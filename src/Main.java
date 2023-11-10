public class Main {
    public static void main(String[] args) {
        Rectangle black = new Rectangle(10, 5);

        black.display();
        black.getArea();
        black.getPerimeter();

        Circle blackC = new Circle(10);

        blackC.display();
        blackC.getArea();
        blackC.getCircumference();

        Student Nemo = new Student("Nemo", 15);

        Nemo.display();

        BankAccount NemoBank = new BankAccount(2667408, 150000);

        NemoBank.getBalance();
        NemoBank.deposit(2000);
        NemoBank.withdraw(200000);
    }
}
