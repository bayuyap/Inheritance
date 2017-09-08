/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author SMK TELKOM
 */
class Person {
    private String nama;
    private int umur;
    
    
    public Person(String nama, int umur){
        this.nama =nama;
        this.umur=umur;
    }
    
    public void info(){
        System.out.println(" Nama : " + this.nama);
        System.out.println(" Umur : " + this.umur);
    }
}
