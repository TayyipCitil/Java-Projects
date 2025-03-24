package ObjectOrientedProgramming.Labs.Lab3;

public class Modified {
        private static int count = 0;

        public static void modifiedCar(Car car, Color newColor) {
            car.changeColor(newColor);
            count++;
        }

        public static int getCount() {
            return count;
        }
    }


