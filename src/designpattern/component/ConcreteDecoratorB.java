package designpattern.component;

public class ConcreteDecoratorB extends Decorator{

    public ConcreteDecoratorB(Component component){
        super(component);
    }

    @Override
    public void dress() {
        operation();
        super.dress();
        operation();
    }

    private void operation(){
        System.out.println("装饰者B 对你进行了操作");
    }
}
