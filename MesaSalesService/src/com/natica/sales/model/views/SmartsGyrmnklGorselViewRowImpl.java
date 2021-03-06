package com.natica.sales.model.views;

import java.math.BigDecimal;

import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Feb 18 09:30:29 EET 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SmartsGyrmnklGorselViewRowImpl extends ViewRowImpl {
    public static final int ENTITY_XXNTCSMARTSGYRMNKLGORSEL = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        GayrimenkulGorselId {
            public Object get(SmartsGyrmnklGorselViewRowImpl obj) {
                return obj.getGayrimenkulGorselId();
            }

            public void put(SmartsGyrmnklGorselViewRowImpl obj, Object value) {
                obj.setGayrimenkulGorselId((BigDecimal)value);
            }
        }
        ,
        GayrimenkulId {
            public Object get(SmartsGyrmnklGorselViewRowImpl obj) {
                return obj.getGayrimenkulId();
            }

            public void put(SmartsGyrmnklGorselViewRowImpl obj, Object value) {
                obj.setGayrimenkulId((BigDecimal)value);
            }
        }
        ,
        DosyaAdi {
            public Object get(SmartsGyrmnklGorselViewRowImpl obj) {
                return obj.getDosyaAdi();
            }

            public void put(SmartsGyrmnklGorselViewRowImpl obj, Object value) {
                obj.setDosyaAdi((String)value);
            }
        }
        ,
        Baslik {
            public Object get(SmartsGyrmnklGorselViewRowImpl obj) {
                return obj.getBaslik();
            }

            public void put(SmartsGyrmnklGorselViewRowImpl obj, Object value) {
                obj.setBaslik((String)value);
            }
        }
        ,
        Tip {
            public Object get(SmartsGyrmnklGorselViewRowImpl obj) {
                return obj.getTip();
            }

            public void put(SmartsGyrmnklGorselViewRowImpl obj, Object value) {
                obj.setTip((BigDecimal)value);
            }
        }
        ,
        Sira {
            public Object get(SmartsGyrmnklGorselViewRowImpl obj) {
                return obj.getSira();
            }

            public void put(SmartsGyrmnklGorselViewRowImpl obj, Object value) {
                obj.setSira((BigDecimal)value);
            }
        }
        ,
        CreationDate {
            public Object get(SmartsGyrmnklGorselViewRowImpl obj) {
                return obj.getCreationDate();
            }

            public void put(SmartsGyrmnklGorselViewRowImpl obj, Object value) {
                obj.setCreationDate((Timestamp)value);
            }
        }
        ,
        LastUpdateDate {
            public Object get(SmartsGyrmnklGorselViewRowImpl obj) {
                return obj.getLastUpdateDate();
            }

            public void put(SmartsGyrmnklGorselViewRowImpl obj, Object value) {
                obj.setLastUpdateDate((Timestamp)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(SmartsGyrmnklGorselViewRowImpl object);

        public abstract void put(SmartsGyrmnklGorselViewRowImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int GAYRIMENKULGORSELID = AttributesEnum.GayrimenkulGorselId.index();
    public static final int GAYRIMENKULID = AttributesEnum.GayrimenkulId.index();
    public static final int DOSYAADI = AttributesEnum.DosyaAdi.index();
    public static final int BASLIK = AttributesEnum.Baslik.index();
    public static final int TIP = AttributesEnum.Tip.index();
    public static final int SIRA = AttributesEnum.Sira.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SmartsGyrmnklGorselViewRowImpl() {
    }

    /**
     * Gets XxntcSmartsGyrmnklGorsel entity object.
     * @return the XxntcSmartsGyrmnklGorsel
     */
    public EntityImpl getXxntcSmartsGyrmnklGorsel() {
        return (EntityImpl)getEntity(ENTITY_XXNTCSMARTSGYRMNKLGORSEL);
    }

    /**
     * Gets the attribute value for GAYRIMENKUL_GORSEL_ID using the alias name GayrimenkulGorselId.
     * @return the GAYRIMENKUL_GORSEL_ID
     */
    public BigDecimal getGayrimenkulGorselId() {
        return (BigDecimal) getAttributeInternal(GAYRIMENKULGORSELID);
    }

    /**
     * Sets <code>value</code> as attribute value for GAYRIMENKUL_GORSEL_ID using the alias name GayrimenkulGorselId.
     * @param value value to set the GAYRIMENKUL_GORSEL_ID
     */
    public void setGayrimenkulGorselId(BigDecimal value) {
        setAttributeInternal(GAYRIMENKULGORSELID, value);
    }

    /**
     * Gets the attribute value for GAYRIMENKUL_ID using the alias name GayrimenkulId.
     * @return the GAYRIMENKUL_ID
     */
    public BigDecimal getGayrimenkulId() {
        return (BigDecimal) getAttributeInternal(GAYRIMENKULID);
    }

    /**
     * Sets <code>value</code> as attribute value for GAYRIMENKUL_ID using the alias name GayrimenkulId.
     * @param value value to set the GAYRIMENKUL_ID
     */
    public void setGayrimenkulId(BigDecimal value) {
        setAttributeInternal(GAYRIMENKULID, value);
    }

    /**
     * Gets the attribute value for DOSYA_ADI using the alias name DosyaAdi.
     * @return the DOSYA_ADI
     */
    public String getDosyaAdi() {
        return (String) getAttributeInternal(DOSYAADI);
    }

    /**
     * Sets <code>value</code> as attribute value for DOSYA_ADI using the alias name DosyaAdi.
     * @param value value to set the DOSYA_ADI
     */
    public void setDosyaAdi(String value) {
        setAttributeInternal(DOSYAADI, value);
    }

    /**
     * Gets the attribute value for BASLIK using the alias name Baslik.
     * @return the BASLIK
     */
    public String getBaslik() {
        return (String) getAttributeInternal(BASLIK);
    }

    /**
     * Sets <code>value</code> as attribute value for BASLIK using the alias name Baslik.
     * @param value value to set the BASLIK
     */
    public void setBaslik(String value) {
        setAttributeInternal(BASLIK, value);
    }

    /**
     * Gets the attribute value for TIP using the alias name Tip.
     * @return the TIP
     */
    public BigDecimal getTip() {
        return (BigDecimal) getAttributeInternal(TIP);
    }

    /**
     * Sets <code>value</code> as attribute value for TIP using the alias name Tip.
     * @param value value to set the TIP
     */
    public void setTip(BigDecimal value) {
        setAttributeInternal(TIP, value);
    }

    /**
     * Gets the attribute value for SIRA using the alias name Sira.
     * @return the SIRA
     */
    public BigDecimal getSira() {
        return (BigDecimal) getAttributeInternal(SIRA);
    }

    /**
     * Sets <code>value</code> as attribute value for SIRA using the alias name Sira.
     * @param value value to set the SIRA
     */
    public void setSira(BigDecimal value) {
        setAttributeInternal(SIRA, value);
    }

    /**
     * Gets the attribute value for CREATION_DATE using the alias name CreationDate.
     * @return the CREATION_DATE
     */
    public Timestamp getCreationDate() {
        return (Timestamp) getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATION_DATE using the alias name CreationDate.
     * @param value value to set the CREATION_DATE
     */
    public void setCreationDate(Timestamp value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate.
     * @return the LAST_UPDATE_DATE
     */
    public Timestamp getLastUpdateDate() {
        return (Timestamp) getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate.
     * @param value value to set the LAST_UPDATE_DATE
     */
    public void setLastUpdateDate(Timestamp value) {
        setAttributeInternal(LASTUPDATEDATE, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value, AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}
