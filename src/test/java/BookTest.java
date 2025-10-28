
/**
 * This is a test class for the Book class.
 * 
 * To run all the tests in this class, run the following command from the project root:
 * `mvn test -Dtest=BookTest`
 * 
 * To run a single test method, run the following command from the project root:
 * `mvn test -Dtest=BookTest#testMethodName`
 * For example, to run the assertBookExists test, use the following command:
 * `mvn test -Dtest=BookTest#assertBookExists`
 * 
 * --------------------------------------------------------------------------------------
 * 
 * HOW TESTS ARE WRITTEN.
 * 
 * A test class is a class that contains methods that test the functionality of another class.
 * In this case, this class tests the functionality of the Library class.
 * 
 * Each method that tests a specific functionality is annotated with the `@Test` annotation.
 * This annotation tells the test runner that this method is a test case.
 * 
 * Inside each test method, you should:
 * 1. Set up the conditions for the test. This is called the "arrange" phase.
 * 2. Call the method that you want to test. This is called the "act" phase.
 * 3. Verify that the result is what you expect. This is called the "assert" phase.
 * 
 * For example, in the `assertBookExists` test, we want to verify that when a book is added to the library,
 * it can be retrieved.
 * 
 * 1. Arrange: we create a new Library and a new Book.
 * 2. Act: we add the book to the library.
 * 3. Assert: we retrieve the book from the library and verify that it is the same book that we added.
 * 
 * To verify the result, we use assertions. Assertions are methods that check for a specific condition and
 * throw an error if the condition is not met.
 * 
 * For example, `assertEquals(expected, actual)` verifies that the expected value is equal to the actual value.
 * `assertNotNull(object)` verifies that the object is not null.
 * 
 * You can find more assertions in the JUnit documentation: https://junit.org/junit5/docs/current/api/org.junit.jupiter.api/org/junit/jupiter/api/Assertions.html
 */
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class BookTest {

    @Test
    void assertBookCreation() {
        // Arrange: we create a new Book object.
        final String title = "The Lord of the Rings";
        final String author =  "J.R.R. Tolkien";
        final String isbn = "f276d2bb-d9aa-43c0-9fe9-e1ec89a33c39";

        Book book = new Book(title, author, isbn);

        // Act: we don't need to do anything for this test.

        // Assert: we verify that the book object has the correct properties.
        assertNotNull(book);
        assertEquals(title, book.getTitle());
        assertEquals(author, book.getAuthor());
        assertEquals(isbn, book.getIsbn());
    }

    @Test
    void testAddBook() {
        // TODO: This test should verify that a book can be added to the library.
        // 1. Create a new Library object.
        // 2. Create a new Book object.
        // 3. Add the book to the library.
        // 4. Verify that the book is in the library.
    }

    @Test
    void testRemoveBook() {
        // TODO: This test should verify that a book can be removed from the library.
        // 1. Create a new Library object.
        // 2. Create a new Book object and add it to the library.
        // 3. Remove the book from the library using its ISBN.
        // 4. Verify that the book is no longer in the library.
    }

    @Test
    void testListBooks() {
        // TODO: This test should verify that the library can list all its books.
        // 1. Create a new Library object.
        // 2. Create multiple Book objects and add them to the library.
        // 3. Call the listBooks() method.
        // 4. Verify that the returned list contains all the books that were added.
    }

    @Test
    void testGetBookByAuthor() {
        // TODO: This test should verify that the library can retrieve all books by a specific author.
        // 1. Create a new Library object.
        // 2. Create multiple Book objects with different authors and add them to the library.
        // 3. Call the getBook() method with a specific author.
        // 4. Verify that the returned list contains all the books by that author.
    }

    @Test
    void testEbookCreation() {
        // TODO: This test should verify that an Ebook can be created with the correct properties.
        // 1. Create a new Ebook object.
        // 2. Verify that the book object has the correct properties (title, author, isbn, and file size).
    }

    @Test
    void testPaperBookCreation() {
        // TODO: This test should verify that a PaperBook can be created with the correct properties.
        // 1. Create a new PaperBook object.
        // 2. Verify that the book object has the correct properties (title, author, isbn, and weight).
    }
}
