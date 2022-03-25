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
public class Bai6 {
    
    public static void main(String[] args) {
        //dem so lan xuat hien cua tu trong chuoi
	String chuoi;
        String[] tu ;
        Scanner scanner = new Scanner(System.in);         
        System.out.println("Nhập vào chuỗi bất kỳ: ");
        chuoi = scanner.nextLine();
        tu = chuoi.split(" ");
        System.out.println("Nhập từ cần tìm");
        String n = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < tu.length; i++) {
            if(tu[i].equals(n)){
                System.out.println("Từ " +"'"+ n+"'" + " xuất hiện ở vị trí " + (i+1));
                count++;
                
            }
        }
        System.out.println("Số lần xuất hiện của từ " +"'"+ n+"'" + " là : "+count);
    }
}