package org.appfuse.tutorial.model; /***********************************************************************
 * Module:  NcWeixinMsg.java
 * Author:  bob
 * Purpose: Defines the Class NcWeixinMsg
 ***********************************************************************/

import java.util.*;

public class NcWeixinMsg {
   public long id;
   public long msgId;
   public String groupName;
   public String status;
   public int errorNum;
   public String mainMsg;
   public String articlesInfo;
   public String questionsInfo;
   public int createTime;
   public int filterCount = 0;

}