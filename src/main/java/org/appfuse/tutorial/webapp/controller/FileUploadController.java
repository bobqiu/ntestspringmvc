package org.appfuse.tutorial.webapp.controller;

import org.appfuse.tutorial.model.NcAttach;
import org.appfuse.tutorial.service.IAttachService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * Controller class to upload Files.
 * <p/>
 * <p>
 * <a href="FileUploadFormController.java.html"><i>View Source</i></a>
 * </p>
 *
 * @author <a href="mailto:matt@raibledesigns.com">Matt Raible</a>
 * /publish/upload/question/111111111111111111111111/C:/fakepath/Chrysanthemum.jpg/1457329271425
 */
@Controller
@RequestMapping("/publish/upload*")
public class FileUploadController extends BaseFormController {

    @Resource
    private IAttachService attachService;

    public FileUploadController() {
        setCancelView("redirect:/home");
        setSuccessView("uploadDisplay");
    }

    @ModelAttribute
    @RequestMapping(method = RequestMethod.GET)
    public FileUpload showForm() {
        return new FileUpload();
    }

    /*@RequestMapping(method = RequestMethod.POST)*/
    @RequestMapping("/{type}/{id}/{fileName}/{time}")
    @ResponseBody
    public Map<String,Object> onSubmit(@RequestParam("file") CommonsMultipartFile file,FileUpload fileUpload, BindingResult errors, HttpServletRequest request,@PathVariable("type") String type,@PathVariable("id") String id,@PathVariable("fileName") String fileName,@PathVariable("time") String time)
            throws Exception {
        System.out.println("type="+type+"=======================================================");
        System.out.println("id="+id+"=+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("fileName="+fileName+"=+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        // the directory to upload to
        String uploadDir = getServletContext().getRealPath("/resources");

        // The following seems to happen when running jetty:run
        if (uploadDir == null) {
            uploadDir = new File("src/main/webapp/resources").getAbsolutePath();
        }
        uploadDir += "/" + request.getRemoteUser() + "/";

        // Create the directory if it doesn't exist
        File dirPath = new File(uploadDir);

        if (!dirPath.exists()) {
            dirPath.mkdirs();
        }

        String path=uploadDir+fileName;

        System.out.println(path);

        File newFile = new File(path);
        file.transferTo(newFile);

        String fileLocation = "/resources/" + request.getRemoteUser() + "/" + fileName;

        NcAttach attach = new NcAttach();
        attach.setFileName(fileName);
        attach.setFileLocation(fileLocation);
        attach.setIsImage(1);
        int attachId=attachService.save(attach);

        Map<String, Object> map = new HashMap<String,Object>();
        map.put("success", true);
        map.put("delete_url","publish/delete/"+fileName);
        map.put("attach_id",attachId);
        map.put("access_key","key1111");
        map.put("attach_tag","attach");
        map.put("thumb",fileLocation);
        map.put("type", "file");

        return map;


        /*if (request.getParameter("cancel") != null) {
            return getCancelView();
        }

        if (validator != null) { // validator is null during testing
            validator.validate(fileUpload, errors);

            if (errors.hasErrors()) {
                return "fileupload";
            }
        }*/

        // validate a file was entered
        /*if (fileUpload.getFile().length == 0) {
            Object[] args =
                    new Object[]{getText("uploadForm.file", request.getLocale())};
            errors.rejectValue("file", "errors.required", args, "File");

            return "fileupload";
        }

        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        CommonsMultipartFile file = (CommonsMultipartFile) multipartRequest.getFile("file");

        // the directory to upload to
        String uploadDir = getServletContext().getRealPath("/resources");

        // The following seems to happen when running jetty:run
        if (uploadDir == null) {
            uploadDir = new File("src/main/webapp/resources").getAbsolutePath();
        }
        uploadDir += "/" + request.getRemoteUser() + "/";

        // Create the directory if it doesn't exist
        File dirPath = new File(uploadDir);

        if (!dirPath.exists()) {
            dirPath.mkdirs();
        }

        //retrieve the file data
        InputStream stream = file.getInputStream();

        //write the file to the file specified
        OutputStream bos = new FileOutputStream(uploadDir + file.getOriginalFilename());
        int bytesRead;
        byte[] buffer = new byte[8192];

        while ((bytesRead = stream.read(buffer, 0, 8192)) != -1) {
            bos.write(buffer, 0, bytesRead);
        }

        bos.close();

        //close the stream
        stream.close();

        // place the data into the request for retrieval on next page
        request.setAttribute("friendlyName", fileUpload.getName());
        request.setAttribute("fileName", file.getOriginalFilename());
        request.setAttribute("contentType", file.getContentType());
        request.setAttribute("size", file.getSize() + " bytes");
        request.setAttribute("location", dirPath.getAbsolutePath() + Constants.FILE_SEP + file.getOriginalFilename());

        String link = request.getContextPath() + "/resources" + "/" + request.getRemoteUser() + "/";
        request.setAttribute("link", link + file.getOriginalFilename());



        return getSuccessView();*/
    }

    public void setAttachService(IAttachService attachService) {
        this.attachService = attachService;
    }
}
