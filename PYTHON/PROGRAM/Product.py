class Product:  #PENGISIAN KELAS PRODUCT
    #KONSTRUKTOR
    def __init__(self, idProduct, name, brand, price):
        self.idProduct = idProduct
        self.name = name
        self.brand = brand
        self.price = price
        
    #GETTER DAN SETTER
    def set_idProduct(self, idProduct):
        self.idProduct = idProduct
    
    def get_idProduct(self):
        return self.idProduct
    
    def set_name(self, name):
        self.name = name
    
    def get_name(self):
        return self.name
    
    def set_brand(self, brand):
        self.brand = brand
    
    def get_brand(self):
        return self.brand
    
    def set_price(self, price):
        self.price = price
    
    def get_price(self):
        return self.price
        