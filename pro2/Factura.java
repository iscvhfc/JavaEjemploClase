package com.vhfc.pro2;

public class Factura {
    private String numero;
    private String descripcion;
    private int cant_comp; //cantidad comprada de un artículo
    private double precio; //el precio por artículo

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCant_comp() {
        return cant_comp;
    }

    public void setCant_comp(int cant_comp) {
        this.cant_comp = cant_comp;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Factura() {
    }

    public Factura(String numero, String descripcion, int cant_comp, double precio) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.cant_comp = cant_comp;
        this.precio = precio;
    }
    public double getArtPrecio() {
        double monto=0.0;
        monto=getCant_comp()*getPrecio();
            if (getPrecio() < 0) {
                precio = 0.0;
            }

        return monto;
    }
    public double getTotalFatura(){

        double total=0.0;
        if (getPrecio()<0){
            total = 0;
        }
                total=total+getArtPrecio();
    return total;
    }
}
