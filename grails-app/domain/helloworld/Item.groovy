package helloworld

// import grails.persistence.*
import java.util.UUID

// @Entity
class Item {
    long id
    String name
    float cost
    String description

    static constraints = {}

    static mapping = {
        version false
    }
}
