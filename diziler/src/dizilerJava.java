import java.util.Scanner;

public class dizilerJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] myList = {13, 21, 18, 20};System.out.println("My lucky numbers  ");
        for(int i=0; i<myList.length; i++)
        {
            System.out.println(myList[i] + " " );
        }
        String [] workDay = {"Monday" , "Wednesday" ,"Friday ", "Saturday"};
        System.out.println("working days");
        for(int j=0; j<workDay.length; j++){
            System.out.println(workDay[j] + "");
        }
        // sayıları toplayan program

        int [] list = {1,2,3,4,5,6,7,8,9};
        int sum=0;
        for(int i: list){
            sum += i;
        }
        System.out.println(sum);
        System.out.println("------------------------");
        // matris örneği

        /* uzun yöntem
           for(int i=0; i<matris.length; i++){
           for(int k=0; k<matris[i].length; k++){
                System.out.print(matris[i][k]+ " ");
            }
            System.out.println();
         */
        int [][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11,12}
        };
        for(int [] row : matris){
            for(int  col : row){
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }

}


