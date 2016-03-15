package org.appfuse.tutorial.model; /***********************************************************************
 * Module:  NcCategory.java
 * Author:  bob
 * Purpose: Defines the Class NcCategory
 ***********************************************************************/

import java.util.*;

public class NcCategory {
   public long id;
   public String title;
   public String type;
   public String icon;
   public int parentId = 0;
   public short sort = 0;
   public String urlToken;

}