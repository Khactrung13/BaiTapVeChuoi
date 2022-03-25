/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapVeChuoi;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai5 {
    public static void main(String[] args) {
        //Thong ke so lan xuat hien cua tung ky tu trong chuoi
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi : ");
        String str = sc.nextLine(); 
        int counter[] = new int[256];
        
        for (int i = 0; i < str.length(); i++){
              counter[str.charAt(i)]++;
        }
        
        char arr[] = new char[str.length()];
        
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
            int dem = 0;
            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == arr[j])
                    dem++;
            }
            if (dem == 1)
                System.out.println("Số lần xuất hiện của " + str.charAt(i)
                        + " trong chuỗi:" + counter[str.charAt(i)]);
        }
    }
}
