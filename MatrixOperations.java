import java.util.Scanner;
public class MatrixOperations
{
    public static void main() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of matrix: ");
        int m = sc.nextInt();//4
        int a[][] = new int[m][m];
        System.out.println("Enter elements");
        for (int i=0;i<m;i++) 
        {
            System.out.println("Enter row " + (i+1) + ":");
            for (int j=0;j<m;j++) 
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("ORIGINAL MATRIX");
        printMatrix(a, m);
        
        NonBoundary(a, m);
        System.out.println("REARRANGED MATRIX");
        printMatrix(a, m);
        
        computePrintDiagonalSum(a, m);
    }
    public static void NonBoundary(int a[][], int m) 
    {
        int b[] = new int[(m - 2) * (m - 2)];//4-2*(4-2)=4
        int k = 0;//b[o] b[1] b[2] b[3]
        for (int i = 1; i <=m - 2; i++) {
            for (int j = 1; j <=m -2; j++) {
                b[k++] = a[i][j];//b[0]=a11; b[1]=a12..
            }
        }// it was in jumbled till here
        for (int i = 0; i < k - 1; i++) 
        {
            for (int j = 0; j < k - i - 1; j++) 
            {
                if (b[j] > b[j + 1]) {
                    int t = b[j];
                    b[j] = b[j+1];
                    b[j+1] = t;
                }
            } 
        }// so at this point b[0], b[1]. b[2], b[3] is stored in ascending order
        k = 0;
        for (int i = 1; i <=m-2; i++) {
            for (int j = 1; j <=m-2; j++) {
                a[i][j] = b[k++];// a[1][1]=b[0]; a[1][2]=b[1] a[2][1]=b[2] a[2][2]=b[3]
            }
        }
    }
    public static void Boundary(int a[][], int m) 
    {
        int b[] = new int[(m - 2) * (m - 2)];//4-2*(4-2)=4
        int k = 0;//b[o] b[1] b[2] b[3]
        for (int i = 1; i <=m - 2; i++) {
            for (int j = 1; j <=m -2; j++) {
                b[k++] = a[i][j];//b[0]=a11; b[1]=a12..
            }
        }// it was in jumbled till here
        for (int i = 0; i < k - 1; i++) 
        {
            for (int j = 0; j < k - i - 1; j++) 
            {
                if (b[j] > b[j + 1]) {
                    int t = b[j];
                    b[j] = b[j+1];
                    b[j+1] = t;
                }
            } 
        }// so at this point b[0], b[1]. b[2], b[3] is stored in ascending order
        k = 0;
        for (int i = 1; i <=m-2; i++) {
            for (int j = 1; j <=m-2; j++) {
                a[i][j] = b[k++];// a[1][1]=b[0]; a[1][2]=b[1] a[2][1]=b[2] a[2][2]=b[3]
            }
        }
    }
    public static void computePrintDiagonalSum(int a[][], int m) {
        int sum = 0;
        System.out.println("DIAGONAL ELEMENTS");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    sum += a[i][j];
                    System.out.print(a[i][j] + "\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        System.out.println("SUM OF THE DIAGONAL ELEMENTS = " + sum);
    }

    public static void printMatrix(int a[][], int m) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}