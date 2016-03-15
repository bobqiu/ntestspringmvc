package org.appfuse.tutorial.model; /***********************************************************************
 * Module:  NcUsersOnline.java
 * Author:  bob
 * Purpose: Defines the Class NcUsersOnline
 ***********************************************************************/

import java.util.*;

public class NcUsersOnline {
   /** 用户 ID */
   public int uid;
   /** 上次活动时间 */
   public int lastActive = 0;
   /** 客户端ip */
   public long ip = 0;
   /** 停留页面 */
   public String activeUrl;
   /** 用户客户端信息 */
   public String userAgent;

}