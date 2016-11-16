package tprest

class UrlMappings {

    static mappings = {
        "/books" (resources: 'book')
        "/libraries" (resources: 'library')
                {
                    "/books" (resourses: 'book')
                }

        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
