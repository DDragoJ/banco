/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos_Clases;

import java.util.Date;
import java.util.Scanner;



/**
 *
 * @author cosmo
 */
class ahorro extends cuenta {
    
    public ahorro(String Numero_cuenta, String Tipo_cuenta, Double saldo, Integer interes) {
        super(Numero_cuenta, Tipo_cuenta, saldo, interes);
        setTipo_cuenta("AHORRO");
        setSaldo(0.0);
        setInteres(0);
    }
            @Override
        public void Leer(){
        super.Leer();
        Scanner scanner= new Scanner(System.in);
        String aux;
        System.out.println("Saldo de ingreso: ");
        aux=scanner.nextLine();
        setSaldo(Double.parseDouble(aux));
        }
    
    
}