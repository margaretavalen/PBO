/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjpenjualan;

import java.sql.*;

/**
 *
 * @author D2A
 */
public class Main {
    public static void main(String[] args) {
        KoneksiMysql kon = new KoneksiMysql("Penjualan");
        Connection c = kon.getConnection();
        System.out.println("c : " + c);
    }
}
