class ForLoopExample {
    public static void main(String args[]){
        for(int i=3; i>0; i--){
            System.out.println("The value of i is: "+i);
        }
        System.out.println("\n \n");

        int[] myArray = {1, 2, 3, 4};
        for (int j = 0; j < myArray.length; j++) {
            System.out.print(myArray[j] + " ");
        }

        System.out.println("\n \n" + myArray);
    }
}
