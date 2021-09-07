package helloworld

class Item {
    long id
    String name
    float cost
    String description

    public Item(long id, String name, float cost, String description){
        this.id = id
        this.name = name
        this.cost = cost
        this.description = description
    }

    static constraints = {}
}
