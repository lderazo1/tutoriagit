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
public class Reloj {

    private int hora;
    private int minuto;
    private int segundo;

    public Reloj() {
        this(12, 59, 59);
    }

    public Reloj(int hora) {
        this(hora, 0, 0);
    }

    public Reloj(int hora, int minuto) {
        this(hora, minuto, 12);
    }

    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        } else {
            System.out.println("Hora Incorrecta, se asigna el valor de 0");
            this.hora = 0;
        }
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        }else{
            System.out.println("Minuto Incorrecto, se asigna el valor de 0");
            this.minuto = 0;
        }
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
        }else{
            System.out.println("Segundo Incorrecto, se asigna el valor de 0");
            this.segundo = 0;
        }
    }
    
    public String mostrarTiempo24Horas(){
        return String.format("%02d:%02d:%02d",hora,minuto,segundo);
    }
    
    public String mostrarTiempo12Horas(){
        return String.format("%02d:%02d:%02d %s",
        hora == 0 || hora == 12 ? 12 : hora % 12,
        minuto,
        segundo,
        hora < 12 ? "AM" : "PM");
    }


}
