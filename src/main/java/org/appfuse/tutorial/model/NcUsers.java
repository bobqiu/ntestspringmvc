package org.appfuse.tutorial.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/***********************************************************************
 * Module:  NcUsers.java
 * Author:  bob
 * Purpose: Defines the Class NcUsers
 ***********************************************************************/
@Entity
@Table(name = "nc_users")
public class NcUsers extends BaseObject implements Serializable, UserDetails {
   /** 用户的 UID */
   public long uid;
   /** 用户名 */
   public String userName;
   /** EMAIL */
   public String email;
   /** 用户手机 */
   public String mobile;
   /** 用户密码 */
   public String password;
   /** 用户附加混淆码 */
   public String salt;
   /** 头像文件 */
   public String avatarFile;
   /** 性别 */
   public String sex;
   /** 生日 */
   public int birthday;
   /** 省 */
   public String province;
   /** 市 */
   public String city;
   /** 职业ID */
   public int jobId = 0;
   /** 注册时间 */
   public int regTime;
   /** 注册IP */
   public long regIp;
   /** 最后登录时间 */
   public int lastLogin = 0;
   /** 最后登录 IP */
   public long lastIp;
   /** 在线时间 */
   public int onlineTime = 0;
   /** 最后活跃时间 */
   public int lastActive;
   /** 未读系统通知 */
   public int notificationUnread = 0;
   /** 未读短信息 */
   public int inboxUnread = 0;
   /** 0-所有人可以发给我,1-我关注的人 */
   public int inboxRecv = 0;
   /** 粉丝数 */
   public int fansCount = 0;
   /** 观众数 */
   public int friendCount = 0;
   /** 邀请我回答数量 */
   public int inviteCount = 0;
   /** 问题数量 */
   public int questionCount = 0;
   /** 回答数量 */
   public int answerCount = 0;
   /** 关注话题数量 */
   public int topicFocusCount = 0;
   /** 邀请数量 */
   public int invitationAvailable = 0;
   /** 用户组 */
   public int groupId = 0;
   /** 威望对应组 */
   public int reputationGroup = 0;
   /** 是否禁止用户 */
   public int forbidden = 0;
   /** 邮箱验证 */
   public int validEmail = 0;
   /** 首次登录标记 */
   public int isFirstLogin = 1;
   /** 赞同数量 */
   public int agreeCount = 0;
   /** 感谢数量 */
   public int thanksCount = 0;
   /** 个人主页查看数量 */
   public int viewsCount = 0;
   /** 威望 */
   public int reputation = 0;
   /** 威望更新 */
   public int reputationUpdateTime = 0;
   /** 微博允许访问 */
   public int weiboVisit = 1;
   public int integral = 0;
   public int draftCount;
   /** 常用邮箱 */
   public String commonEmail;
   /** 个性网址 */
   public String urlToken;
   public int urlTokenUpdate = 0;
   public String verified;
   public String defaultTimezone;
   public String emailSettings = "";
   public String weixinSettings = "";
   public String recentTopics;

   private Set<NcUsersGroup> usersGroups = new HashSet<NcUsersGroup>();
   private boolean enabled;
   private boolean accountExpired;
   private boolean accountLocked;
   private boolean credentialsExpired;

   public NcUsers() {
   }
   public NcUsers(final String userName) {
      this.userName = userName;
   }
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   public long getUid() {
      return uid;
   }

   public void setUid(long uid) {
      this.uid = uid;
   }
   @Column(name="user_name")
   public String getUserName() {
      return userName;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }
   @Column
   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }
   @Column
   public String getMobile() {
      return mobile;
   }

   public void setMobile(String mobile) {
      this.mobile = mobile;
   }

   /**
    * Returns the authorities granted to the user. Cannot return <code>null</code>.
    *
    * @return the authorities, sorted by natural key (never <code>null</code>)
    */
   @Transient
   public Set<GrantedAuthority> getAuthorities() {
      Set<GrantedAuthority> authorities = new LinkedHashSet<GrantedAuthority>();
      authorities.addAll(usersGroups);
      return authorities;
   }
   @Column
   public String getPassword() {
      return password;
   }

   /**
    * Returns the username used to authenticate the user. Cannot return <code>null</code>.
    *
    * @return the username (never <code>null</code>)
    */
   @Transient
   public String getUsername() {
      return null;
   }

   /**
    * Indicates whether the user's account has expired. An expired account cannot be authenticated.
    *
    * @return <code>true</code> if the user's account is valid (ie non-expired), <code>false</code> if no longer valid
    * (ie expired)
    */
   @Transient
   public boolean isAccountNonExpired() {
      return false;
   }

   /**
    * Indicates whether the user is locked or unlocked. A locked user cannot be authenticated.
    *
    * @return <code>true</code> if the user is not locked, <code>false</code> otherwise
    */
   @Transient
   public boolean isAccountNonLocked() {
      return false;
   }

   /**
    * Indicates whether the user's credentials (password) has expired. Expired credentials prevent
    * authentication.
    *
    * @return <code>true</code> if the user's credentials are valid (ie non-expired), <code>false</code> if no longer
    * valid (ie expired)
    */
   @Transient
   public boolean isCredentialsNonExpired() {
      return false;
   }

   public void setPassword(String password) {
      this.password = password;
   }
   @Column
   public String getSalt() {
      return salt;
   }

   public void setSalt(String salt) {
      this.salt = salt;
   }
   @Column(name="avatar_file")
   public String getAvatarFile() {
      return avatarFile;
   }

   public void setAvatarFile(String avatarFile) {
      this.avatarFile = avatarFile;
   }
   @Column
   public String getSex() {
      return sex;
   }

   public void setSex(String sex) {
      this.sex = sex;
   }
   @Column
   public int getBirthday() {
      return birthday;
   }

   public void setBirthday(int birthday) {
      this.birthday = birthday;
   }
   @Column
   public String getProvince() {
      return province;
   }

   public void setProvince(String province) {
      this.province = province;
   }
   @Column
   public String getCity() {
      return city;
   }

   public void setCity(String city) {
      this.city = city;
   }
