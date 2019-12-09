package mypackage1;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InicioAction extends Action 
{
  /**
   * This is the main action called from the Struts framework.
   * @param mapping The ActionMapping used to select this instance.
   * @param form The optional ActionForm bean for this request.
   * @param request The HTTP Request we are processing.
   * @param response The HTTP Response we are processing.
   */
  public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
  {
    InicioForm navBar = (InicioForm) form;
    String opcion = navBar.getOpcionNavBar();
    switch (opcion)
    {
      case "listaTorneos":

      break;
      case: "nuevoTorneo":
      break;
      case: "listaPartidos":
      break;
      case: "nuevoPartido":
      break;
      case: "listaResultados":
      break;
      case: "nuevoResultado":
      break;
      case: "listaEquipos":
      break;
      case: "nuevoEquipo":
      break;
    }
    return mapping.findForward("success");
  }
}