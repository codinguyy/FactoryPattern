package app.codinguyy.factorypattern.factorypattern

abstract class Creator : Product {
    abstract fun someOperation()
    abstract fun createProduct(): Product
}
