/*!
 * FileUpload v1.0
 * Copyright 2011-2014 Wecenter, Inc.
 * Date: 2014-06-02
 */
FileUpload.prototype =
{
	// 初始化上传器
	init : function (element, container)
	{
		var form = this.createForm(),
			input = this.createInput();

		$(element).prepend($(form).append(input));

		$(container).append('<ul class="upload-list"></ul>');
	},

	// 创建表单
	createForm : function ()
	{
		var form = this.toElement('<form method="post" enctype="multipart/form-data"><input type="submit" class="submit" /></form>');

		$(form).attr({
			'id' : 'upload-form',
			'action' : this.url,
			'target' : 'ajaxUpload'
		});

		this.form = form;

		return form;
	},

	// 创建input
	createInput : function ()
	{
		var _this = this, input = this.toElement('<input type="file" />');

		$(input).attr({
			'class' : 'file-input',
			/*'name' : 'aws_upload_file',*/
			'name' : 'file',
			'multiple' : this.options.multiple ? 'multiple' : false,
			'id':'uploadFile'
		});

		$(input).change(function()

		{	var uFile=$(input)[0].value;
			_this.addFileList(this);
		});

		return input;
	},

	// 创建隐藏域 (wecenter定制)
	createHiddenInput : function(attach_id)
	{
		var _this = this, input = this.toElement('<input type="hidden" name="attachIds" class="hidden-input" />');

		$(input).val(attach_id);

		return input;
	},

	// 创建iframe
	createIframe : function ()
	{
		var iframe = this.toElement('<iframe></iframe>');
    	$(iframe).attr({
    		'class': 'hide upload-iframe',
    		'name': 'ajaxUpload'
    	});
    	return iframe;
	},

	// 添加文件列表
	//addFileList : function (input)
	addFileList : function (input)
	{
		//alert("uploadfile="+$(input)[0].value);
		//var files = $(input)[0].files;
		var file=$(input)[0].value;
		var pos = file.lastIndexOf("\\");
		file = file.substring(pos + 1);
		//alert("files:"+file);
		/*if (files && this.type == 'file')*/
		if (file && this.type == 'file')
		{
			/*for (i = 0; i < files.length; i++)
			{
				this.li = this.toElement(this.options.template);
				this.file = files[i];
				$(this.container).find('.upload-list').append(this.li);
				this.upload(files[i], this.li);
			}*/

				this.li = this.toElement(this.options.template);
				this.file = file;
				$(this.container).find('.upload-list').append(this.li);
				this.upload(file, this.li);

		}
		else
		{
			if (this.type == 'file')
			{
				this.li = this.toElement(this.options.template);
				$(this.container).find('.upload-list').append(this.li);
				this.upload('', this.li);
			}
			else
			{
				this.upload('');
			}
		}

	},

	// 上传功能
	upload : function (file, li)
	{
		var _this = this;
		//alert("upload:file::"+file);
		if (file)
		{
			/*var xhr = new XMLHttpRequest(), status = false;

	        xhr.upload.onprogress = function(event)
	        {
	        	if (event.lengthComputable)
	        	{
	                var percent = Math.round(event.loaded * 100 / event.total);
	            }

                $(li).find('.title').html(file.name);

                $(li).find('.size').html(percent + '%');
	        };

	        xhr.onreadystatechange = function()
	        {
	            _this.oncomplete(xhr, li, file);
	        };

	       // var url = this.url + '&aws_upload_file=' + file.name + '&timestamp=' + new Date().getTime();
			var url = this.url + '/' + file.name + '/' + new Date().getTime();


			alert(file.name);
	        xhr.open("POST", url);

	        xhr.send(file);*/

			var options = {
				url: this.url + '/' + file + '/' + new Date().getTime(),
				//url: this.url + '/' + new Date().getTime(),
				type: "post",
				dataType:"json",
				beforeSend:function(){
					//alert(file);
					$(li).find('.title').html(file);
					$(li).find('.size').html('0%');

				},
				uploadProgress:function(event,position,total,percentComplete){

					var percentVal = percentComplete + '%';
					//alert("percentVal="+percentVal);
					$(li).find('.title').html(file.name);
					$(li).find('.size').html(percentVal);

				},
				success:function(data) {

					//alert("上传成功："+JSON.stringify(data));
					//_this.oncomplete('', li, file);
					var response,fileSize;
					//alert(file);
					filesize = _this.getFIleSize(file);

					//response = eval('(" + data + ")');
					response = data;
					//alert(response);
					//alert(filesize);
					_this.render(li, response, filesize);
				},
				error:function(data) {

					alert("上传失败:"+JSON.stringify(data));
					$(li).addClass('error').find('.img').addClass('error').html('<i class="icon icon-delete"></i>');

					$(li).find('.size').text(data.responseText.error);
				}
			};

			$("#upload-form").ajaxSubmit(options);
		}
        else
        {
        	//低版本ie上传
			var iframe = this.createIframe();

			if (this.options.loading_status)
			{
				$(this.options.loading_status).show();
			}

        	if (iframe.addEventListener)
        	{
		        iframe.addEventListener('load', function()
	        	{
	        		_this.getIframeContentJSON(iframe, _this.container);
	        	}, false);
		    } else if (iframe.attachEvent)
		    {
		        iframe.attachEvent('onload', function()
	        	{
	        		_this.getIframeContentJSON(iframe, _this.container);
	        	});
	    	}

    		$('#aw-ajax-box').append(iframe);

        	$(this.form).find('.submit').click();
        }
	},

	// 从iframe获取json内容
	getIframeContentJSON : function (iframe, container)
	{
		var doc = iframe.contentDocument ? iframe.contentDocument: iframe.contentWindow.document,
			response, filename;

            response = eval("(" + doc.body.innerHTML + ")");
		/*var aresponse = eval( doc.body.innerHTML);
		response ="("+aresponse+")";*/
			//alert("respone="+response);
            if (this.type == 'file')
            {
            	this.render(this.li, response);

	           	filename = this.getName($('#upload-form .file-input')[0].value);

	           	$(this.li).find('.title').html(filename);
            }
            else
            {
            	$(this.options.loading_status).hide();

            	if ($(this.container).attr('src'))
            	{
            		$(this.container).attr('src', response.thumb + '?' + Math.round(Math.random() * 10000));
            	}
            	else
            	{
            		$(this.container).css(
            		{
            			'background' : 'url(' + response.thumb + '?' + Math.round(Math.random() * 10000) + ')'
            		});
            	}
            }

           	$('.upload-iframe').detach();

           	this.oncallback();
	},

	// ajax完成callback
	oncomplete : function (xhr, li, file)
	{
		var _this = this, response, filesize = this.getFIleSize(file);

		if (xhr.readyState == 4 && xhr.status == 200)
		{
            try
            {
                response = eval("(" + xhr.responseText + ")");

                this.render(li, response, filesize);
            }
            catch(err)
            {
                response = {};
            }
		}
	},

	// 此功能配合编辑器
	oncallback : function ()
	{
		if (this.callback)
       	{
       		this.callback();
       	}
	},

	// 渲染缩略列表
	render : function (element, json, filesize)
	{
		//alert(JSON.stringify(json));
		if (json)
		{
			if (!json.error)
			{

				switch (json.class_name)
				{
					case 'txt':
						$(element).find('.img').addClass('file').html('<i class="icon icon-file"></i>');
					break;

					default :
						$(element).find('.img').css(
						{
			                'background': 'url("' + json.thumb + '")'
			            }).addClass('active').attr('data-img', json.thumb);
			        break;
				}

				if (filesize)
				{
					$(element).find('.size').html(filesize);
				}

				if (this.options.deleteBtn && json.delete_url)
				{
					var btn = this.createDeleteBtn(json.delete_url);

					$(element).find('.meta').append(btn);
				}
				//alert(json.class_name);
				if (this.options.insertBtn && json.delete_url && !json.class_name)
				{

					var btn = this.createInsertBtn(json.attach_id);

					$(element).find('.meta').append(btn);
				}

				// 插入隐藏域(wecenter定制)
				$(element).append(this.createHiddenInput(json.attach_id));

				this.oncallback();
			}
			else
			{
				$(element).addClass('error').find('.img').addClass('error').html('<i class="icon icon-delete"></i>');

				$(element).find('.size').text(json.error);
			}
		}
	},

	toElement : function (html)
	{
		var div = document.createElement('div');
		div.innerHTML = html;
        var element = div.firstChild;
        div.removeChild(element);
        return element;
	},

	// 获取文件名
	getName : function (filename)
	{
        return filename.replace(/.*(\/|\\)/, "");
    },

    // 获取文件大小
    getFIleSize : function (file)
    {
    	var filesize;
    	if (file.size > 1024 * 1024)
        {
            filesize = (Math.round(file.size * 100 / (1024 * 1024)) / 100).toString() + 'MB';
        }
        else
        {
            filesize = (Math.round(file.size * 100 / 1024) / 100).toString() + 'KB';
        }
        return filesize;
    },

    // 创建插入按钮
    createInsertBtn : function (attach_id)
    {
    	var btn = this.toElement(this.options.insertBtnTemplate), _this = this;

    	$(btn).click(function()
		{
			if (typeof CKEDITOR != 'undefined')
			{
				_this.editor.insertText("\n[attach]" + attach_id + "[/attach]\n");
			}
			else
			{
				_this.editor.val( _this.editor.val() + "\n[attach]" + attach_id + "[/attach]\n");
			}
		});

		return btn;
    },

    // 创建删除按钮
   	createDeleteBtn : function (url)
   	{
   		var btn = this.toElement(this.options.deleteBtnTemplate);

   		$(btn).click(function()
		{
			if (confirm('确认删除?'))
			{
				var _this = this;
				$.get(url, function (result)
				{
					if (result.errno == "-1")
					{
						AWS.alert(result.err);
					}
					else
					{
						$(_this).parents('li').detach();
					}
				}, 'json');
			}
		});

		return btn;
   	},

   	// 初始化文件列表
    setFileList : function (json)
    {
    	var template = '<li>';

    	if (!json.is_image)
		{
			template += '<div class="img file"><i class="icon icon-file"></i></div>';
		}
		else
		{
			template += '<div class="img" data-img="' + json.thumb + '" style="background:url(' + json.thumb + ')"></div>';
		}

		template += '<div class="content">'+
							'<p class="title">' + json.file_name + '</p>'+
							'<p class="size"></p>'+
							'<p class="meta"></p>'+
						'</div>'+
		    		'</li>';
		var insertBtn = this.createInsertBtn(json.attach_id),
		    deleteBtn = this.createDeleteBtn(json.delete_link),
		    hiddenInput = this.createHiddenInput(json.attach_id);

		template = this.toElement(template), _this = this;

		$(template).find('.meta').append(deleteBtn);
		$(template).find('.meta').append(insertBtn);
		$(template).find('.meta').append(hiddenInput);
    	$(this.container).find('.upload-list').append(template);
    }
}
function FileUpload (type, element, container, url, options, callback)
{
	var _this = this;
	this.type = type;
	this.element = element;
	this.container = container;
	this.url = url;
	this.options = {
		'multiple' : true,
		'deleteBtn' : true,
		'insertBtn' : true,
		'insertTextarea' : '.wmd-input',
		'template' : '<li>'+
		'<div class="img"></div>'+
		'<div class="content">'+
		'<p class="title"></p>'+
		'<p class="size"></p>'+
		'<p class="meta"></p>'+
		'</div>'+
		'</li>',
		'deleteBtnTemplate' : '<a class="delete-file">删除</a>' ,
		'insertBtnTemplate' : '<a class="insert-file">插入</a>'
	};

	if (options.editor)
	{
		this.editor = options.editor;
	}

	this.options = $.extend(this.options, options);

	this.callback = callback;

	if (type == 'file')
	{
		this.init(element, container);
	}
	else
	{
		var form = this.createForm(),
			input = this.createInput();

		$(element).prepend($(form).append(input));
	}
}

