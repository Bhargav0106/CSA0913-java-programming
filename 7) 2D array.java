import java.lang.reflect.Array;
import java.util.Arrays;
public class Main {
 public static void main(String[] args) {
 // Define the dimensions of the matrix
 int rows = 3;
 int cols = 3;
 // Create a 2D matrix using the Array class
 int[][] matrix = (int[][]) Array.newInstance(int.class, rows, cols);
 // Populate the matrix with values
 for (int i = 0; i < rows; i++) {
 for (int j = 0; j < cols; j++) {
 matrix[i][j] = i * cols + j + 1;
 }
 }