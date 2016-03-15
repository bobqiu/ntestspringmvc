package org.appfuse.tutorial.model; /***********************************************************************
 * Module:  NcReputationTopic.java
 * Author:  bob
 * Purpose: Defines the Class NcReputationTopic
 ***********************************************************************/

import java.util.*;

public class NcReputationTopic {
   public long autoId;
   public int uid = 0;
   /** 话题ID */
   public int topicId = 0;
   /** 威望问题话题计数 */
   public int topicCount = 0;
   /** 更新时间 */
   public int updateTime;
   /** 赞成 */
   public int agreeCount = 0;
   /** 感谢 */
   public int thanksCount = 0;
   public int reputation = 0;

}