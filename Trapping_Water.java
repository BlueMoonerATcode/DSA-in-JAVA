import java.util.*;

public class Trapping_Water {

    public static int tp_water(int height[]) {

        // left Max Boundary:Array
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }

        // Right Max Boundary:Array
        int rightmax[] = new int[height.length];
        rightmax[height.length - 1] = height[height.length - 1]; 
        for (int i = height.length - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }

        int trapped_water = 0;
        // Loop
        for (int i = 0; i < height.length; i++) {
            int water_level = Math.min(leftmax[i], rightmax[i]); // Water level = Min(Lm and Rm)
            trapped_water += water_level - height[i]; // Trapped Water = Water Level - Height[i]
        }
        return trapped_water;

    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(tp_water(height));

    }
}
