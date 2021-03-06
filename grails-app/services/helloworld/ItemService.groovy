package helloworld

import grails.gorm.transactions.Transactional
import javax.annotation.PostConstruct

@Transactional
class ItemService {

    def setItem(String nameValue, Float costValue, String descriptionValue) {
        def item = new Item(name: nameValue,cost: costValue,description: descriptionValue)
        item.save()
    }

    def checkItemIsEmpty() {
        def rowsAmount = Item.count()
        if(rowsAmount == 0){
            return true
        }
        return false
    }

    def getAllItems() {
        return Item.findAll()
    }

    def findByQuery(String query) {
        return Item.findAllByName(query)
    }

    def findById(Long id) {
        return Item.findById(id)
    }

    def removeItem(Long id) {
        def removingItem = Item.get(id)
        removingItem.delete()
    }

    def editItem(Long id, String nameValue, Float costValue, String descriptionValue){
        def editingItem = Item.get(id)
        editingItem.name = nameValue
        editingItem.cost = costValue
        editingItem.description = descriptionValue
        editingItem.save()
    }
}

