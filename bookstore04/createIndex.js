{
    db = db.getSiblingDB( "bookstore" );

    db.books.createIndex( { title: 1 }, { name: "title_index" } );

}
