package com.natica.sales.model.server.serviceinterface;

import com.natica.sales.model.SalesModuleImpl;
import com.natica.sales.model.common.serviceinterface.SalesModuleService;
import com.natica.sales.model.views.common.SmartsBlokPlaniViewSDO;
import com.natica.sales.model.views.common.SmartsGyrmnklGorselViewSDO;
import com.natica.sales.model.views.common.SmartsPlanGayrimenkulViewSDO;
import com.natica.sales.model.views.common.SmartsVaziyetViewSDO;
import com.natica.sales.model.views.common.UnitsViewSDO;
import com.natica.sales.model.views.response.common.SmartsCrudResponseSDO;

import java.lang.reflect.Method;

import java.math.BigDecimal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import javax.interceptor.Interceptors;

import oracle.jbo.common.Diagnostic;
import oracle.jbo.common.sdo.SDOHelper;
import oracle.jbo.server.svc.ServiceContextInterceptor;
import oracle.jbo.server.svc.ServiceImpl;
import oracle.jbo.service.errors.ServiceException;

import oracle.webservices.annotations.PortableWebService;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Feb 18 17:42:39 EET 2016
// ---------------------------------------------------------------------
@Stateless(name="com.natica.sales.model.common.SalesModuleServiceBean", mappedName="SalesModuleServiceBean")
@Remote(SalesModuleService.class)
@PortableWebService(targetNamespace="/com/natica/sales/model/common/", serviceName="SalesModuleService", portName="SalesModuleServiceSoapHttpPort",
    endpointInterface="com.natica.sales.model.common.serviceinterface.SalesModuleService")
@Interceptors( { ServiceContextInterceptor.class })
public class SalesModuleServiceImpl extends ServiceImpl implements SalesModuleService {
    private static boolean _isInited = false;
    private static final Map _map = new HashMap();

    /**
     * This is the default constructor (do not remove).
     */
    public SalesModuleServiceImpl() {
        init();
        setApplicationModuleDefName("com.natica.sales.model.SalesModule");
        setConfigurationName("SalesModuleService");
    }

    /**
     * Generated method. Do not modify. Do initialization in the constructor
     */
    protected void init() {
        if (_isInited) {
            return;
        }
        synchronized (SalesModuleServiceImpl.class) {
            if (_isInited) {
                return;
            }
            try {
                SDOHelper.INSTANCE.defineSchema("com/natica/sales/model/common/serviceinterface/", "SalesModuleService.xsd");
                _map.put("createBlockPlani",
                         SalesModuleImpl.class.getMethod("createBlockPlani", new Class[] { BigDecimal.class,
                                                                                           String.class,
                                                                                           BigDecimal.class,
                                                                                           BigDecimal.class }));
                _map.put("createGayrimenkulGorsel",
                         SalesModuleImpl.class.getMethod("createGayrimenkulGorsel", new Class[] { BigDecimal.class,
                                                                                                  String.class,
                                                                                                  String.class,
                                                                                                  BigDecimal.class,
                                                                                                  BigDecimal.class }));
                _map.put("createPlanGayrimenkul",
                         SalesModuleImpl.class.getMethod("createPlanGayrimenkul", new Class[] { BigDecimal.class,
                                                                                                BigDecimal.class,
                                                                                                BigDecimal.class,
                                                                                                String.class }));
                _map.put("createVaziyetPlani",
                         SalesModuleImpl.class.getMethod("createVaziyetPlani", new Class[] { BigDecimal.class,
                                                                                             String.class }));
                _map.put("deleteBlockPlani",
                         SalesModuleImpl.class.getMethod("deleteBlockPlani", new Class[] { BigDecimal.class }));
                _map.put("deleteGayrimenkulGorsel",
                         SalesModuleImpl.class.getMethod("deleteGayrimenkulGorsel", new Class[] { BigDecimal.class }));
                _map.put("deletePlanGayrimenkul",
                         SalesModuleImpl.class.getMethod("deletePlanGayrimenkul", new Class[] { BigDecimal.class }));
                _map.put("deleteVaziyetPlani",
                         SalesModuleImpl.class.getMethod("deleteVaziyetPlani", new Class[] { BigDecimal.class }));
                _map.put("getProjectDetails",
                         SalesModuleImpl.class.getMethod("getProjectDetails", new Class[] { Integer.class }));
                _map.put("updateBlockPlani",
                         SalesModuleImpl.class.getMethod("updateBlockPlani", new Class[] { BigDecimal.class,
                                                                                           BigDecimal.class,
                                                                                           String.class,
                                                                                           BigDecimal.class,
                                                                                           BigDecimal.class }));
                _map.put("updateGayrimenkulGorsel",
                         SalesModuleImpl.class.getMethod("updateGayrimenkulGorsel", new Class[] { BigDecimal.class,
                                                                                                  BigDecimal.class,
                                                                                                  String.class,
                                                                                                  String.class,
                                                                                                  BigDecimal.class,
                                                                                                  BigDecimal.class }));
                _map.put("updatePlanGayrimenkul",
                         SalesModuleImpl.class.getMethod("updatePlanGayrimenkul", new Class[] { BigDecimal.class,
                                                                                                BigDecimal.class,
                                                                                                BigDecimal.class,
                                                                                                BigDecimal.class,
                                                                                                String.class }));
                _map.put("updateVaziyetPlani",
                         SalesModuleImpl.class.getMethod("updateVaziyetPlani", new Class[] { BigDecimal.class,
                                                                                             String.class }));
                _map.put("viewBlockPlani",
                         SalesModuleImpl.class.getMethod("viewBlockPlani", new Class[] { BigDecimal.class }));
                _map.put("viewGayrimenkulGorsel",
                         SalesModuleImpl.class.getMethod("viewGayrimenkulGorsel", new Class[] { BigDecimal.class }));
                _map.put("viewPlanGayrimenkul",
                         SalesModuleImpl.class.getMethod("viewPlanGayrimenkul", new Class[] { BigDecimal.class }));
                _map.put("viewVaziyetPlani",
                         SalesModuleImpl.class.getMethod("viewVaziyetPlani", new Class[] { BigDecimal.class }));
                _isInited = true;
            } catch (Exception ex) {
                Diagnostic.printStackTrace(ex);
            }
        }
    }

