public class ProductManager {
    public void add(Product product){
        ProductValidator productValidator = new ProductValidator();
        if (productValidator.isValid(product))
            System.out.println("eklendi");
        else
            System.out.println("Ürün bilgileri geçersizdir");
    }
}
