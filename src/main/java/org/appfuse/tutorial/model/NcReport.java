package org.appfuse.tutorial.model; /***********************************************************************
 * Module:  NcReport.java
 * Author:  bob
 * Purpose: Defines the Class NcReport
 ***********************************************************************/

public class NcReport {
   public long id;
   /** 举报用户id */
   public int uid = 0;
   /** 类别 */
   public String type;
   /** ID */
   public int targetId = 0;
   /** 举报理由 */
   public String reason;
   public String url;
   /** 举报时间 */
   public int addTime = 0;
   /** 是否处理 */
   public int status = 0;

}