package PTBS;

import java.time.LocalDate;

public class ReminderVisitor extends NodeVisitor {

    private Reminder m_Reminder;

    ReminderVisitor() {
        // Visitor pattern is implemented here
        System.out.println("ReminderVisitor class");
    }

    @Override
    void visitProduct(Product product) {
        System.out.println("Visit product:" + product.productName);
        product.addTrading(new Trading(LocalDate.of(2022, 10,31)));
        for (Trading trading : product.tradings) {
//             visit each trading in a product
            visitTrading(trading);
        }
    }

    @Override
    void visitTrading(Trading trading) {
        System.out.println("Visit trading:");
        if ((LocalDate.now().compareTo(trading.getDueDate()) <= 2) && (LocalDate.now().compareTo(trading.getDueDate()) > 0)) {
            System.out.println("Send reminder if due date is less than 2 days");
        }
    }

    @Override
    void visitFacade(Facade facade) {
        System.out.println("Visit facade:");
        for (Product product : facade.theProductList.getProductList()) {
//             visit each product
            visitProduct(product);
        }

    }
}
