package helloworld

class ItemController {
    static responseFormats = ['json', 'html']

    def itemService

    def showList() { 
       def items = itemService.getAll()
       respond items
    }

    def search(String query) { 
        def response = itemService.findByQuery(query)
        respond response
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
