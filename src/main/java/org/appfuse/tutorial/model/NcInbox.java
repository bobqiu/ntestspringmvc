package org.appfuse.tutorial.model; /***********************************************************************
 * Module:  NcInbox.java
 * Author:  bob
 * Purpose: Defines the Class NcInbox
 ***********************************************************************/

public class NcInbox {
   public long id;
   /** 发送者 ID */
   public int uid;
   /** 对话id */
   public int dialogId;
   /** 内容 */
   public String message;
   /** 添加时间 */
   public int addTime;
   public int senderRemove = 0;
   public int recipientRemove = 0;
   public int receipt = 0;

}