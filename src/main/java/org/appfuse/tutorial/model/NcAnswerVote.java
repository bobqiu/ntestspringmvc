package org.appfuse.tutorial.model; /***********************************************************************
 * Module:  NcAnswerVote.java
 * Author:  bob
 * Purpose: Defines the Class NcAnswerVote
 ***********************************************************************/

public class NcAnswerVote {
   /** 自动ID */
   public long voterId;
   /** 回复id */
   public int answerId;
   /** 回复作者id */
   public int answerUid;
   /** 用户ID */
   public int voteUid;
   /** 添加时间 */
   public int addTime;
   /** -1反对 1 支持 */
   public String voteValue;
   public int reputationFactor = 0;

}