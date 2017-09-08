/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

/**
 *
 * @author SMK TELKOM
 */
class Pertama {

    private int a =20;
    
    protected void terlindungi()
    {
        System.out.println(" Method Ini Hanya Untuk Anaknya ");
    }
    
    public void info(){
        System.out.println (" a = " +a);
        System.out.println("Dipanggil pada = "+this.getClass().getName());
    }
}
