package ObjectOrientedProgramming.Labs.Lab3;

public class Car {
        private static int count = 0;
        private Color color;
        private String model;
        private double motor;

        public Car() {
            this(Color.BEYAZ, "Belli Değil", 0.0);
        }

        public Car(Color color, String model, double motor) {
            this.color = color;
            this.model = model;
            this.motor = motor;
            count++;
        }

        public Car(Color color) {
            this(color, "Belli Değil", 0.0);
        }

        public Car(Color color, String model) {
            this(color, model, 0.0);
        }

        public void setCar(Color color, String model, double motor) {
            this.color = color;
            this.model = model;
            this.motor = motor;
        }

        public void carInfo() {
            System.out.println("Model: " + getModel());
            System.out.println("Renk: " + color.getAvatar());
            System.out.println("Motor Gücü: " + getMotor());
            System.out.println("Toplam araba adedi :"+getCount());
            System.out.println("");

        }

        public static int getCount() {
            return count;
        }

        public void changeColor(Color newColor) {
            this.color = newColor;
        }

        public Color getColor() {
            return color;
        }

        public String getModel() {
            return model;
        }

        public double getMotor() {
            return motor;
        }
    }


