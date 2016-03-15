package org.appfuse.tutorial.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

/***********************************************************************
 * Module:  NcTopic.java
 * Author:  bob
 * Purpose: Defines the Class NcTopic
 ***********************************************************************/

public class NcTopic {
   /** 话题id */
   public long topicId;
   /** 话题标题 */
   public String topicTitle;
   /** 添加时间 */
   public Timestamp addTime;
   /** 讨论计数 */
   public int discussCount = 0;
   /** 话题描述 */
   public String topicDescription;
   /** 话题图片 */
   public String topicPic;
   /** 话题是否锁定 1 锁定 0 未锁定 */
   public int topicLock = 0;
   /** 关注计数 */
   public int focusCount = 0;
   /** 是否被用户关联 */
   public int userRelated = 0;
   public String urlToken;
   public int mergedId = 0;
   public String seoTitle;
   public int parentId = 0;
   public int isParent = 0;
   public int discussCountLastWeek = 0;
   public int discussCountLastMonth = 0;
   public int discussCountUpdate = 0;


   public long getTopicId() {
      return topicId;
   }

   public void setTopicId(long topicId) {
      this.topicId = topicId;
   }

   public String getTopicTitle() {
      return topicTitle;
   }

   public void setTopicTitle(String topicTitle) {
      this.topicTitle = topicTitle;
   }

   public Timestamp getAddTime() {
      return addTime;
   }

   public void setAddTime(Timestamp addTime) {
      this.addTime = addTime;
   }

   public int getDiscussCount() {
      return discussCount;
   }

   public void setDiscussCount(int discussCount) {
      this.discussCount = discussCount;
   }

   public String getTopicDescription() {
      return topicDescription;
   }

   public void setTopicDescription(String topicDescription) {
      this.topicDescription = topicDescription;
   }

   public String getTopicPic() {
      return topicPic;
   }

   public void setTopicPic(String topicPic) {
      this.topicPic = topicPic;
   }

   public int getTopicLock() {
      return topicLock;
   }

   public void setTopicLock(int topicLock) {
      this.topicLock = topicLock;
   }

   public int getFocusCount() {
      return focusCount;
   }

   public void setFocusCount(int focusCount) {
      this.focusCount = focusCount;
   }

   public int getUserRelated() {
      return userRelated;
   }

   public void setUserRelated(int userRelated) {
      this.userRelated = userRelated;
   }

   public String getUrlToken() {
      return urlToken;
   }

   public void setUrlToken(String urlToken) {
      this.urlToken = urlToken;
   }

   public int getMergedId() {
      return mergedId;
   }

   public void setMergedId(int mergedId) {
      this.mergedId = mergedId;
   }

   public String getSeoTitle() {
      return seoTitle;
   }

   public void setSeoTitle(String seoTitle) {
      this.seoTitle = seoTitle;
   }

   public int getParentId() {
      return parentId;
   }

   public void setParentId(int parentId) {
      this.parentId = parentId;
   }

   public int getIsParent() {
      return isParent;
   }

   public void setIsParent(int isParent) {
      this.isParent = isParent;
   }

   public int getDiscussCountLastWeek() {
      return discussCountLastWeek;
   }

   public void setDiscussCountLastWeek(int discussCountLastWeek) {
      this.discussCountLastWeek = discussCountLastWeek;
   }

   public int getDiscussCountLastMonth() {
      return discussCountLastMonth;
   }

   public void setDiscussCountLastMonth(int discussCountLastMonth) {
      this.discussCountLastMonth = discussCountLastMonth;
   }

   public int getDiscussCountUpdate() {
      return discussCountUpdate;
   }

   public void setDiscussCountUpdate(int discussCountUpdate) {
      this.discussCountUpdate = discussCountUpdate;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      NcTopic ncTopic = (NcTopic) o;

      if (discussCount != ncTopic.discussCount) return false;
      if (discussCountLastMonth != ncTopic.discussCountLastMonth) return false;
      if (discussCountLastWeek != ncTopic.discussCountLastWeek) return false;
      if (discussCountUpdate != ncTopic.discussCountUpdate) return false;
      if (focusCount != ncTopic.focusCount) return false;
      if (isParent != ncTopic.isParent) return false;
      if (mergedId != ncTopic.mergedId) return false;
      if (parentId != ncTopic.parentId) return false;
      if (topicId != ncTopic.topicId) return false;
      if (topicLock != ncTopic.topicLock) return false;
      if (userRelated != ncTopic.userRelated) return false;
      if (addTime != null ? !addTime.equals(ncTopic.addTime) : ncTopic.addTime != null) return false;
      if (seoTitle != null ? !seoTitle.equals(ncTopic.seoTitle) : ncTopic.seoTitle != null) return false;
      if (topicDescription != null ? !topicDescription.equals(ncTopic.topicDescription) : ncTopic.topicDescription != null)
         return false;
      if (topicPic != null ? !topicPic.equals(ncTopic.topicPic) : ncTopic.topicPic != null) return false;
      if (topicTitle != null ? !topicTitle.equals(ncTopic.topicTitle) : ncTopic.topicTitle != null) return false;
      if (urlToken != null ? !urlToken.equals(ncTopic.urlToken) : ncTopic.urlToken != null) return false;

      return true;
   }

   @Override
   public int hashCode() {
      int result = (int) (topicId ^ (topicId >>> 32));
      result = 31 * result + (topicTitle != null ? topicTitle.hashCode() : 0);
      result = 31 * result + (addTime != null ? addTime.hashCode() : 0);
      result = 31 * result + discussCount;
      result = 31 * result + (topicDescription != null ? topicDescription.hashCode() : 0);
      result = 31 * result + (topicPic != null ? topicPic.hashCode() : 0);
      result = 31 * result + topicLock;
      result = 31 * result + focusCount;
      result = 31 * result + userRelated;
      result = 31 * result + (urlToken != null ? urlToken.hashCode() : 0);
      result = 31 * result + mergedId;
      result = 31 * result + (seoTitle != null ? seoTitle.hashCode() : 0);
      result = 31 * result + parentId;
      result = 31 * result + isParent;
      result = 31 * result + discussCountLastWeek;
      result = 31 * result + discussCountLastMonth;
      result = 31 * result + discussCountUpdate;
      return result;
   }

   @Override
   public String toString() {
      return "NcTopic{" +
              "topicId=" + topicId +
              ", topicTitle='" + topicTitle + '\'' +
              ", addTime=" + addTime +
              ", discussCount=" + discussCount +
              ", topicDescription='" + topicDescription + '\'' +
              ", topicPic='" + topicPic + '\'' +
              ", topicLock=" + topicLock +
              ", focusCount=" + focusCount +
              ", userRelated=" + userRelated +
              ", urlToken='" + urlToken + '\'' +
              ", mergedId=" + mergedId +
              ", seoTitle='" + seoTitle + '\'' +
              ", parentId=" + parentId +
              ", isParent=" + isParent +
              ", discussCountLastWeek=" + discussCountLastWeek +
              ", discussCountLastMonth=" + discussCountLastMonth +
              ", discussCountUpdate=" + discussCountUpdate +
              '}';
   }
}