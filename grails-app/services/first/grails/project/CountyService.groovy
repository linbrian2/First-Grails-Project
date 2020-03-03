package first.grails.project

import grails.gorm.transactions.Transactional

@Transactional
class CountyService {
    def get(id) {
        County.get(id)
    }
    def list() {
        County.list()
    }
    def save(county) {
        county.save()
    }
    def delete(id) {
        County.get(id).delete()
    }
}
