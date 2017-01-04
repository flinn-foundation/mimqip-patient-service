package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class app_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:v=\"urn:schemas-microsoft-com:vml\">\n");
      out.write("<head>\n");
      out.write("\t<title>Flinn Foundation</title>\n");
      out.write("\t<link type=\"text/css\" rel=\"Stylesheet\" href=\"css/global.css\" />\n");
      out.write("\t<link type=\"text/css\" rel=\"Stylesheet\" href=\"css/app.css\" />\n");
      out.write("\t<link type=\"text/css\" rel=\"Stylesheet\" href=\"css/colorbox.css\" />\n");
      out.write("\t<!--<script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.6/jquery.min.js\"></script>-->\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery-1.6.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/globalUtils.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery.ui.tabs.min.js\"></script>\t\t\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jHtmlArea-min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/app.js\"></script>\n");
      out.write("</head>\n");
      out.write("<!--[if IE 7 ]><body class=\"ie7\"><![endif]-->\n");
      out.write("<!--[if IE 8 ]><body class=\"ie8\"><![endif]-->\n");
      out.write("<!--[if IE 9 ]><body class=\"ie9\"><![endif]-->\n");
      out.write("<!--[if !IE]><!--><body><!--<![endif]-->\n");
      out.write("<div id=\"container\">\n");
      out.write("\t<div id=\"utilityBarWrapper\">\n");
      out.write("\t\t<div id=\"utilityBar\">\n");
      out.write("\t\t\t<h1></h1>\n");
      out.write("\t\t\t<span class=\"welcome\"></span>\t\n");
      out.write("\t\t\t<a href=\"#\" id=\"logoutBtn\" class=\"roundedBtn\">Logout</a>\n");
      out.write("\t\t\t<div class=\"buttons\">\n");
      out.write("\t\t\t\t<a href=\"/patient-search.jsp\" id=\"patientSearchBtn\" class=\"roundedBtn\">Patient Search</a>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t<a href=\"/admin/\" id=\"adminBtn\" class=\"roundedBtn\">Administration</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"instructionsWrapper\">\n");
      out.write("\t\t<div id=\"instructions\">\n");
      out.write("\t\t\t<p><strong class=\"heading\">Instructions:</strong> For MiMQIP to provide the best recommendation, it is important that all patient information be updated. <strong class=\"pleaseRemember\">Please remember to do the following:</strong> <a href=\"#\" class=\"btn\" id=\"hideInstructions\"><span>Hide</span></a></p>\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li id=\"firstStep\"><span>Verify diagnosis &amp; stage</span>  <a href=\"#\">Update</a></li>\n");
      out.write("\t\t\t\t<li id=\"secondStep\"><span>Verify current medications</span>  <a href=\"#\">Update</a></li>\n");
      out.write("\t\t\t\t<li id=\"thirdStep\"><span>Complete diagnosis-related scale</span> <a href=\"#\">Go</a></li>\n");
      out.write("\t\t\t\t<li id=\"fourthStep\"><span>Complete global rating scales</span> <a href=\"#\">Go</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"topWrapper\">\n");
      out.write("\t\t<div id=\"top\">\t\t\t\n");
      out.write("\t\t\t<div id=\"boxes\">\n");
      out.write("\t\t\t\t<div id=\"boxInformation\" class=\"box\">\n");
      out.write("\t\t\t\t\t<div class=\"headingBar\">\n");
      out.write("\t\t\t\t\t\t<h2>Patient Information</h2>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"fieldBox\" id=\"first\">\n");
      out.write("\t\t\t\t\t\t<span class=\"title\">First</span>\n");
      out.write("\t\t\t\t\t\t<span class=\"content\"></span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"fieldBox\" id=\"last\">\n");
      out.write("\t\t\t\t\t\t<span class=\"title\">Last</span>\n");
      out.write("\t\t\t\t\t\t<span class=\"content\"></span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"fieldBox\" id=\"id\">\n");
      out.write("\t\t\t\t\t\t<span class=\"title\">ID #</span>\n");
      out.write("\t\t\t\t\t\t<span class=\"content\"></span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"fieldBox\" id=\"sex\">\n");
      out.write("\t\t\t\t\t\t<span class=\"title\">Sex</span>\n");
      out.write("\t\t\t\t\t\t<span class=\"content\"></span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"fieldBox\" id=\"age\">\n");
      out.write("\t\t\t\t\t\t<span class=\"title\">Age</span>\n");
      out.write("\t\t\t\t\t\t<span class=\"content\"></span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"fieldBox\" id=\"dob\">\n");
      out.write("\t\t\t\t\t\t<span class=\"title\">Dob</span>\n");
      out.write("\t\t\t\t\t\t<span class=\"content\"></span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div id=\"boxDiagnosisStage\" class=\"box\">\n");
      out.write("\t\t\t\t\t<div class=\"headingBar\">\n");
      out.write("\t\t\t\t\t\t<h2>Diagnosis &amp; Stage</h2>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"floatWrapper\">\n");
      out.write("\t\t\t\t\t\t<div class=\"fieldBox\" id=\"diagnosis\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"title\">Primary Diagnosis</span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"content\"></span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"fieldBox\" id=\"stage\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"title\">Stage</span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"content\"></span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" id=\"updateViewPast\" class=\"btn\"><span>Update / View Past</span></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div id=\"boxMedications\" class=\"box\">\n");
      out.write("\t\t\t\t\t<div class=\"headingBar\">\n");
      out.write("\t\t\t\t\t\t<h2>Current Medications<span></span></h2>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"fieldBox\" id=\"meds\">\n");
      out.write("\t\t\t\t\t\t<span class=\"content\">\n");
      out.write("\t\t\t\t\t\t\t<!--Bupropion:     60mg<br />\n");
      out.write("\t\t\t\t\t\t\tFluphenazine Decanoate:   30mg<br />\n");
      out.write("\t\t\t\t\t\t\tTranylcypromine:     60mg<br />\n");
      out.write("\t\t\t\t\t\t\tLorazepam:   30mg<br />\n");
      out.write("\t\t\t\t\t\t\tFluoxetine:     60mg<br />\n");
      out.write("\t\t\t\t\t\t\tZolpidem:   30mg<br />\n");
      out.write("\t\t\t\t\t\t\tVenlafaxine:     60mg-->\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div id=\"boxNotes\" class=\"box\">\n");
      out.write("\t\t\t\t\t<div class=\"headingBar\">\n");
      out.write("\t\t\t\t\t\t<h2>Progress Notes</h2>\n");
      out.write("\t\t\t\t\t\t<!--<a href=\"#\" id=\"searchNotesBtn\" class=\"btn\"><span>Search Notes</span></a>-->\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" id=\"createNoteBtn\" class=\"btn\"><span>Create Note</span></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"noteInfoBar\">\n");
      out.write("\t\t\t\t\t\t<span class=\"date\"></span>\n");
      out.write("\t\t\t\t\t\t<span class=\"time\"></span>\n");
      out.write("\t\t\t\t\t\t<span class=\"author\"></span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"note\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div id=\"createProgressNote\">\n");
      out.write("\t\t\t\t\t<div id=\"selectTags\">\n");
      out.write("\t\t\t\t\t\t<h3>Select Tag(s)</h3>\n");
      out.write("\t\t\t\t\t\t<div id=\"tagSelectList\">\n");
      out.write("\t\t\t\t\t\t\t<ul></ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div id=\"writeNote\">\n");
      out.write("\t\t\t\t\t\t<div id=\"topToolBar\">\n");
      out.write("\t\t\t\t\t\t\t<h3>Progress Notes</h3>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"disabled\" id=\"saveNote\">Save</a>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" id=\"cancelNote\">Cancel</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<textarea id=\"noteTextarea\" cols=\"10\" rel=\"Enter text...\" rows=\"10\">Enter text...\n");
      out.write("\t\t\t\t\t\t</textarea>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"tabsOuterWrapper\">\n");
      out.write("\t<div id=\"tabs\">\n");
      out.write("\t\t<div id=\"ajaxLoader\"><img src=\"images/global/ajax-loader.gif\" alt=\"\" /></div>\n");
      out.write("\t\t<div id=\"tabWrapper\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li id=\"tabEvaluations\">\n");
      out.write("\t\t\t\t\t<a href=\"#evaluations\"><span>Patient Evaluations</span></a>\n");
      out.write("\t\t\t\t</li>\t\t\t\t\n");
      out.write("\t\t\t\t<li id=\"tabMedications\" class=\"on\">\n");
      out.write("\t\t\t\t\t<a href=\"#medications\"><span>Medications</span></a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li id=\"tabRecommendations\">\n");
      out.write("\t\t\t\t\t<a href=\"#recommendations\"><span>Decision Support</span></a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li id=\"tabProgress\">\n");
      out.write("\t\t\t\t\t<a href=\"#progress\"><span>Progress Notes</span></a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li id=\"tabLabs\">\n");
      out.write("\t\t\t\t\t<a href=\"#labs\"><span>Patient Labs</span></a>\n");
      out.write("\t\t\t\t</li>\t\t\t\t\n");
      out.write("\t\t\t\t<li id=\"tabInformation\">\n");
      out.write("\t\t\t\t\t<a href=\"#information\"><span>Patient Information</span></a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li id=\"tabReports\">\n");
      out.write("\t\t\t\t\t<a href=\"#reports\"><span>Reports</span></a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"evaluations\" class=\"tabBox\">\t\t\t\n");
      out.write("\t\t\t<div id=\"evalNav\">\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li><h3>Required Evaluations</h3></li>\n");
      out.write("\t\t\t\t\t<li id=\"CRSNav\"><a href=\"#CRS\">Enter New <span class=\"upper\">Diagnosis-Related Scale</span></a></li>\n");
      out.write("\t\t\t\t\t<li id=\"PastCRSNav\" class=\"pastEval\"><a href=\"#PastCRS\">View Past <span>Diagnosis-Related Scales</span></a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#global_rating_scale\">Enter New <span class=\"upper\">Global Rating Scale</span></a></li>\n");
      out.write("\t\t\t\t\t<li class=\"pastEval\"><a href=\"#Pastglobal_rating_scale\">View Past Global <span>Rating Scales</span></a></li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<li><h3>Additional Evaluations</h3></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#psychiatric_evaluation\">Enter New <span class=\"upper\">Psychiatric Evaluation</span></a></li>\n");
      out.write("\t\t\t\t\t<li class=\"pastEval\"><a href=\"#Pastpsychiatric_evaluation\">View Past <span>Psychiatric Evaluation</span></a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#mental_status\">Enter New <span class=\"upper\">Mental Status</span></a></li>\n");
      out.write("\t\t\t\t\t<li class=\"pastEval\"><a href=\"#Pastmental_status\">View Past <span>Mental Status</span></a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#substance_abuse\">Enter New <span class=\"upper\">Substance Abuse Assessment</span></a></li>\n");
      out.write("\t\t\t\t\t<li class=\"pastEval\"><a href=\"#Pastsubstance_abuse\">View Past <span>Substance Abuse Assessment</span></a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#vital_signs\">Enter New <span class=\"upper\">Patient Vital Signs</span></a></li>\n");
      out.write("\t\t\t\t\t<li class=\"pastEval\"><a href=\"#Pastvital_signs\">View Past <span>Patient Vital Signs</span></a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div id=\"evalContent\">\n");
      out.write("\t\t\t\t<div id=\"CRS\" class=\"eval\"><div class=\"content\"></div></div>\n");
      out.write("\t\t\t\t<div id=\"PastCRS\" class=\"past eval\"><div class=\"content\"></div></div>\n");
      out.write("\t\t\t\t<div id=\"global_rating_scale\" class=\"eval\"><div class=\"content\"></div></div>\n");
      out.write("\t\t\t\t<div id=\"Pastglobal_rating_scale\" class=\"past eval\"><div class=\"content\"></div></div>\n");
      out.write("\t\t\t\t<div id=\"psychiatric_evaluation\" class=\"eval\"><div class=\"content\"></div></div>\n");
      out.write("\t\t\t\t<div id=\"Pastpsychiatric_evaluation\" class=\"past eval\"><div class=\"content\"></div></div>\n");
      out.write("\t\t\t\t<div id=\"mental_status\" class=\"eval\"><div class=\"content\"></div></div>\n");
      out.write("\t\t\t\t<div id=\"Pastmental_status\" class=\"past eval\"><div class=\"content\"></div></div>\n");
      out.write("\t\t\t\t<div id=\"substance_abuse\" class=\"eval\"><div class=\"content\"></div></div>\n");
      out.write("\t\t\t\t<div id=\"Pastsubstance_abuse\" class=\"past eval\"><div class=\"content\"></div></div>\t\t\n");
      out.write("\t\t\t\t<div id=\"vital_signs\" class=\"eval\"><div class=\"content\"></div></div>\n");
      out.write("\t\t\t\t<div id=\"Pastvital_signs\" class=\"past eval\"><div class=\"content\"></div></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"medications\" class=\"tabBox\">\n");
      out.write("\t\t\t<div class=\"floatHolder\">\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"btn\" id=\"discontinue\"><span>Discontinue</span></a>\t\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"btn\" id=\"prescribe\"><span>ePrescribe</span></a>\n");
      out.write("\t\t\t\t<h3>Manage Medications:</h3>\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"graphWrapper\">\n");
      out.write("\t\t\t\t<div id=\"key\">\n");
      out.write("\t\t\t\t\t<div class=\"dropdown\" id=\"scales\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"pullDown\"></a>\n");
      out.write("\t\t\t\t\t\t<ul></ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div id=\"keyWrapper\">\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"brown\"></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"purple\"></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"red\"></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div id=\"graph\">\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li></li>\n");
      out.write("\t\t\t\t\t\t<li></li>\n");
      out.write("\t\t\t\t\t\t<li></li>\n");
      out.write("\t\t\t\t\t\t<li></li>\n");
      out.write("\t\t\t\t\t\t<li></li>\n");
      out.write("\t\t\t\t\t\t<li></li>\n");
      out.write("\t\t\t\t\t\t<li></li>\n");
      out.write("\t\t\t\t\t\t<li></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"chartWrapper\">\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"previous navArrow\"><<</a>\n");
      out.write("\t\t\t\t<div class=\"outerTable\">\n");
      out.write("\t\t\t\t\t<div class=\"innerTable\">\n");
      out.write("\t\t\t\t\t\t<table>\n");
      out.write("\t\t\t\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t\t\t<tr class=\"dateRow\">\n");
      out.write("\t\t\t\t\t\t\t\t<th class=\"appt\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"week\">Stage:</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"date\">Date:</span>\n");
      out.write("\t\t\t\t\t\t\t\t</th>\n");
      out.write("\t\t\t\t\t\t\t\t<th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"week\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"stage\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"date\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t</th>\n");
      out.write("\t\t\t\t\t\t\t\t<th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"week\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"stage\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"date\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t</th>\n");
      out.write("\t\t\t\t\t\t\t\t<th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"week\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"stage\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"date\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t</th>\n");
      out.write("\t\t\t\t\t\t\t\t<th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"week\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"stage\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"date\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t</th>\n");
      out.write("\t\t\t\t\t\t\t\t<th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"week\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"stage\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"date\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t</th>\n");
      out.write("\t\t\t\t\t\t\t\t<th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"week\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"stage\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"date\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t</th>\n");
      out.write("\t\t\t\t\t\t\t\t<th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"week\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"stage\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"date\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t</th>\n");
      out.write("\t\t\t\t\t\t\t\t<th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"week\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"stage\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"date\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t</th>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t</thead>\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t\t\t\t<!--<tr class=\"current\">\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"heading\">Buproprion</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>30</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>30</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>30</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>30</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>30</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>30</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>30</td>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t<tr class=\"odd current\">\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"heading\">Venlafaxine</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>15</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>15</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>15</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>15</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>15</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>15</td>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t<tr class=\"discontinuedDivider\">\n");
      out.write("\t\t\t\t\t\t\t\t<td colspan=\"9\">Discontinued Medications <img src=\"images/graph/downArrow.png\" alt=\"\" /></td>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t<tr class=\"discontinued\">\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"heading\">Lorazepam</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>20</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>D/C</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t<tr class=\"discontinued odd\">\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"heading\">Fluoxetine</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>20</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>D/C</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t<tr class=\"discontinued\">\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"heading\">Zolpidem</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>10</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>D/C</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t<tr class=\"discontinued odd\">\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"heading\">Fluoxetine</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>20</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>D/C</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t<tr class=\"discontinued\">\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"heading\">Zolpidem</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>10</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>D/C</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t\t</tr>-->\n");
      out.write("\t\t\t\t\t\t\t</tbody>\n");
      out.write("\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"next navArrow\">>></a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"noMedications\" class=\"noresults\"><p>No medications have been added for this patient.</p><p>Click the ePrescribe button above to add a medication.</p></div>\n");
      out.write("\t\t\t<div id=\"longMedications\" class=\"longresults\"><p>* Treatment was last administered on the date indicated in <span style=\"color:red;\">red</span> next to the drug name to the left.</p></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"recommendations\" class=\"tabBox\">\n");
      out.write("\t\t\t<div class=\"floatLeft\">\n");
      out.write("\t\t\t\t<h2 class=\"conditionalHeading hide\" id=\"generalMessagesHdr\">General Messages</h2>\n");
      out.write("\t\t\t\t<div class=\"generalmessages\"></div>\n");
      out.write("\t\t\t\t<h2 class=\"conditionalHeading hide\" id=\"guidelineConsistencyHdr\">Guideline Consistency</h2>\n");
      out.write("\t\t\t\t<div class=\"generalconsistency\"></div>\n");
      out.write("\t\t\t\t<div class=\"additionalconsistency\"></div>\n");
      out.write("\t\t\t\t<h2 class=\"conditionalHeading hide\" id=\"clinicalResponseHdr\">Clinical Response and Treatment Recommendations</h2>\n");
      out.write("\t\t\t\t<div class=\"treatmentmessages\"></div>\n");
      out.write("\t\t\t\t<div class=\"specialmessages\"></div>\n");
      out.write("\t\t\t\t<div class=\"clinicalresponse\"></div>\n");
      out.write("\t\t\t\t<div class=\"medicationresponse\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"floatLeft right\">\n");
      out.write("\t\t\t\t<div class=\"treatmentTableHolder\">\n");
      out.write("\t\t\t\t\t<h2>Current Guideline Stage Treatment Table</h2>\n");
      out.write("\t\t\t\t\t<table class=\"guidelinechart\">\n");
      out.write("\t\t\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<th class=\"narrow odd\" scope=\"col\">Stage</th>\n");
      out.write("\t\t\t\t\t\t\t<th scope=\"col\">Drug 1</th>\n");
      out.write("\t\t\t\t\t\t\t<th class=\"odd\" scope=\"col\">Drug 2</th>\n");
      out.write("\t\t\t\t\t\t\t<th scope=\"col\">Drug 3</th>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t</thead>\n");
      out.write("\t\t\t\t\t\t<tbody></tbody>\n");
      out.write("\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t<a href=\"MQIP_Treatment_Tables.pdf\" target=\"_blank\" id=\"treatmentTableLink\">Open treatment table for all stages (pdf)</a>\n");
      out.write("\t\t\t\t\t<div class=\"notes\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<h2 class=\"conditionalHeading hide\" id=\"otherInfoHdr\">Other Information</h2>\n");
      out.write("\t\t\t\t<div class=\"othermessages\"></div>\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"progress\" class=\"tabBox\">\n");
      out.write("\t\t\t<div id=\"searchBar\">\n");
      out.write("\t\t\t\t<h2>Search Notes</h2>\n");
      out.write("\t\t\t\t<div id=\"searchBoxesWrapper\">\n");
      out.write("\t\t\t\t\t<div class=\"fieldWrapper\" id=\"searchKeywords\">\n");
      out.write("\t\t\t\t\t\t<form action=\"\" id=\"keywordSearchForm\">\n");
      out.write("\t\t\t\t\t\t\t<p>Enter a search term:</p>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" disabled=\"disabled\" rel=\"Enter keyword(s)\" id=\"noteKeywords\" class=\"greenInput\" value=\"Enter keyword(s)\" />\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" class=\"orangeBtn\" id=\"searchNotesKeyword\" value=\"Search\" disabled=\"disabled\" />\n");
      out.write("\t\t\t\t\t\t</form>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"fieldWrapper\" id=\"tagHolder\">\n");
      out.write("\t\t\t\t\t\t<p>Select a tag to filter:</p>\n");
      out.write("\t\t\t\t\t\t<div class=\"dropdown disabled\" id=\"tagDropdown\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"pullDown\">Select</a>\n");
      out.write("\t\t\t\t\t\t\t<ul></ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"clearNoteSearch\">Clear All</a>\n");
      out.write("\t\t\t\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"searchContent\">\n");
      out.write("\t\t\t\t<div id=\"noteSamples\">\n");
      out.write("\t\t\t\t\t<div class=\"pagination topPagination\"></div>\n");
      out.write("\t\t\t\t\t<ul></ul>\n");
      out.write("\t\t\t\t\t<div class=\"pagination bottomPagination\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div id=\"noteContent\"></div>\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"noNotesWritten\" class=\"noresults\"><p>No progress notes have been written for this patient.</p><p>Click the Create Note button in the upper right to create a note.</p></div>\n");
      out.write("\t\t\t<div id=\"noNotesSearch\" class=\"noresults\">Your search did not match any progress notes. <a href=\"#\" class=\"clearNoteSearch\">Clear your search</a></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"labs\" class=\"tabBox\">\n");
      out.write("\t\t\t<div id=\"labsTopBar\">\n");
      out.write("\t\t\t\t<div id=\"floatWrapper\">\n");
      out.write("\t\t\t\t\t<div class=\"fieldWrapper\">\n");
      out.write("\t\t\t\t\t\t<p>View by test:</p>\n");
      out.write("\t\t\t\t\t\t<div class=\"dropdown disabled\" id=\"labTestsDropdown\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"pullDown\">View All</a>\n");
      out.write("\t\t\t\t\t\t\t<ul></ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"pagination topPagination\"></div>\n");
      out.write("\t\t\t\t\t<div class=\"orangeBtnContainer\"><a href=\"#\" id=\"enterLabTests\" class=\"orangeBtn\">Enter Labs</a></div>\n");
      out.write("\t\t\t\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<table>\n");
      out.write("\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<th class=\"labName\">Laboratory Test Name</th>\n");
      out.write("\t\t\t\t\t\t<th class=\"date\">Date</th>\n");
      out.write("\t\t\t\t\t\t<th class=\"results\">Results</th>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t</thead>\n");
      out.write("\t\t\t\t<tbody></tbody>\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t\t<div class=\"pagination bottomPagination\"></div>\n");
      out.write("\t\t\t<div id=\"noLabsWritten\" class=\"noresults\"><p>No lab test results have been entered for this patient.</p><p>Click the Enter Labs button above to enter a lab test result.</p></div>\n");
      out.write("\t\t\t<div id=\"noLabsSearch\" class=\"noresults\">There are no results for that test. <a href=\"#\" class=\"showAllLabs\">Show all lab test results</a></div>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"information\" class=\"tabBox\">\n");
      out.write("\t\t\t<div id=\"displayPatientInfo\">\n");
      out.write("\t\t\t\t<h2>Patient Information: </h2>\n");
      out.write("\t\t\t\t<div id=\"displayInfo\" class=\"patientForm\">\n");
      out.write("\t\t\t\t\t<div class=\"floatLeft\">\n");
      out.write("\t\t\t\t\t\t<div class=\"fieldWrapper\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"fNameText\">First Name:</label>\n");
      out.write("\t\t\t\t\t\t\t<span id=\"fNameText\" class=\"infoText\"></span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"fieldWrapper\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"lNameText\">Last Name:</label>\n");
      out.write("\t\t\t\t\t\t\t<span id=\"lNameText\" class=\"infoText\"></span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"fieldWrapper\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"raceText\">Race:</label>\n");
      out.write("\t\t\t\t\t\t\t<span id=\"raceText\" class=\"infoText\"></span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"fieldWrapper\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"ethnicityText\">Ethnicity:</label>\n");
      out.write("\t\t\t\t\t\t\t<span id=\"ethnicityText\" class=\"infoText\"></span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"fieldWrapper\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"pcpnText\">Primary Care Physician Name:</label>\n");
      out.write("\t\t\t\t\t\t\t<span id=\"pcpnText\" class=\"infoText paddingTop\"></span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"fieldWrapper\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"pcpeText\">Primary Care Physician Email:</label>\n");
      out.write("\t\t\t\t\t\t\t<span id=\"pcpeText\" class=\"infoText paddingTop\"></span>\n");
      out.write("\t\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"floatLeft\">\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"fieldWrapper\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"patientIdText\">ID #:</label>\n");
      out.write("\t\t\t\t\t\t\t<span id=\"patientIdText\" class=\"infoText\"></span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"fieldWrapper\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"zipCodeText\">ZIP Code:</label>\n");
      out.write("\t\t\t\t\t\t\t<span id=\"zipCodeText\" class=\"infoText\"></span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"fieldWrapper\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"sexText\">Sex:</label>\n");
      out.write("\t\t\t\t\t\t\t<span id=\"sexText\" class=\"infoText\"></span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"fieldWrapper\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"dobText\">Date of Birth:</label>\n");
      out.write("\t\t\t\t\t\t\t<span id=\"dobText\" class=\"infoText\"></span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"fieldWrapper\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"maritalText\">Marital Status:</label>\n");
      out.write("\t\t\t\t\t\t\t<span id=\"maritalText\" class=\"infoText\"></span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"fieldWrapper\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"employmentText\" class=\"noPadding\">Employment Status:</label>\n");
      out.write("\t\t\t\t\t\t\t<span id=\"employmentText\" class=\"infoText\"></span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"fieldWrapper\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"livingText\" class=\"noPadding\">Living Arrangement:</label>\n");
      out.write("\t\t\t\t\t\t\t<span id=\"livingText\" class=\"infoText\"></span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<a href=\"#\" id=\"editBtn\" class=\"orangeBtn\">Edit</a>\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\t\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"editPatientInfo\">\n");
      out.write("\t\t\t\t<h2>Edit Patient Information: </h2>\n");
      out.write("\t\t\t\t<div id=\"createFields\" class=\"patientForm\">\n");
      out.write("\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/inc/patientForm.jsp", out, false);
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<a href=\"#\" id=\"closeEditPatient\">Cancel</a><input type=\"submit\" value=\"Save\" class=\"orangeBtn\" id=\"savePatient\" />\n");
      out.write("\t\t\t\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"reports\" class=\"tabBox\">Reports</div>\n");
      out.write("\t</div>\n");
      out.write("\t</div>\t\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
