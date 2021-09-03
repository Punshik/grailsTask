package helloworld

class UrlMappings {

    static mappings = {
        
        group "/item", {
            "/list"(controller: "item", action: "showList")
            "/search"(controller: "item", action: "search")
            "/view/$id"(controller: "item", action: "showId")
        }


        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
