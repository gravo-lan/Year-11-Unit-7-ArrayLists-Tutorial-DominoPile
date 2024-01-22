public class Domino {
    private int top, bottom;

    public Domino() {
        this.top = 0;
        this.bottom = 0;
    }

    public Domino(int top, int bottom) {
        this.top = top;
        this.bottom = bottom;
    }

    public int getTop() {
        return top;
    }

    public int getBottom() {
        return bottom;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    public void flip() {
        this.bottom ^= this.top;
        this.top = this.bottom^this.top;
        this.bottom^=this.top;
    }

    public void settle() {
        if (this.top>this.bottom) flip();
    }

    public int compareTo(Domino other) {
        int small = this.top;
        if (this.bottom<small) small = this.bottom;
        int oSmall = other.getTop();
        if (other.getBottom()<oSmall) oSmall = other.getBottom();

        int big = this.top;
        if (this.bottom>big) big = this.bottom;
        int oBig = other.getTop();
        if (other.getBottom()>oBig) oBig = other.getBottom();

        if (small<oSmall) return -1;
        else if (small>oSmall) return 1;
        else {
            if (big<oBig) return -1;
            else if (big>oBig) return 1;
        }
        return 0;
    }

    public int compareToWeight(Domino other) {
        if (this.top+this.bottom < other.getBottom() + other.getTop()) return -1;
        else if (this.top+this.bottom > other.getBottom() + other.getTop()) return 1;
        return 0;
    }

    public boolean canConnect(Domino other) {
        return this.top == other.getTop() || this.top == other.getBottom() || this.bottom == other.getTop() || this.bottom == other.getBottom();
    }
}
