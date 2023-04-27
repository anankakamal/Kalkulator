import java.util.Random;
import java.util.Scanner;

 class Main {
     
    public static String getRandom(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

    public static void main(String[] args) {
       
       Scanner inputJwb = new Scanner(System.in);
       
       //random untuk memilih soal total atau kembalian
        double randomNumber = 1+(Math.random()*1);
        int x = (int)randomNumber;
        
        //data barang dengan randomizernya
        String[] namaBarang = {"Kaos", "Cola", "Batang Keju", "Onigiri", "Chitato", "Red Bull", "Sabun Dettol", "Kusuka"};
        int[] hargaBarang = {30000, 5000, 15000, 10000, 12000, 22000, 8000, 16000};
        
        double randTotala1 = 1+(Math.random()*10);
        int randTotalb1= (int)randTotala1;  // random total barang pertama dari 1 sampai 10
        double randTotala2 = 1+(Math.random()*10);
        int randTotalb2= (int)randTotala2;  // random total barang kedua dari 1 sampai 10
        double randTotala3 = 1+(Math.random()*10);
        int randTotalb3= (int)randTotala3;  // random total barang ketiga dari 1 sampai 10
        
        double randBarangA1 = (Math.random()*8); // random milih barang pertama
        int randBarangB1= (int)randBarangA1;
        double randBarangA2 = (Math.random()*8); // random milih barang kedua
        int randBarangB2= (int)randBarangA2;
        double randBarangA3 = (Math.random()*8); // random milih barang ketiga
        int randBarangB3= (int)randBarangA3;
        
        
        
        // switch untuk diantara soal total dan kembalian
        switch(x){
            case 1: System.out.println("Total");
                        double randTotal = 1+(Math.random()*1);
                        int y = (int)randTotal;
                        
                        // 3 tipe soal dengan 3 barang total
                        switch(y){
                            case 1: System.out.println("1 Barang");
                            
                            System.out.println("Pelanggan membeli "+getRandom(namaBarang)+" "+hargaBarang[randBarangB1]+" sebanyak "+randTotalb1+" berapa total belanja pembeli?");
                            int pertTotal1 = hargaBarang[randBarangB1]*randTotalb1;
                            int Jwb1 = inputJwb.nextInt();
                            
                            if (pertTotal1 == Jwb1 ){
                                    System.out.println("Benar");
                                }else{
                                    System.out.println("Salah");
                                    System.out.println("Jawaban yang benar adalah "+pertTotal1);
                                }
                                
                        break;
                            case 2: System.out.println("2 Barang");
                            
                            System.out.println("Pelanggan membeli "+namaBarang[randBarangB1]+" sebanyak "+randTotalb1+" Dengan "+namaBarang[randBarangB2]+" sebanyak "+randTotalb2);
                            int pertTotal2 = hargaBarang[randBarangB1]*randTotalb1+hargaBarang[randBarangB2]*randTotalb2;
                            
                            int Jwb2 = inputJwb.nextInt();
                            
                            if (pertTotal2 == Jwb2 ){
                                    System.out.println("Benar");
                                }else{
                                    System.out.println("Salah");
                                    System.out.println("Jawaban yang benar adalah "+pertTotal2);
                                }
                        break;    
                            case 3: System.out.println("3 Barang");
                            
                            System.out.println("Pelanggan membeli "+namaBarang[randBarangB1]+" sebanyak "+randTotalb1+" dengan harga "+hargaBarang[randBarangB1]+" dengan barang "+namaBarang[randBarangB2]+" sebanyak "+randTotalb2+" dengan harga "+hargaBarang[randBarangB2]+ " dan dengan barang "+namaBarang[randBarangB3]+" sebanyak "+randTotalb3+" dengan harga "+hargaBarang[randBarangB3]);
                            int pertTotal3 = hargaBarang[randBarangB1]*randTotalb1+hargaBarang[randBarangB2]*randTotalb2+hargaBarang[randBarangB3]*randTotalb3;
                            
                            int Jwb3 = inputJwb.nextInt();
                            
                            if (pertTotal3 == Jwb3 ){
                                    System.out.println("Benar");
                                }else{
                                    System.out.println("Salah");
                                    System.out.println("Jawaban yang benar adalah "+pertTotal3);
                                }
                        break; 
                            
                        }
                    break;
            case 2: System.out.println("Kembalian");
                        double randKembalian = 1+(Math.random()*3);
                        int z = (int)randKembalian;
                        
                        // 3 tipe soal dengan 3 barang kembalian
                    switch(z){
                            case 1: System.out.println("1 Barang");
                            System.out.println("Pelanggan membeli "+namaBarang[3]+" "+hargaBarang[3]);
                        break;
                            case 2: System.out.println("2 Barang");
                            System.out.println("Pelanggan membeli "+namaBarang[4]+" "+hargaBarang[4]);
                        break;    
                            case 3: System.out.println("3 Barang");
                            System.out.println("Pelanggan membeli "+namaBarang[5]+" "+hargaBarang[5]);
                        break; 
                        }
        break;}
    }
}