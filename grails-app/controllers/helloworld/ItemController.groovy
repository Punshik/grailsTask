package helloworld

class ItemController {
    static responseFormats = ['json', 'html']

    def itemService

    def showList() { 
        def itemsFromDB = itemService.getAllItems()
        respond itemsFromDB
    }

    def search(String query) { 
        def nameMatches = itemService.findByQuery(query)
        respond nameMatches
    }

    def searchById() { 
        def matchById = itemService.findById(Long.parseLong(params.id,10))
        if(!matchById){
            response.status = 404
        }
        else{
            respond matchById
        }
    }

    def removeItem(Long id) {
        itemService.removeItem(id)
        render 'deleted'
    }

    def manageItem() {
        if(params.id){
            itemService.editItem(Long.parseLong(params.id), params.name ,Float.parseFloat(params.cost), params.description)
        }
        else {
            itemService.setItem(params.name, Float.parseFloat(params.cost), params.description)
        }
    }
}
