package controller;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import model.CodigoArea;
import org.jboss.weld.context.RequestContext;
import org.primefaces.PrimeFaces;

import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@ViewScoped
public class IndexController implements Serializable {

    private static final long serialVersionUID = -2701110827897445334L;

    private String consulta;
    private List<CodigoArea> codigoAreas = new ArrayList<>();


    public void buscarRegiao() {
        setCodigoAreas(new ArrayList<>());
        Client client = Client.create();
        WebResource wr = client.resource("https://api-codigoarea.herokuapp.com/srcascudo/" + getConsulta());
        Gson gson = new Gson();
        getCodigoAreas().add(gson.fromJson(wr.get(String.class), CodigoArea.class));
        PrimeFaces.current().executeScript("document.getElementById('loading').style.display='none'");
    }

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }

    public List<CodigoArea> getCodigoAreas() {
        return codigoAreas;
    }

    public void setCodigoAreas(List<CodigoArea> codigoAreas) {
        this.codigoAreas = codigoAreas;
    }
}
