package org.appfuse.tutorial.model; /***********************************************************************
 * Module:  NcInboxDialog.java
 * Author:  bob
 * Purpose: Defines the Class NcInboxDialog
 ***********************************************************************/

import java.util.*;

public class NcInboxDialog {
   /** 对话ID */
   public long id;
   /** 发送者UID */
   public int senderUid;
   /** 发送者未读 */
   public int senderUnread;
   /** 接收者UID */
   public int recipientUid;
   /** 接收者未读 */
   public int recipientUnread;
   /** 添加时间 */
   public int addTime;
   /** 最后更新时间 */
   public int updateTime;
   /** 发送者显示对话条数 */
   public int senderCount;
   /** 接收者显示对话条数 */
   public int recipientCount;

}