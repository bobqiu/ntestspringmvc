package org.appfuse.tutorial.model;

import javax.persistence.*;
import java.util.Date;

/***********************************************************************
 * Module:  NcAttach.java
 * Author:  bob
 * Purpose: Defines the Class NcAttach
 ***********************************************************************/
@Entity
@Table(name = "nc_attach")
public class NcAttach {
   public long id;
   /** 附件名称 */
   public String fileName;
   /** 批次 Key */
   public String accessKey;
   /** 上传时间 */
   public Date addTime ;
   /** 文件位置 */
   public String fileLocation;
   public int isImage = 0;
   /** 关联类型 */
   public int itemType = 0;
   /** 关联 ID */
   public long itemId = 0;
   public int waitApproval = 0;
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name="id",nullable=false)
   public long getId() {
      return id;
   }

   public void setId(long id) {
      this.id = id;
   }
   @Column(name="file_name")
   public String getFileName() {
      return fileName;
   }

   public void setFileName(String fileName) {
      this.fileName = fileName;
   }

   @Column(name = "access_key")
   public String getAccessKey() {
      return accessKey;
   }

   public void setAccessKey(String accessKey) {
      this.accessKey = accessKey;
   }

   @Column(name = "add_time")
   public Date getAddTime() {
      return addTime;
   }

   public void setAddTime(Date addTime) {
      this.addTime = addTime;
   }

   @Column(name = "file_location")
   public String getFileLocation() {
      return fileLocation;
   }

   public void setFileLocation(String fileLocation) {
      this.fileLocation = fileLocation;
   }

   @Column(name = "is_image")
   public int getIsImage() {
      return isImage;
   }

   public void setIsImage(int isImage) {
      this.isImage = isImage;
   }

   @Column(name = "item_type")
   public int getItemType() {
      return itemType;
   }

   public void setItemType(int itemType) {
      this.itemType = itemType;
   }

   @Column(name = "item_id")
   public long getItemId() {
      return itemId;
   }

   public void setItemId(long itemId) {
      this.itemId = itemId;
   }

   @Column(name = "wait_approval")
   public int getWaitApproval() {
      return waitApproval;
   }

   public void setWaitApproval(int waitApproval) {
      this.waitApproval = waitApproval;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof NcAttach)) return false;

      NcAttach ncAttach = (NcAttach) o;

      if (id != ncAttach.id) return false;
      if (isImage != ncAttach.isImage) return false;
      if (itemId != ncAttach.itemId) return false;
      if (itemType != ncAttach.itemType) return false;
      if (waitApproval != ncAttach.waitApproval) return false;
      if (!accessKey.equals(ncAttach.accessKey)) return false;
      if (!addTime.equals(ncAttach.addTime)) return false;
      if (!fileLocation.equals(ncAttach.fileLocation)) return false;
      if (!fileName.equals(ncAttach.fileName)) return false;

      return true;
   }

   @Override
   public int hashCode() {
      int result = (int) (id ^ (id >>> 32));
      result = 31 * result + fileName.hashCode();
      result = 31 * result + accessKey.hashCode();
      result = 31 * result + addTime.hashCode();
      result = 31 * result + fileLocation.hashCode();
      result = 31 * result + isImage;
      result = 31 * result + itemType;
      result = 31 * result + (int) (itemId ^ (itemId >>> 32));
      result = 31 * result + waitApproval;
      return result;
   }

   @Override
   public String toString() {
      return "NcAttach{" +
              "id=" + id +
              ", fileName='" + fileName + '\'' +
              ", accessKey='" + accessKey + '\'' +
              ", addTime=" + addTime +
              ", fileLocation='" + fileLocation + '\'' +
              ", isImage=" + isImage +
              ", itemType=" + itemType +
              ", itemId=" + itemId +
              ", waitApproval=" + waitApproval +
              '}';
   }
}