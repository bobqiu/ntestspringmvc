package org.appfuse.tutorial.dao.impl;

import org.appfuse.tutorial.common.BasicDao;
import org.appfuse.tutorial.dao.IAttachDao;
import org.appfuse.tutorial.model.NcAttach;
import org.appfuse.tutorial.util.RandomUtil;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * Created by Administrator on 2016/3/11.
 */
@Repository
public class AttachDaoImpl extends BasicDao implements IAttachDao  {
    @Override
    public int save(NcAttach attach) {
        StringBuilder sb = new StringBuilder();
        int id = Integer.parseInt(RandomUtil.getNumeric());
        sb.append("insert nc_attach(ID,FILE_NAME,ACCESS_KEY,ADD_TIME,FILE_LOCATION,IS_IMAGE,ITEM_TYPE,ITEM_ID,WAIT_APPROVAL) values(?,?,?,?,?,?,?,?,?)");
        Object[] params = {id, attach.getFileName(), attach.getAccessKey(), new Date(), attach.getFileLocation(), attach.getIsImage(), attach.getItemType(), attach.getItemId(), attach.getWaitApproval()};
        int i=this.getJdbcTemplate().update(sb.toString(),params);
        System.out.println("AttachDaoImpl:i================="+i);
        return id;
    }
}

