package ru.netology;

public class ProductRepository {

    private Product[] products = new Product[0];                // Массив товаров

    public void save(Product product) {                         // Сохраняем товары
        Product[] tmp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = product;
        products = tmp;
    }

    public Product[] findAll() {                                 // Получаем сохраненные товары

        return products;
    }

    public void removeById(int id) {         // Удаляем товар по ID
        findById() {
            if () {
                throw new NotFoundException("Element with id: " + id + " not found");
            }

            //       if () {
            //           throw new NotFoundException("Element with id: " + id + " not found");
            //       }

            Product[] tmp = new Product[products.length - 1];
            int copyToIndex = 0;
            for (Product item : products) {
                if (item.getId() != id) {
                    tmp[copyToIndex] = item;
                    copyToIndex++;
                }
            }
            products = tmp;
        }

        public Product findById(          ) {                 /// Как вызвать ID из метода removeById ?
            for (Product item : products) {
                if (item.getId() == id) {
                    return product;
                }
            }
            return null;

        }
    }

}
