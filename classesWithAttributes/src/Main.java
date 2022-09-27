public class Main {
    public static void main(String[] args) {
        Product product =new Product();
        product.setId(2);
        product.setName("Acer Laptop");
        product.setPrice(15000);
        product.setStockAmount(1000);
        product.setColour("Black");

        System.out.println("Product Name :"+ product.getName());
        System.out.println("Product id :" + product.getId());
        System.out.println("Product price :" + product.getPrice());
        System.out.println("Product StockAmount :" + product.getStockAmount());
        System.out.println("Product Colour :" + product.getColour());

        ProductManager productManager=new ProductManager();
        productManager.Add(product);

    }



}
