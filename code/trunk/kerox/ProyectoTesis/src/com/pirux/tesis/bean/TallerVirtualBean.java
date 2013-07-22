package com.pirux.tesis.bean;

import java.util.ArrayList;
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
    TallerVirtual taller2 = new TallerVirtual();
    taller2.setNombreTutor("David2");
    TallerVirtual taller3 = new TallerVirtual();
    taller3.setNombreTutor("David3");
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
