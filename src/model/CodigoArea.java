package model;

import java.util.ArrayList;
import java.util.List;

public class CodigoArea {
    private String ddd;
    private String estado;
    private List<String> regiao = new ArrayList<>();

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<String> getRegiao() {
        return regiao;
    }

    public void setRegiao(List<String> regiao) {
        this.regiao = regiao;
    }

    public static List<CodigoArea> codigoAreaBrasil(){
        CodigoArea ca;
        List<CodigoArea> lista = new ArrayList<>();

        ca = new CodigoArea();
        ca.estado = "S�o Paulo";
        ca.ddd = "11";
        ca.regiao.add("S�o Paulo - SP");
        ca.regiao.add("Jundia� - SP");
        ca.regiao.add("Itu - SP");
        ca.regiao.add("Bragan�a Paulista - SP");
        lista.add(ca);

        ca = new CodigoArea();
        ca.estado = "S�o Paulo";
        ca.ddd = "12";
        ca.regiao.add("S�o Jos� dos Campos -SP");
        ca.regiao.add("Taubat� - SP");
        ca.regiao.add("Vale do Para�ba - SP");
        lista.add(ca);

        ca = new CodigoArea();
        ca.estado = "S�o Paulo";
        ca.ddd = "13";
        ca.regiao.add("Santos - SP");
        ca.regiao.add("S�o Vicente - SP");
        ca.regiao.add("Baixada Santista - SP");
        ca.regiao.add("Vale do Ribeira - SP");
        lista.add(ca);

        ca = new CodigoArea();
        ca.estado = "S�o Paulo";
        ca.ddd = "14";
        ca.regiao.add("Bauru - SP");
        ca.regiao.add("Mar�lia - SP");
        ca.regiao.add("Ja� - SP");
        ca.regiao.add("Botucatu - SP");
        lista.add(ca);

        ca = new CodigoArea();
        ca.estado = "S�o Paulo";
        ca.ddd = "15";
        ca.regiao.add("Sorocaba - SP");
        ca.regiao.add("Itapetininga - SP");
        ca.regiao.add("Itapeva - SP");
        lista.add(ca);

        ca = new CodigoArea();
        ca.estado = "S�o Paulo";
        ca.ddd = "16";
        ca.regiao.add("Ribeir�o Preto - SP");
        ca.regiao.add("Franca - SP");
        ca.regiao.add("S�o Carlos - SP");
        ca.regiao.add("Araraquara - SP");
        lista.add(ca);

        ca = new CodigoArea();
        ca.estado = "S�o Paulo";
        ca.ddd = "17";
        ca.regiao.add("S�o Jos� do Rio Preto - SP");
        ca.regiao.add("Catanduva - SP");
        ca.regiao.add("Barretos - SP");
        ca.regiao.add("Votuporanga - SP");
        lista.add(ca);

        ca = new CodigoArea();
        ca.estado = "S�o Paulo";
        ca.ddd = "18";
        ca.regiao.add("Presidente Prudente - SP");
        ca.regiao.add("Ara�atuba - SP");
        ca.regiao.add("Birigui - SP");
        ca.regiao.add("Assis - SP");
        lista.add(ca);

        ca = new CodigoArea();
        ca.estado = "S�o Paulo";
        ca.ddd = "19";
        ca.regiao.add("Campinas - SP");
        ca.regiao.add("Piracicaba - SP");
        ca.regiao.add("Limeira - SP");
        ca.regiao.add("Americana - SP");
        lista.add(ca);

        //------------ RIO DE JANEIRO ---------------------
        ca = new CodigoArea();
        ca.estado = "Rio de Janeiro";
        ca.ddd = "21";
        ca.regiao.add("Rio de Janeiro - RJ");
        ca.regiao.add("Regi�o Metropolitana - RJ");
        ca.regiao.add("Teres�polis - RJ");
        lista.add(ca);
        return lista;
    }

    @Override
    public String toString() {
        return "Codigo de �rea: " + getDdd() + "\n" +
                "Regi�o: " + getRegiao().toString();
    }
}
