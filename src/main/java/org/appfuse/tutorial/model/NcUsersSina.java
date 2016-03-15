package org.appfuse.tutorial.model; /***********************************************************************
 * Module:  NcUsersSina.java
 * Author:  bob
 * Purpose: Defines the Class NcUsersSina
 ***********************************************************************/

import java.util.*;

public class NcUsersSina {
   /** 新浪用户 ID */
   public long id;
   /** 用户在本地的UID */
   public int uid;
   /** 微博昵称 */
   public String name;
   /** 地址 */
   public String location;
   /** 个人描述 */
   public String description;
   /** 用户博客地址 */
   public String url;
   /** Sina 自定义头像地址 */
   public String profileImageUrl;
   public String gender;
   /** 添加时间 */
   public int addTime;
   /** 过期时间 */
   public int expiresTime = 0;
   public String accessToken;
   public long lastMsgId;

}