package Circular;

public class Driver {

    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println("Double Linked List");
        System.out.println("======================================");
        Chain x = new Chain();

        System.out.println("Apakah data awal kosong? "+ x.isEmpty());
        System.out.println("======================================");
        System.out.println("Data di isi");
        x.add(0, "Satu");
        x.add(1, "One");
        x.add(2, "Tiga");
        x.add(3, "Macan");
        x.add(4, 5);
        x.add(5, "Main");
        System.out.println(x.toString());
        System.out.println("Size = "+x.size);
        System.out.println("======================================");
        System.out.println("Tambah Data");
        System.out.println("index 2 = baru dan index 5 = 'Masa'");
        x.add(2, "baru");
        x.add(5, "Masa");
        System.out.println(x.toString());
        System.out.println("Size = "+x.size);
        System.out.println("======================================");
        System.out.println("Remove Data");
        System.out.println("Remove index terakhir");
        x.remove(x.size-1);
        System.out.println(x.toString());
        System.out.println("Size = "+x.size);
        System.out.println("======================================");
        System.out.println("Get Objek(index ke 5)");
        System.out.println("element index ke 5 = "+x.get(5));
        System.out.println("======================================");
        System.out.println("Index Of(objek baru)");
        System.out.println("'baru' berada pada index ke - "+x.indexOf("baru"));
        System.out.println("======================================");
 
    }
}
