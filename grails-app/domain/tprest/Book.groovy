package tprest

class Book {

    String name
    String author
    String realeaseDate
    String isbn

    static belongsTo = [library:Library]

    static constraints = {
        name blank:false
        realeaseDate nullable:false
        isbn null:false
        author blank:false
    }

}
