<?php
class Product{
    private $idProduct; //deklarasi objek - objek class product
    private $name;
    private $brand;
    private $price;

    //konstruktor ber parameter
    public function __construct($idProduct, $name, $brand, $price)
    {
        $this->idProduct = $idProduct;
        $this->name = $name;
        $this->brand = $brand;
        $this->price = $price;
    }

    //getter dan setter
    public function get_idProduct(){
        return $this->idProduct;
    }

    public function set_idProduct($idProduct){
        $this->idProduct = $idProduct;
    }

    public function get_name(){
        return $this->name;
    }

    public function set_name($name){
        $this->name = $name;
    }

    public function get_brand(){
        return $this->brand;
    }

    public function set_brand($brand){
        $this->brand = $brand;
    }

    public function get_price(){
        return $this->price;
    }

    public function set_price($price){
        $this->price = $price;
    }
}

?>