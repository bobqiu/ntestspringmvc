package org.appfuse.tutorial.model;

import javax.persistence.*;
import java.util.Date;

/***********************************************************************
 * Module:  NcQuestionComments.java
 * Author:  bob
 * Purpose: Defines the Class NcQuestionComments
 ***********************************************************************/
@Entity
@Table(name="nc_question_comments")
public class NcQuestionComments {
   private long id;
   //private int questionId = 0;
   private int uid = 0;
   private String message;
   private Date time;
   //@ManyToOne
  // @JoinColumn(name="ncQuestion")
   private NcQuestion ncQuestion;


 /*  @Column(name = "questionId")
   public int getQuestionId() {
      return questionId;
   }

   public void setQuestionId(int questionId) {
      this.questionId = questionId;
   }*/
@Column(name = "uid")
   public int getUid() {
      return uid;
   }

   public void setUid(int uid) {
      this.uid = uid;
   }
   @Column(name = "message")
   public String getMessage() {
      return message;
   }

   public void setMessage(String message) {
      this.message = message;
   }
   @Column(name = "time")
   public Date getTime() {
      return time;
   }

   public void setTime(Date time) {
      this.time = time;
   }
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "question_id")
   public NcQuestion getNcQuestion() {
      return ncQuestion;
   }

   public void setNcQuestion(NcQuestion ncQuestion) {
      this.ncQuestion = ncQuestion;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      NcQuestionComments that = (NcQuestionComments) o;

      if (id != that.id) return false;
     // if (questionId != that.questionId) return false;
      if (time != that.time) return false;
      if (uid != that.uid) return false;
      if (message != null ? !message.equals(that.message) : that.message != null) return false;
      if (ncQuestion != null ? !ncQuestion.equals(that.ncQuestion) : that.ncQuestion != null) return false;

      return true;
   }


   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "id")
   public long getId() {
      return id;
   }

   public void setId(long id) {
      this.id = id;
   }


}