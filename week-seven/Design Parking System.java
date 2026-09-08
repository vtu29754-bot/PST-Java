public class DesignParkingSystem {
    static class ParkingSystem {
        private int big;
        private int medium;
        private int small;

        public ParkingSystem(int big, int medium, int small) {
            this.big = big;
            this.medium = medium;
            this.small = small;
        }

        public boolean addCar(int carType) {
            if (carType == 1) {
                if (big > 0) { big--; return true; }
            } else if (carType == 2) {
                if (medium > 0) { medium--; return true; }
            } else if (carType == 3) {
                if (small > 0) { small--; return true; }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
        System.out.println("ParkingSystem initialized with (1, 1, 0)");
        System.out.println("addCar(1): " + parkingSystem.addCar(1));
        System.out.println("addCar(2): " + parkingSystem.addCar(2));
        System.out.println("addCar(3): " + parkingSystem.addCar(3));
        System.out.println("addCar(1): " + parkingSystem.addCar(1));
    }
}

/*
INPUT & OUTPUT:

ParkingSystem initialized with (1, 1, 0)
addCar(1): true
addCar(2): true
addCar(3): false
addCar(1): false
*/
