/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author GUN GUN ISKANDAR
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DataPegawai dp = new DataPegawai();
        dp.NIP = 197504262;
        dp.Nama = "Asep Tungtung";
        dp.Golongan = "III/A";
        dp.Pangkat = "Penata Muda";
        
        System.out.println("Ini adalah data pegawai");
        System.out.println("Nama : " + dp.Nama);
        System.out.println("NIP : " + dp.NIP);
        System.out.println("Gol. : " + dp.Golongan);
        System.out.println("Pangkat : " + dp.Pangkat);
                
                
        
    }
    
}
