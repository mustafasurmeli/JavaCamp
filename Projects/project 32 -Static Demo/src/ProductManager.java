public class ProductManager {
    public void add(Product product){

        if (ProductValidate.isValid(product)){
            System.out.println("Added.");
        }else {
            System.out.println("Product information is invalid.");
        }

//        ProductValidate productValidate = new ProductValidate();
//        productValidate.something();

    }
}
