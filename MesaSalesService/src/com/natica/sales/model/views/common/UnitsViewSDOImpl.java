package com.natica.sales.model.views.common;

import org.eclipse.persistence.sdo.SDODataObject;

public class UnitsViewSDOImpl extends SDODataObject implements UnitsViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 15;

   public UnitsViewSDOImpl() {}

   public java.math.BigDecimal getGayrimenkulId() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setGayrimenkulId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.math.BigDecimal getProjeId() {
      return getBigDecimal(START_PROPERTY_INDEX + 1);
   }

   public void setProjeId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getProjeAdi() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setProjeAdi(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.math.BigDecimal getEtapId() {
      return getBigDecimal(START_PROPERTY_INDEX + 3);
   }

   public void setEtapId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.lang.String getEtapAdi() {
      return getString(START_PROPERTY_INDEX + 4);
   }

   public void setEtapAdi(java.lang.String value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.math.BigDecimal getBlokId() {
      return getBigDecimal(START_PROPERTY_INDEX + 5);
   }

   public void setBlokId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.lang.String getBlokAdi() {
      return getString(START_PROPERTY_INDEX + 6);
   }

   public void setBlokAdi(java.lang.String value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.lang.String getGayrimenkulAdi() {
      return getString(START_PROPERTY_INDEX + 7);
   }

   public void setGayrimenkulAdi(java.lang.String value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }

   public java.lang.String getKat() {
      return getString(START_PROPERTY_INDEX + 8);
   }

   public void setKat(java.lang.String value) {
      set(START_PROPERTY_INDEX + 8 , value);
   }

   public java.lang.String getDaireNo() {
      return getString(START_PROPERTY_INDEX + 9);
   }

   public void setDaireNo(java.lang.String value) {
      set(START_PROPERTY_INDEX + 9 , value);
   }

   public java.lang.String getDaireTipi() {
      return getString(START_PROPERTY_INDEX + 10);
   }

   public void setDaireTipi(java.lang.String value) {
      set(START_PROPERTY_INDEX + 10 , value);
   }

   public java.lang.String getCephe() {
      return getString(START_PROPERTY_INDEX + 11);
   }

   public void setCephe(java.lang.String value) {
      set(START_PROPERTY_INDEX + 11 , value);
   }

   public java.math.BigDecimal getNetAlanM2() {
      return getBigDecimal(START_PROPERTY_INDEX + 12);
   }

   public void setNetAlanM2(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 12 , value);
   }

   public java.math.BigDecimal getBrutAlanM2() {
      return getBigDecimal(START_PROPERTY_INDEX + 13);
   }

   public void setBrutAlanM2(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 13 , value);
   }

   public java.math.BigDecimal getGuncelListeFiyati() {
      return getBigDecimal(START_PROPERTY_INDEX + 14);
   }

   public void setGuncelListeFiyati(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 14 , value);
   }

   public java.lang.String getKonutStatusu() {
      return getString(START_PROPERTY_INDEX + 15);
   }

   public void setKonutStatusu(java.lang.String value) {
      set(START_PROPERTY_INDEX + 15 , value);
   }


}

