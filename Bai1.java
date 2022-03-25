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
public class Bai1 {
    public static void main(String[] args) {
        //xoa khoang trang
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi cần kiểm tra: ");
        String str = sc.nextLine();  
        str = str.replaceAll(" ", "");
        System.out.println("Chuỗi sau khi xóa khoảng trắng: " + str);
 

  }
}
