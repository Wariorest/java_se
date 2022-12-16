package visitor_JSON.memento;

import visitor_JSON.Stats;
import visitor_JSON.memento.Memento;

public class Originator {
    private Stats state;

    public Stats getState() {
        return state;
    }

    public void setState(Stats state) {
        this.state = state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }
}
