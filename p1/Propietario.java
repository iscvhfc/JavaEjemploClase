package com.vhfc.p1;

public class Propietario {

    private String nombre;
    private String cpf;
    private String identificacion;
    private String fec_nac;
    private String calle;
    private String vecindario;
    private String ciudad;
    private String expresar;
    private String codigo_postal;
    private String completar;


    public Propietario() {
    }


    public Propietario(String nombre, String cpf, String identificacion, Direccion direccion) {
        this.nombre = nombre;
        this.cpf = cpf;
        this.identificacion = identificacion;
        this.calle=direccion.getCalle();
        this.ciudad=direccion.getCiudad();
        this.codigo_postal=direccion.getCodigo_postal();
        this.expresar=direccion.getExpresar();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getFec_nac() {
        return fec_nac;
    }

    public void setFec_nac(String fec_nac) {
        this.fec_nac = fec_nac;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getVecindario() {
        return vecindario;
    }

    public void setVecindario(String vecindario) {
        this.vecindario = vecindario;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getExpresar() {
        return expresar;
    }

    public void setExpresar(String expresar) {
        this.expresar = expresar;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getCompletar() {
        return completar;
    }

    public void setCompletar(String completar) {
        this.completar = completar;
    }
}
