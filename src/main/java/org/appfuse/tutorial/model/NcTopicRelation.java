package org.appfuse.tutorial.model; /***********************************************************************
 * Module:  NcTopicRelation.java
 * Author:  bob
 * Purpose: Defines the Class NcTopicRelation
 ***********************************************************************/

import java.util.*;

public class NcTopicRelation {
   /** 自增 ID */
   public long id;
   /** 话题id */
   public int topicId = 0;
   public int itemId = 0;
   /** 添加时间 */
   public int addTime = 0;
   /** 用户ID */
   public int uid = 0;
   public String type;

}