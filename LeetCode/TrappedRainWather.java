public class TrappedRainWathe {

  // TRAPPING RAIN WATHER
  public static int trappedRainWather(int[] height) {
    // CALCULATE LEFT MAX BOUNDARY
    int[] leftMax = new int[height.length];
    leftMax[0] = height[0];
    for (int i = 1; i < height.length; i++) {
      leftMax[i] = Math.max(height[i], leftMax[i - 1]);
    }

    // CALCULATE RIGHT MAX BOUNDARY
    int[] rightMax = new int[height.length];
    rightMax[height.length - 1] = height[height.length - 1];
    for (int i = height.length - 2; i >= 0; i--) {
      rightMax[i] = Math.max(rightMax[i + 1], height[i]);
    }

    int trappedWather = 0;

    // LOOP
    for (int i = 0; i < height.length; i++) {
      // watherLevel = main(leftMax bound, rightMax bound)
      int watherLevel = Math.min(leftMax[i], rightMax[i]);
      // trappedWather = watherLevel - height[i]
      trappedWather += watherLevel - height[i];
    }

    return trappedWather;
  }

  public static void main(String[] args) {
    int height[] = { 4, 2, 0, 6, 3, 2, 5 };
    System.out.println(trappedRainWather(height));
  }
}