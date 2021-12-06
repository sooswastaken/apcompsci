public class Horse {
    private int location;
    private int index;

    public Horse() {
        location = 1;
        index = 0;
    }

    public Horse(int loc, int i) {
        location = loc;
        index = i;
    }

    public int getLocation() {
        return location;
    }

    public int getIndex() {
        return index;
    }

    public void advance() {
        if(location != 15) location ++;
    }

    public void raceStride() {
        if(
            (int)(Math.random() * 100) + 1 < 50
        ) advance();

        // // Uncomment this and comment the above code to test a tie contition.

        // advance();
    }

    public String toString() {
        int beforeDashesCount = location;
        int afterDashesCount = (15 - location) - 1;

        String beforeDashes = "";
        for(int i=1; i<beforeDashesCount; i++) beforeDashes+="-";

        String afterDashes = "";
        for(int i=0; i<=afterDashesCount; i++) afterDashes+="-";

        return "|" + beforeDashes + index + afterDashes + "|";
    }
}