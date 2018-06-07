package designpattern.component;

public class PersonConcreteComponent extends Component{
    @Override
    public void dress() {
        System.out.println("装饰者：我自己的操作");
    }
}
