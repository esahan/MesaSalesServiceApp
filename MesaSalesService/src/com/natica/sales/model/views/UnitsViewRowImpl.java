package com.natica.sales.model.views;

import java.math.BigDecimal;

import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Feb 07 11:42:53 VET 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class UnitsViewRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        GayrimenkulId {
            public Object get(UnitsViewRowImpl obj) {
                return obj.getGayrimenkulId();
            }

            public void put(UnitsViewRowImpl obj, Object value) {
                obj.setGayrimenkulId((BigDecimal)value);
            }
        }
        ,
        ProjeId {
            public Object get(UnitsViewRowImpl obj) {
                return obj.getProjeId();
            }

            public void put(UnitsViewRowImpl obj, Object value) {
                obj.setProjeId((BigDecimal)value);
            }
        }
        ,
        ProjeAdi {
            public Object get(UnitsViewRowImpl obj) {
                return obj.getProjeAdi();
            }

            public void put(UnitsViewRowImpl obj, Object value) {
                obj.setProjeAdi((String)value);
            }
        }
        ,
        EtapId {
            public Object get(UnitsViewRowImpl obj) {
                return obj.getEtapId();
            }

            public void put(UnitsViewRowImpl obj, Object value) {
                obj.setEtapId((BigDecimal)value);
            }
        }
        ,
        EtapAdi {
            public Object get(UnitsViewRowImpl obj) {
                return obj.getEtapAdi();
            }

            public void put(UnitsViewRowImpl obj, Object value) {
                obj.setEtapAdi((String)value);
            }
        }
        ,
        BlokId {
            public Object get(UnitsViewRowImpl obj) {
                return obj.getBlokId();
            }

            public void put(UnitsViewRowImpl obj, Object value) {
                obj.setBlokId((BigDecimal)value);
            }
        }
        ,
        BlokAdi {
            public Object get(UnitsViewRowImpl obj) {
                return obj.getBlokAdi();
            }

            public void put(UnitsViewRowImpl obj, Object value) {
                obj.setBlokAdi((String)value);
            }
        }
        ,
        GayrimenkulAdi {
            public Object get(UnitsViewRowImpl obj) {
                return obj.getGayrimenkulAdi();
            }

            public void put(UnitsViewRowImpl obj, Object value) {
                obj.setGayrimenkulAdi((String)value);
            }
        }
        ,
        Kat {
            public Object get(UnitsViewRowImpl obj) {
                return obj.getKat();
            }

            public void put(UnitsViewRowImpl obj, Object value) {
                obj.setKat((String)value);
            }
        }
        ,
        DaireNo {
            public Object get(UnitsViewRowImpl obj) {
                return obj.getDaireNo();
            }

            public void put(UnitsViewRowImpl obj, Object value) {
                obj.setDaireNo((String)value);
            }
        }
        ,
        DaireTipi {
            public Object get(UnitsViewRowImpl obj) {
                return obj.getDaireTipi();
            }

            public void put(UnitsViewRowImpl obj, Object value) {
                obj.setDaireTipi((String)value);
            }
        }
        ,
        Cephe {
            public Object get(UnitsViewRowImpl obj) {
                return obj.getCephe();
            }

            public void put(UnitsViewRowImpl obj, Object value) {
                obj.setCephe((String)value);
            }
        }
        ,
        NetAlanM2 {
            public Object get(UnitsViewRowImpl obj) {
                return obj.getNetAlanM2();
            }

            public void put(UnitsViewRowImpl obj, Object value) {
                obj.setNetAlanM2((BigDecimal)value);
            }
        }
        ,
        BrutAlanM2 {
            public Object get(UnitsViewRowImpl obj) {
                return obj.getBrutAlanM2();
            }

            public void put(UnitsViewRowImpl obj, Object value) {
                obj.setBrutAlanM2((BigDecimal)value);
            }
        }
        ,
        GuncelListeFiyati {
            public Object get(UnitsViewRowImpl obj) {
                return obj.getGuncelListeFiyati();
            }

            public void put(UnitsViewRowImpl obj, Object value) {
                obj.setGuncelListeFiyati((BigDecimal)value);
            }
        }
        ,
        KonutStatusu {
            public Object get(UnitsViewRowImpl obj) {
                return obj.getKonutStatusu();
            }

            public void put(UnitsViewRowImpl obj, Object value) {
                obj.setKonutStatusu((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(UnitsViewRowImpl object);

        public abstract void put(UnitsViewRowImpl object, Object value);

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
    public static final int GAYRIMENKULID = AttributesEnum.GayrimenkulId.index();
    public static final int PROJEID = AttributesEnum.ProjeId.index();
    public static final int PROJEADI = AttributesEnum.ProjeAdi.index();
    public static final int ETAPID = AttributesEnum.EtapId.index();
    public static final int ETAPADI = AttributesEnum.EtapAdi.index();
    public static final int BLOKID = AttributesEnum.BlokId.index();
    public static final int BLOKADI = AttributesEnum.BlokAdi.index();
    public static final int GAYRIMENKULADI = AttributesEnum.GayrimenkulAdi.index();
    public static final int KAT = AttributesEnum.Kat.index();
    public static final int DAIRENO = AttributesEnum.DaireNo.index();
    public static final int DAIRETIPI = AttributesEnum.DaireTipi.index();
    public static final int CEPHE = AttributesEnum.Cephe.index();
    public static final int NETALANM2 = AttributesEnum.NetAlanM2.index();
    public static final int BRUTALANM2 = AttributesEnum.BrutAlanM2.index();
    public static final int GUNCELLISTEFIYATI = AttributesEnum.GuncelListeFiyati.index();
    public static final int KONUTSTATUSU = AttributesEnum.KonutStatusu.index();

    /**
     * This is the default constructor (do not remove).
     */
    public UnitsViewRowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute GayrimenkulId.
     * @return the GayrimenkulId
     */
    public BigDecimal getGayrimenkulId() {
        return (BigDecimal) getAttributeInternal(GAYRIMENKULID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute GayrimenkulId.
     * @param value value to set the  GayrimenkulId
     */
    public void setGayrimenkulId(BigDecimal value) {
        setAttributeInternal(GAYRIMENKULID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ProjeId.
     * @return the ProjeId
     */
    public BigDecimal getProjeId() {
        return (BigDecimal) getAttributeInternal(PROJEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ProjeId.
     * @param value value to set the  ProjeId
     */
    public void setProjeId(BigDecimal value) {
        setAttributeInternal(PROJEID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ProjeAdi.
     * @return the ProjeAdi
     */
    public String getProjeAdi() {
        return (String) getAttributeInternal(PROJEADI);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ProjeAdi.
     * @param value value to set the  ProjeAdi
     */
    public void setProjeAdi(String value) {
        setAttributeInternal(PROJEADI, value);
    }

    /**
     * Gets the attribute value for the calculated attribute EtapId.
     * @return the EtapId
     */
    public BigDecimal getEtapId() {
        return (BigDecimal) getAttributeInternal(ETAPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute EtapId.
     * @param value value to set the  EtapId
     */
    public void setEtapId(BigDecimal value) {
        setAttributeInternal(ETAPID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute EtapAdi.
     * @return the EtapAdi
     */
    public String getEtapAdi() {
        return (String) getAttributeInternal(ETAPADI);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute EtapAdi.
     * @param value value to set the  EtapAdi
     */
    public void setEtapAdi(String value) {
        setAttributeInternal(ETAPADI, value);
    }

    /**
     * Gets the attribute value for the calculated attribute BlokId.
     * @return the BlokId
     */
    public BigDecimal getBlokId() {
        return (BigDecimal) getAttributeInternal(BLOKID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BlokId.
     * @param value value to set the  BlokId
     */
    public void setBlokId(BigDecimal value) {
        setAttributeInternal(BLOKID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute BlokAdi.
     * @return the BlokAdi
     */
    public String getBlokAdi() {
        return (String) getAttributeInternal(BLOKADI);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BlokAdi.
     * @param value value to set the  BlokAdi
     */
    public void setBlokAdi(String value) {
        setAttributeInternal(BLOKADI, value);
    }

    /**
     * Gets the attribute value for the calculated attribute GayrimenkulAdi.
     * @return the GayrimenkulAdi
     */
    public String getGayrimenkulAdi() {
        return (String) getAttributeInternal(GAYRIMENKULADI);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute GayrimenkulAdi.
     * @param value value to set the  GayrimenkulAdi
     */
    public void setGayrimenkulAdi(String value) {
        setAttributeInternal(GAYRIMENKULADI, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Kat.
     * @return the Kat
     */
    public String getKat() {
        return (String) getAttributeInternal(KAT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Kat.
     * @param value value to set the  Kat
     */
    public void setKat(String value) {
        setAttributeInternal(KAT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute DaireNo.
     * @return the DaireNo
     */
    public String getDaireNo() {
        return (String) getAttributeInternal(DAIRENO);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute DaireNo.
     * @param value value to set the  DaireNo
     */
    public void setDaireNo(String value) {
        setAttributeInternal(DAIRENO, value);
    }

    /**
     * Gets the attribute value for the calculated attribute DaireTipi.
     * @return the DaireTipi
     */
    public String getDaireTipi() {
        return (String) getAttributeInternal(DAIRETIPI);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute DaireTipi.
     * @param value value to set the  DaireTipi
     */
    public void setDaireTipi(String value) {
        setAttributeInternal(DAIRETIPI, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Cephe.
     * @return the Cephe
     */
    public String getCephe() {
        return (String) getAttributeInternal(CEPHE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Cephe.
     * @param value value to set the  Cephe
     */
    public void setCephe(String value) {
        setAttributeInternal(CEPHE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute NetAlanM2.
     * @return the NetAlanM2
     */
    public BigDecimal getNetAlanM2() {
        return (BigDecimal) getAttributeInternal(NETALANM2);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute NetAlanM2.
     * @param value value to set the  NetAlanM2
     */
    public void setNetAlanM2(BigDecimal value) {
        setAttributeInternal(NETALANM2, value);
    }

    /**
     * Gets the attribute value for the calculated attribute BrutAlanM2.
     * @return the BrutAlanM2
     */
    public BigDecimal getBrutAlanM2() {
        return (BigDecimal) getAttributeInternal(BRUTALANM2);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BrutAlanM2.
     * @param value value to set the  BrutAlanM2
     */
    public void setBrutAlanM2(BigDecimal value) {
        setAttributeInternal(BRUTALANM2, value);
    }

    /**
     * Gets the attribute value for the calculated attribute GuncelListeFiyati.
     * @return the GuncelListeFiyati
     */
    public BigDecimal getGuncelListeFiyati() {
        return (BigDecimal) getAttributeInternal(GUNCELLISTEFIYATI);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute GuncelListeFiyati.
     * @param value value to set the  GuncelListeFiyati
     */
    public void setGuncelListeFiyati(BigDecimal value) {
        setAttributeInternal(GUNCELLISTEFIYATI, value);
    }

    /**
     * Gets the attribute value for the calculated attribute KonutStatusu.
     * @return the KonutStatusu
     */
    public String getKonutStatusu() {
        return (String) getAttributeInternal(KONUTSTATUSU);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute KonutStatusu.
     * @param value value to set the  KonutStatusu
     */
    public void setKonutStatusu(String value) {
        setAttributeInternal(KONUTSTATUSU, value);
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
