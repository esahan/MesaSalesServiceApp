package com.natica.sales.model.views.common;

import org.eclipse.persistence.sdo.SDODataObject;

public class SmartsPlanGayrimenkulViewSDOImpl extends SDODataObject implements SmartsPlanGayrimenkulViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 6;

   public SmartsPlanGayrimenkulViewSDOImpl() {}

   public java.math.BigDecimal getPlanGayrimenkulId() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setPlanGayrimenkulId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.math.BigDecimal getProjeId() {
      return getBigDecimal(START_PROPERTY_INDEX + 1);
   }

   public void setProjeId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.math.BigDecimal getBlockPlanId() {
      return getBigDecimal(START_PROPERTY_INDEX + 2);
   }

   public void setBlockPlanId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.math.BigDecimal getGayrimenkulId() {
      return getBigDecimal(START_PROPERTY_INDEX + 3);
   }

   public void setGayrimenkulId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.lang.String getKoordinatlar() {
      return getString(START_PROPERTY_INDEX + 4);
   }

   public void setKoordinatlar(java.lang.String value) {
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

