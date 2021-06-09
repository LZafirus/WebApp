/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.walaszczyk.model;

/**
 *
 * @author Dawid Walaszczyk
 */
public class Converter {
    
    private int number;
    private String result;
    
    public int getNumber(){
        return number;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    public void toBinary(){
        result = Integer.toBinaryString(number);
    }
    
    public void toHex(){
        result = Integer.toHexString(number);
    }
    
    public void toOctal(){
        result = Integer.toOctalString(number);
    }
    
    public void clear(){
        result = "";
    }
    
}
