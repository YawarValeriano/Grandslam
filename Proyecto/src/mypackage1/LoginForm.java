package mypackage1;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class LoginForm extends ActionForm 
{
  String usuario;
  String contraseña;

  /**
   * Reset all properties to their default values.
   * @param mapping The ActionMapping used to select this instance.
   * @param request The HTTP Request we are processing.
   */
  public void reset(ActionMapping mapping, HttpServletRequest request)
  {
    super.reset(mapping, request);
  }

  /**
   * Validate all properties to their default values.
   * @param mapping The ActionMapping used to select this instance.
   * @param request The HTTP Request we are processing.
   * @return ActionErrors A list of all errors found.
   */
  public ActionErrors validate(ActionMapping mapping, HttpServletRequest request)
  {
    ActionErrors errors = new ActionErrors();
    if ((usuario == null) || (usuario.length() < 1))
      errors.add("usuario", new ActionError("error.usuario.required"));
    if ((contraseña == null) || (contraseña.length() < 1))
      errors.add("contraseña", new ActionError("error.contraseña.required")); 
    return errors;
  }

  public String getUsuario()
  {
    return usuario;
  }

  public void setUsuario(String newUsuario)
  {
    usuario = newUsuario;
  }

  public String getContraseña()
  {
    return contraseña;
  }

  public void setContraseña(String newContraseña)
  {
    contraseña = newContraseña;
  }
}