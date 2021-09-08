package helloworld

import grails.gorm.transactions.Transactional
import javax.annotation.PostConstruct

@Transactional
class ItemService {

    // Item item = new Item

    // @PostConstruct
    // def init(){
        
    //         long idValue = 1 + (long) (Math.random()*1000);
    //         String nameValue = 1 + (String) (Math.random()*100000);
    //         float costValue = 1 + (float) (Math.random()*100000);
    //         String descriptionValue = 1 + (String) (Math.random()*1000);
    //         item = new Item(idValue,nameValue,costValue,descriptionValue);
    //         item.save()
    // }

    // def getAll() {
    //     return item
    // }

    // def findByQuery(String query) {
    //     ArrayList<Item> resultList = new ArrayList<>();
    //     for(int i : 0..9) {
    //         if(item[i].name == query){
    //             resultList.add(item[i])
    //         }
    //     }
    //     return resultList
    // }

    // def findById(long id) {
    //     for(int i = 0 ; i < item.length; i++){
    //         if(item[i].id == id){
    //             return item[i]
    //         }
    //     }
    //     return null
    // }
}

