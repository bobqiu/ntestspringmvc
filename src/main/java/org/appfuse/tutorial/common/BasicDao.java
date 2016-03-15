package org.appfuse.tutorial.common;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Created by Administrator on 2016/3/10.
 */
public class BasicDao {
    private static final Log log = LogFactory.getLog(BasicDao.class);
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;


    public DataSource getDataSource() {
        return dataSource;
    }

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public JdbcTemplate getJdbcTemplate() {
        if (dataSource == null) {
            return jdbcTemplate;
        }else {
            return jdbcTemplate = new JdbcTemplate(dataSource);
        }
    }

    /*@Resource(name="dataSource")
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        if (this.dataSource == null) {
            this.jdbcTemplate = new JdbcTemplate(dataSource);
        }else {
            this.jdbcTemplate =this.getJdbcTemplate();
        }
    }*/
}
