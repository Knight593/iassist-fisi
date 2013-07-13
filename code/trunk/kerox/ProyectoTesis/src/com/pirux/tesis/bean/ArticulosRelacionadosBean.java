package com.pirux.tesis.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import org.primefaces.push.PushContext;
import org.primefaces.push.PushContextFactory;

import com.pirux.tesis.model.ArticuloRealcionado;

@ManagedBean
@ApplicationScoped
// Evaluar de que sea session scope
// Esta informacion quedara registrada a nivel de BD
public class ArticulosRelacionadosBean {

  private List<ArticuloRealcionado> articulosRelacionados;

  // datos para agregar articulo
  private String urlAgregar;
  private String tituloAgregar;
  private String imagenAgregar;

  public String getUrlAgregar() {
    return urlAgregar;
  }

  public void setUrlAgregar(String urlAgregar) {
    this.urlAgregar = urlAgregar;
  }

  public String getTituloAgregar() {
    return tituloAgregar;
  }

  public void setTituloAgregar(String tituloAgregar) {
    this.tituloAgregar = tituloAgregar;
  }

  public String getImagenAgregar() {
    return imagenAgregar;
  }

  public void setImagenAgregar(String imagenAgregar) {
    this.imagenAgregar = imagenAgregar;
  }

  public ArticulosRelacionadosBean() {
    this.articulosRelacionados = obtenerArticulosRelacionados();
  }

  public synchronized void agregarArticuloRelacionado() {
    final ArticuloRealcionado articulo = new ArticuloRealcionado();
    articulo.setTituloPost(tituloAgregar);
    articulo.setUrlPost(urlAgregar);
    articulo.setRutaImagen(imagenAgregar);
    articulosRelacionados.add(0, articulo);
    final PushContext pushContext = PushContextFactory.getDefault()
        .getPushContext();
    pushContext.push("/LinkRelacionadoCanal", null);
    this.tituloAgregar = "";
    this.imagenAgregar = "";
    this.urlAgregar = "";
  }

  private List<ArticuloRealcionado> obtenerArticulosRelacionados() {
    final List<ArticuloRealcionado> listaArticulosRelacionados = new ArrayList<ArticuloRealcionado>();

    final ArticuloRealcionado articulo = new ArticuloRealcionado();
    articulo.setTituloPost("Se fue Reader pero calma, hay más y hasta mejores opciones");
    articulo.setUrlPost("http://www.enter.co/vida-digital/se-va-reader-pero-calma-hay-mas-y-hasta-mejores-opciones/");
    articulo.setRutaImagen("http://www.enter.co/custom/uploads/2013/03/Alternativas-google-reader.jpg");

    final ArticuloRealcionado articulo2 = new ArticuloRealcionado();
    articulo2.setTituloPost("Llega el root para Android Jelly Bean 4.3 de la mano de Chainfire");
    articulo2.setUrlPost("http://www.xatakandroid.com/sistema-operativo/llega-el-root-para-android-jelly-bean-4-3-de-la-mano-de-chainfire");
    articulo2.setRutaImagen("http://img.xatakandroid.com/2013/05/Galaxy-S4-GE.jpg");

    final ArticuloRealcionado articulo3 = new ArticuloRealcionado();
    articulo3.setTituloPost("ZTE Grand X PRO, toda la información sobre el smartphone de ZTE");
    articulo3.setUrlPost("http://www.xatakandroid.com/moviles-android/zte-grand-x-pro-toda-la-informacion-sobre-el-smartphone-de-zte");
    articulo3.setRutaImagen("http://img.xatakandroid.com/2013/07/650_1000_zte-grand.jpg");

    final ArticuloRealcionado articulo5 = new ArticuloRealcionado();
    articulo5.setTituloPost("En Holanda, varios colegios tendrán al iPad como profesor");
    articulo5.setUrlPost("http://www.enter.co/moviles/en-holanda-varios-colegios-tendran-al-ipad-como-profesor/");
    articulo5.setRutaImagen("http://www.enter.co/custom/uploads/2013/07/ipad-en-clase.jpg");
    
    final ArticuloRealcionado articulo4 = new ArticuloRealcionado();
    articulo4.setTituloPost("Mega lanza su aplicación oficial para Android; iOS y cliente de Windows 'pronto'");
    articulo4.setUrlPost("http://www.genbeta.com/movil/mega-lanza-su-aplicacion-oficial-para-android-ios-y-cliente-de-windows-pronto");
    articulo4.setRutaImagen("http://img.genbeta.com/2013/07/mega.jpg");
    
    final ArticuloRealcionado articulo6 = new ArticuloRealcionado();
    articulo6.setTituloPost("EEUU no era el único: Francia también tiene su propio PRISM, según Le Monde ");
    articulo6.setUrlPost("http://www.genbeta.com/actualidad/eeuu-no-era-el-unico-francia-tambien-tiene-su-propio-prism-segun-le-monde");
    articulo6.setRutaImagen("http://img.genbeta.com/2013/07/france-prism.png");
    
    final ArticuloRealcionado articulo7 = new ArticuloRealcionado();
    articulo7.setTituloPost("7digital lanza su tienda de música para Firefox OS ");
    articulo7.setUrlPost("http://www.genbeta.com/multimedia/7digital-lanza-su-tienda-de-musica-para-firefox-os");
    articulo7.setRutaImagen("http://img.genbeta.com/2013/07/650_1000_7d_wordmark_colour_RGB.png");
    
    final ArticuloRealcionado articulo8 = new ArticuloRealcionado();
    articulo8.setTituloPost("Los resultados orgánicos de Google ocupan menos del 15% de la página");
    articulo8.setUrlPost("http://www.enter.co/vida-digital/los-resultados-organicos-de-google-ocupan-menos-del-15-de-la-pagina/");
    articulo8.setRutaImagen("http://www.enter.co/custom/uploads/2013/07/tumblr_inline_mp48uuUnpc1qz4rgp.png");

    listaArticulosRelacionados.add(articulo);
    listaArticulosRelacionados.add(articulo2);
    listaArticulosRelacionados.add(articulo3);
    listaArticulosRelacionados.add(articulo4);
    listaArticulosRelacionados.add(articulo5);
    listaArticulosRelacionados.add(articulo6);
    listaArticulosRelacionados.add(articulo7);
    listaArticulosRelacionados.add(articulo8);

    return listaArticulosRelacionados;
  }

  public List<ArticuloRealcionado> getArticulosRelacionados() {
    return articulosRelacionados;
  }

  public void setArticulosRelacionados(
      final List<ArticuloRealcionado> articulosRelacionados) {
    this.articulosRelacionados = articulosRelacionados;
  }

}
