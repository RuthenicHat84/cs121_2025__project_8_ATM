// HasMenu.java
import java.util.Scanner;
public interface HasMenu {

default public String[] menu(){

    Scanner user = new Scanner(System.in);
    String userIn = user.nextLine();
    return userIn;
} // end menu

void start(){

    menu();

}

}