//product -> clothing ->shirt
#include <iostream>
#include <string>   //desklarasi library yang ingin dipakai

//using standard namespace
using namespace std;
 
class Product{
    private:
        //deklarasi object yang ada di dalam class product
        string name;
        string idProduct;
        string brand;
        string price;

    public:
        //konstruktor
        Product(){
        }

        //getter dan setter
        void set_name(string name){
            this->name = name;
        }

        string get_name(){
            return this->name;
        }

        void set_idProduct(string idProduct){
            this->idProduct = idProduct;
        }

        string get_idProduct(){
            return this->idProduct;
        }

        void set_brand(string brand){
            this->brand = brand;
        }

        string get_brand(){
            return this->brand;
        }

        void set_price(string price){
            this->price = price;
        }

        string get_price(){
            return this->price;
        }

        ~Product(){
        }
};
