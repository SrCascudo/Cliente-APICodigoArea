package controller;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import model.CodigoArea;
import org.json.simple.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class IndexController implements Serializable {

    private static final long serialVersionUID = -2701110827897445334L;

    String consulta;
    List<CodigoArea> codigoAreas = new ArrayList<>();


    public void buscarRegiao() {
        setCodigoAreas(new ArrayList<>());
        Client client = Client.create();
        WebResource wr = client.resource("http://localhost:8080/API-1.0-SNAPSHOT/srcascudo/" + getConsulta());
        Gson gson = new Gson();
        getCodigoAreas().add(gson.fromJson(wr.get(String.class), CodigoArea.class));
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
