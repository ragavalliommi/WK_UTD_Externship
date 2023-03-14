package main.FizzBuzz;


public class FizzBizzImpl {
    /*
    FizzBizz Implementation
     */
    public void fizzBizzImplementation(int startNumber, int endNumber){
        if(startNumber >= 1 && endNumber >= 1){
            for(int i = startNumber; i <= endNumber; i++) {
                //checks if i is divisible by 5
                if(i % 5 == 0) {
                    System.out.println(i + " " + Constants.BUZZWORD);
                }
                //checks if i is divisible by 3
                else if(i % 3 == 0) {
                    System.out.println(i + " " + Constants.FIZZWORD);
                }
                else {
                    System.out.println(i);
                }
            }
        }else{
            System.out.println("Please input valid positive range");
        }
    }
}
