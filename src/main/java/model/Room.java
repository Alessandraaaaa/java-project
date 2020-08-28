package model;

public class Room {
    //pere4esljaem opcii
    private double height;
    private double width;
    private double lenght;
    private boolean isLightOn;

    //osnovnoj funkcional alt+ins geter and seter ,dlja togo 4tobi potom polu4atj zna4enija


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public boolean isLightOn() {
        return isLightOn;
    }

    public void setLightOn(boolean lightOn) {
        isLightOn = lightOn;
    }
}
