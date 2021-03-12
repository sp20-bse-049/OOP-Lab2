
package llab2;


public class Rectangle {
    int length, width, corners;
    public void area(){
        System.out.println("its area can be calculated by length * width.");
    }
    public void circumference(){
        System.out.println("Its circumference can be calculated by 2[Length + Width] which is " );
        
    }
    public void display(){
        System.out.println("corners = " + corners + "\nlength = " + length + "\nwidth = " + width);
    }

    
}
