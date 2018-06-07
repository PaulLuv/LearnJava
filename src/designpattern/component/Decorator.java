package designpattern.component;

public abstract class Decorator extends Component{

    private Component component;

    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public void dress() {
        component.dress();
    }
}
