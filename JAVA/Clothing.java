class Clothing extends Product {    //class clothing yang medapatkan atribut turunan dari class product
    String size;    //atribut dari kelas clothing
    String material;
    char gender;

    Clothing(){ //konstruktor kosong
    }

    Clothing (String size, String material, char gender){   //konstruktor dengan parameter
        this.size = size;
        this.material = material;
        this.gender = gender;
    }

    //get dan set
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
