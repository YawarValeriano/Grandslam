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

public class ActionTorneo extends Action 
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
    ActionFormTorneo torneo = (ActionFormTorneo) form;
     try
    {
    //select * from tab where TNAME like '%G8%'
    
      cn = conn.conexion;
      String cadena = "select a.id_torneo as torneo,b.anio as gestion,c.granbetrana,c.francia,c.usa,c.australia  from g8_torneo a,g8_gestion b,g8_lugar order by 1";
      rsConsulta = conn.getData(cadena);
      ArrayList items = new ArrayList();
      while (rsConsulta.next())
      {
        String aux="";
        ClaseTorneo item = new ClaseTorneo();
        item.setTorneo(rsConsulta.getString("torneo"));
        item.setGestion(rsConsulta.getString("gestion"));
        int i = Integer.parseInt(rsConsulta.getString("granbetrana"));
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
        ActionFormTorneo f = new ActionFormTorneo();
        f.setTabla(items);
        System.out.println(f);
        request.getSession().setAttribute("yyy",f);

        return mapping.findForward("torneo");
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
}