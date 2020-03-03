package first.grails.project

class County {
    String name
    int population
    boolean rural
    boolean suburban
    boolean urban

    static constraints = {
        name()
        population()
        rural()
        suburban()
        urban()
    }

    public County (String name, int population, boolean rural, boolean suburban, boolean urban) {
        this.name = name
        this.population = population
        this.rural = rural
        this.suburban = suburban
        this.urban = urban
    }

}
