package tprest
import grails.converters.XML

class ApiController {

    def book() {

        switch (request.getMethod())
        {
            case "POST":
                if (!Library.get(params.library.id)) {
                    render (status: 400, text: "Cannot attach a book to a non existent library (${params.library.id})")
                    return
                }
                def bookInstance = new Book (params)
                if (bookInstance.save(flush:true))
                    response.status = 201
                else
                    response.status = 400
                break;

            case "GET":
                render Book.list() as XML
                break;

            default:
                response.status = 405
                break;
        }
    }
}
