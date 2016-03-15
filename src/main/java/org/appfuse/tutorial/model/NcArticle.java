package org.appfuse.tutorial.model; /***********************************************************************
 * Module:  NcArticle.java
 * Author:  bob
 * Purpose: Defines the Class NcArticle
 ***********************************************************************/

public class NcArticle {
   public long id;
   public int uid;
   public String title;
   public String message;
   public int comments = 0;
   public int views = 0;
   public int addTime;
   public int hasAttach = 0;
   public int isLock = 0;
   public int votes = 0;
   public String titleFulltext;
   public int categoryId = 0;
   public int isRecommend = 0;
   public int chapterId;
   public int sort = 0;

}