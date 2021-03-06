package first.grails.project

class CountyController {
    def countyService;

    def index() {
        respond countyService.list()
    }
    def show(Long id) {
        respond countyService.get(id)
    }
    def create() {
        respond new County(params)
    }
    def save(County county) {
        countyService.save(county)
        redirect action:"index", method:"GET"
    }
    def edit(Long id) {
        respond County.get(id)
    }
    def update(County county) {
        countyService.save(county)
        redirect action:"index", method:"GET"
    }
    def delete(Long id) {
        countyService.delete(id)
        redirect action:"index", method:"GET"
    }
    def populate() {
        countyService.populate()
        redirect action:"index", method:"GET"
    }
}