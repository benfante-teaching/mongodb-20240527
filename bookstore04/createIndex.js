{
    db = db.getSiblingDB( "bookstore" );

    db.books.createIndex( { title: 1 }, { name: "title_index" } );

    db.books.createIndex( { title: 1, isbn: 1 }, { name: "title_and_isbn_index" } );

}
