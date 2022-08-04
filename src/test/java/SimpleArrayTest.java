import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class SimpleArrayTest {

    @org.junit.jupiter.api.Test
    void add() {
        Simple<String> strings = new SimpleArray<>();
        strings.add("One");
        strings.add("Two");
        strings.add("Three");
        assertEquals("One", strings.get(0));
    }

    @org.junit.jupiter.api.Test
    void delete() {
        Simple<String> strings = new SimpleArray<>();
        strings.add("One");
        strings.add("Two");
        strings.add("Three");
        strings.delete(1);
        assertEquals(2,strings.size());
    }

    @org.junit.jupiter.api.Test
    void get() {
        Simple<String> strings = new SimpleArray<>();
        strings.add("One");
        strings.add("Two");
        strings.add("Three");
        assertEquals("Three", strings.get(2));
    }

    @org.junit.jupiter.api.Test
    void size() {
        Simple<String> strings = new SimpleArray<>();
        strings.add("One");
        strings.add("Two");
        strings.add("Three");
        assertEquals(3,strings.size());
    }

    @org.junit.jupiter.api.Test
    void update() {
        Simple<String> strings = new SimpleArray<>();
        strings.add("One");
        strings.add("Two");
        strings.add("Three");
        strings.update(1,"Four");
        assertEquals("Four",strings.get(1));
    }
}