package memento;

public class StartMemento {
    public static void run(){
        Character player = new Character("Vladislav", "Martynov");

        Stats temp = Stats.generate();
        player.setAttributes(temp);
        player.printSheet();

        CareTaker careTaker = new CareTaker();
        Memento mem = new Memento(temp);

        mem.setState(temp);
        careTaker.add(mem.getState());

        temp = Stats.generate();
        temp.print();
        mem.setState(temp);
        careTaker.add(mem.getState());

        mem.setState(careTaker.get(0));
        temp = mem.getState();
        temp.print();
    }
}
