// import java.awt.List;
import java.util.Scanner;       //import library scanner 
import java.util.ArrayList;     //import library arraylist
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //set scanner
        ArrayList<Shirt> list = new ArrayList<>();  //set list
        int a = 0;
        a = sc.nextInt();   //minta masukan user jumlah data yang ingin di input
        for (int i = 0; i < a; i++) {   //perulangan sebanyak masukan user, menginput unruk semua atribut
            Shirt x = new Shirt();
            System.out.println("Masukkan idProduct : ");
            int idProduct = sc.nextInt();
            System.out.println("Masukkan name : ");
            String name = sc.next();
            System.out.println("Masukkan brand : ");
            String brand =  sc.next();
            System.out.println("Masukkan price : ");
            String price = sc.next();
            System.out.println("Masukkan size : ");
            String size = sc.next();
            System.out.println("Masukkan material : ");
            String material = sc.next();
            System.out.println("Masukkan gender : ");
            char gender = sc.next().charAt(0);
            System.out.println("Masukkan color : ");
            String color = sc.next();
            System.out.println("Masukkan sleeve type : ");
            String sleeve_type = sc.next();

            x.setIdProduct(idProduct); x.setName(name); x.setBrand(brand); x.setPrice(price); x.setSize(size); x.setMaterial(material); x.setGender(gender); x.setColor(color); x.setSleeve_type(sleeve_type);
            list.add(x);    //memasukkan data ke dalam list

            
        }
        
        //perulangan untuk menampilkan isi list
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("| %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s |%n",
                    list.get(i).getIdProduct(), list.get(i).getName(), list.get(i).getBrand(), list.get(i).getPrice(), list.get(i).getSize(), list.get(i).getMaterial(), list.get(i).getGender(), list.get(i).getColor(), list.get(i).getSleeve_type());
        }
    }
}
