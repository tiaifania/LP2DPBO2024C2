#include <iostream> //pemanggilan library yang ingin dipakai
#include <string>
#include <bits/stdc++.h>
#include <algorithm>
#include "Shirt.cpp"
//using standard namespace
using namespace std;

int main (){
    int n = 0, i;   //deklarasi object penampung jumlh
    string name;    //deklarasi object temp untuk nampung masukan
    string idProduct;
    string brand;
    string price;
    string size;
    string material;
    char gender;
    string color;
    string sleeve_type;
    cin >> n;   //minta masukan user mau berapa data
    list<Shirt> list;   //pembuatan list untuk menampung masukan
    
    for ( i = 0; i < n; i++)    //perulangan untuk menampung masukan dari user
    {
        Shirt temp;
        cin >> idProduct >> name >> brand >> price >> size >> material >> gender >> color >> sleeve_type;
        temp.set_idProduct(idProduct);
        temp.set_name(name);
        temp.set_brand(brand);
        temp.set_price(price);
        temp.set_size(size);
        temp.set_material(material);
        temp.set_gender(gender);
        temp.set_color(color);
        temp.set_sleeve_type(sleeve_type);

        list.push_back(temp);   //memasukkan data yang barusan didapatkan ke dalam list
    }

    i = 0;
    for (auto it = list.begin(); it != list.end(); it++)       //perulangan untuk ngeprint isi list
    {
        cout << (i + 1) << ". " << it->get_idProduct() << " | " << it->get_name() << " | " << it->get_brand() << " | " << 
        it->get_price() << " | " << it->get_size() << " | " << it->get_material() << " | " << it->get_gender() << " | " 
        << it->get_color() << " | " << it->get_sleeve_type() <<  '\n';
        i++;
    }
    
}