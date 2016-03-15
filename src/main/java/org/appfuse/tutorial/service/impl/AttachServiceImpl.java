package org.appfuse.tutorial.service.impl;

import org.appfuse.tutorial.dao.IAttachDao;
import org.appfuse.tutorial.model.NcAttach;
import org.appfuse.tutorial.service.IAttachService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/3/11.
 */
@Service
public class AttachServiceImpl implements IAttachService {
    @Resource
    private IAttachDao attachDao;
    @Override
    public int save(NcAttach attach) {
        return attachDao.save(attach);
    }

    public void setAttachDao(IAttachDao attachDao) {
        this.attachDao = attachDao;
    }

}
