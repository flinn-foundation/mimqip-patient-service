package flinn.controller.recommend;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messages")
public class MessagesController {

//    public void getMessages() {
//        boolean first = true;
//        String orderby = "MessageTag";
//        String criteria = "false";
//        String authcode = flinn.old.dao.util.CookieHandler.getCookie("authcode", request);
//
//        if (qsOrder1)
//            orderby = "Message DESC";
//        if (qsOrder2)
//            orderby = "Priority DESC";
//
//
//        List<flinn.old.dao.recommend.beans.response.ResponseMessageBean> messageList = null;
//        flinn.old.dao.recommend.dao.DaoRecommendManager dm = new flinn.old.dao.recommend.dao.DaoRecommendManager();
//        flinn.old.dao.beans.request.RequestContainerBean input = new flinn.old.dao.beans.request.RequestContainerBean();
//        ResponseSessionContainerBean userSession = dm.getSession(authcode, request);
//        int lastactivity = -1;
//        Boolean isSuperAdmin = false;
//        if (flinn.old.dao.util.AdminRole.isAdmin(userSession))isSuperAdmin = true;
//
//        try{
//            messageList = dm.findAllMessages(input, userSession, orderby); //function call to get messages
//
//            try{
//                //function call to update user's last activity
//                lastactivity = dm.updateLastActivity(userSession);
//                dm.commitConnection("updateLastActivity");
//            }
//            catch(Exception e) {
//                dm.rollbackConnection("updateLastActivity");
//                dm.LOG.debug("Unable to commit changes to updateLastActivity");
//            }
//        }
//        catch(Exception e) {
//            dm.LOG.debug("Unable to open connection for findAllMessages");
//        }
//        finally{dm.disposeConnection("findAllMessages");}
//
//        if (messageList != null){
//            for (int i=0; i<messageList.size(); i++) {
//                if (!first) {
//    }
//
//    @GetMapping("/{id}")
//    public void getMessageById() {
//        int adminid = -1;
//        String serverName = request.getServerName();
//        Boolean isAdmin = false, isSuperAdmin = false;
//        Boolean editable = false;
//        Boolean postType = false;
//        Boolean hasEdit = false;
//        String jspSelf = request.getRequestURI().toString();
//
//        int mid = -1;
//        int messageid = -1;
//        int priority = -1;
//        String message = "", messagetag = "";
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
//            messageid = Integer.parseInt(request.getParameter("id"));
//        }
//
//        if (request.getParameter("Message") != null) {
//            message = request.getParameter("Message");
//        }
//
//        if (request.getParameter("MessageTag") != null) {
//            messagetag = request.getParameter("MessageTag");
//        }
//
//        if (request.getParameter("Priority") != null) {
//            priority = Integer.parseInt(request.getParameter("Priority"));
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
//            flinn.old.dao.recommend.beans.request.RequestMessageBean input = new flinn.old.dao.recommend.beans.request.RequestMessageBean();
//
//            input.setMessageid(messageid);
//            input.setMessage(message);
//            input.setMessagetag(messagetag);
//            input.setPriority(priority);
//
//            if (messageid > 0) {
//                // Update message
//                rqcont.setMessage(input);
//                flinn.old.dao.recommend.beans.response.ResponseMessageContainerBean rspBean = new flinn.old.dao.recommend.beans.response.ResponseMessageContainerBean();
//
//                try {
//                    rspBean = (flinn.old.dao.recommend.beans.response.ResponseMessageContainerBean) dm.updateMessage(rqcont, userSession);
//                    mid = rspBean.getMessage().getMessageid();
//                } catch (Exception e) {
//                    dm.rollbackConnection("updateMessage");
//                    dm.LOG.debug("Unable to commit changes to updateMessage");
//                }
//            } else {
//                // Create message
//                try {
//                    rqcont.setMessage(input);
//                    mid = dm.createMessage(rqcont, userSession);
//                } catch (Exception e) {
//                    dm.rollbackConnection("createMessage");
//                    dm.LOG.debug("Unable to commit changes to createMessage");
//                }
//            }
//
//            // generate the response message
//            if (mid > 0) {
//                if (messageid > 0) {
//                    response.sendRedirect("/recommend/message_detail.jsp?id=" + mid + "&reason=message+changes+saved");
//                } else {
//                    response.sendRedirect("/recommend/message_detail.jsp?id=" + mid + "&reason=message+created");
//                }
//            } else {
//                response.sendRedirect("/admin/error.jsp?reason=" + mid);
//            }
//
//            messageid = mid;
//
//        }
//
//
//        flinn.old.dao.recommend.beans.response.ResponseMessageBean adminMessage = new flinn.old.dao.recommend.beans.response.ResponseMessageBean();
//        if (messageid > 0) {
//
//            try {
//                adminMessage = dm.findMessage(messageid);
//                messageid = adminMessage.getMessageid();
//                priority = adminMessage.getPriority();
//                message = adminMessage.getMessage();
//                messagetag = adminMessage.getMessagetag();
//            } catch (Exception e) {
//                dm.LOG.debug("Unable to open connection findMessage");
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
