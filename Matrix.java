public class Matrix {
    int x, y;

    Matrix(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public ComplexNumber[][] matrix;

    public void init(ComplexNumber[][] matrix) {
        this.matrix = new ComplexNumber[this.x][this.y];
        if (matrix.length != this.x || matrix[0].length != this.y) {
            System.out.println("Matrix initialization ERROR");
            return;
        }
        this.matrix = matrix;
    }

    public void init(Double[][] matrix) {
        this.matrix = new ComplexNumber[this.x][this.y];
        if (matrix.length != this.x || matrix[0].length != this.y) {
            System.out.println("Matrix initialization ERROR");
            return;
        }
        for (int i = 0; i < this.x; i++) {
            for (int j = 0; j < this.y; j++) {
                this.matrix[i][j] = new ComplexNumber(matrix[i][j]);
            }
        }
    }

    public void init() {
        this.matrix = new ComplexNumber[this.x][this.y];
        for (int i = 0; i < this.x; i++)
            for (int j = 0; j < this.y; j++)
                this.matrix[i][j] = new ComplexNumber();

    }

    public void print() {
        for (int i = 0; i < x; ++i) {
            for (int j = 0; j < y; ++j)
                System.out.print("\t" + matrix[i][j].getStringNumberForm() + " ");
            System.out.println();
        }
    }

    // Operation with Matrix

    public Matrix transposition() {
        Matrix transpositionMatrix = new Matrix(this.x, this.y);
        transpositionMatrix.init();
        for (int i = 0; i < this.x; i++)
            for (int j = 0; j < this.y; j++)
                transpositionMatrix.matrix[i][j] = this.matrix[j][i];
        return transpositionMatrix;
    }

    // Operation Matrix & Number

    public Matrix addNumber(Double number) {
        return this.addNumber(new ComplexNumber(number, 0.0));
    }

    public Matrix addNumber(ComplexNumber number) {
        Matrix newMatrix = new Matrix(this.x, this.y);
        newMatrix.init();
        for (int i = 0; i < this.x; i++)
            for (int j = 0; j < this.y; j++)
                newMatrix.matrix[i][j] = this.matrix[i][j].summarize(number);
        return newMatrix;
    }

    public Matrix subtractNumber(Double number) {
        return this.subtractNumber(new ComplexNumber(number, 0.0));
    }

    public Matrix subtractNumber(ComplexNumber number) {
        Matrix newMatrix = new Matrix(this.x, this.y);
        newMatrix.init();
        for (int i = 0; i < this.x; i++)
            for (int j = 0; j < this.y; j++)
                newMatrix.matrix[i][j] = this.matrix[i][j].subtract(number);
        return newMatrix;
    }

    public Matrix multiplicationOnNumber(Double number) {
        return this.multiplicationOnNumber(new ComplexNumber(number, 0.0));
    }

    public Matrix multiplicationOnNumber(ComplexNumber number) {
        Matrix newMatrix = new Matrix(this.x, this.y);
        newMatrix.init();
        for (int i = 0; i < this.x; i++)
            for (int j = 0; j < this.y; j++)
                newMatrix.matrix[i][j] = this.matrix[i][j].multiplication(number);
        return newMatrix;
    }

    public Matrix divisionOnNumber(Double number) {
        return this.divisionOnNumber(new ComplexNumber(number, 0.0));
    }

    public Matrix divisionOnNumber(ComplexNumber number) {
        Matrix newMatrix = new Matrix(this.x, this.y);
        newMatrix.init();
        for (int i = 0; i < this.x; i++)
            for (int j = 0; j < this.y; j++)
                newMatrix.matrix[i][j] = this.matrix[i][j].division(number);
        return newMatrix;
    }

    // Operation Matrix & Matrix

    public Matrix summarize(Matrix matrix) {
        if (matrix.x != this.x || matrix.y != this.y) {
            System.out.println("Summarize Matrix ERROR");
            return matrix;
        }

        Matrix newMatrix = new Matrix(this.x, this.y);
        newMatrix.init();
        for (int i = 0; i < this.x; i++)
            for (int j = 0; j < this.y; j++)
                newMatrix.matrix[i][j] = this.matrix[i][j].summarize(matrix.matrix[i][j]);
        return newMatrix;
    }

    public Matrix subtract(Matrix matrix) {
        if (matrix.x != this.x || matrix.y != this.y) {
            System.out.println("Subtract Matrix ERROR");
            return matrix;
        }

        Matrix newMatrix = new Matrix(this.x, this.y);
        newMatrix.init();
        for (int i = 0; i < this.x; i++)
            for (int j = 0; j < this.y; j++)
                newMatrix.matrix[i][j] = this.matrix[i][j].subtract(matrix.matrix[i][j]);
        return newMatrix;
    }

    public Matrix multiplication(Matrix matrix) {
        if (matrix.x != this.y) {
            System.out.println("Multiplication Matrix ERROR");
            return matrix;
        }
        Matrix newMatrix = new Matrix(this.x, matrix.y);
        newMatrix.init();
        for (int i = 0; i < this.x; i++) {
            for (int j = 0; j < matrix.y; j++) {
                int k = 0, l = 0;
                while (k < this.y && l < matrix.x) {
                    newMatrix.matrix[i][j] = newMatrix.matrix[i][j].summarize(this.matrix[i][k].multiplication(matrix.matrix[l][j]));
                    ++k;
                    ++l;
                }
            }
        }
        return newMatrix;
    }

}