  /*@lineinfo:filename=/inicio.jsp*/
  /*@lineinfo:generated-code*/

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;


public class _inicio extends com.orionserver.http.OrionHttpJspPage {

  public final String _globalsClassName = null;

  // ** Begin Declarations


  // ** End Declarations

  public void _jspService(HttpServletRequest request, HttpServletResponse response) throws java.io.IOException, ServletException {

    response.setContentType( "text/html;charset=windows-1252");
    /* set up the intrinsic variables using the pageContext goober:
    ** session = HttpSession
    ** application = ServletContext
    ** out = JspWriter
    ** page = this
    ** config = ServletConfig
    ** all session/app beans declared in globals.jsa
    */
    PageContext pageContext = JspFactory.getDefaultFactory().getPageContext( this, request, response, null, true, JspWriter.DEFAULT_BUFFER, true);
    // Note: this is not emitted if the session directive == false
    HttpSession session = pageContext.getSession();
    int __jsp_tag_starteval;
    ServletContext application = pageContext.getServletContext();
    JspWriter out = pageContext.getOut();
    _inicio page = this;
    ServletConfig config = pageContext.getServletConfig();

    com.evermind.server.http.JspCommonExtraWriter __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
    try {
      // global beans
      // end global beans


      __ojsp_s_out.write(__jsp_StaticText.text[0]);
      __ojsp_s_out.write(__jsp_StaticText.text[1]);
      /*@lineinfo:translated-code*//*@lineinfo:6^1*/      {
        org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_1=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setKey("boot.inicio");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1);
      }
      /*@lineinfo:generated-code*/
      __ojsp_s_out.write(__jsp_StaticText.text[2]);
      /*@lineinfo:translated-code*//*@lineinfo:40^1*/      {
        org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_2=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setKey("boot.script");
        __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
          } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2);
      }
      /*@lineinfo:generated-code*/
      __ojsp_s_out.write(__jsp_StaticText.text[3]);


    }
    catch( Throwable e) {
      try {
        if (out != null) out.clear();
      }
      catch( Exception clearException) {
      }
      pageContext.handlePageException( e);
    }
    finally {
      OracleJspRuntime.extraHandlePCFinally(pageContext,true);
      JspFactory.getDefaultFactory().releasePageContext(pageContext);
    }

  }
  private static class __jsp_StaticText {
    private static final byte text[][]=new byte[4][];
    static {
      try {
      text[0] = 
      "\r\n".getBytes("Cp1252");
      text[1] = 
      "\r\n<!DOCTYPE html>\r\n<html lang=\"en\">\r\n<head>\r\n".getBytes("Cp1252");
      text[2] = 
      "\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\r\n<title>\r\nInicio\r\n</title>\r\n</head>\r\n<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarTogglerDemo03\" aria-controls=\"navbarTogglerDemo03\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n    <span class=\"navbar-toggler-icon\"></span>\r\n  </button>\r\n  <a class=\"navbar-brand\" href=\"#\">Grand Slam</a>\r\n\r\n  <div class=\"collapse navbar-collapse\" id=\"navbarTogglerDemo03\">\r\n    <ul class=\"navbar-nav mr-auto mt-2 mt-lg-0\">\r\n      <li class=\"nav-item active\">\r\n        <a class=\"nav-link\" href=\"#\">Categorias <span class=\"sr-only\">(current)</span></a>\r\n      </li>\r\n      <li class=\"nav-item\">\r\n        <a class=\"nav-link\" href=\"#\">Paises</a>\r\n      </li>\r\n      <li class=\"nav-item\">\r\n        <a class=\"nav-link\" href=\"#\">Modalidades</a>\r\n      </li>\r\n      <li class=\"nav-item\">\r\n        <a class=\"nav-link\" href=\"#\">Equipos</a>\r\n      </li>\r\n      <li class=\"nav-item\">\r\n        <a class=\"nav-link\" href=\"#\">por vErse</a>\r\n      </li>\r\n    </ul>\r\n  </div>\r\n</nav>\r\n<body>\r\nhola Mundo\r\n".getBytes("Cp1252");
      text[3] = 
      "\r\n</body>\r\n</html>\r\n".getBytes("Cp1252");
      }
      catch (Throwable th) {
        System.err.println(th);
      }
  }
}
}
