package com.natica.sales.model.views.response.common;

import org.eclipse.persistence.sdo.SDODataObject;

public class SmartsCrudResponseSDOImpl extends SDODataObject implements SmartsCrudResponseSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 2;

   public SmartsCrudResponseSDOImpl() {}

   public java.math.BigDecimal getId() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.Integer getResponseCode() {
      return new Integer(getInt(START_PROPERTY_INDEX + 1));
   }

   public void setResponseCode(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getMessage() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setMessage(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }


}

