package com.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HashMapExercisesTest {

    @Test
    void testAddStudent() {
        HashMapExercises ex = new HashMapExercises();
        ex.addStudent(1, "Zizipo");
        assertEquals("Zizipo", ex.findStudent(1));
    }

    @Test
    void testRemoveStudent() {
        HashMapExercises ex = new HashMapExercises();
        ex.addStudent(2, "Alice");
        ex.removeStudent(2);
        assertNull(ex.findStudent(2));
    }

    @Test
    void testFindStudent() {
        HashMapExercises ex = new HashMapExercises();
        ex.addStudent(3, "Bob");
        assertEquals("Bob", ex.findStudent(3));
    }

    @Test
    void testPrintAllStudents() {
        HashMapExercises ex = new HashMapExercises();
        ex.addStudent(4, "Charlie");
        ex.addStudent(5, "Dana");
        // TODO: verify output manually when running main
        ex.printAllStudents();
    }
}
