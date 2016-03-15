package org.appfuse.tutorial.model; /***********************************************************************
 * Module:  NcUsersQq.java
 * Author:  bob
 * Purpose: Defines the Class NcUsersQq
 ***********************************************************************/

import java.util.*;

public class NcUsersQq {
   public long id;
   /** 用户在本地的UID */
   public int uid;
   public String nickname;
   public String openid = "";
   public String gender;
   /** 添加时间 */
   public int addTime;
   public String accessToken;
   public String refreshToken;
   public int expiresTime;
   public String figureurl;

}