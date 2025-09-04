public class printf {
    public static void main(String[] args){

        //printf = a method to format output
        //[Flags][width][.precision][character specifier]

        //width
        //0 padding
        //number = right justified padding
        //negative number = left justified padding

        int id1 = 1;
        int id2 =23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n",id2);
        System.out.printf("%-4d\n",id3);
        System.out.printf("%-4d\n",id4);







    }
}
