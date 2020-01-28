package test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class squareTest {
    public static final double PI = 3.141592;

    public static void main(String[] args) {
        //System.out.println("Полезная площадь = " + poleznPloshad(getInput()) + " мм2");

        SimpleGUI app = new SimpleGUI();
        app.setVisible(true);
    }

    private static Input getInput() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Input input = new Input();
        try {
            System.out.println("Количество витков, шт:");
            input.setnVitkov(Integer.parseInt(reader.readLine()));
            System.out.println("Диаметр провода, мм:");
            input.setDiamProv(Double.parseDouble(reader.readLine()));
            System.out.println("Внутренний диаметр, мм:");
            input.setInnerDiam(Double.parseDouble(reader.readLine()));
            reader.close();
        } catch (IOException | NumberFormatException n) {
            System.out.println("Error! Incorrect input. Try again...");
            return getInput();
        }
        return input;
    }

    private static double poleznPloshad(Input input) {
        return input.getDiamProv() * input.getnVitkov() * circleLength(input.getInnerDiam());
    }

    public static double circleSquare(double diam) {
        return PI * Math.pow(diam / 2, 2);
    }

    public static double circleLength(double diam) {
        return diam * PI;
    }
}
