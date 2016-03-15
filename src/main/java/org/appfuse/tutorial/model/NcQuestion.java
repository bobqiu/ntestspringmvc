package org.appfuse.tutorial.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * ********************************************************************
 * Module:  NcQuestion.java
 * Author:  bob
 * Purpose: Defines the Class NcQuestion
 * *********************************************************************
 */
@Entity
@Table(name = "nc_question")
public class NcQuestion {
    private long questionId;
    /**
     * 问题内容
     */
    private String questionContent = "";
    /**
     * 问题说明
     */
    private String questionDetail;
    /**
     * 添加时间
     */
    private Date addTime;
    private Date updateTime;
    /**
     * 发布用户UID
     */
    private int publishedUid;
    /**
     * 回答计数
     */
    private int answerCount = 0;
    /**
     * 回答人数
     */
    private int answerUsers = 0;
    /**
     * 浏览次数
     */
    private int viewCount = 0;
    /**
     * 关注数
     */
    private int focusCount = 0;
    /**
     * 评论数
     */
    private int commentCount = 0;
    /**
     * 动作的记录表的关连id
     */
    private int actionHistoryId = 0;
    /**
     * 分类 ID
     */
    private int categoryId = 0;
    /**
     * 回复赞同数总和
     */
    private int agreeCount = 0;
    /**
     * 回复反对数总和
     */
    private int againstCount = 0;
    /**
     * 最佳回复 ID
     */
    private int bestAnswer = 0;
    /**
     * 是否存在附件
     */
    private int hasAttach = 0;
    private String unverifiedModify;
    private int unverifiedModifyCount = 0;
    private long ip;
    /**
     * 最后回答 ID
     */
    private int lastAnswer = 0;
    private double popularValue = 0;
    private int popularValueUpdate = 0;
    /**
     * 是否锁定
     */
    private int isLock = 0;
    private int anonymous = 0;
    private int thanksCount = 0;
    private String questionContentFulltext;
    private int isRecommend = 0;
    private long weiboMsgId;
    private int receivedEmailId;
    private int chapterId;
    private int sort = 0;


    private Set<NcQuestionComments> ncQuestionComments = new HashSet<NcQuestionComments>();

    private Set<NcQuestionFocus> ncQuestionFocus = new HashSet<NcQuestionFocus>();



    @OneToMany(cascade = CascadeType.MERGE, mappedBy = "ncQuestion", fetch = FetchType.LAZY)

    public Set<NcQuestionComments> getNcQuestionComments() {
        return ncQuestionComments;
    }

    public void setNcQuestionComments(Set<NcQuestionComments> ncQuestionComments) {
        this.ncQuestionComments = ncQuestionComments;
    }
    @OneToMany(cascade = CascadeType.MERGE, mappedBy = "ncQuestion", fetch = FetchType.LAZY)
    public Set<NcQuestionFocus> getNcQuestionFocus() {
        return ncQuestionFocus;
    }

    public void setNcQuestionFocus(Set<NcQuestionFocus> ncQuestionFocus) {
        this.ncQuestionFocus = ncQuestionFocus;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NcQuestion that = (NcQuestion) o;

        if (actionHistoryId != that.actionHistoryId) return false;
        if (addTime != that.addTime) return false;
        if (againstCount != that.againstCount) return false;
        if (agreeCount != that.agreeCount) return false;
        if (anonymous != that.anonymous) return false;
        if (answerCount != that.answerCount) return false;
        if (answerUsers != that.answerUsers) return false;
        if (bestAnswer != that.bestAnswer) return false;
        if (categoryId != that.categoryId) return false;
        if (chapterId != that.chapterId) return false;
        if (commentCount != that.commentCount) return false;
        if (focusCount != that.focusCount) return false;
        if (hasAttach != that.hasAttach) return false;
        if (ip != that.ip) return false;
        if (isLock != that.isLock) return false;
        if (isRecommend != that.isRecommend) return false;
        if (lastAnswer != that.lastAnswer) return false;
        if (Double.compare(that.popularValue, popularValue) != 0) return false;
        if (popularValueUpdate != that.popularValueUpdate) return false;
        if (publishedUid != that.publishedUid) return false;
        if (questionId != that.questionId) return false;
        if (receivedEmailId != that.receivedEmailId) return false;
        if (sort != that.sort) return false;
        if (thanksCount != that.thanksCount) return false;
        if (unverifiedModifyCount != that.unverifiedModifyCount) return false;
        if (updateTime != that.updateTime) return false;
        if (viewCount != that.viewCount) return false;
        if (weiboMsgId != that.weiboMsgId) return false;
        if (questionContent != null ? !questionContent.equals(that.questionContent) : that.questionContent != null)
            return false;
        if (questionContentFulltext != null ? !questionContentFulltext.equals(that.questionContentFulltext) : that.questionContentFulltext != null)
            return false;
        if (questionDetail != null ? !questionDetail.equals(that.questionDetail) : that.questionDetail != null)
            return false;
        if (unverifiedModify != null ? !unverifiedModify.equals(that.unverifiedModify) : that.unverifiedModify != null)
            return false;

        return true;
    }*/


