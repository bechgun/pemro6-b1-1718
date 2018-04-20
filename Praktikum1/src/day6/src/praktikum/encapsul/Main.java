/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.encapsul;

/**
 *
 * @author Gun Gun
 */
public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        // panggil enkapsulasi
        mhs1.setNama("Mahasiswa A");
        System.out.println("Nama : " + mhs1.getNama());
    }
}
