package ro.fasttrackit.Lab7Tema;

public class Product {
    public String name;
    public int price;
    public int quantity;
    public String category;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public String getCategory() {
        return category;
    }

    public boolean hasStock(int quantity) {
        if(quantity!=0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setName("Banane");
        product1.setPrice(5);
        product1.setQuantity(44);
        product1.setCategory("Fructe");
        System.out.println("Produsul1 este: " + product1.getName() + ", avand pretul de: " + product1.getPrice() + " lei" + ", in cantitate de: " + product1.getQuantity() + " kg" + ", din categoria: " + product1.getCategory() + ".");
        System.out.println("Pentru cantitate = " + product1.hasStock(product1.getQuantity()));

        Product product2 = new Product();
        product2.setName("Laptop");
        product2.setPrice(5000);
        product2.setQuantity(0);
        product2.setCategory("Electronice");
        System.out.println("Produsul2 este: " + product2.getName() + ", avand pretul de: " + product2.getPrice() + " lei" + ", in cantitate de: " + product2.getQuantity() + " bucati" + ", din categoria: " + product2.getCategory() + ".");
        System.out.println("Pentru cantitate = " + product2.hasStock(product2.getQuantity()));

        Product product3 = new Product();
        product3.setName("Audi A6");
        product3.setPrice(1000000);
        product3.setQuantity(2);
        product3.setCategory("VAG");
        System.out.println("Produsul3 este: " + product3.getName() + ", avand pretul de: " + product3.getPrice() + " lei" + ", in cantitate de: " + product3.getQuantity() + " bucati" + ", din categoria: " + product3.getCategory() + ".");
        System.out.println("Pentru cantitate = " + product3.hasStock(product3.getQuantity()));
    }
}
