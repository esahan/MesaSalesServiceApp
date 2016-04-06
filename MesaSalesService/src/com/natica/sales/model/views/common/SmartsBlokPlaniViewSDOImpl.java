package com.natica.sales.model.views.common;

import org.eclipse.persistence.sdo.SDODataObject;

public class SmartsBlokPlaniViewSDOImpl extends SDODataObject implements SmartsBlokPlaniViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 6;

   public SmartsBlokPlaniViewSDOImpl() {}

   public java.math.BigDecimal getBlokPlaniId() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setBlokPlaniId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.math.BigDecimal getProjectId() {
      return getBigDecimal(START_PROPERTY_INDEX + 1);
   }

   public void setProjectId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getBlokPlaniGorseli() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setBlokPlaniGorseli(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.math.BigDecimal getKoorX() {
      return getBigDecimal(START_PROPERTY_INDEX + 3);
   }

   public void setKoorX(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.math.BigDecimal getKoorY() {
      return getBigDecimal(START_PROPERTY_INDEX + 4);
   }

   public void setKoorY(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.sql.Timestamp getCreationDate() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 5);
   }

   public void setCreationDate(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.sql.Timestamp getLastUpdateDate() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 6);
   }

   public void setLastUpdateDate(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }


}

