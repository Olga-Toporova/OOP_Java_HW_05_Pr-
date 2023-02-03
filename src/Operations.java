public class Operations implements OperationsInterface {
    int choice;

    public Operations(int ch) {
        this.choice = ch;

        if (ch == 1) {
            sum();
        }
        if (ch == 2) {
            sub();
        }
        if (ch == 3) {
            mult();
        }
        if (ch == 4) {
            div();
        }
        if (ch == 0) {
            Logging.logWrite("Возврат в предыдущее меню");
            Main.menu();
        }
    }

    @Override
    public void sum() {
        double a = TryInput.inputNumber();
        double b = TryInput.inputNumber();
        Output.out(a + b);
        Logging.logWrite("Рациональные числа | Операция: " + a + " + " + b + " = " + (a + b));
    }

    @Override
    public void sub() {
        double a = TryInput.inputNumber();
        double b = TryInput.inputNumber();
        Output.out(a - b);
        Logging.logWrite("Рациональные числа | Операция: " + a + " - " + b + " = " + (a - b));
    }

    @Override
    public void mult() {
        double a = TryInput.inputNumber();
        double b = TryInput.inputNumber();
        Output.out(a * b);
        Logging.logWrite("Рациональные числа | Операция: " + a + " * " + b + " = " + (a * b));
    }

    @Override
    public void div() {
        double a = TryInput.inputNumber();
        double b = TryInput.excep0();
        Output.out(a / b);
        Logging.logWrite("Рациональные числа | Операция: " + a + " / " + b + " = " + (a / b));
    }
}