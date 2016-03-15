package org.appfuse.tutorial.model;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.io.Serializable;

/***********************************************************************
 * Module:  NcUsersGroup.java
 * Author:  bob
 * Purpose: Defines the Class NcUsersGroup
 ***********************************************************************/
@Entity
@Table(name = "nc_users_group")
@NamedQueries({
        @NamedQuery(
                name = "findRoleByName",
                query = "select r from NcUsersGroup r where r.groupName = :name "
        )
})
public class NcUsersGroup  extends BaseObject implements Serializable, GrantedAuthority {
   public long groupId;
   /** 0-会员组 1-系统组 */
   public int type = 0;
   /** 是否自定义 */
   public int custom = 0;
   public String groupName;
   public int reputationLower = 0;
   public int reputationHiger = 0;
   /** 威望系数 */
   public float reputationFactor = 0;
   /** 权限设置 */
   public String permission;

   public NcUsersGroup() {
   }

   public NcUsersGroup(String groupName) {
      this.groupName = groupName;
   }

   @Id
@GeneratedValue(strategy = GenerationType.AUTO)
   public long getGroupId() {
      return groupId;
   }

   public void setGroupId(long groupId) {
      this.groupId = groupId;
   }

   public int getType() {
      return type;
   }

   public void setType(int type) {
      this.type = type;
   }

   public int getCustom() {
      return custom;
   }

   public void setCustom(int custom) {
      this.custom = custom;
   }

   public String getGroupName() {
      return groupName;
   }

   public void setGroupName(String groupName) {
      this.groupName = groupName;
   }

   public int getReputationLower() {
      return reputationLower;
   }

   public void setReputationLower(int reputationLower) {
      this.reputationLower = reputationLower;
   }

   public int getReputationHiger() {
      return reputationHiger;
   }

   public void setReputationHiger(int reputationHiger) {
      this.reputationHiger = reputationHiger;
   }

   public float getReputationFactor() {
      return reputationFactor;
   }

   public void setReputationFactor(float reputationFactor) {
      this.reputationFactor = reputationFactor;
   }

   public String getPermission() {
      return permission;
   }

   public void setPermission(String permission) {
      this.permission = permission;
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

   /**
    * If the <code>GrantedAuthority</code> can be represented as a <code>String</code> and that
    * <code>String</code> is sufficient in precision to be relied upon for an access control decision by an {@link
    * AccessDecisionManager} (or delegate), this method should return such a <code>String</code>.
    * <p/>
    * If the <code>GrantedAuthority</code> cannot be expressed with sufficient precision as a <code>String</code>,
    * <code>null</code> should be returned. Returning <code>null</code> will require an
    * <code>AccessDecisionManager</code> (or delegate) to specifically support the <code>GrantedAuthority</code>
    * implementation, so returning <code>null</code> should be avoided unless actually required.
    *
    * @return a representation of the granted authority (or <code>null</code> if the granted authority cannot be
    * expressed as a <code>String</code> with sufficient precision).
    */
   @Override
   @Transient
   public String getAuthority() {
      return getGroupName();
   }
}