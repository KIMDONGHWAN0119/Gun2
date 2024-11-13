package Model;

public class Gun_type extends Gun {

    protected void shotgun(int i) {
        valueChange(i,15, 5, 50);
    }

    public void rifle(int i) {
        valueChange(i,80,30,10);
    }

}
