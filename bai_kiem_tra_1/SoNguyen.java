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
public class SoNguyen {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    SoNguyen() {
       
    }
    public int TongSoNguyen(){
        int sum = 0;
        for(int i = 0; i <= this.number; i++){
            sum += i;
        }
        return sum;
    }
    public boolean KiemTraSnt(int number){
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number%i==0) return false;
        }
        return number > 1;
    }
    public void DayNguyenTo(){
        System.out.println("Day so nguyen to nho hon number: ");
        for(int i = 2; i <= this.number; i++){
            if(KiemTraSnt(i)){
                System.out.print(i + " ");
            }
        }
    }
}
