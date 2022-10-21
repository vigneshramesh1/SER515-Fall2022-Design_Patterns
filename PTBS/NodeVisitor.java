package PTBS;

abstract public class NodeVisitor {

    abstract void visitProduct(Product product);

    abstract void visitTrading(Trading trading);

    abstract void visitFacade(Facade facade);

}
