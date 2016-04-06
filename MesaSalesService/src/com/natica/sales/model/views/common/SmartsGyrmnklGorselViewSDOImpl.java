package com.natica.sales.model.views.common;

import org.eclipse.persistence.sdo.SDODataObject;

public class SmartsGyrmnklGorselViewSDOImpl extends SDODataObject implements SmartsGyrmnklGorselViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 7;

   public SmartsGyrmnklGorselViewSDOImpl() {}

   public java.math.BigDecimal getGayrimenkulGorselId() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setGayrimenkulGorselId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.math.BigDecimal getGayrimenkulId() {
      return getBigDecimal(START_PROPERTY_INDEX + 1);
   }

   public void setGayrimenkulId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getDosyaAdi() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setDosyaAdi(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.String getBaslik() {
      return getString(START_PROPERTY_INDEX + 3);
   }

   public void setBaslik(java.lang.String value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.math.BigDecimal getTip() {
      return getBigDecimal(START_PROPERTY_INDEX + 4);
   }

   public void setTip(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.math.BigDecimal getSira() {
      return getBigDecimal(START_PROPERTY_INDEX + 5);
   }

   public void setSira(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.sql.Timestamp getCreationDate() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 6);
   }

   public void setCreationDate(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.sql.Timestamp getLastUpdateDate() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 7);
   }

   public void setLastUpdateDate(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }


}

