/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combarin.sisfosiswa;
import java.util.Scanner;
import java.io.IOException;
/**
 *
 * @author ASUS
 */
public class SisfoSiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        Scanner terminalInput = new Scanner(System.in);
        String inputUser;
        boolean lanjutkan = true;
        //membuat menu 
        while(lanjutkan){ 
        System.out.println("Sistem Informasi Siswa\n");
        System.out.println("1.  List Siswa");
        System.out.println("2.  Cari Siswa");
        System.out.println("3.  Tambah Siswa");
        System.out.println("4.  Ubah Siswa");
        System.out.println("5.  Hapus Siswa");
        
        System.out.println("\n");
        
        System.out.print("Masukan Pilihan Anda : ");
        inputUser = terminalInput.next();
        
        //menampilkan pilihan menu yang diambil user
        switch(inputUser){
            case "1":
                System.out.println("\n===============");
                System.out.println("List Nama Siswa");
                System.out.println("===============");
            break;
            case "2":
                System.out.println("\n===============");
                System.out.println("Cari Nama Siswa");
                System.out.println("===============");
            break;
            case "3":
                System.out.println("\n=================");
                System.out.println("Tambah Nama Siswa");
                System.out.println("=================");
            break;
            case "4":
                System.out.println("\n===============");
                System.out.println("Ubah Nama Siswa");
                System.out.println("===============");
            break;
            case "5":
                System.out.println("\n================");
                System.out.println("Hapus Nama Siswa");
                System.out.println("================");
            break;
        default:
             System.err.print("\nPilihan yang anda masukan salah, Pilih 1 sampai 5\n");
        }
        
        lanjutkan = getYesOrNo("\nApakah anda ingin melanjutkann ? ");
        
           // lanjutkan = getYesOrNo("Apakah anda ingin lanjut bro?"); 
           //System.out.println("\nApakah anda ingin lanjut (y/n)?");
            //inputUser = terminalInput.next();
            //lanjutkan = inputUser.equalsIgnoreCase("y");
            /*
            System.out.println("\nApakah anda ingin lanjut (y/n)?");
            inputUser = terminalInput.next();
            if(inputUser.equals("y")){
            lanjutkan = true;
            }else if(inputUser.equals("n")){
            lanjutkan = false;
            break;
            }else{
            System.out.println("Pilihan tidak sesuai");
            System.out.println("\nApakah anda ingin lanjut (y/n)?");
            inputUser = terminalInput.next();
            }
             */
        
    }
         
    }
    //membuat method message
    private static boolean getYesOrNo (String pesan){
        Scanner terminalInput = new Scanner(System.in);
        System.out.println("\n"+pesan+"(y/n)");
        String userInput = terminalInput.next();
        
        while(!userInput.equalsIgnoreCase("y") && !userInput.equalsIgnoreCase("n")){
            System.out.println("Pilihan anda salah, Silahkan pilih y atau n");
            System.out.println("\n"+pesan+"(y/n)");
            userInput = terminalInput.next();
        }
        //perintah dibandingkan dengan looping lanjutkan
        return userInput.equalsIgnoreCase("y");
    }
    
    
    
}
