import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ROG
 */
    public class data {   
 public String NamaDepan, NamaBelakang, Id, Email,Password; 
 public int pilihan;
 public String Email2, Password2,ulang;
    public String getNamaDepan() { 
        return NamaDepan;
    }
    public void setNamaDepan(String NamaDepan) {
        this.NamaDepan = NamaDepan;
    }
    public String getNamaBelakang() {
        return NamaBelakang;
    }
    public void setNamaBelakang(String NamaBelakang) {
        this.NamaBelakang = NamaBelakang;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String Email) {
        this.Email = Email;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String Password) {
        this.Password = Password;
    }
    public String getId() {
        return Id;
    }
    public void setId(String Id) {
        this.Id = Id;
    }
    public int getPilihan() {
        return pilihan;
    }
    public void setPilihan(int pilihan) {
        this.pilihan = pilihan;
    }
    public String getEmail2() {
        return Email2;
    }
    public void setEmail2(String Email2) {
        this.Email2 = Email2;
    }
    public String getPassword2() {
        return Password2;
    }
    public void setPassword2(String Password2) {
        this.Password2 = Password2;
    }
    public String getUlang() {
        return ulang;
    }
    public void setUlang(String ulang) {
        this.ulang = ulang;
    }
        public static void main(String[] args) {
            
        
        data in = new data();
        Scanner input = new Scanner(System.in);
       
            System.out.println("Selamat Datang di Halaman Register LINE");
            System.out.println("======================================="); 
            System.out.print("Masukan Nama Depan    : ");
            in.setNamaDepan(input.next());
            System.out.print("Masukan Nama Belakang : ");
            in.setNamaBelakang(input.next());
            System.out.print("Masukan Email         : ");
            in.setEmail(input.next());
            System.out.print("Masukan ID Line       : ");
            in.setId(input.next());
            System.out.print("Masukan Password      : ");
            in.setPassword(input.next());
            in.setUlang("Y");
        while (in.getUlang().equals("Y")) {  
            System.out.println("======================================="); 
            System.out.println("Harap Login Terlebih Dahulu");
            System.out.print("Masukan Email         : ");
            in.setEmail2(input.next());
            System.out.print("Masukan Password      : ");
            in.setPassword2(input.next());
            System.out.println("======================================="); 
            
            if  (in.getEmail2().equalsIgnoreCase(in.getEmail()) && in.getPassword2().equals(in.getPassword())){
                System.out.println("LOGIN BERHASIL");
                System.out.println("Selamat Datang di LINE");
                in.setUlang("N");
            }
            else {
                System.out.println("LOGIN GAGAL");
                System.out.println("Email/Password Salah");
                in.setUlang("Y");    
            }
        }       
    }      
    
    
} 



