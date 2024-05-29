{
    db = db.getSiblingDB( "bookstore" );

    db.books.dropIndex( "title_index" );

    db.books.dropIndex( "title_and_isbn_index" );

}
