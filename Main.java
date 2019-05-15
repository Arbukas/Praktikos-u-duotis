package praktika;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // 1)

        // 10 matches:

        ArrayList<String> results = new ArrayList<>();
        results.add("3:1");
        results.add("2:2");
        results.add("0:1");
        results.add("1:1");
        results.add("3:2");
        results.add("4:3");
        results.add("2:4");
        results.add("4:4");
        results.add("2:4");
        results.add("1:1");

        //Function to count final score

        System.out.println("Final score is: " + countPoints(results));

        // 2)

        // ex 1

        ArrayList<String> arr = new ArrayList<>();

        arr.add("XOOXO");
        arr.add("XOOXO");
        arr.add("OOOXO");
        arr.add("XXOXO");
        arr.add("OXOOO");

        System.out.println("Land perimeter of ex1 is: " + landPerimeter(arr)+" (has to be 24)");

        // ex 2
        ArrayList<String> arr2 = new ArrayList<>();

        arr2.add("XOOO");
        arr2.add("XOXO");
        arr2.add("XOXO");
        arr2.add("OOXX");
        arr2.add("OOOO");


        System.out.println("Land perimeter of ex2 is: " + landPerimeter(arr2)+" (has to be 18)");


        // 3)

        System.out.println("Number of cows: "+countCows(0));


    }
    public static int countCows(int n){

        int finalCount = 0;

        if(n == 0 || n == 1){
            finalCount = 1;
        }else{
            
        }
        return finalCount;
    }
    public static int landPerimeter(ArrayList<String> arr){
        int landPerimeter = 0;
        for(int i=0; i<arr.size(); i++){
            for(int j = 0; j<arr.get(i).length(); j++){
                if(arr.get(i).charAt(j) == 'X'){

                    landPerimeter += 4;

                    if(i == 0){
                        if(arr.get(i+1).charAt(j) == 'X'){
                            landPerimeter-=2;
                        }
                    }else if(i>0 && i<arr.size()-1){
                        if(arr.get(i+1).charAt(j) == 'X'){
                            landPerimeter-=2;
                        }
                    }

                    if(j==0){
                        if(arr.get(i).charAt(j+1) == 'X'){
                            landPerimeter-=2;
                        }
                    }else if(j>0 && j<arr.get(i).length()-1){
                        if(arr.get(i).charAt(j+1) == 'X'){
                            landPerimeter-=2;
                        }
                    }
                }

            }
        }
        return landPerimeter;
    }
    public static int countPoints(ArrayList<String> results){

        int finalScore = 0;

        for(int i=0; i<results.size(); i++){

            int x = Integer.parseInt(String.valueOf(results.get(i).charAt(0)));
            int y = Integer.parseInt(String.valueOf(results.get(i).charAt(2)));

            if(x > y){
                finalScore += 3;
            }else if(x == y){
                finalScore += 1;
            }
        }
        return finalScore;
    }
}
