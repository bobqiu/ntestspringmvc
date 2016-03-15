package org.appfuse.tutorial.model; /***********************************************************************
 * Module:  NcInvitation.java
 * Author:  bob
 * Purpose: Defines the Class NcInvitation
 ***********************************************************************/

public class NcInvitation {
   /** 激活ID */
   public long invitationId;
   /** 用户ID */
   public int uid = 0;
   /** 激活码 */
   public String invitationCode;
   /** 激活email */
   public String invitationEmail;
   /** 添加时间 */
   public int addTime;
   /** 添加IP */
   public long addIp;
   /** 激活过期 */
   public int activeExpire = 0;
   /** 激活时间 */
   public int activeTime;
   /** 激活IP */
   public long activeIp;
   /** 1已使用0未使用-1已删除 */
   public int activeStatus = 0;
   public int activeUid;

}