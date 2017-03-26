package flinn.controller.recommend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("recommend/settings")
public class SettingsController {

//    @GetMapping
//    public String getSettings(Map<String, Object> model, @RequestParam(value = "order", required = false) String order) {
//
//        boolean qsOrder = false, qsOrder1 = false;
//
//        if (order != null) {
//            if (order.equals("0"))
//                qsOrder = true;
//
//            if (order.equals("1"))
//                qsOrder1 = true;
//        } else {
//            qsOrder = true;
//        }
//
//        model.put("qsOrder", qsOrder);
//        model.put("qsOrder1", qsOrder1);
//
//        boolean first = true;
//        String orderby = "SettingName";
//        String criteria = "false";
//
//        if (qsOrder1)
//            orderby = "SettingValue DESC";
//
//
//        List<ResponseSettingBean> settingList = null;
//        flinn.old.dao.recommend.dao.DaoRecommendManager dm = new flinn.old.dao.recommend.dao.DaoRecommendManager();
//        flinn.old.dao.beans.request.RequestContainerBean input = new flinn.old.dao.beans.request.RequestContainerBean();
//        int lastactivity = -1;
//
//
//        try {
//            settingList = dm.findAllSettings(input, null, orderby); //function call to get settings
//
//            try {
//                //function call to update user's last activity
//                lastactivity = dm.updateLastActivity(null);
//                dm.commitConnection("updateLastActivity");
//            } catch (Exception e) {
//                dm.rollbackConnection("updateLastActivity");
//                dm.LOG.debug("Unable to commit changes to updateLastActivity");
//            }
//        } catch (Exception e) {
//            dm.LOG.debug("Unable to open connection for findAllSettings");
//        } finally {
//            dm.disposeConnection("findAllSettings");
//        }
//
//        if (settingList != null) {
//            for (int i = 0; i < settingList.size(); i++) {
//                if (!first) {
//
//                }
//                first = false;
//            }
//        }
//
//        return "recommend/setting";
//    }
//
//    @GetMapping("/{id}")
//    public String getSettingById(@PathVariable("id") String id) {
//        int adminid = -1;
//        String serverName = request.getServerName();
//        Boolean isAdmin = false, isSuperAdmin = false;
//        Boolean editable = false;
//        Boolean postType = false;
//        Boolean hasEdit = false;
//        String jspSelf = request.getRequestURI().toString();
//
//        int sid = -1;
//        int settingid = -1;
//        String name = "", value = "";
//        int lastactivity = -1;
//
//        String authcode = flinn.old.dao.util.CookieHandler.getCookie("authcode", request);
//        flinn.old.dao.recommend.dao.DaoRecommendManager dm = new flinn.old.dao.recommend.dao.DaoRecommendManager();
//        flinn.old.dao.beans.response.ResponseSessionContainerBean userSession = dm.getSession(authcode, request);
//        try {
//            //function call to update user's last activity
//            lastactivity = dm.updateLastActivity(userSession);
//            dm.commitConnection("updateLastActivity");
//        } catch (Exception e) {
//            dm.rollbackConnection("updateLastActivity");
//            dm.LOG.debug("Unable to commit changes to updateLastActivity");
//        }
//
//        adminid = userSession.getUser().getAppuserid();
//
//        if (request.getParameter("id") != null) {
//            settingid = Integer.parseInt(request.getParameter("id"));
//        }
//
//        if (request.getParameter("Name") != null) {
//            name = request.getParameter("Name");
//        }
//
//        if (request.getParameter("Value") != null) {
//            value = request.getParameter("Value");
//        }
//
//        if (flinn.old.dao.util.AdminRole.isRecommendAdmin(userSession)) {
//            isAdmin = true;
//        }
//        if (flinn.old.dao.util.AdminRole.isAdmin(userSession)) {
//            isSuperAdmin = true;
//        }
//
//        if (request.getMethod() != null) {
//            if (request.getMethod().equals("POST")) {
//                postType = true;
//            }
//        }
//
//        if (request.getParameter("edit") != null) {
//            if (request.getParameter("edit").equals("y")) {
//                hasEdit = true;
//            }
//        }
//
//
//        if (isAdmin && postType) {
//            flinn.old.dao.beans.request.RequestContainerBean rqcont = new flinn.old.dao.beans.request.RequestContainerBean();
//            flinn.old.dao.recommend.beans.request.RequestSettingBean input = new flinn.old.dao.recommend.beans.request.RequestSettingBean();
//
//            input.setSettingid(settingid);
//            input.setSettingname(name);
//            input.setSettingvalue(value);
//
//            if (settingid > 0) {
//                // Update Setting
//                rqcont.setSetting(input);
//                flinn.old.dao.recommend.beans.response.ResponseSettingContainerBean rspBean = new flinn.old.dao.recommend.beans.response.ResponseSettingContainerBean();
//
//                try {
//                    rspBean = (flinn.old.dao.recommend.beans.response.ResponseSettingContainerBean) dm.updateSetting(rqcont, userSession);
//                    sid = rspBean.getSetting().getSettingid();
//                } catch (Exception e) {
//                    dm.rollbackConnection("updateSetting");
//                    dm.LOG.debug("Unable to commit changes to updateSetting");
//                }
//            } else {
//                // Create setting
//                try {
//                    rqcont.setSetting(input);
//                    sid = dm.createSetting(rqcont, userSession);
//                } catch (Exception e) {
//                    dm.rollbackConnection("createSetting");
//                    dm.LOG.debug("Unable to commit changes to createSetting");
//                }
//            }
//
//            // generate the response setting
//            if (sid > 0) {
//                if (settingid > 0) {
//                    response.sendRedirect("/recommend/setting_detail.jsp?id=" + sid + "&reason=setting+changes+saved");
//                } else {
//                    response.sendRedirect("/recommend/setting_detail.jsp?id=" + sid + "&reason=setting+created");
//                }
//            } else {
//                response.sendRedirect("/admin/error.jsp?reason=" + sid);
//            }
//
//            settingid = sid;
//
//        }
//
//
//        flinn.old.dao.recommend.beans.response.ResponseSettingBean adminSetting = new flinn.old.dao.recommend.beans.response.ResponseSettingBean();
//        if (settingid > 0) {
//
//            try {
//                adminSetting = dm.findSetting(settingid);
//                name = adminSetting.getSettingname();
//                value = adminSetting.getSettingvalue();
//            } catch (Exception e) {
//                dm.LOG.debug("Unable to open connection findSetting");
//            }
//
//
//        }
//
//        editable = false;   // Whether or not this is to edit the information
//        if (isAdmin && hasEdit) {
//            editable = true;
//        }
//    }

}
