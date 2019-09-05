import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PGM extends Image{
    public int[][] array;
    private String magic;
    public int width;
    public int height;
    public int depth;
    public int[][]new_array;

    public PGM(){
        super();
        array = new int[0][0];
    }

    public PGM(String file){
        File image = new File(file);
        Scanner sc = null;
        try{
            sc = new Scanner(image);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        magic = sc.nextLine();
        width = sc.nextInt();
        height = sc.nextInt();
        depth = sc.nextInt();

        array = new int[height][width];
        for(int i = 0; i < height; i ++)
        {
            for(int j = 0; j < width; j ++)
            {
                array[i][j] = sc.nextInt();
            }
        }
    }

    public String getMagic(){
        return magic;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public int getDepth(){
        return depth;
    }
    public int[][] getPixels(){
        return array;
    }

    public void flip_horizontally(){
        new_array = new int[height][width];
        for(int i = 0; i < height; i ++)
        {
            int index = 0;
            for(int j = width - 1; j >= 0; j --)
            {
                new_array[i][index] = array[i][j];
                index ++;
            }
        }
        array = new_array;
    }

    public void flip_vertically(){
        new_array = new int[height][width];
        int index = 0;
        for(int i = height - 1; i >= 0; i--)
        {
            for(int j = 0; j < width; j++)
            {
                new_array[index][j] = array[i][j];
            }
            index++;
        }
        array = new_array;
    }

    public void rotate_right_90(){
        int index = 0;
        new_array = new int[width][height];
        for(int i = 0; i < width; i ++)
        {
            int newIndex = 0;
            for(int j = height - 1; j >= 0; j--)
            {
                new_array[index][newIndex] = array[j][i];
                newIndex++;
            }
            index++;
        }
        int temp = height;
        height = width;
        width = temp;
        array = new_array;
    }

    public void save(String fileName){
        PrintWriter writer = null;
        try{
            writer = new PrintWriter(fileName);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        writer.println(magic);
        writer.println(width + " " + height);
        writer.println(depth);
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[0].length; j++)
            {
                writer.print(array[i][j] + " ");
            }
            writer.println("");
        }
        writer.close();
    }
}
