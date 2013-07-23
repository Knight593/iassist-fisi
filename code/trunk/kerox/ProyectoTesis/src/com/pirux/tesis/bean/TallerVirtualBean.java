package com.pirux.tesis.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.pirux.tesis.model.TallerVirtual;

/**
 * Representa un Hangout Grabado
 * 
 * @author Landayer
 */
@ManagedBean
@SessionScoped
public class TallerVirtualBean {

  private List<TallerVirtual> talleresVirtuales;

  public TallerVirtualBean() {
    talleresVirtuales = new ArrayList<TallerVirtual>();
    // TODO dcabanillas: Crear handler, service, dao y mock
    TallerVirtual taller = new TallerVirtual();
    taller.setNombreTutor("David");
    taller.setTitulo("Titulo 1");
    taller.setFecha(new Date());
    taller.setTecnologias("JAVA");
    taller.setDescripcion("Descripcion 1");
    TallerVirtual taller2 = new TallerVirtual();
    taller2.setNombreTutor("David2");
    taller2.setTitulo("Titulo 2");
    taller2.setFecha(new Date());
    taller2.setTecnologias("C#");
    taller2.setDescripcion("Descripcion 2");
    TallerVirtual taller3 = new TallerVirtual();
    taller3.setNombreTutor("David3");
    taller3.setTitulo("Titulo 3");
    taller3.setFecha(new Date());
    taller3.setTecnologias("PHP");
    taller3.setDescripcion("Descripcion 3");
    talleresVirtuales.add(taller);
    talleresVirtuales.add(taller2);
    talleresVirtuales.add(taller3);
  }
  
  public List<TallerVirtual> getTalleresVirtuales() {
    return talleresVirtuales;
  }

  public void setTalleresVirtuales(final List<TallerVirtual> talleresVirtuales) {
    this.talleresVirtuales = talleresVirtuales;
  }

}