    @Column(name = "answer_users")
    public int getAnswerUsers() {

        return answerUsers;
    }

    public void setAnswerUsers(int answerUsers) {
        this.answerUsers = answerUsers;
    }

  /* @Lob
   @Basic(fetch = FetchType.LAZY)
    *//*@Type(type="longtext")*//*
   @Column(name="questrion_content", columnDefinition="longtext",length = 16777216)
   public String getQuestionContent() {
      return questionContent;
   }*/

    @Column(name = "question_content")
    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "question_detail", columnDefinition = "longtext", length = 16777216)
    public String getQuestionDetail() {
        return questionDetail;
    }

    public void setQuestionDetail(String questionDetail) {
        this.questionDetail = questionDetail;
    }

    @Column(name = "add_time")
    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    @Column(name = "update_time")
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Column(name = "published_uid")
    public int getPublishedUid() {
        return publishedUid;
    }

    public void setPublishedUid(int publishedUid) {
        this.publishedUid = publishedUid;
    }

    @Column(name = "answer_count")
    public int getAnswerCount() {
        return answerCount;
    }

    public void setAnswerCount(int answerCount) {
        this.answerCount = answerCount;
    }

    @Column(name = "view_count")
    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    @Column(name = "focus_count")
    public int getFocusCount() {
        return focusCount;
    }

    public void setFocusCount(int focusCount) {
        this.focusCount = focusCount;
    }

    @Column(name = "comment_count")
    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    @Column(name = "action_history_id")
    public int getActionHistoryId() {
        return actionHistoryId;
    }

    public void setActionHistoryId(int actionHistoryId) {
        this.actionHistoryId = actionHistoryId;
    }

    @Column(name = "category_id")
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Column(name = "agree_count")
    public int getAgreeCount() {
        return agreeCount;
    }

    public void setAgreeCount(int agreeCount) {
        this.agreeCount = agreeCount;
    }

    @Column(name = "against_count")
    public int getAgainstCount() {
        return againstCount;
    }

    public void setAgainstCount(int againstCount) {
        this.againstCount = againstCount;
    }

    @Column(name = "best_answer")
    public int getBestAnswer() {
        return bestAnswer;
    }

    public void setBestAnswer(int bestAnswer) {
        this.bestAnswer = bestAnswer;
    }

    @Column(name = "has_attach")
    public int getHasAttach() {
        return hasAttach;
    }

    public void setHasAttach(int hasAttach) {
        this.hasAttach = hasAttach;
    }

    @Lob
    @Basic(fetch = FetchType.LAZY)
    // @Type(type="longtext")
    @Column(name = "unverified_modify", columnDefinition = "longtext", length = 16777216)
    public String getUnverifiedModify() {
        return unverifiedModify;
    }

 /*@Column(name="unverified_modify")
 public String getUnverifiedModify() {
    return unverifiedModify;
 }*/

    public void setUnverifiedModify(String unverifiedModify) {
        this.unverifiedModify = unverifiedModify;
    }

    @Column(name = "unverified_modify_count")
    public int getUnverifiedModifyCount() {
        return unverifiedModifyCount;
    }

    public void setUnverifiedModifyCount(int unverifiedModifyCount) {
        this.unverifiedModifyCount = unverifiedModifyCount;
    }

    @Column(name = "ip")
    public long getIp() {
        return ip;
    }

    public void setIp(long ip) {
        this.ip = ip;
    }

    @Column(name = "last_answer")
    public int getLastAnswer() {
        return lastAnswer;
    }

    public void setLastAnswer(int lastAnswer) {
        this.lastAnswer = lastAnswer;
    }

    @Column(name = "popular_value")
    public double getPopularValue() {
        return popularValue;
    }

    public void setPopularValue(double popularValue) {
        this.popularValue = popularValue;
    }

    @Column(name = "popular_value_update")
    public int getPopularValueUpdate() {
        return popularValueUpdate;
    }

    public void setPopularValueUpdate(int popularValueUpdate) {
        this.popularValueUpdate = popularValueUpdate;
    }

    @Column(name = "is_lock")
    public int getIsLock() {
        return isLock;
    }

    public void setIsLock(int isLock) {
        this.isLock = isLock;
    }

    @Column(name = "anonymous")
    public int getAnonymous() {
        return anonymous;
    }

    public void setAnonymous(int anonymous) {
        this.anonymous = anonymous;
    }

    @Column(name = "thanks_count")
    public int getThanksCount() {
        return thanksCount;
    }

    public void setThanksCount(int thanksCount) {
        this.thanksCount = thanksCount;
    }

    @Lob
    @Basic(fetch = FetchType.LAZY)
    // @Type(type="longtext")
    @Column(name = "question_content_fulltext", columnDefinition = "longtext", length = 16777216)
    public String getQuestionContentFulltext() {
        return questionContentFulltext;
    }

    /*@Type(type="longtext")*/
 /* @Column(name="question_content_fulltext")
  public String getQuestionContentFulltext() {
     return questionContentFulltext;
  }*/

    public void setQuestionContentFulltext(String questionContentFulltext) {
        this.questionContentFulltext = questionContentFulltext;
    }

    @Column(name = "is_recommend")
    public int getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(int isRecommend) {
        this.isRecommend = isRecommend;
    }

    @Column(name = "weibo_msg_id")
    public long getWeiboMsgId() {
        return weiboMsgId;
    }

    public void setWeiboMsgId(long weiboMsgId) {
        this.weiboMsgId = weiboMsgId;
    }

    @Column(name = "received_email_id")
    public int getReceivedEmailId() {
        return receivedEmailId;
    }

    public void setReceivedEmailId(int receivedEmailId) {
        this.receivedEmailId = receivedEmailId;
    }

    @Column(name = "chapter_id")
    public int getChapterId() {
        return chapterId;
    }

    public void setChapterId(int chapterId) {
        this.chapterId = chapterId;
    }

    @Column(name = "sort")
    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "question_id")
    public long getQuestionId() {

        return questionId;
    }

    public void setQuestionId(long questionId) {
        this.questionId = questionId;
    }

   /* @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (questionId ^ (questionId >>> 32));
        result = 31 * result + questionContent.hashCode();
        result = 31 * result + questionDetail.hashCode();
        result = 31 * result + addTime.hashCode();
        result = 31 * result + updateTime.hashCode();
        result = 31 * result + publishedUid;
        result = 31 * result + answerCount;
        result = 31 * result + answerUsers;
        result = 31 * result + viewCount;
        result = 31 * result + focusCount;
        result = 31 * result + commentCount;
        result = 31 * result + actionHistoryId;
        result = 31 * result + categoryId;
        result = 31 * result + agreeCount;
        result = 31 * result + againstCount;
        result = 31 * result + bestAnswer;
        result = 31 * result + hasAttach;
        result = 31 * result + unverifiedModify.hashCode();
        result = 31 * result + unverifiedModifyCount;
        result = 31 * result + (int) (ip ^ (ip >>> 32));
        result = 31 * result + lastAnswer;
        temp = Double.doubleToLongBits(popularValue);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + popularValueUpdate;
        result = 31 * result + isLock;
        result = 31 * result + anonymous;
        result = 31 * result + thanksCount;
        result = 31 * result + questionContentFulltext.hashCode();
        result = 31 * result + isRecommend;
        result = 31 * result + (int) (weiboMsgId ^ (weiboMsgId >>> 32));
        result = 31 * result + receivedEmailId;
        result = 31 * result + chapterId;
        result = 31 * result + sort;
        return result;
    }*/
}