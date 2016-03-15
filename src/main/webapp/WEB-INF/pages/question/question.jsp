<%@ include file="/common/taglibs.jsp"%>


<%@include file="/common/header.jsp"%>



<div class="aw-container-wrap">
    <div class="container aw-publish">
        <div class="row">
            <div class="aw-content-wrap clearfix">
                <div class="col-sm-12 col-md-9 aw-main-content">
                    <!-- tab 切换 -->
                    <ul class="nav nav-tabs aw-nav-tabs active">
                        <li class="active"><a href="${ctx}/publish/">问题</a></li>
                        <h2 class="hidden-xs"><i class="icon icon-ask"></i> 发起</h2>
                    </ul>
                    <!-- end tab 切换 -->
                    <form action="${ctx}/question/create" method="post" id="question_form"
                          onsubmit="return false;">
                        <input type="hidden" name="post_hash" value="d0846fdcca18641d"/>
                        <input type="hidden" name="attach_access_key" value="d539ddaabd685a2d8032124da0c30c3a"/>
                       <%-- //<input type="hidden" name="questioni_d" id="question_id" value="<s:property value='question.questionId'/> "/>--%>
                        <%--<input type="hidden" name="questionId" id="question_id" value=""/>--%>
                        <input type="hidden" name="ask_user_id" value=""/>

                        <div class="aw-mod aw-mod-publish">
                            <div class="mod-body">
                                <h3>问题标题:</h3>
                                <!-- 问题标题 -->
                                <div class="aw-publish-title active">
                                    <div>
                                        <input type="text" placeholder="问题标题..." name="questionContent"
                                               id="questionContent" value="" class="form-control"/>

                                        <div class="aw-publish-suggest-question hide">
                                            <p class="text-color-999">你的问题可能已经有答案</p>
                                            <ul class="aw-dropdown-list">
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                <!-- end 问题标题 -->

                                <h3>问题补充 (选填):</h3>

                                <div class="aw-mod aw-editor-box">
                                    <div class="mod-head">
                                        <div class="wmd-panel">
                                            <textarea class="wmd-input form-control autosize editor" id="wmd-input"
                                                      rows="15" name="questionDetail"></textarea>
                                        </div>
                                    </div>
                                    <div class="mod-body">
                                        <span class="pull-right text-color-999"
                                              id="question_detail_message">&nbsp;</span>

                                        <div class="aw-upload-box">
                                            <a class="btn btn-default">上传附件</a>

                                            <div class="upload-container"></div>
                                            <span class="text-color-999 aw-upload-tips hidden-xs">允许 : jpg,jpeg,png,zip,rar,7z</span>
                                        </div>
                                    </div>
                                </div>
                                <h3>添加话题:</h3>

                                <div class="aw-topic-bar" data-type="publish">
                                    <div class="tag-bar clearfix">


                                        <span class="aw-edit-topic icon-inverse"><i
                                                class="icon icon-edit"></i> 编辑话题</span>
                                        </span>
                                    </div>
                                </div>
                                <h3>最近话题:</h3>

                                <div class="aw-topic-bar">
                                    <div class="topic-bar clearfix">
																				<span class="topic-tag"
                                                                                      onclick="$('#aw_edit_topic_title').val('java');$('.add').click();$(this).hide();">
											<a class="text">
                                                java </a>
										</span>
																				<span class="topic-tag"
                                                                                      onclick="$('#aw_edit_topic_title').val('程序');$('.add').click();$(this).hide();">
											<a class="text">
                                                程序 </a>
										</span>
                                    </div>
                                </div>
                            </div>
                            <div class="mod-footer clearfix">
                                <a href="${ctx}/integral/rule/" target="_blank">[积分规则]</a>								<span
                                    class="aw-anonymity">
																											<label><input
                                                                                                                    type="checkbox"
                                                                                                                    class="pull-left"
                                                                                                                    value="1"
                                                                                                                    name="anonymous"/>
                                                                                                                匿名</label>
									
								</span>
                                <a class="btn btn-large btn-success btn-publish-submit" id="publish_submit"
                                   onclick="AWS.ajax_post($('#question_form')); return false;">确认发起</a>
                            </div>
                        </div>
                    </form>
                </div>
                <!-- 侧边栏 -->
                <div class="col-sm-12 col-md-3 aw-side-bar hidden-xs">
                    <!-- 问题发起指南 -->
                    <div class="aw-mod publish-help">
                        <div class="mod-head">
                            <h3>问题发起指南</h3>
                        </div>
                        <div class="mod-body">
                            <p><b>• 问题标题:</b> 请用准确的语言描述您发布的问题思想</p>

                            <p><b>• 问题补充:</b> 详细补充您的问题内容, 并提供一些相关的素材以供参与者更多的了解您所要问题的主题思想</p>

                            <p><b>• 选择话题:</b> 选择一个或者多个合适的话题, 让您发布的问题得到更多有相同兴趣的人参与. 所有人可以在您发布问题之后添加和编辑该问题所属的话题</p>

                            <p><b>• 关于积分：</b> 发起一个问题会消耗您 10 个积分, 每多一个回复你将获得 5 个积分的奖励 ,为了您的利益,
                                在发起问题的时候希望能够更好的描述您的问题以及多使用站内搜索功能.</p>
                        </div>
                    </div>
                    <!-- end 问题发起指南 -->
                </div>
                <!-- end 侧边栏 -->
            </div>
        </div>
    </div>
</div>
<script type="text/javascript">
    var ATTACH_ACCESS_KEY = '111111111111111111111111';
    var CATEGORY_ID = 0;
    var PUBLISH_TYPE = 'question';
</script>

<%@ include file="/common/footer.jsp"%>

<!-- Escape time: 0.032617092132568 --><!-- / DO NOT REMOVE -->
<script src="${ctx}/static/js/app/publish.js?v=20141226" type="text/javascript"></script>
<script src="${ctx}/static/js/editor/ckeditor/ckeditor.js?v=20141226" type="text/javascript"></script>
<script src="${ctx}/static/js/editor/ckeditor/adapters/jquery.js?v=20141226" type="text/javascript"></script>
<script src="${ctx}/static/js/fileupload.js?v=20141226" type="text/javascript"></script>
</body>

</html>
