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
public class MaTran {
    private int n;
    private int[][] arr = new int[n][n];

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[][] getArr() {
        return arr;
    }

    public void setArr(int[][] arr) {
        this.arr = arr;
    }
    public void TongHangMaTran(){
        for(int i = 0; i < this.n; i++){
            int sum = 0;
            for(int j = 0; j < this.n; j++){
                sum += this.arr[i][j];
            }
            System.out.println("Tong Hang " + (i+1) + ": " + sum );
        }
    }
    public int TinhDinhThuc(int arr[][],int n){
        int s,sum = 0;
        if(n == 1) {
           return arr[0][0];
        }
        if(n == 2){
           return ((arr[0][0] * arr[1][1]) - (arr[0][1] * arr[1][0]));
        }
        for(int k = 0; k < n; k++){
            int[][] res = new int[100][100];
            for(int i = 0; i < n; i++){
                for(int j = 1; j < n; j++){
                    if(i < k) res[i][j-1] = arr[i][j];
                    if(i > k) res[i-1][j-1] = arr[i][j];
                }
            }
            if(k%2 == 0) s = 1;
            else s = -1;
            sum += arr[k][0]*s*TinhDinhThuc(res, n-1);
        }
        return sum;
    }
    public void KqDinhThuc(){
        int kq = TinhDinhThuc(this.arr, this.n);
        System.out.println("Ket Qua Dinh Thuc: " + kq);
    }
}
