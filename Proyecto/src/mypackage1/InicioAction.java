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
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.NamingException;
import oracle.jdbc.*;
import java.util.*;

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
    Connection cn = null;
    ConnectDB conn =new ConnectDB();
    ResultSet rsConsulta = null;
    InicioForm navBar = (InicioForm) form;
    String opcion = navBar.getOpcionNavBar();
    if (opcion.equals("Ver Torneos"))
    {
      try
      {
        cn = conn.conexion;
        String cadena = "select a.id_torneo as torneo,b.anio as gestion,c.granbetra�a,c.francia,c.usa,c.australia  from g8_torneo a,g8_gestion b,g8_lugar c where a.lugar_id_lugar = c.id_lugar and a.gestion_id_gestion = b.id_gestion  order by 1";
        rsConsulta = conn.getData(cadena);
        ArrayList items = new ArrayList();
        while (rsConsulta.next())
        {
          String aux="";
          ClaseTorneo item = new ClaseTorneo();
          item.setTorneo(rsConsulta.getString("torneo"));
          item.setGestion(rsConsulta.getString("gestion"));
          int i = Integer.parseInt(rsConsulta.getString("granbetra�a"));
          if(i>0){
            aux="Gran Betrana";
          }
          int j = Integer.parseInt(rsConsulta.getString("francia"));
          if(j>0){
            aux="Francia";
          }
          int k = Integer.parseInt(rsConsulta.getString("australia"));
          if(k>0){
            aux="Australia";
          }
          int l = Integer.parseInt(rsConsulta.getString("usa"));
          if(l>0){
            aux="USA";
          }
          item.setLugar(aux);
          items.add(item);
        }
        InicioForm f = new InicioForm();
        f.setTablaTorneos(items);
        request.getSession().setAttribute("torneos",f);
        return mapping.findForward("inicio");
      }	
      catch(Exception e)
      {
        e.printStackTrace();
        return (mapping.findForward("error"));
      }
      finally
      {
        conn.closeConnection();	
      }
    }
    if (opcion.equals("Nuevo Torneo"))
    {
      return mapping.findForward("nuevoTorneo");
    }
    if (opcion.equals("Ver �rbitros"))
    {
      return mapping.findForward("arbitros");
    }
    if (opcion.equals("Nuevo �rbitro"))
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