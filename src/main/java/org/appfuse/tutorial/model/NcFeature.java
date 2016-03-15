package org.appfuse.tutorial.model; /***********************************************************************
 * Module:  NcFeature.java
 * Author:  bob
 * Purpose: Defines the Class NcFeature
 ***********************************************************************/

public class NcFeature {
   public long id;
   /** 专题标题 */
   public String title;
   /** 专题描述 */
   public String description;
   /** 专题图标 */
   public String icon;
   /** 话题计数 */
   public int topicCount = 0;
   /** 自定义CSS */
   public String css;
   public String urlToken;
   public String seoTitle;
   public int enabled = 0;

}