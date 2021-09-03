/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_kiem_tra_1;

/**
 *
 * @author hoang
 */
public class Xau {
    private String s;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
    public int Len(){
        return this.s.length();
    }
    public int SoCau(){
        String[] arr = this.s.split("\\.");
        int count = 0;
        for(String i : arr){
            count++;
        }
        return count;
    }
}
