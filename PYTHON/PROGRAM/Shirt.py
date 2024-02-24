from Clothing import Clothing #MENGAMBIL KELAS ORANG TUA AGAR BISA DIWARISKAN

class Shirt(Clothing):  #PENGISIAN KELAS SHIRT YANG DIWARISI OLEH CLOTHING
    #KONSTRUKTOR
    def __init__(self, idProduct, name, brand, price, size, material, gender, color, sleeve_type): 
        super().__init__(idProduct, name, brand, price, size, material, gender) # OBJEK WARISAN DARI CLASS ORTU
        self.color = color
        self.sleeve_type = sleeve_type
    
    #GETTER DAN SETTER
    def get_color(self):
        return self.color

    def set_color(self, color):
        self.color = color
        
    def get_sleeve_type(self):
        return self.sleeve_type

    def set_sleeve_type(self, sleeve_type):
        self.sleeve_type = sleeve_type