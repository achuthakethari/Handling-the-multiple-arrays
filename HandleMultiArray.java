package handlemultiarray;
// Program handles Two Dimesnional integer array and string array .
// Array is group of elements with index starting at Zero.

// int [] [] <arrayname> defines two dimensional array

public class HandleMultiArray {

    public static void main(String args[]) {
        int[][] intarr2DimInit = new int[][]{{5, 10, 15}, {20, 25, 30}};
        String[][] stringarr2DimInit = new String[][]{{"Kiran", "Sanjay"}, {"Adithya", "Rohith"}};


        System.out.println("Printing elements of Initialised Integer Array");
        for (int i : intarr2DimInit[0])
            System.out.printf("%d, ", i);
        System.out.println();
        for (int i : intarr2DimInit[1])
            System.out.printf("%d, ", i);

        System.out.println("\n");

        System.out.println("Printing elements of Initialised String Array");
        for (String s : stringarr2DimInit[0])
            System.out.printf("%s, ", s);
        System.out.println();
        for (String s : stringarr2DimInit[1])
            System.out.printf("%s, ", s);

        //***************************************************************************************8

        int[][] intarr2DimAssigned = new int[3][3];
        System.out.println("\n\nUsing for-loop Assigning elements of Integer Array");
        for (int i = 0; i < 3; i++) {
            for ( int j = 0; j < 3; j++)
                //intarr2DimAssigned[i][j] = (i == 0) ? i + j + 1 : i + j + 3;
           intarr2DimAssigned[i][j] = i+j;
        }

        System.out.println("\n\nUsing for-loop Printing Assigned values of Integer Array:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.printf("%d, ", intarr2DimAssigned[i][j]);
            System.out.println();
        }

    }
}