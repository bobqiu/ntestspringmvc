package org.appfuse.tutorial.model; /***********************************************************************
 * Module:  NcMailQueue.java
 * Author:  bob
 * Purpose: Defines the Class NcMailQueue
 ***********************************************************************/

public class NcMailQueue {
   public long id;
   public String sendTo;
   public String subject;
   public String message;
   public int isError = 0;
   public String errorMessage;

}