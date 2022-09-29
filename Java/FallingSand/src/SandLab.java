import java.awt.*;
import java.util.*;

public class SandLab
{
  public static void main(String[] args)
  {
    SandLab lab = new SandLab(120, 80);
    lab.run();
  }
  
  //add constants for particle types here
  public static final int EMPTY = 0;
  public static final int METAL = 1;
  public static final int SAND = 2;
  public static final int WATER = 3;

  private Color[] colors = new Color[4];
  //do not add any more fields
  private int[][] grid;
  private SandDisplay display;
  
  public SandLab(int numRows, int numCols)
  {
    String[] names;
    names = new String[4];
    names[EMPTY] = "Empty";
    names[METAL] = "Metal";
    names[SAND] = "Sand";
    names[WATER] = "Water";
    colors[EMPTY] = new Color(0, 0, 0);
    colors[METAL] = new Color(90, 90, 90);
    colors[SAND] = new Color(205, 170, 109);
    colors[WATER] = new Color(0, 0, 255);
    display = new SandDisplay("Falling Sand", numRows, numCols, names);
    grid = new int[numRows][numCols];
  }
  
  //called when the user clicks on a location using the given tool
  private void locationClicked(int row, int col, int tool)
  {
    grid[row][col] = tool;
  }

  //copies each element of grid into the display
  public void updateDisplay()
  {
    for (int i = 0; i< grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        display.setColor(i, j, colors[grid[i][j]]);
      }
    }
  }

  //called repeatedly.
  //causes one random particle to maybe do something.
  public void step()
  {
    int r = (int)(Math.random() * grid.length);
    int c = (int)(Math.random() * grid[0].length);
    if (grid[r][c] == SAND) {
      if (r+1 >= grid.length-1 && grid[r+1][c] == WATER) {
        grid[r][c] = WATER;
        grid[r+1][c] = EMPTY;
      }
      grid[grid[r+1][c]==EMPTY?r+1>=grid.length-1?r:r+1:r][c] = SAND;
    } else if (grid[r][c] == WATER) {
      int d = 1+(int)(Math.random() * 3);
      if ((d==1&&c-1<=0)||(d==2&&r+1>=grid.length-1)||(d==3&&c+1>=grid[0].length)) return;
      int nr = d==2?grid[r+1][c]==EMPTY?r+1:r:r;
      int nc = d==1?grid[r][c-1]==EMPTY?c-1:c:d==3?grid[r][c+1]==EMPTY?c+1:c:c;
      if (c == nc && r == nr) return;
      grid[r][c] = EMPTY;
      grid[nr][nc] = WATER;

    }
  }
  
  //do not modify
  public void run()
  {
    while (true)
    {
      for (int i = 0; i < display.getSpeed(); i++)
        step();
      updateDisplay();
      display.repaint();
      display.pause(1);  //wait for redrawing and for mouse
      int[] mouseLoc = display.getMouseLocation();
      if (mouseLoc != null)  //test if mouse clicked
        locationClicked(mouseLoc[0], mouseLoc[1], display.getTool());
    }
  }
}
