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
    if (opcion.equals("Ver Torneos"))
    {
      return mapping.findForward("inicio");
    }
    if (opcion.equals("Nuevo Torneo"))
    {
      return mapping.findForward("nuevoTorneo");
    }
    if (opcion.equals("Ver Árbitros"))
    {
      return mapping.findForward("arbitros");
    }
    if (opcion.equals("Nuevo Árbitro"))
    {
      return mapping.findForward("nuevoArbitro");
    }
    if (opcion.equals("Ver Equipos"))
    {
      return mapping.findForward("equipos"); 
    }
    if (opcion.equals("Nuevo Equipo"))
    {
      return mapping.findForward("nuevoEquipo");
    }
    if (opcion.equals("Ver Partidos"))
    {
      return mapping.findForward("partidos"); 
    }
    if (opcion.equals("Salir"))
    {
      return mapping.findForward("login");
    }
    return mapping.findForward("login");
  }
}