@Column(name="job_id")
   public int getJobId() {
      return jobId;
   }

   public void setJobId(int jobId) {
      this.jobId = jobId;
   }
   @Column(name="reg_time")
   public int getRegTime() {
      return regTime;
   }

   public void setRegTime(int regTime) {
      this.regTime = regTime;
   }
   @Column(name = "reg_ip")
   public long getRegIp() {
      return regIp;
   }

   public void setRegIp(long regIp) {
      this.regIp = regIp;
   }
   @Column(name = "last_login")
   public int getLastLogin() {
      return lastLogin;
   }

   public void setLastLogin(int lastLogin) {
      this.lastLogin = lastLogin;
   }
   @Column(name = "last_ip")
   public long getLastIp() {
      return lastIp;
   }

   public void setLastIp(long lastIp) {
      this.lastIp = lastIp;
   }
   @Column(name = "online_time")
   public int getOnlineTime() {
      return onlineTime;
   }

   public void setOnlineTime(int onlineTime) {
      this.onlineTime = onlineTime;
   }
   @Column(name = "last_active")
   public int getLastActive() {
      return lastActive;
   }

   public void setLastActive(int lastActive) {
      this.lastActive = lastActive;
   }
   @Column(name ="notification_unread")
   public int getNotificationUnread() {
      return notificationUnread;
   }

   public void setNotificationUnread(int notificationUnread) {
      this.notificationUnread = notificationUnread;
   }
   @Column(name = "inbox_unread")
   public int getInboxUnread() {
      return inboxUnread;
   }

   public void setInboxUnread(int inboxUnread) {
      this.inboxUnread = inboxUnread;
   }
   @Column(name = "inbox_recv")
   public int getInboxRecv() {
      return inboxRecv;
   }

   public void setInboxRecv(int inboxRecv) {
      this.inboxRecv = inboxRecv;
   }
   @Column(name = "fans_count")
   public int getFansCount() {
      return fansCount;
   }

   public void setFansCount(int fansCount) {
      this.fansCount = fansCount;
   }
   @Column(name = "friend_count")
   public int getFriendCount() {
      return friendCount;
   }

   public void setFriendCount(int friendCount) {
      this.friendCount = friendCount;
   }
   @Column(name="invite_count")
   public int getInviteCount() {
      return inviteCount;
   }

   public void setInviteCount(int inviteCount) {
      this.inviteCount = inviteCount;
   }
   @Column(name="question_count")
   public int getQuestionCount() {
      return questionCount;
   }

   public void setQuestionCount(int questionCount) {
      this.questionCount = questionCount;
   }
   @Column(name = "answer_count")
   public int getAnswerCount() {
      return answerCount;
   }

   public void setAnswerCount(int answerCount) {
      this.answerCount = answerCount;
   }
   @Column(name = "topic_focus_count")
   public int getTopicFocusCount() {
      return topicFocusCount;
   }

   public void setTopicFocusCount(int topicFocusCount) {
      this.topicFocusCount = topicFocusCount;
   }
   @Column(name = "invitation_available")
   public int getInvitationAvailable() {
      return invitationAvailable;
   }

   public void setInvitationAvailable(int invitationAvailable) {
      this.invitationAvailable = invitationAvailable;
   }
   @Column(name = "group_id")
   public int getGroupId() {
      return groupId;
   }

   public void setGroupId(int groupId) {
      this.groupId = groupId;
   }
   @Column(name = "reputation_group")
   public int getReputationGroup() {
      return reputationGroup;
   }

   public void setReputationGroup(int reputationGroup) {
      this.reputationGroup = reputationGroup;
   }
   @Column
   public int getForbidden() {
      return forbidden;
   }

   public void setForbidden(int forbidden) {
      this.forbidden = forbidden;
   }
   @Column(name="valid_email")
   public int getValidEmail() {
      return validEmail;
   }

   public void setValidEmail(int validEmail) {
      this.validEmail = validEmail;
   }
   @Column(name="is_first_login")
   public int getIsFirstLogin() {
      return isFirstLogin;
   }

   public void setIsFirstLogin(int isFirstLogin) {
      this.isFirstLogin = isFirstLogin;
   }
   @Column(name = "agree_count")
   public int getAgreeCount() {
      return agreeCount;
   }

   public void setAgreeCount(int agreeCount) {
      this.agreeCount = agreeCount;
   }
   @Column(name="thanks_count")
   public int getThanksCount() {
      return thanksCount;
   }

   public void setThanksCount(int thanksCount) {
      this.thanksCount = thanksCount;
   }
   @Column(name = "views_count")
   public int getViewsCount() {
      return viewsCount;
   }

   public void setViewsCount(int viewsCount) {
      this.viewsCount = viewsCount;
   }
   @Column
   public int getReputation() {
      return reputation;
   }

   public void setReputation(int reputation) {
      this.reputation = reputation;
   }
   @Column(name = "reputation_update_time")
   public int getReputationUpdateTime() {
      return reputationUpdateTime;
   }

   public void setReputationUpdateTime(int reputationUpdateTime) {
      this.reputationUpdateTime = reputationUpdateTime;
   }
   @Column(name = "weibo_visit")
   public int getWeiboVisit() {
      return weiboVisit;
   }

   public void setWeiboVisit(int weiboVisit) {
      this.weiboVisit = weiboVisit;
   }
   @Column
   public int getIntegral() {
      return integral;
   }

   public void setIntegral(int integral) {
      this.integral = integral;
   }
   @Column(name = "draft_count")
   public int getDraftCount() {
      return draftCount;
   }

   public void setDraftCount(int draftCount) {
      this.draftCount = draftCount;
   }
   @Column(name = "common_email")
   public String getCommonEmail() {
      return commonEmail;
   }

   public void setCommonEmail(String commonEmail) {
      this.commonEmail = commonEmail;
   }
   @Column(name = "url_token")
   public String getUrlToken() {
      return urlToken;
   }

   public void setUrlToken(String urlToken) {
      this.urlToken = urlToken;
   }
   @Column(name="url_token_update")
   public int getUrlTokenUpdate() {
      return urlTokenUpdate;
   }

   public void setUrlTokenUpdate(int urlTokenUpdate) {
      this.urlTokenUpdate = urlTokenUpdate;
   }
   @Column
   public String getVerified() {
      return verified;
   }

   public void setVerified(String verified) {
      this.verified = verified;
   }
   @Column(name = "default_timezone")
   public String getDefaultTimezone() {
      return defaultTimezone;
   }

   public void setDefaultTimezone(String defaultTimezone) {
      this.defaultTimezone = defaultTimezone;
   }
   @Column(name="email_settings")
   public String getEmailSettings() {
      return emailSettings;
   }

   public void setEmailSettings(String emailSettings) {
      this.emailSettings = emailSettings;
   }
   @Column(name = "weixin_settings")
   public String getWeixinSettings() {
      return weixinSettings;
   }

   public void setWeixinSettings(String weixinSettings) {
      this.weixinSettings = weixinSettings;
   }
   @Column(name="recent_topics")
   public String getRecentTopics() {
      return recentTopics;
   }

   public void setRecentTopics(String recentTopics) {
      this.recentTopics = recentTopics;
   }

   @Transient
   public boolean isEnabled() {
      return enabled;
   }

   public void setEnabled(boolean enabled) {
      this.enabled = enabled;
   }
   @Transient
   public boolean isAccountExpired() {
      return accountExpired;
   }

   public void setAccountExpired(boolean accountExpired) {
      this.accountExpired = accountExpired;
   }
   @Transient
   public boolean isAccountLocked() {
      return accountLocked;
   }

   public void setAccountLocked(boolean accountLocked) {
      this.accountLocked = accountLocked;
   }
   @Transient
   public boolean isCredentialsExpired() {
      return credentialsExpired;
   }

   public void setCredentialsExpired(boolean credentialsExpired) {
      this.credentialsExpired = credentialsExpired;
   }

   /**
    * Returns a multi-line String with key=value pairs.
    *
    * @return a String representation of this class.
    */
   @Override
   public String toString() {
      return null;
   }

   /**
    * Compares object equality. When using Hibernate, the primary key should
    * not be a part of this comparison.
    *
    * @param o object to compare to
    * @return true/false based on equality tests
    */
   @Override
   public boolean equals(Object o) {
      return false;
   }

   /**
    * When you override equals, you should override hashCode. See "Why are
    * equals() and hashCode() importation" for more information:
    * http://www.hibernate.org/109.html
    *
    * @return hashCode
    */
   @Override
   public int hashCode() {
      return 0;
   }
}