package org.appfuse.tutorial.model; /***********************************************************************
 * Module:  NcUserActionHistory.java
 * Author:  bob
 * Purpose: Defines the Class NcUserActionHistory
 ***********************************************************************/

public class NcUserActionHistory {
   /** 自增ID */
   public long historyId;
   /** 用户id */
   public int uid;
   /** 关联类型: 1 问题 2 回答 3 评论 4 话题 */
   public String associateType;
   /** 操作类型 */
   public short associateAction;
   /** 关联ID */
   public int associateId;
   /** 添加时间 */
   public int addTime;
   public int associateAttached;
   /** 是否匿名 */
   public int anonymous = 0;
   public int foldStatus = 0;

}