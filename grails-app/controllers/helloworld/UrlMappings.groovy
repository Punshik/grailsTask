package helloworld

class UrlMappings {

    static mappings = {
        
        group "/item", {
            "/list"(controller: "item", action: "showList")
            "/search"(controller: "item", action: "search")
            "/view/$id"(controller: "item", action: "searchById")
            "/remove"(controller: "item", action: "removeItem")
            "/manage"(controller: "item", action: "manageItem")
        }


        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
