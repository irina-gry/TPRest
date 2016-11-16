import tprest.Library
import tprest.Book

class BootStrap {

    def init = { servletContext ->
        new Library(name:"My Library", address: "1, Street, City", yearCreated: 2004)
                .addToBooks(new Book(name: "My first book", author: "Serge Miranda", realeaseDate:"01.09.2009", isbn:"17JF898KD"))
                .addToBooks(new Book(name: "My second book", author: "Gabriel Mopolo", realeaseDate:"02.09.2010", isbn:"89IK8HY65"))
                .addToBooks(new Book(name: "My third book", author: "Harris Dahon", realeaseDate:"03.09.2011", isbn:"45YU7I8IK")).save(flush: true, failonError: true)
    }
    def destroy = {
    }
}
