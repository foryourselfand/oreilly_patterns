package Ch11_Proxy.GumballRemote.States;

import java.io.Serializable;

public interface State extends Serializable {
    public void insertQuarter();

    public void ejectQuarter();

    public void turnCrank();

    public void dispense();
}