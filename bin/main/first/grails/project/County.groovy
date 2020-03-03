package first.grails.project

class County {
    String name
    int population
    int size
    boolean rural
    boolean suburban
    boolean urban

    static constraints = {
        name()
        population()
        size()
        rural()
        suburban()
        urban()
    }
}
