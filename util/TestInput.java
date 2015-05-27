package util;

import java.io.IOException;
import java.util.Optional;


public class TestInput {    
    public static void main(String [] args) {
        MyInputReader myInputReader = new MyInputReader();
        System.out.println("#Testing reading standard input ");
        try{
            double value_double = myInputReader.readDouble(Optional.of("Enter double:"));
            System.out.println("I read the double -> " + value_double);
        } catch (IOException ioe) {
			System.out.println("Error: Input exception");
        } catch (NumberFormatException nfe){
			System.out.println("Error: " + nfe.getMessage());
		}
        try{
            int value_int = myInputReader.readInt(Optional.of("Enter Int:"));
            System.out.println("I read the int -> " + value_int);
        } catch (IOException ioe) {
			System.out.println("Error: Input exception");
        } catch (NumberFormatException nfe){
			System.out.println("Error: " + nfe.getMessage());
		}
        try{
            String value_string = myInputReader.readString(Optional.of("Enter a String:"));
            System.out.println("I read the string -> " + value_string);
        } catch (IOException ioe) {

        }
        myInputReader.close();
    }
}