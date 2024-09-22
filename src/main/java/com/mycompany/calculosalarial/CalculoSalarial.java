/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculosalarial;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class CalculoSalarial {

    public static void main(String[] args) {
        int sueldoBaseRepositor;
        double sueldoBaseCajero, sueldoBaseSupervisor, sueldoFinal = 0;
        Scanner entradaTeclado = new Scanner (System.in);
        System.out.println("Ingrese el empleado: ");
        String categoriaSueldo = entradaTeclado.nextLine().toLowerCase();
        switch (categoriaSueldo) {
            case "repositor": 
                sueldoBaseRepositor = 15890;
                sueldoFinal = sueldoBaseRepositor + (sueldoBaseRepositor * 0.10);
                break;
            case "cajero":
                sueldoBaseCajero = 25630.89;
                sueldoFinal = sueldoBaseCajero;
                break;
            case "supervisor":
                sueldoBaseSupervisor = 35560.20;
                sueldoFinal = sueldoBaseSupervisor - (sueldoBaseSupervisor * 0.11);
                break;
            default:
                System.out.println("La categoria de empleado no existe");
                break;
        }
        
        if (sueldoFinal != 0) {
            System.out.println("El sueldo del "+categoriaSueldo+" es de: "+sueldoFinal);
        }
    }
}
