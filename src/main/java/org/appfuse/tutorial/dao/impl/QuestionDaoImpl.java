package org.appfuse.tutorial.dao.impl;

import org.appfuse.tutorial.common.BasicDao;
import org.appfuse.tutorial.dao.IQuestionDao;
import org.appfuse.tutorial.model.NcQuestion;
import org.appfuse.tutorial.util.RandomUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.support.AbstractLobCreatingPreparedStatementCallback;
import org.springframework.jdbc.support.lob.DefaultLobHandler;
import org.springframework.jdbc.support.lob.LobCreator;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Administrator on 2016/3/10.
 */
@Repository
public class QuestionDaoImpl extends BasicDao implements IQuestionDao {
    @Autowired
    private DefaultLobHandler defaultLobHandler;
    @Override
    public Integer save(final NcQuestion question) {
        StringBuffer sb = new StringBuffer();
        final int id = Integer.parseInt(RandomUtil.getNumeric());
        sb.append("insert into nc_question(question_id,question_content,question_detail) values(?,?,?)");
        int i= this.getJdbcTemplate().execute(sb.toString(), new AbstractLobCreatingPreparedStatementCallback(this.defaultLobHandler) {
            @Override
            protected void setValues(PreparedStatement ps, LobCreator lobCreator) throws SQLException, DataAccessException {
                ps.setInt(1, id);
                ps.setString(2, question.getQuestionContent());
                lobCreator.setClobAsString(ps, 3, question.getQuestionDetail());
            }
        });
        return id;
    }
}
