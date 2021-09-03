/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_kiem_tra_1;

import java.util.Scanner;

/**
 *
 * @author hoang
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SoNguyen songuyen = new SoNguyen();
        MaTran matran = new MaTran();
        Xau xau = new Xau();
        while(true){
            System.out.println("------------------------------------------------------------------------");
            System.out.println("1. Nhap vao so nguyen duong n");
            System.out.println("2. Viet ra tong s = 1+2+3+..+n");
            System.out.println("3. Dua ra day so nguyen to nho hon va bang n");
            System.out.println("4. Nhap vao 1 xau");                       
            System.out.println("5. Dua ra do dai cua xau");
            System.out.println("6. dua ra so cau cua xau");
            System.out.println("7. Nhap vao 1 ma tran vuong A");
            System.out.println("8. Dua ra tong cac hang cua ma tran");
            System.out.println("9. Tinh Dinh Thuc cua ma tran A");
            System.out.println("10. Exit");
            System.out.println("------------------------------------------------------------------------");
             System.out.print("Moi ban nhap vao lua chon: ");
            int t = sc.nextInt();
            sc.nextLine();
            if(t == 1){
                System.out.print("Moi ban nhap vao lua chon Number: ");
                int number = sc.nextInt();
                songuyen.setNumber(number);
            }
            else if(t == 2){
                System.out.println("Tong cua day so nho hon n la: " + songuyen.TongSoNguyen());
            }
            else if(t == 3){
                songuyen.DayNguyenTo();
            }
            else if(t == 4){
                System.out.print("Nhap vao 1 xau: ");
                String s = sc.nextLine();
                xau.setS(s);
            }
            else if(t == 5){
                System.out.println("Do dai cua xau la: " + xau.Len());
            }
            else if(t == 6){
                System.out.println("So cau co trong xau la: " + xau.SoCau());
            }
            else if(t== 7){
                System.out.print("Nhap vao kich thuoc ma tran: ");
                int n = sc.nextInt();
                matran.setN(n);
                System.out.println("Nhap vao ma tran: ");
                int[][] arr = new int[n][n];
                for(int i = 0; i < n; i++){
                    for(int j = 0; j < n; j++){
                        arr[i][j] = sc.nextInt();
                    }
                }
                matran.setArr(arr);
            }
            else if(t == 8){
                matran.TongHangMaTran();
            }
            else if(t == 9){
                matran.KqDinhThuc();
            }
        }
    }
}
