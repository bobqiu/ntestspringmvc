package org.appfuse.tutorial.model; /***********************************************************************
 * Module:  NcNotification.java
 * Author:  bob
 * Purpose: Defines the Class NcNotification
 ***********************************************************************/

public class NcNotification {
   /** 自增ID */
   public long notificationId;
   /** 发送者ID */
   public int senderUid;
   /** 接收者ID */
   public int recipientUid = 0;
   /** 操作类型 */
   public int actionType;
   public short modelType = 0;
   /** 关联 ID */
   public int sourceId = 0;
   /** 添加时间 */
   public int addTime;
   /** 阅读状态 */
   public int readFlag = 0;

}