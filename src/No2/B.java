

import java.util.Scanner;
class DeteksiAngka {
    private int angka ;
    private String bilangan;
    public int getAngka(){
        return angka;
    }
    public String getBilangan(){
        return bilangan;
    }
    DeteksiAngka(int angka){
        this.angka = angka;
    }
    public void setBilangan(){
        int deteksi = getAngka() % 2;
        if(angka%2==0){
            bilangan = "Genap";
        } else {
            bilangan = "Ganjil";
        }
    }
}
public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DeteksiAngka deteksiAngka;
        String hasil ;

        System.out.print("Masukkan angka : ");

        int x = scanner.nextInt();
        deteksiAngka = new DeteksiAngka(x);
        deteksiAngka.setBilangan();

        hasil = deteksiAngka.getBilangan();

        System.out.println(""+ x +" adalah angka " + hasil);

    }
}