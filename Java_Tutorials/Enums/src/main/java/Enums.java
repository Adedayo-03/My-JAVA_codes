/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author princ
 */
public class Enums {
    enum Level{
        Low,
        Medium,
        High
    }

    public static void main(String[] args) {
        Level myObj = Level.High;
        System.out.println(myObj);
    }
}
