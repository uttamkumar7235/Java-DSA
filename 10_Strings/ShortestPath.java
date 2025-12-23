public class ShortestPath {

    public static float getshortestPath(String path) {
        
        int x=0, y=0;
        
        for (int i=0; i<path.length(); i++) {
            char dir = path.charAt(i);
            // East
            if (dir == 'E') {
                x++;
            }
            // West
            else if (dir == 'W') {
                x--;
            }
            // North
            else if (dir == 'N') {
                y++;
            }
            // South
            else {
                y--;
            }
        }
        int X2 = x*x;   // X2 = (x-x1)^2
        int Y2 = y*y;   // Y2 = (y-y1)^2
        return (float)Math.sqrt(X2 + Y2);
    }

    public static void main(String[] args) {

        String path = "WNEENESENNN";
        System.out.println(getshortestPath(path));
    }
}
