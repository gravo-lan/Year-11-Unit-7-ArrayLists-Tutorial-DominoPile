import java.util.*;

public class DominoPile {
    private final ArrayList<Domino> pile;

    public DominoPile() {
        this.pile = new ArrayList<>();
    }

    public ArrayList<Domino> getPile() {
        return pile;
    }

    public void newStack6() {
        for (int i = 0; i <= 6; i++) {
            for (int j = 0; j <= 6; j++) {
                if (j<i) continue;
                pile.add(new Domino(i,j));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(pile);
    }
}
