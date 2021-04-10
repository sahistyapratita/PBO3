package barang;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Benda {
    Scanner run = new Scanner(System.in);
    int semua;

    int[] kodebarang = new int[50];
    int[] harga = new int[50];
    int[] stok = new int[50];
    int[] nilai = new int[50];
    String[] nama = new String[50];

    public Benda(){

    }
    public void masukkanData(){
        try{
            for(int i=0;i < semua;i++){
                System.out.println("Produk Barang      :"+(i+1));
                System.out.println("Nama Barang        : \t\t\t Tekan 0 Jika Batal");
                run.nextLine();
                kodebarang[i]=(i+1);
                nama[i] = run.nextLine();

                if (nama[i].equals("0")){
                    break;
                }
                System.out.println("Harga Barang       : ");
                harga[i]= run.nextInt();
                System.out.println("Stok Barang        : ");
                stok[i]= run.nextInt();
                nilai[i]=stok[i]*harga[i];
            }
        }catch (InputMismatchException e){
            System.out.println("Anda Harus Memasukkan Angka ");
            run.nextLine();
            menu();
        }
    }
    public void menu(){
        do{
            System.out.println("Masukkan Banyak Barang   : ");
            semua = run.nextInt();

            if (semua <= 0){
                System.out.println("Yang Anda Masukkan Lebih Dari 0");
            }else {
                masukkanData();
            }
        }while (semua <= 0);
    }
    public void getnilaidata(){
        for (int i =0; i < semua; i++){
            System.out.println("Nomer Barang           : "+kodebarang[i]);
            System.out.println("Nama Barang            : "+ nama[i]);
            System.out.println("Harga Barang           : "+harga[i]);
            System.out.println("Stok Barang            : "+stok[i]);
            System.out.println("Nilai Barang           : "+nilai[i]);
        }
    }

}
