package com.pirux.tesis.bean;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.pirux.tesis.util.ConstantesFlowPage;

/**
 * Controla las navegaciones entre las paginas
 * @author Landayer
 */
@ManagedBean
@ApplicationScoped
public class NavegacionPageFlowBean {
  
  public String irProyectosRealizados() {
    return ConstantesFlowPage.GO_PAGINA_PROYECTOS_REALIZADOS;
  }

  public String irHome() {
    return ConstantesFlowPage.GO_PAGINA_HOME;
  }

  public String irPresentacion() {
    return ConstantesFlowPage.GO_PAGINA_PRESENTACION;
  }
}
