from Product import Product     #MENGAMBIL KELAS ORANG TUA AGAR BISA DIWARISKAN

class Clothing(Product):    #PENGISIAN KELAS CLOTHING YANG DIWARISI OLEH PRODUCT
    #KONTRUKTOR
    def __init__(self, idProduct, name, brand, price, size, material, gender):
        super().__init__(idProduct, name, brand, price) # OBJEK WARISAN DARI CLASS ORTU
        self.size = size
        self.material = material
        self.gender = gender
    
    #GETTER DAN SETTER
    def get_size(self):
        return self.size
    
    def set_size(self, size):
        self.size = size
        
    def get_material(self):
        return self.material
    
    def set_material(self, material):
        self.material = material
        
    def get_gender(self):
        return self.gender
    
    def set_gender(self, gender):
        self.gender = gender