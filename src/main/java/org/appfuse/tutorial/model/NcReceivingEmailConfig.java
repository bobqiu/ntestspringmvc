package org.appfuse.tutorial.model; /***********************************************************************
 * Module:  NcReceivingEmailConfig邮件账号列表.java
 * Author:  bob
 * Purpose: Defines the Class NcReceivingEmailConfig邮件账号列表
 ***********************************************************************/

/** 邮件账号列表 */
public class NcReceivingEmailConfig {
   public long id;
   public String protocol;
   public String server;
   public int isSsl = 0;
   public short port;
   public String username = "";
   public String password = "";
   public int uid;
   public String accessKey;
   public int hasAttach = 0;

}