{
    db = db.getSiblingDB( "bookstore" );

    db.books.dropIndex( "title_index" );

}
