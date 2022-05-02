package com.vhfc.p1;

public class MarcaRenombrada {

    private int nrDeModelos;
    private String anio_l;      //año de lanzamiento
    private String cod_ident;  // código identificativo

    public MarcaRenombrada(int nrDeModelos, String anio_l, String cod_ident) {
        this.nrDeModelos = nrDeModelos;
        this.anio_l = anio_l;
        this.cod_ident = cod_ident;
    }

    public MarcaRenombrada() {
    }

    public int getNrDeModelos() {
        return nrDeModelos;
    }

    public void setNrDeModelos(int nrDeModelos) {
        this.nrDeModelos = nrDeModelos;
    }

    public String getAnio_l() {
        return anio_l;
    }

    public void setAnio_l(String anio_l) {
        this.anio_l = anio_l;
    }

    public String getCod_ident() {
        return cod_ident;
    }

    public void setCod_ident(String cod_ident) {
        this.cod_ident = cod_ident;
    }
}
