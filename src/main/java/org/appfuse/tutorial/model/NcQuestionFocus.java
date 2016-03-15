package org.appfuse.tutorial.model; /***********************************************************************
 * Module:  NcQuestionFocus.java
 * Author:  bob
 * Purpose: Defines the Class NcQuestionFocus
 ***********************************************************************/

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "nc_question_focus")
public class NcQuestionFocus {
   /** 自增ID */
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "focus_id")
   private long focusId;
   /**
    * 话题ID
    */
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "question_id")
   private NcQuestion ncQuestion;
  // public int questionId;
   /** 用户UID */
   @Column(name = "uid")
   private int uid;
   @Column(name = "add_time")
   private Date addTime;


   public long getFocusId() {
      return focusId;
   }

   public void setFocusId(long focusId) {
      this.focusId = focusId;
   }

   public NcQuestion getNcQuestion() {
      return ncQuestion;
   }

   public void setNcQuestion(NcQuestion ncQuestion) {
      this.ncQuestion = ncQuestion;
   }

   public int getUid() {
      return uid;
   }

   public void setUid(int uid) {
      this.uid = uid;
   }

   public Date getAddTime() {
      return addTime;
   }

   public void setAddTime(Date addTime) {
      this.addTime = addTime;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      NcQuestionFocus that = (NcQuestionFocus) o;

      if (focusId != that.focusId) return false;
      if (uid != that.uid) return false;
      if (addTime != null ? !addTime.equals(that.addTime) : that.addTime != null) return false;
      if (ncQuestion != null ? !ncQuestion.equals(that.ncQuestion) : that.ncQuestion != null) return false;

      return true;
   }

   @Override
   public int hashCode() {
      int result = (int) (focusId ^ (focusId >>> 32));
      result = 31 * result + (ncQuestion != null ? ncQuestion.hashCode() : 0);
      result = 31 * result + uid;
      result = 31 * result + (addTime != null ? addTime.hashCode() : 0);
      return result;
   }
}