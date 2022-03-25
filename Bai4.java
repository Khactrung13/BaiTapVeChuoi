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
public class Bai4 {
    public static void main(String[] args) {
        //Tach chuoi
        String chuoi;
        String[] tu ;
        Scanner scanner = new Scanner(System.in);         
        System.out.println("Nhập vào chuỗi bất kỳ: ");
        chuoi = scanner.nextLine();
        tu = chuoi.split(" ");
        for (int i = 0; i < tu.length; i++) {
            System.out.println(tu[i]);
        }
    }
}
