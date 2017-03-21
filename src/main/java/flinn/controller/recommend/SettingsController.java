package flinn.controller.recommend;

import flinn.recommend.beans.response.ResponseSettingBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("recommend/settings")
public class SettingsController {

    @GetMapping
    public String getSettings(Map<String, Object> model, @RequestParam(value = "order", required = false) String order) {

        boolean qsOrder = false, qsOrder1 = false;

        if (order != null) {
            if (order.equals("0"))
                qsOrder = true;

            if (order.equals("1"))
                qsOrder1 = true;
        } else {
            qsOrder = true;
        }

        model.put("qsOrder", qsOrder);
        model.put("qsOrder1", qsOrder1);

        boolean first = true;
        String orderby = "SettingName";
        String criteria = "false";

        if (qsOrder1)
            orderby = "SettingValue DESC";


        List<ResponseSettingBean> settingList = null;
        flinn.recommend.dao.DaoRecommendManager dm = new flinn.recommend.dao.DaoRecommendManager();
        flinn.beans.request.RequestContainerBean input = new flinn.beans.request.RequestContainerBean();
        int lastactivity = -1;


        try {
            settingList = dm.findAllSettings(input, null, orderby); //function call to get settings

            try {
                //function call to update user's last activity
                lastactivity = dm.updateLastActivity(null);
                dm.commitConnection("updateLastActivity");
            } catch (Exception e) {
                dm.rollbackConnection("updateLastActivity");
                dm.LOG.debug("Unable to commit changes to updateLastActivity");
            }
        } catch (Exception e) {
            dm.LOG.debug("Unable to open connection for findAllSettings");
        } finally {
            dm.disposeConnection("findAllSettings");
        }

        if (settingList != null) {
            for (int i = 0; i < settingList.size(); i++) {
                if (!first) {

                }
                first = false;
            }
        }

        return "recommend/setting";
    }

    public String WriteTableHeader(String name, Boolean selected, String page, String order) {
        StringBuilder outString = new StringBuilder();
        outString.append("<td nowrap><p class='tableHeader'>");
        if (!selected) {
            outString.append("<a href='" + page + "?order=" + order + "' class='tableHeader'>");
        }
        outString.append(name);
        if (!selected) {
            outString.append("</a>");
        }
        outString.append("</p></td>");
        outString.append("<td>&nbsp;</td>");
        return outString.toString();
    }

}
