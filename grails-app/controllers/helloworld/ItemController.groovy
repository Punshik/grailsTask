package helloworld

class ItemController {
    static responseFormats = ['json', 'html']
    def itemService    

    def showList() { 
       def items = itemService.getAll()
       respond items.properties
    }

    def search() { 
        respond([id : params.id, name : params.name])
    }

    def showId() { 
        render params.id
    }
}
