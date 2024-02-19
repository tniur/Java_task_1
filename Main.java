//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        printDivider();

        System.out.println("\nOPERATION WITH ONE MATRIX");

        System.out.println("\nInit Real Matrix:");
        Matrix matrix1 = new Matrix(3,3);
        matrix1.init(new Double[][] {{-1.0, 5.0, 3.0}, {2.0, 8.0, 4.0}, {7.0, 1.0, 9.0}});
        matrix1.print();

        System.out.println("\nInit Complex Matrix:");
        Matrix matrix1_2 = new Matrix(3,3);
        matrix1_2.init(new ComplexNumber[][] {{new ComplexNumber(1.0, -3.0), new ComplexNumber(2.0, 2.0), new ComplexNumber(-3.0, 2.0)}, {new ComplexNumber(1.0, -1.0), new ComplexNumber(5.0, -2.0), new ComplexNumber(4.0, 3.0)}, {new ComplexNumber(6.0, -8.0), new ComplexNumber(2.0, 1.0), new ComplexNumber(3.0, -5.0)}});
        matrix1_2.print();

        System.out.println("\nInit Mixed Matrix:");
        Matrix matrix1_3 = new Matrix(3,3);
        matrix1_3.init(new ComplexNumber[][] {{new ComplexNumber(1.0), new ComplexNumber(2.0), new ComplexNumber(-3.0, 2.0)}, {new ComplexNumber(-1.0), new ComplexNumber(5.0, -2.0), new ComplexNumber(3.0)}, {new ComplexNumber(6.0), new ComplexNumber(2.0, 1.0), new ComplexNumber(3.0, -5.0)}});
        matrix1_3.print();

        printDivider();

        System.out.println("\nTransposition Matrix:");
        matrix1.init(new Double[][] {{-1.0, 5.0, 3.0}, {2.0, 8.0, 4.0}, {7.0, 1.0, 9.0}});
        matrix1.print();

        System.out.println();

        Matrix matrix2 = matrix1.transposition();
        matrix2.print();

        printDivider();

        System.out.println("\nAdd number to Matrix (+2):");
        matrix2 = matrix2.addNumber(2.0);
        matrix2.print();

        System.out.println("\nSubtract number to Matrix (-2):");
        matrix2 = matrix2.subtractNumber(2.0);
        matrix2.print();

        System.out.println("\nMatrix multiplication on number (*3):");
        matrix2 = matrix2.multiplicationOnNumber(3.0);
        matrix2.print();

        System.out.println("\nMatrix division on number (/3):");
        matrix2 = matrix2.divisionOnNumber(3.0);
        matrix2.print();

        printDivider();

        System.out.println("\nAdd number to Matrix (5-i2):");
        matrix2 = matrix2.addNumber(new ComplexNumber(5.0, -2.0));
        matrix2.print();

        System.out.println("\nSubtract number to Matrix (3+2i):");
        matrix2 = matrix2.subtractNumber(new ComplexNumber(3.0, 2.0));
        matrix2.print();

        System.out.println("\nMatrix multiplication on complex number (1+i1):");
        matrix2 = matrix2.multiplicationOnNumber(new ComplexNumber(1.0, 1.0));
        matrix2.print();

        System.out.println("\nMatrix division on complex number (1+i1):");
        matrix2 = matrix2.divisionOnNumber(new ComplexNumber(1.0, 1.0));
        matrix2.print();

        printDivider();

        System.out.println("\nOPERATION WITH TWO MATRIX");

        System.out.println("\nFirst:");
        Matrix matrix3 = new Matrix(3,3);
        matrix3.init(new ComplexNumber[][] {{new ComplexNumber(2.0, -1.0), new ComplexNumber(4.0, 2.0), new ComplexNumber(1.0, -3.0)}, {new ComplexNumber(2.0, 0.0), new ComplexNumber(3.0, -5.0), new ComplexNumber(1.0)}, {new ComplexNumber(4.0, 2.0), new ComplexNumber(1.0), new ComplexNumber(1.0, 5.0)}});
        matrix3.print();

        System.out.println("\nSecond:");
        Matrix matrix4 = new Matrix(3,3);
        matrix4.init(new ComplexNumber[][] {{new ComplexNumber(1.0, -3.0), new ComplexNumber(2.0, 2.0), new ComplexNumber(-3.0, 2.0)}, {new ComplexNumber(1.0, -1.0), new ComplexNumber(5.0, -2.0), new ComplexNumber(4.0, 3.0)}, {new ComplexNumber(6.0, -8.0), new ComplexNumber(2.0, 1.0), new ComplexNumber(3.0, -5.0)}});
        matrix4.print();

        printDivider();

        System.out.println("\nSummarize First and Second matrix:");
        Matrix matrix5 = matrix3.summarize(matrix4);
        matrix5.print();

        printDivider();

        System.out.println("\nSubtract First from Second matrix:");
        matrix5 = matrix4.subtract(matrix3);
        matrix5.print();

        printDivider();

        System.out.println("\nSubtract First from Second matrix:");
        matrix5 = matrix4.subtract(matrix3);
        matrix5.print();

        printDivider();

        System.out.println("\nThird:");
        Matrix matrix6 = new Matrix(2,3);
        matrix6.init(new ComplexNumber[][] {{new ComplexNumber(2.0, -1.0), new ComplexNumber(4.0, 2.0), new ComplexNumber(1.0, -3.0)}, {new ComplexNumber(2.0, 0.0), new ComplexNumber(3.0, -5.0), new ComplexNumber(1.0)}});
        matrix6.print();

        System.out.println("\nFourth:");
        Matrix matrix7 = new Matrix(3,2);
        matrix7.init(new ComplexNumber[][] {{new ComplexNumber(1.0, -3.0), new ComplexNumber(2.0, 2.0)}, {new ComplexNumber(1.0, -1.0), new ComplexNumber(5.0, -2.0)}, {new ComplexNumber(6.0, -8.0), new ComplexNumber(2.0, 1.0)}});
        matrix7.print();

        System.out.println("\nMultiplication Third and Fourth matrix:");
        Matrix matrix8 = matrix6.multiplication(matrix7);
        matrix8.print();

        printDivider();

    }

    public static void printDivider() {
        System.out.println("\n-----------------------------------------");
    }

}