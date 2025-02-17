import java.util.ArrayList;


public class DominoPile {
    private ArrayList<Domino> pile;
    DominoPile(){
        pile = new ArrayList<Domino>();
    }
    public ArrayList<Domino> getPile(){
        return pile;
    }
    public void newStack6(){
        for(int i = 0; i <= 36; i ++){
            for(int j = i; j <= 6; j++){
                Domino domino = new Domino(i, j);
                pile.add(domino);
            }
        }
    }
    public void shuffle(){
        int min = 0;
        int max = pile.size()-1;
        for (int i = 0; i < 1000; i++){
            int switchIndex1 = (int) Math.floor(Math.random() *(max - min + 1) + min);
            int switchIndex2 = (int) Math.floor(Math.random() *(max - min + 1) + min);
            Domino domino = pile.get(switchIndex1);
            pile.set(switchIndex1, pile.get(switchIndex2));
            pile.set(switchIndex2, domino);
        }
    }
}

