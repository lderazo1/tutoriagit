/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase15.reloj;

/**
 *
 * @author Luis_Daniel PC
 */
public class MainReloj {
    public static void main(String[] args) {
        Reloj reloj = new Reloj (18,59,59);
        
        System.out.println(reloj.mostrarTiempo24Horas());
        System.out.println(reloj.mostrarTiempo12Horas());

    }
}
