class Shirt extends Clothing{   //class cucu yang mendapatkan turunan dari product dan clothing
    String color;   //atribut di class shirt
    String Sleeve_type;

    Shirt(){    //kontruktor kosong
    }

    Shirt(String color, String sleeve_type){    //konstruktor berparameter
        this.color = color;
        this.Sleeve_type = sleeve_type;
    }

    //get dan set atribut
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSleeve_type() {
        return Sleeve_type;
    }

    public void setSleeve_type(String sleeve_type) {
        Sleeve_type = sleeve_type;
    }
}
