package PTBS;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Trading {

    LocalDate dueDate;

    Trading(LocalDate due){
        dueDate = due;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    void accept(NodeVisitor visitor) {
        // Visitor pattern is implemented here
        System.out.println("Accept visitor in Trading class");
        visitor.visitTrading(this);
    }
}
