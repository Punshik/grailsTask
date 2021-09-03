package helloworld

import grails.gorm.transactions.Transactional

@Transactional
class ItemService {
    def bindingMap = [ id: 1, name: 'Hello', cost: '123', description: 'djsaiodas']

    def getAll() {
        def item = new Item(bindingMap)
        item.save()
        return item
    }
}