    /**
     * createBlockPlani: generated method. Do not modify.
     */
    public SmartsCrudResponseSDO createBlockPlani(BigDecimal projectId, String blokPlaniGorseli, BigDecimal KoorX,
                                                  BigDecimal KoorY) throws ServiceException {
        return (SmartsCrudResponseSDO)invokeCustom((Method)_map.get("createBlockPlani"),
                                                   new Object[] { projectId, blokPlaniGorseli, KoorX, KoorY },
                                                   new String[] { null, null, null, null },
                                                   SmartsCrudResponseSDO.class, false);
    }

    /**
     * createGayrimenkulGorsel: generated method. Do not modify.
     */
    public SmartsCrudResponseSDO createGayrimenkulGorsel(BigDecimal gayrimenkulId, String dosyaAdi, String baslik,
                                                         BigDecimal tip, BigDecimal sira) throws ServiceException {
        return (SmartsCrudResponseSDO)invokeCustom((Method)_map.get("createGayrimenkulGorsel"),
                                                   new Object[] { gayrimenkulId, dosyaAdi, baslik, tip, sira },
                                                   new String[] { null, null, null, null, null },
                                                   SmartsCrudResponseSDO.class, false);
    }

    /**
     * createPlanGayrimenkul: generated method. Do not modify.
     */
    public SmartsCrudResponseSDO createPlanGayrimenkul(BigDecimal projectId, BigDecimal blockPlanId,
                                                       BigDecimal gayrimenkulId,
                                                       String Koordinat) throws ServiceException {
        return (SmartsCrudResponseSDO)invokeCustom((Method)_map.get("createPlanGayrimenkul"),
                                                   new Object[] { projectId, blockPlanId, gayrimenkulId, Koordinat },
                                                   new String[] { null, null, null, null },
                                                   SmartsCrudResponseSDO.class, false);
    }

    /**
     * createVaziyetPlani: generated method. Do not modify.
     */
    public SmartsCrudResponseSDO createVaziyetPlani(BigDecimal prjectId, String dosyaIsmi) throws ServiceException {
        return (SmartsCrudResponseSDO)invokeCustom((Method)_map.get("createVaziyetPlani"),
                                                   new Object[] { prjectId, dosyaIsmi }, new String[] { null, null },
                                                   SmartsCrudResponseSDO.class, false);
    }

    /**
     * deleteBlockPlani: generated method. Do not modify.
     */
    public SmartsCrudResponseSDO deleteBlockPlani(BigDecimal blokPlaniId) throws ServiceException {
        return (SmartsCrudResponseSDO)invokeCustom((Method)_map.get("deleteBlockPlani"), new Object[] { blokPlaniId },
                                                   new String[] { null }, SmartsCrudResponseSDO.class, false);
    }

    /**
     * deleteGayrimenkulGorsel: generated method. Do not modify.
     */
    public SmartsCrudResponseSDO deleteGayrimenkulGorsel(BigDecimal GayrimenkulGorselId) throws ServiceException {
        return (SmartsCrudResponseSDO)invokeCustom((Method)_map.get("deleteGayrimenkulGorsel"),
                                                   new Object[] { GayrimenkulGorselId }, new String[] { null },
                                                   SmartsCrudResponseSDO.class, false);
    }

    /**
     * deletePlanGayrimenkul: generated method. Do not modify.
     */
    public SmartsCrudResponseSDO deletePlanGayrimenkul(BigDecimal planGayrimenkulId) throws ServiceException {
        return (SmartsCrudResponseSDO)invokeCustom((Method)_map.get("deletePlanGayrimenkul"),
                                                   new Object[] { planGayrimenkulId }, new String[] { null },
                                                   SmartsCrudResponseSDO.class, false);
    }

    /**
     * deleteVaziyetPlani: generated method. Do not modify.
     */
    public SmartsCrudResponseSDO deleteVaziyetPlani(BigDecimal prjectId) throws ServiceException {
        return (SmartsCrudResponseSDO)invokeCustom((Method)_map.get("deleteVaziyetPlani"), new Object[] { prjectId },
                                                   new String[] { null }, SmartsCrudResponseSDO.class, false);
    }

