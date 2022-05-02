package com.vhfc.pro3;

import java.util.Scanner;

public class MaiSalario {
    public static void main(String[] args) {
        Empleado empleado=new Empleado();
        Scanner dat= new Scanner(System.in);
        System.out.print("Nombre de empleado: ");
        empleado.setNombre(dat.next());
        System.out.print("Apellido de empleado: ");
        empleado.setApellido(dat.next());
        System.out.println("el salario de empleado: ");
        empleado.setSalario(dat.nextDouble());
        System.out.println("dias trabajados: ");
        int dia=dat.nextInt();
        System.out.print("el salario es: "+ empleado.salarioM(dia));
;
    }
}
