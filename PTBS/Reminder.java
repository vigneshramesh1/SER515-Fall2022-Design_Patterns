package PTBS;

public class Reminder {
    ReminderVisitor reminderVisitor;

    Reminder(ClassProductList productList){
        reminderVisitor = new ReminderVisitor();
        productList.accept(this.reminderVisitor);
    }

    Reminder(Trading trading){
        trading.accept(this.reminderVisitor);
    }

}
