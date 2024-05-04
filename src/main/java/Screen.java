public class Screen {
    private int width;
    private int height;

    public Screen() {
        this.width = 640;
        this.height = 480;
    }

    public Screen(int screenWidth, int screenHeight) {
        this.width = screenWidth;
        this.height = screenHeight;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
