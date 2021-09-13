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
}
