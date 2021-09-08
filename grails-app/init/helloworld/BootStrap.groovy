package helloworld

class BootStrap {

    def init = { servletContext ->
        Item item = new Item(name: "Hello", cost: 222, description: "hi world")
        item.save()
    }
    def destroy = {
    }
}
