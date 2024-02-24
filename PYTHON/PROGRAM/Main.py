from Product import Product
from Clothing import Clothing   #PEMANGGILAN FILE CLASS YANG INGIN DIPAKAI
from Shirt import Shirt 

shirt_list = [] #PEMBUATAN ARRAY

n = int(input())    #MEMINTA MASUKAN USER UNTUK BERAPA BANYAK MASUKAN YANG DIINGINKAN
for i in range (n): #PERULANGAN UNTUK MENERIMA INPUTAN DARI USER
    idProduct = str(input())
    name = str(input())
    brand = str(input())
    price = str(input())
    size = str(input())
    material = str(input())
    gender = input()[0]
    color = str(input())
    sleeve_type = str(input())
    
    shirt = Shirt(idProduct, name, brand, price, size, material, gender, color, sleeve_type)    #DITAMPUNG DULU
    shirt_list.append(shirt)    #KEMUDIAN DIMASUKKAN KE DALAM ARRAY
    
for anggota in shirt_list:  #PERULANGAN UNTUK MENAMPILKAN ISI DARI ARRAY
    print(anggota.get_idProduct(), "|", anggota.get_name(), "|", anggota.get_brand(), "|", 
            anggota.get_price(), "|", anggota.get_size(), "|", anggota.get_material(), "|",
            anggota.get_gender(), "|", anggota.get_color(), "|", anggota.get_sleeve_type())
