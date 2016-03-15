package org.appfuse.tutorial.model; /***********************************************************************
 * Module:  NcAnswer.java
 * Author:  bob
 * Purpose: Defines the Class NcAnswer
 ***********************************************************************/

public class NcAnswer {
   /** 回答id */
   private long answerId;
   /** 问题id */
   private int questionId;
   /** 回答内容 */
   private String answerContent;
   /** 添加时间 */
   private int addTime = 0;
   /** 反对人数 */
   private int againstCount = 0;
   /** 支持人数 */
   private int agreeCount = 0;
   /** 发布问题用户ID */
   private int uid = 0;
   /** 评论总数 */
   private int commentCount = 0;
   /** 不感兴趣 */
   private int uninterestedCount = 0;
   /** 感谢数量 */
   private int thanksCount = 0;
   /** 分类id */
   private int categoryId = 0;
   /** 是否存在附件 */
   private int hasAttach = 0;
   private long ip;
   /** 强制折叠 */
   private int forceFold = 0;
   private int anonymous = 0;
   private String publishSource;

}