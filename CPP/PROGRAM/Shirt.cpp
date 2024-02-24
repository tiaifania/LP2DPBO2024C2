#include <iostream>
#include <string>
#include "Clothing.cpp" //menginclude nama file orangtua untuk mewariskan object dari class orang tua
//using standard namespace
using namespace std;

//class shirt yang mewarisi dari kelas clothing
class Shirt : public Clothing{
    private:
        string color;
        string sleeve_type;

    public:
        Shirt(){
        }
        
        //getter dan setter
        void set_color(string color){
            this->color = color;
        }

        string get_color(){
            return this->color;
        }

        void set_sleeve_type(string sleeve_type){
            this->sleeve_type = sleeve_type;
        }

        string get_sleeve_type(){
            return this->sleeve_type;
        }

        ~Shirt(){
        }
};