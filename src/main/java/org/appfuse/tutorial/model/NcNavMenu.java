package org.appfuse.tutorial.model; /***********************************************************************
 * Module:  NcNavMenu.java
 * Author:  bob
 * Purpose: Defines the Class NcNavMenu
 ***********************************************************************/

import java.util.*;

public class NcNavMenu {
   public long id;
   public String title;
   public String description;
   public String type;
   public int typeId = 0;
   /** 链接 */
   public String link;
   /** 图标 */
   public String icon;
   /** 排序 */
   public short sort = 0;

}