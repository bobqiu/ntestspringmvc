package org.appfuse.tutorial.model; /***********************************************************************
 * Module:  NcUserFollow.java
 * Author:  bob
 * Purpose: Defines the Class NcUserFollow
 ***********************************************************************/

import java.util.*;

public class NcUserFollow {
   /** 自增ID */
   public long followId;
   /** 关注人的UID */
   public int fansUid;
   /** 被关注人的uid */
   public int friendUid;
   /** 添加时间 */
   public int addTime;

}