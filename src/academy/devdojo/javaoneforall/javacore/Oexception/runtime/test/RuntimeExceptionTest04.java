package academy.devdojo.javaoneforall.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Inside ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Inside IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Inside IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("Inside ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Inside RuntimeException");
        }

        try{
            mayThrowException();
        }catch (Exception e){

        }
    }

    private static void mayThrowException() throws SQLException, FileNotFoundException{

    }
}
