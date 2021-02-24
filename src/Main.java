public class Main {

    public static void main(String[] args) {
        

        int myValue = 10000; 

        int myMinIntValue = Integer.MIN_VALUE; 
        int myMaxIntValue = Integer.MAX_VALUE; 
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted Max value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value = " + (myMinIntValue - 1)); 

        int myMaxIntTest = 214_748_367; 
        // valid but not used oftern above 

        short myMinShortValue = Short.MIN_VALUE; 
        short myMaxShortValue = Short.MAX_VALUE; 

        System.out.println("Short Min Value = " + myMinShortValue); 
        System.out.println("Short Max Value = " + myMaxShortValue);
    }
}