package org.flinnfoundation.controller.recommend;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messages")
public class MessagesController {

//    public void getMessages() {
//        boolean first = true;
//        String orderby = "MessageTag";
//        String criteria = "false";
//        String authcode = CookieHandler.getCookie("authcode", request);
//
//        if (qsOrder1)
//            orderby = "Message DESC";
//        if (qsOrder2)
//            orderby = "Priority DESC";
//
//
//        List<ResponseMessageBean> messageList = null;
//        DaoRecommendManager dm = new DaoRecommendManager();
//        RequestContainerBean input = new RequestContainerBean();
//        ResponseSessionContainerBean userSession = dm.getSession(authcode, request);
//        int lastactivity = -1;
//        Boolean isSuperAdmin = false;
//        if (org.flinnfoundation.old.dao.util.AdminRole.isAdmin(userSession))isSuperAdmin = true;
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
//        String authcode = CookieHandler.getCookie("authcode", request);
//        DaoRecommendManager dm = new DaoRecommendManager();
//        ResponseSessionContainerBean userSession = dm.getSession(authcode, request);
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
//        if (org.flinnfoundation.old.dao.util.AdminRole.isRecommendAdmin(userSession)) {
//            isAdmin = true;
//        }
//        if (org.flinnfoundation.old.dao.util.AdminRole.isAdmin(userSession)) {
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
//            RequestContainerBean rqcont = new RequestContainerBean();
//            RequestMessageBean input = new RequestMessageBean();
//
//            input.setMessageid(messageid);
//            input.setMessage(message);
//            input.setMessagetag(messagetag);
//            input.setPriority(priority);
//
//            if (messageid > 0) {
//                // Update message
//                rqcont.setMessage(input);
//                ResponseMessageContainerBean rspBean = new ResponseMessageContainerBean();
//
//                try {
//                    rspBean = (ResponseMessageContainerBean) dm.updateMessage(rqcont, userSession);
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
//        ResponseMessageBean adminMessage = new ResponseMessageBean();
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
