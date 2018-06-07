package designpattern.component;

public class Client {
    public static void main(String[] args){
        Component person = new PersonConcreteComponent();

        ConcreteDecoratorA a = new ConcreteDecoratorA(person);
        ConcreteDecoratorB b = new ConcreteDecoratorB(person);

        a.dress();
        b.dress();
    }
}
