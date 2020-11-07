/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119058.latihan33.userlogin;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Caraka Muhamad Rahman
 * KELAS    : PBOIF2
 * NIM      : 10119058
 * Deskripsi Program : Program ini berisi program untuk mengecek status login.
 */
public class PBOIF210119058Latihan33UserLogin {

    /**
     * @param args the command line arguments
     */
    private static String usName;
    private static String passWord;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Username = ");
        usName = scanner.next();
        System.out.print("Masukkan Password = ");
        passWord = scanner.next();
        
        User user = new User();
        user.pengecekkanLogin(usName, passWord);
    }
    
}
