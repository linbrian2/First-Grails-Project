package first.grails.project

import grails.gorm.transactions.Transactional

@Transactional
class CountyService {
    
    def populateList = [new County(name: "Montgomery", population: 1100000, rural: false, suburban: true, urban: true),
                    new County(name: "Prince George's", population: 860000, rural: false, suburban: true, urban: true),
                    new County(name: "Garrett", population: 30000, rural: true, suburban: false, urban: false),
                    new County(name: "Frederick", population: 240000, rural: false, suburban: true, urban: false),
                    new County(name: "Howard", population: 288000, rural: false, suburban: true, urban: true),
                    new County(name: "Baltimore", population: 830000, rural: false, suburban: false, urban: true),
    ]
    
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
    def populate() {
        for (def county: populateList) {
            county.save()
        }
    }
}
