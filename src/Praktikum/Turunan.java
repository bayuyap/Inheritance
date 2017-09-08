/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author SMK TELKOM
 */
public class Turunan extends Induk {
    public void test(String S){
        System.out.println("Method Overload di Class Turunan");
        System.out.println("S : \''"+S+"\''");
        
    }
    public void test(){
        System.out.println("Method Overriding di Class Turunan");
    }
}
