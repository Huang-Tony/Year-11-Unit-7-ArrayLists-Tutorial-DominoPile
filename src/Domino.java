public class Domino {
    private int top;
    private int bottom;
    public Domino(){
        top = 0;
        bottom = 0;
    }
    public Domino(int top, int bottom){
        this.top = top;
        this.bottom = bottom;
    }
    public int getTop(){
        return this.top;
    }
    public void setTop(int top){
        this.top = top;
    }
    public void setBottom(int bottom){
        this.bottom = bottom;
    }
    public int getBottom(){
        return this.bottom;
    }
    public String toString(){
        return String.format("(%1$s/%2$s)",top,bottom);
    }
    public void flip(){
        int x;
        x = top;
        top = bottom;
        bottom = x;
    }
    public void settle(){
        if(top > bottom){
            flip();
        }
    }
    public int compareTo(Domino other){
        settle();
        other.settle();
        if(this.bottom < other.bottom){
            return -1;
        }else if(this.bottom > other.bottom){
            return 1;
        }else if(this.top < other.top){
            return -1;
        }else if(this.top > other.top){
            return 1;
        }else{
            return 0;
        }
    }
    public int compareToWeight(Domino other){
        if(this.top + this.bottom < other.top + other.bottom){
            return -1;
        } else if(this.top + this.bottom > other.top + other.bottom){
            return 1;
        } else{
            return 0;
        }
    }
    public boolean canConnect(Domino other){
        return(this.top == other.top || this.top == other.bottom || this.bottom == other.top ||this.bottom == other.bottom);
    }


}

