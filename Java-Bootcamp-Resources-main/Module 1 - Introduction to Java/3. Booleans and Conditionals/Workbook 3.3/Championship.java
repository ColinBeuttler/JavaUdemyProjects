public class Championship {
    public static void main(String[] args) {

        int gryffindor = 120;    //gryffindor points
        int ravenclaw = 200;    //ravenclaw points

        // int margin = amount of points by which gryffindor scored over ravenclaw;

        int margin = (gryffindor-ravenclaw);


        //if gryffindor wins by a margin of 300 points:
             //print: Gryffindor takes the house cup!
        if(margin >= 300){
            System.out.println("Gryffindor takes the house cup!");
        }

        //if gryffindor wins by a margin of any points: 
            //print: In second place, Gryffindor!
        else if ( margin >= 1){
            System.out.println("In second place, Gryffindor!");
        }

        //if gryffindor loses by a margin of 100 points, they are third:
            //print: In third place, Gryffindor!
        else if (-100 <= margin){
            System.out.println("In third place, Gryf findor!");
        }

        //else:
           //print: In fourth place, Gryffindor! 
        else {
            System.out.println("In fourth place, Gryffindor!");
        }
        
    }
}