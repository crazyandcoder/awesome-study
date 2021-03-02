package design_pattern.bridge;

public abstract class Abstraction {

    protected Implementor mImp;

    public void operation() {

    }

    public Abstraction(Implementor mImp) {
        this.mImp = mImp;
    }

}
