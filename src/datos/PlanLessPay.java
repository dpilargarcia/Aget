/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import Presentacion.Modelo;
import Presentacion.Ventanas.VentanaLessPay;
import Presentacion.Ventanas.ventanaGastosAutomaticos;

/**
 *
 * @author danim
 */
public class PlanLessPay {
    private ProcesosBD bd;
    private Modelo modelo;
    private int ingresos;
    private int arriendo;
    private int servicios;
    private int mercado;
    private int transporte;
    private int educacion;
    private int deudas;
    private int lujos;
    private int ahorro;


    public ProcesosBD getBd() {
        return bd;
    }

    public Modelo getModelo() {
        if(modelo==null){
        this.modelo = new Modelo();
        }
        return modelo;
    }

    public int getIngresos() {
        return ingresos;
    }

    public int getArriendo() {
        return arriendo;
    }

    public int getServicios() {
        return servicios;
    }

    public int getMercado() {
        return mercado;
    }

    public int getTransporte() {
        return transporte;
    }

    public int getEducacion() {
        return educacion;
    }

    public int getDeudas() {
        return deudas;
    }

    public int getLujos() {
        return lujos;
    }

    public int getAhorro() {
        return ahorro;
    }

    
    public void calcularPlan(){
//        ingresos=Integer.parseInt(vtnLessPay.getTxtValor().getText());
  //      arriendo=Integer.parseInt(vtnGastosAuto.getTxtV1().getText());
/*      servicios=Integer.parseInt(modelo.getVtnGastosAutomaticos().getTxtV2().getText());
        mercado=Integer.parseInt(modelo.getVtnGastosAutomaticos().getTxtV3().getText());
        transporte=Integer.parseInt(modelo.getVtnGastosAutomaticos().getTxtV4().getText());
        educacion=Integer.parseInt(modelo.getVtnGastosAutomaticos().getTxtV5().getText());
        deudas=Integer.parseInt(modelo.getVtnGastosAutomaticos().getTxtV6().getText());
        lujos=Integer.parseInt(modelo.getVtnGastosAutomaticos().getTxtV7().getText());
        ahorro=Integer.parseInt(modelo.getVtnGastosAutomaticos().getTxtV8().getText());
*/
        System.out.println("ingreosos y arriendo" +ingresos + arriendo);
        
       }
    
}
