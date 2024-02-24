<?php
class Shirt extends Clothing {
    private $color; //deklarasi objek - objek class shirt
    private $sleeve_type;

    public function __construct($idProduct, $name, $brand, $price, $size, $material, $gender, $color, $sleeve_type)
    {
        parent::__construct($idProduct, $name, $brand, $price, $size, $material, $gender);  //mewariskan objek - objek dari orang tuanya (class product dan clothing)
        $this->color = $color;
        $this->sleeve_type = $sleeve_type;
    }

    //getter dan setter
    public function get_color(){
        return $this->color;
    }

    public function set_color($color){
        $this->color = $color;
    }

    public function get_sleeve_type(){
        return $this->sleeve_type;
    }

    public function set_sleeve_type($sleeve_type){
        $this->sleeve_type = $sleeve_type;
    }
}

?>