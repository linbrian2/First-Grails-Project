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
    def edit() {
        render "TO BE IMPLEMENTED :)"
    }
    def delete(Long id) {
        countyService.delete(id)
        redirect action:"index", method:"GET"
    }
}