    /**
     * getProjectDetails: generated method. Do not modify.
     */
    public List<UnitsViewSDO> getProjectDetails(Integer projectId) throws ServiceException {
        return (List<UnitsViewSDO>)invokeCustom((Method)_map.get("getProjectDetails"), new Object[] { projectId },
                                                new String[] { null }, UnitsViewSDO.class, false);
    }

    /**
     * updateBlockPlani: generated method. Do not modify.
     */
    public SmartsCrudResponseSDO updateBlockPlani(BigDecimal blokPlaniId, BigDecimal projectId,
                                                  String blokPlaniGorseli, BigDecimal KoorX,
                                                  BigDecimal KoorY) throws ServiceException {
        return (SmartsCrudResponseSDO)invokeCustom((Method)_map.get("updateBlockPlani"),
                                                   new Object[] { blokPlaniId, projectId, blokPlaniGorseli, KoorX,
                                                                  KoorY },
                                                   new String[] { null, null, null, null, null },
                                                   SmartsCrudResponseSDO.class, false);
    }

    /**
     * updateGayrimenkulGorsel: generated method. Do not modify.
     */
    public SmartsCrudResponseSDO updateGayrimenkulGorsel(BigDecimal GayrimenkulGorselId, BigDecimal gayrimenkulId,
                                                         String dosyaAdi, String baslik, BigDecimal tip,
                                                         BigDecimal sira) throws ServiceException {
        return (SmartsCrudResponseSDO)invokeCustom((Method)_map.get("updateGayrimenkulGorsel"),
                                                   new Object[] { GayrimenkulGorselId, gayrimenkulId, dosyaAdi, baslik,
                                                                  tip, sira },
                                                   new String[] { null, null, null, null, null, null },
                                                   SmartsCrudResponseSDO.class, false);
    }

    /**
     * updatePlanGayrimenkul: generated method. Do not modify.
     */
    public SmartsCrudResponseSDO updatePlanGayrimenkul(BigDecimal planGayrimenkulId, BigDecimal projectId,
                                                       BigDecimal blockPlanId, BigDecimal gayrimenkulId,
                                                       String Koordinat) throws ServiceException {
        return (SmartsCrudResponseSDO)invokeCustom((Method)_map.get("updatePlanGayrimenkul"),
                                                   new Object[] { planGayrimenkulId, projectId, blockPlanId,
                                                                  gayrimenkulId, Koordinat },
                                                   new String[] { null, null, null, null, null },
                                                   SmartsCrudResponseSDO.class, false);
    }

    /**
     * updateVaziyetPlani: generated method. Do not modify.
     */
    public SmartsCrudResponseSDO updateVaziyetPlani(BigDecimal prjectId, String dosyaIsmi) throws ServiceException {
        return (SmartsCrudResponseSDO)invokeCustom((Method)_map.get("updateVaziyetPlani"),
                                                   new Object[] { prjectId, dosyaIsmi }, new String[] { null, null },
                                                   SmartsCrudResponseSDO.class, false);
    }

    /**
     * viewBlockPlani: generated method. Do not modify.
     */
    public SmartsBlokPlaniViewSDO viewBlockPlani(BigDecimal blokPlaniId) throws ServiceException {
        return (SmartsBlokPlaniViewSDO)invokeCustom((Method)_map.get("viewBlockPlani"), new Object[] { blokPlaniId },
                                                    new String[] { null }, SmartsBlokPlaniViewSDO.class, false);
    }

    /**
     * viewGayrimenkulGorsel: generated method. Do not modify.
     */
    public SmartsGyrmnklGorselViewSDO viewGayrimenkulGorsel(BigDecimal GayrimenkulGorselId) throws ServiceException {
        return (SmartsGyrmnklGorselViewSDO)invokeCustom((Method)_map.get("viewGayrimenkulGorsel"),
                                                        new Object[] { GayrimenkulGorselId }, new String[] { null },
                                                        SmartsGyrmnklGorselViewSDO.class, false);
    }

    /**
     * viewPlanGayrimenkul: generated method. Do not modify.
     */
    public SmartsPlanGayrimenkulViewSDO viewPlanGayrimenkul(BigDecimal planGayrimenkulId) throws ServiceException {
        return (SmartsPlanGayrimenkulViewSDO)invokeCustom((Method)_map.get("viewPlanGayrimenkul"),
                                                          new Object[] { planGayrimenkulId }, new String[] { null },
                                                          SmartsPlanGayrimenkulViewSDO.class, false);
    }

    /**
     * viewVaziyetPlani: generated method. Do not modify.
     */
    public SmartsVaziyetViewSDO viewVaziyetPlani(BigDecimal projectId) throws ServiceException {
        return (SmartsVaziyetViewSDO)invokeCustom((Method)_map.get("viewVaziyetPlani"), new Object[] { projectId },
                                                  new String[] { null }, SmartsVaziyetViewSDO.class, false);
    }
}
