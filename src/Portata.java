public class Portata {

    public String name;
    public boolean isHot;
    public double priceEuros;

    public Portata(String name, boolean isHot, double priceEuros){
        this.name = name;
        this.isHot = isHot;
        this.priceEuros = priceEuros;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriceEuros() {
        return priceEuros;
    }

    public void setPriceEuros(double priceEuros) {
        this.priceEuros = priceEuros;
    }

    public boolean isHot() {
        return isHot;
    }

    public void setHot(boolean hot) {
        isHot = hot;
    }

    //TODO da sistamare e sistemare a giro secondo i principi solid
    public void printPortataDetail(){
        System.out.println(name  + priceEuros);

    }

}
