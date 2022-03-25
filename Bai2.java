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
public class Bai2 {
    public static void main(String[] args) {
        //Chuyen chu in hoa
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi cần kiểm tra: ");
        String str = sc.nextLine(); 
        char[] charArray = str.toCharArray();
        boolean kiemtra = true;
   
        for(int i = 0; i < charArray.length; i++) {
            if(Character.isLetter(charArray[i])) {
                if(kiemtra) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    kiemtra = false;
                }
            }
            else {
                kiemtra= true;
            }
        }
        str = String.valueOf(charArray);
        System.out.println("Chuỗi sau khi đổi:" + str);
    }    
}
