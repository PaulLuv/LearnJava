package designpattern.component;

public class ConcreteDecoratorA extends Decorator{

    public ConcreteDecoratorA(Component component){
        super(component);
    }

    @Override
    public void dress() {
        operation();
        super.dress();
        operation();
    }

    private void operation(){
        System.out.println("装饰者A 对你进行了操作");
    }
}
