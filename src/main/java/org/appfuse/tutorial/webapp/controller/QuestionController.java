package org.appfuse.tutorial.webapp.controller;

import org.appfuse.tutorial.model.NcQuestion;
import org.appfuse.tutorial.service.IQuestionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/2/29.
 */
@Controller
@RequestMapping(value="/question")
public class QuestionController {
    @Resource
    private IQuestionService IQuestionService;

    @RequestMapping(value = "")
    public String showForm() {
        /*ModelAndView modelAndView = new ModelAndView();
        modelAndView.setView();*/
        return "/question/question";
    }

    @RequestMapping(value = "/create")
    @ResponseBody
    public Map<String,Object> create( NcQuestion question,final HttpServletRequest request, final HttpServletResponse response) {
        System.out.println("create111 start======================================");
        String postHash = request.getParameter("post_hash");
        System.out.println("postHash:" + postHash + "77777777777777777777777777777");
        System.out.println("question.questionContent:" + question.getQuestionContent()+"0000000000000000000000000000000000000");
        System.out.println("question.questionDetail:" + question.getQuestionDetail());
        System.out.println("create************************************************");

        String[] topics = request.getParameterValues("topics");
        String[] attachIds = request.getParameterValues("attachIds");

        if (topics != null && topics.length != 0) {

        }
        int id = IQuestionService.save(question);
        System.out.println("int:=" + id);

        Map<String, Object> map = new HashMap<String,Object>();
        Map map1 = new HashMap();
        map1.put("url", "/question/"+id);
        map.put("rsm", map1);
        map.put("errno", 1);
        map.put("err", "错了");

        return map;
    }


    public IQuestionService getIQuestionService() {
        return IQuestionService;
    }

    public void setIQuestionService(IQuestionService IQuestionService) {
        this.IQuestionService = IQuestionService;
    }
}