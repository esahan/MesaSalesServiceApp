package com.natica.sales.model.views.common;

import org.eclipse.persistence.sdo.SDODataObject;

public class SmartsVaziyetViewSDOImpl extends SDODataObject implements SmartsVaziyetViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 3;

   public SmartsVaziyetViewSDOImpl() {}

   public java.math.BigDecimal getProjectId() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setProjectId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getDosyaIsmi() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setDosyaIsmi(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.sql.Timestamp getCreationDate() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 2);
   }

   public void setCreationDate(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.sql.Timestamp getLastUpdateDate() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 3);
   }

   public void setLastUpdateDate(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }


}

