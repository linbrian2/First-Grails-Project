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
}
