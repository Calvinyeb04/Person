public class Product
{
    private String Name;
    private String description ;
    private String ID;
    Double Cost;

    public Product(String name, String description, String ID, Double cost) {
        Name = name;
        this.description = description;
        this.ID = ID;
        Cost = cost;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Double getCost() {
        return Cost;
    }

    public void setCost(Double cost) {
        Cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Name='" + Name + '\'' +
                ", description='" + description + '\'' +
                ", ID='" + ID + '\'' +
                ", Cost=" + Cost +
                '}';
    }


    ///Geting FullNAme////

    public String GetFullName()
    {
        return Name;
    }

    ///Getting ID///

    public String GetID(){return ID; }

    ///Getting Cost///
    public Double GetCost(){ return Cost; }
}