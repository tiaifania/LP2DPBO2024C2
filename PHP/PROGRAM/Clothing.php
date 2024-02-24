<?php
class Clothing extends Product{
    private $size;      //deklarasi objek - objek class clothing
    private $material;
    private $gender;

    //konstruktor
    public function __construct($idProduct, $name, $brand, $price, $size, $material, $gender)
    {
        parent::__construct($idProduct, $name, $brand, $price); //mewariskan objek - objek dari orang tuanya (class product)
        $this->size = $size;
        $this->material = $material;
        $this->gender = $gender;
    }

    //getter dan setter
    public function get_size(){
        return $this->size;
    }

    public function set_size($size){
        $this->size = $size;
    }

    public function get_material(){
        return $this->material;
    }

    public function set_material($material){
        $this->material = $material;
    }

    public function get_gender(){
        return $this->gender;
    }

    public function set_gender($gender){
        $this->gender = $gender;
    }
}

?>