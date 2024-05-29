{
db = db.getSiblingDB( "bookstore" );

db.books.deleteMany({})
db.authors.deleteMany({})

let Author = function(firstName, lastName) {
  this._id = new ObjectId();
  this.firstName = firstName;
  this.lastName = lastName;
}

let authors = db.authors.insertMany([
    new Author('J. K.', 'Rowling'),
    new Author('Ken', 'Arnold'),
    new Author('James', 'Gosling'),
    new Author('David', 'Holmes'),
    new Author('Eric', 'Gamma'),
    new Author('Richard', 'Helm'),
    new Author('Ralph', 'Johnson'),
    new Author('John', 'Vlissides')
])

console.log(authors)

const alphabet = "abcdefghijklmnopqrstuvwxyz"

for(let z=0; z < 100; z++) {
  let currBooks = []
  for(let i=0; i < 1000; i++) {
    let randomAuthors = [];
    for(let j=0; j < Math.floor(Math.random() * 3) + 1 ; j++) {
      randomAuthors.push(authors.insertedIds[Math.floor(Math.random() * authors.insertedIds.length)])
    }

    const randomCharacter = alphabet[Math.floor(Math.random() * alphabet.length)]
    const randomTitle = randomCharacter + 'Book ' + (i * (z + 1))

    currBooks.push({
      title: randomTitle,
      isbn: z.toString().padStart(3, '0') + '-978-8831-'+ ((i+1) * (z + 1)),
      pages: Math.floor(Math.random() * 1000),
      year: Math.floor(Math.random() * 124) + 1900,
      price: Math.random() * 100,
      authors: randomAuthors,
      publisher: { name: 'Salani' },
      categories: [ 'LITERATURE_AND_FICTION' ]
    });

  }

  let result = db.books.insertMany(currBooks);

  console.log(`Inserted ${result.insertedIds.length} in group ${z}`)
}

}