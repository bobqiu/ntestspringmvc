package org.appfuse.tutorial.model; /***********************************************************************
 * Module:  NcQuestionInvite.java
 * Author:  bob
 * Purpose: Defines the Class NcQuestionInvite
 ***********************************************************************/

import java.util.*;

public class NcQuestionInvite {
   /** 自增ID */
   public long questionInviteId;
   /** 问题ID */
   public int questionId;
   public int senderUid;
   public int recipientsUid;
   /** 受邀Email */
   public String email;
   /** 添加时间 */
   public int addTime = 0;
   /** 生效时间 */
   public int availableTime = 0;

}