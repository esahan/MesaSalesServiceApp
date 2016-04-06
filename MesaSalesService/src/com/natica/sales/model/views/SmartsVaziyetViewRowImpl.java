package com.natica.sales.model.views;

import com.natica.sales.model.entities.SmartsVaziyetImpl;

import java.math.BigDecimal;

import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Feb 17 16:00:02 EET 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SmartsVaziyetViewRowImpl extends ViewRowImpl {

    public static final int ENTITY_XXNTCSMARTSVAZIYET = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        ProjectId {
            public Object get(SmartsVaziyetViewRowImpl obj) {
                return obj.getProjectId();
            }

            public void put(SmartsVaziyetViewRowImpl obj, Object value) {
                obj.setProjectId((BigDecimal)value);
            }
        }
        ,
        DosyaIsmi {
            public Object get(SmartsVaziyetViewRowImpl obj) {
                return obj.getDosyaIsmi();
            }

            public void put(SmartsVaziyetViewRowImpl obj, Object value) {
                obj.setDosyaIsmi((String)value);
            }
        }
        ,
        CreationDate {
            public Object get(SmartsVaziyetViewRowImpl obj) {
                return obj.getCreationDate();
            }

            public void put(SmartsVaziyetViewRowImpl obj, Object value) {
                obj.setCreationDate((Timestamp)value);
            }
        }
        ,
        LastUpdateDate {
            public Object get(SmartsVaziyetViewRowImpl obj) {
                return obj.getLastUpdateDate();
            }

            public void put(SmartsVaziyetViewRowImpl obj, Object value) {
                obj.setLastUpdateDate((Timestamp)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(SmartsVaziyetViewRowImpl object);

        public abstract void put(SmartsVaziyetViewRowImpl object, Object value);

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

    public static final int PROJECTID = AttributesEnum.ProjectId.index();
    public static final int DOSYAISMI = AttributesEnum.DosyaIsmi.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SmartsVaziyetViewRowImpl() {
    }

    /**
     * Gets XxntcSmartsVaziyet entity object.
     * @return the XxntcSmartsVaziyet
     */
    public SmartsVaziyetImpl getXxntcSmartsVaziyet() {
        return (SmartsVaziyetImpl)getEntity(ENTITY_XXNTCSMARTSVAZIYET);
    }


    /**
     * Gets the attribute value for PROJECT_ID using the alias name ProjectId.
     * @return the PROJECT_ID
     */
    public BigDecimal getProjectId() {
        return (BigDecimal) getAttributeInternal(PROJECTID);
    }

    /**
     * Sets <code>value</code> as attribute value for PROJECT_ID using the alias name ProjectId.
     * @param value value to set the PROJECT_ID
     */
    public void setProjectId(BigDecimal value) {
        setAttributeInternal(PROJECTID, value);
    }

    /**
     * Gets the attribute value for DOSYA_ISMI using the alias name DosyaIsmi.
     * @return the DOSYA_ISMI
     */
    public String getDosyaIsmi() {
        return (String) getAttributeInternal(DOSYAISMI);
    }

    /**
     * Sets <code>value</code> as attribute value for DOSYA_ISMI using the alias name DosyaIsmi.
     * @param value value to set the DOSYA_ISMI
     */
    public void setDosyaIsmi(String value) {
        setAttributeInternal(DOSYAISMI, value);
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
