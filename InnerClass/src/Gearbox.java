import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear>gears;
    private int maxGears;
    private int currentGear;
    private boolean cluthIsIn;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears=new ArrayList<Gear>();
        Gear neutral=new Gear(0,0.00);
        this.gears.add(neutral);

    }
    /*******
     * @param in
     * states the conditoni of clutch
     */
    public void Clutchin(boolean in){
         this.cluthIsIn=in;
    }

    /****
     * @param number
     * @param ratio
     * this method add new Gear object to the this.gears arraylist
     */
    public void addGears(int number,double ratio){
        if (number>0&&ratio>0){
            this.gears.add(new Gear(number,ratio));
        }
    }
    /*******
     * this method changes the currentGear feild of the Class
     * @param gearNumber
     */
    public void changeGears(int gearNumber){
        if(gearNumber>0&&gearNumber<this.gears.size()&&this.cluthIsIn){
            this.currentGear=gearNumber;
            System.out.println("Gear "+gearNumber+" Selected");
        }
        else{
            System.out.println("Grind");
            this.currentGear=0;
        }
    }
    public double wheelSpeed(int reves){
        if (cluthIsIn){
            System.out.println("Scream!!!!1");
            return 0.00;

        }
        return this.gears.get(currentGear).driveSpeed(reves);
    }
    /*******
     * This is an InnerClass DEclaration
     * of Gear
     *******/
    private class Gear{
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int reves){
            System.out.println("Wheel Speed "+reves*this.ratio);
            return reves*this.ratio;
        }
    }

}
