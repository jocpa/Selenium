package selenium.POO;

public class ClassesObjects {
    
    public static void main(String[] args) {
        
    }

    public class House {

        private int nbrOfWindows;
        private int nbrOfDoors;
        private int nbrOfBedrooms;
        
        public House (int windows, int doors, int bedrooms) {
        
        nbrOfWindows = windows;
        nbrOfDoors = doors;
        nbrOfBedrooms = bedrooms;
            
        }
        
        public int getWindows() {
        return nbrOfWindows;
        }
        
        public int getDoors() {
        return nbrOfDoors;
        }
        
        public int getBedrooms() {
        return nbrOfBedrooms;
        }
    
    }

}
