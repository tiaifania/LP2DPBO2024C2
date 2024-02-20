class Product {     //class orangtua, yang akan mewarisi atributnya ke anak - cucu
    int idProduct;  //deklarasi atribut
    String name;
    String brand;
    String price;

    Product (){ //konstructor kosong
    }

    Product (int idProduct, String name, String brand, String price){   //konstruktor yang ada parameter
        this.idProduct = idProduct;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    //get/set atribut2
    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}
