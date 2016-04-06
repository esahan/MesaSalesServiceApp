package com.natica.sales.model.views;

import java.math.BigDecimal;

import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Feb 18 09:30:18 EET 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SmartsPlanGayrimenkulViewRowImpl extends ViewRowImpl {
    public static final int ENTITY_XXNTCSMARTSPLANGAYRIMENKUL = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        PlanGayrimenkulId {
            public Object get(SmartsPlanGayrimenkulViewRowImpl obj) {
                return obj.getPlanGayrimenkulId();
            }

            public void put(SmartsPlanGayrimenkulViewRowImpl obj, Object value) {
                obj.setPlanGayrimenkulId((BigDecimal)value);
            }
        }
        ,
        ProjeId {
            public Object get(SmartsPlanGayrimenkulViewRowImpl obj) {
                return obj.getProjeId();
            }

            public void put(SmartsPlanGayrimenkulViewRowImpl obj, Object value) {
                obj.setProjeId((BigDecimal)value);
            }
        }
        ,
        BlockPlanId {
            public Object get(SmartsPlanGayrimenkulViewRowImpl obj) {
                return obj.getBlockPlanId();
            }

            public void put(SmartsPlanGayrimenkulViewRowImpl obj, Object value) {
                obj.setBlockPlanId((BigDecimal)value);
            }
        }
        ,
        GayrimenkulId {
            public Object get(SmartsPlanGayrimenkulViewRowImpl obj) {
                return obj.getGayrimenkulId();
            }

            public void put(SmartsPlanGayrimenkulViewRowImpl obj, Object value) {
                obj.setGayrimenkulId((BigDecimal)value);
            }
        }
        ,
        Koordinatlar {
            public Object get(SmartsPlanGayrimenkulViewRowImpl obj) {
                return obj.getKoordinatlar();
            }

            public void put(SmartsPlanGayrimenkulViewRowImpl obj, Object value) {
                obj.setKoordinatlar((String)value);
            }
        }
        ,
        CreationDate {
            public Object get(SmartsPlanGayrimenkulViewRowImpl obj) {
                return obj.getCreationDate();
            }

            public void put(SmartsPlanGayrimenkulViewRowImpl obj, Object value) {
                obj.setCreationDate((Timestamp)value);
            }
        }
        ,
        LastUpdateDate {
            public Object get(SmartsPlanGayrimenkulViewRowImpl obj) {
                return obj.getLastUpdateDate();
            }

            public void put(SmartsPlanGayrimenkulViewRowImpl obj, Object value) {
                obj.setLastUpdateDate((Timestamp)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(SmartsPlanGayrimenkulViewRowImpl object);

        public abstract void put(SmartsPlanGayrimenkulViewRowImpl object, Object value);

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
    public static final int PLANGAYRIMENKULID = AttributesEnum.PlanGayrimenkulId.index();
    public static final int PROJEID = AttributesEnum.ProjeId.index();
    public static final int BLOCKPLANID = AttributesEnum.BlockPlanId.index();
    public static final int GAYRIMENKULID = AttributesEnum.GayrimenkulId.index();
    public static final int KOORDINATLAR = AttributesEnum.Koordinatlar.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SmartsPlanGayrimenkulViewRowImpl() {
    }

    /**
     * Gets XxntcSmartsPlanGayrimenkul entity object.
     * @return the XxntcSmartsPlanGayrimenkul
     */
    public EntityImpl getXxntcSmartsPlanGayrimenkul() {
        return (EntityImpl)getEntity(ENTITY_XXNTCSMARTSPLANGAYRIMENKUL);
    }

    /**
     * Gets the attribute value for PLAN_GAYRIMENKUL_ID using the alias name PlanGayrimenkulId.
     * @return the PLAN_GAYRIMENKUL_ID
     */
    public BigDecimal getPlanGayrimenkulId() {
        return (BigDecimal) getAttributeInternal(PLANGAYRIMENKULID);
    }

    /**
     * Sets <code>value</code> as attribute value for PLAN_GAYRIMENKUL_ID using the alias name PlanGayrimenkulId.
     * @param value value to set the PLAN_GAYRIMENKUL_ID
     */
    public void setPlanGayrimenkulId(BigDecimal value) {
        setAttributeInternal(PLANGAYRIMENKULID, value);
    }

    /**
     * Gets the attribute value for PROJE_ID using the alias name ProjeId.
     * @return the PROJE_ID
     */
    public BigDecimal getProjeId() {
        return (BigDecimal) getAttributeInternal(PROJEID);
    }

    /**
     * Sets <code>value</code> as attribute value for PROJE_ID using the alias name ProjeId.
     * @param value value to set the PROJE_ID
     */
    public void setProjeId(BigDecimal value) {
        setAttributeInternal(PROJEID, value);
    }

    /**
     * Gets the attribute value for BLOCK_PLAN_ID using the alias name BlockPlanId.
     * @return the BLOCK_PLAN_ID
     */
    public BigDecimal getBlockPlanId() {
        return (BigDecimal) getAttributeInternal(BLOCKPLANID);
    }

    /**
     * Sets <code>value</code> as attribute value for BLOCK_PLAN_ID using the alias name BlockPlanId.
     * @param value value to set the BLOCK_PLAN_ID
     */
    public void setBlockPlanId(BigDecimal value) {
        setAttributeInternal(BLOCKPLANID, value);
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
     * Gets the attribute value for KOORDINATLAR using the alias name Koordinatlar.
     * @return the KOORDINATLAR
     */
    public String getKoordinatlar() {
        return (String) getAttributeInternal(KOORDINATLAR);
    }

    /**
     * Sets <code>value</code> as attribute value for KOORDINATLAR using the alias name Koordinatlar.
     * @param value value to set the KOORDINATLAR
     */
    public void setKoordinatlar(String value) {
        setAttributeInternal(KOORDINATLAR, value);
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
