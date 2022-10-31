/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 * @author princ
 */
public class Enums {
    enum details{
        name,
        age,
        level
    }
    
    public static void main(String[] args) {
        details myObj = details.level;
        System.out.print(myObj);
    }
}
