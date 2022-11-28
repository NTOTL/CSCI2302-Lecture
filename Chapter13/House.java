package Chapter13;

import java.util.Date;

public class House implements Comparable<House>, Cloneable{
    private int id;
    private double area;
    private String builder;
    private String outerWallMaterial;
    private String houseType;
    private boolean hasGarage;
    private Date whenBuilt;    

    public House(int id, double area) {
        this.id = id;
        this.area = area;
        this.whenBuilt = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Date getWhenBuilt() {
        return whenBuilt;
    }

    @Override
    public int compareTo(House o) {
        if (this.area > o.area)
        {
            return 1;
        }
        else if (this.area < o.area)
        {
            return -1;
        }
        return 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try{
            return super.clone();
        }
        catch (CloneNotSupportedException ex)
        {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Area: " + this.getArea() + " Built: " + this.getWhenBuilt();
    }

    public String getBuilder() {
        return builder;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public String getOuterWallMaterial() {
        return outerWallMaterial;
    }

    public void setOuterWallMaterial(String outerWallMaterial) {
        this.outerWallMaterial = outerWallMaterial;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    public House deepCopy(){
        House houseCopy = new House(id, area);
        houseCopy.setBuilder(builder);
        houseCopy.setHasGarage(hasGarage);
        houseCopy.setHouseType(houseType);
        houseCopy.setOuterWallMaterial(outerWallMaterial);

        Date builtDate = new Date();
        houseCopy.getWhenBuilt().setTime(builtDate.getTime());
        return houseCopy;
    }
       
}
