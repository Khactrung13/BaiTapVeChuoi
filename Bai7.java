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
public class Bai7 {
    public static void main(String[] args) {
        //dao nguoc chuoi
        Scanner scanner = new Scanner(System.in);
		
	System.out.println("Nhập vào chuỗi bất kỳ: ");
	String str = scanner.nextLine();
        System.out.println("Chuỗi ban đầu là:" + str);
        str = new StringBuffer(str).reverse().toString();
        System.out.println("Chuỗi sau khi đảo ngược là: " + str);
        
    }
}
