#include <iostream>
#include <string>
#include "Product.cpp"  //menginclude nama file orangtua untuk mewariskan object dari class orang tua

//using standard namespace
using namespace std;

//class clothing yang mewarisi dari kelas product
class Clothing : public Product{
    private:
        string size;
        string material;
        char gender;

    public:
        Clothing(){
        }

        //getter dan setter
        void set_size(string size){
            this->size = size;
        }

        string get_size(){
            return this->size;
        }

        void set_material(string material){
            this->material = material;
        }

        string get_material(){
            return this->material;
        }

        void set_gender(char gender){
            this->gender = gender;
        }

        char get_gender(){
            return this->gender;
        }

        ~Clothing(){
        }
};