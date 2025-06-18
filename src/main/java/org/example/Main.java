package org.example;
class Main {
    public static void main(String[] args) {
        Tester.printCompany();

        Tester tester1 = new Tester();
        Tester tester2 = new Tester("Alice", "Smith");
        Tester tester3 = new Tester("Bob", "Johnson", 5);

        tester1.work();
        tester2.work("Mobile App");
        tester3.work("Web Application", 8);
    }
}