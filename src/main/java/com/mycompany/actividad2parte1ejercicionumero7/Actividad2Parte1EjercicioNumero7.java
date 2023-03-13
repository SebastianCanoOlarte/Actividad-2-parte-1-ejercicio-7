/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad2parte1ejercicionumero7;

import java.util.Scanner;
public class Actividad2Parte1EjercicioNumero7 {

    public static void main(String[] args) {
        String NOM;
        int NHT,VHN,HET,HEE8,SALARIO;
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese su nombre");
        NOM = input.nextLine();
        System.out.println("numero de horas trabajadas");
        NHT = input.nextInt();
        System.out.println("valor por hora de trabajo");
        VHN = input.nextInt();
        if (NHT>40){
            HET = NHT-40;
            if (HET>8){
                HEE8 = HET-8;
                SALARIO = (40*VHN)+(16*VHN)+(HEE8*3*VHN);
            }
            else{
                SALARIO = (40*VHN)+(HET*2*VHN);
            }
        }
        else{
            SALARIO = NHT*VHN;
        }
        System.out.println("El trabajador "+NOM+" devengo: $"+SALARIO);
    }
}
