package io.eventdriven.ecommerce.cleanarchitecture.entities.products;

class ConcreteProductFactory implements ProductFactory{
  @Override
  public Product create(ProductId productId, SKU sku, String name, String password) {
    return new ConcreteProduct(productId, sku, name, password);
  }
}
