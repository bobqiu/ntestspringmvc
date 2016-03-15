package org.appfuse.tutorial.service.impl;

import org.appfuse.tutorial.dao.IQuestionDao;
import org.appfuse.tutorial.model.NcQuestion;
import org.appfuse.tutorial.service.IQuestionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/3/10.
 */
@Service
public class QuestionServiceImpl implements IQuestionService {
    @Resource
    private IQuestionDao IQuestionDao;
    @Override
    public Integer save(NcQuestion question) {
        return IQuestionDao.save(question);
    }

    public void setIQuestionDao(IQuestionDao IQuestionDao) {
        this.IQuestionDao = IQuestionDao;
    }
}
