package osnProg.secondKT;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Matrix m = new Matrix(4);
        System.out.println(m);
        System.out.println(Arrays.deepToString(m.transp(m)));

    }
}