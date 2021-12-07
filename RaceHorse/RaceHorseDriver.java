public class RaceHorseDriver {
    public static void main(String[] args) {
        boolean horseOneHasWon = false;
        boolean horseTwoHasWon = false;
        boolean horseThreeHasWon = false;

        Horse horseOne = new Horse();
        Horse horseTawo = new Horse(1, 1);
        Horse horseThree = new Horse(1, 2);

        while(!(horseOneHasWon || horseTwoHasWon || horseThreeHasWon)) {
            advanceHorses(horseOne, horseTwo, horseThree);
            if(horseOne.getLocation() == 15) horseOneHasWon = true;
            if(horseTwo.getLocation() == 15) horseTwoHasWon = true;
            if(horseThree.getLocation() == 15) horseThreeHasWon = true;

            System.out.println(horseOne);
            System.out.println(horseTwo);
            System.out.println(horseThree);
            System.out.println(" ");

        }

        int numberOfWonHorses = 0;
        
        if(horseOneHasWon) numberOfWonHorses++;
        if(horseTwoHasWon) numberOfWonHorses++;
        if(horseThreeHasWon) numberOfWonHorses++;

        if(numberOfWonHorses == 1) {
            if(horseOneHasWon) System.out.println("Horse One has won!");
            else if(horseTwoHasWon) System.out.println("Horse Two has won!");
            else if(horseThreeHasWon) System.out.println("Horse Three has won!");
        } else {
            String tiedHorses = "";
            if (horseOneHasWon) tiedHorses += "Horse One, ";
            if (horseTwoHasWon) tiedHorses += "Horse Two, ";
            if (horseThreeHasWon) tiedHorses += "Horse Three, ";

            tiedHorses = tiedHorses.substring(0, tiedHorses.length() - 2); // Remove last comma.
            tiedHorses += ".";

            System.out.println("There was a Tie! The followng horses won: " + tiedHorses);
        }
        
    }
    public static void advanceHorses(
        Horse one,
        Horse two,
        Horse three
    ) {
        one.raceStride();
        two.raceStride();
        three.raceStride();
    }
}
