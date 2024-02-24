<?php
include('Product.php');     //mengakses file - file class yang ingin dipakai
include('Clothing.php');
include('Shirt.php');

//deklarasi secara statis, semua inputan akan ditampung di dalam array "baju"
$baju = array(
    new Shirt("1", "A", "Polo", "12000", "XS", "cotton", "P", "red", "short"),
    new Shirt("2", "B", "H&M", "55000", "M", "polyester", "L", "green", "long"),
    new Shirt("3", "C", "Zara", "99000", "L", "wool", "P", "black", "medium")

);

//perulangan untuk menampilkan isi dari array
foreach ($baju as $index => $shirt) {
    echo "baju " . ($index + 1) . ":" . "<br>";
    echo "Product ID: " . $shirt->get_idProduct() . "<br>";
    echo "Name: " . $shirt->get_name() . "<br>";
    echo "Brand: " . $shirt->get_brand() . "<br>";
    echo "Price: " . $shirt->get_price() . "<br>";
    echo "Size: " . $shirt->get_size() . "<br>";
    echo "Material: " . $shirt->get_material() . "<br>";
    echo "Gender: " . $shirt->get_gender() . "<br>";
    echo "Color: " . $shirt->get_color() . "<br>";
    echo "Sleeve Type: " . $shirt->get_sleeve_type() . "<br>";
    echo "<br>";
}

?>