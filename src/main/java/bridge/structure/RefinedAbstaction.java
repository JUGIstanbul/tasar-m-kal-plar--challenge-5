package bridge.structure;

public class RefinedAbstaction extends Abstraction {

    private Implementor implementor;

    public RefinedAbstaction(Implementor implementor) {
        
        this.implementor = implementor;
    }

    public void operation() {
        implementor.implementation();
    }
}
