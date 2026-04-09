package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ListManagerTest {

    @Test
    void testAddElement() {
        List<Integer> list = new ArrayList<>();
        ListManager manager = new ListManager();

        manager.addElement(list, 10);
        manager.addElement(list, 20);

        assertTrue(list.contains(10));
        assertTrue(list.contains(20));
        assertEquals(2, manager.getSize(list));
    }

    @Test
    void testRemoveElement() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        ListManager manager = new ListManager();
        manager.removeElement(list, 10);

        assertFalse(list.contains(10));
        assertEquals(1, manager.getSize(list));
    }

    @Test
    void testGetSize() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(15);
        list.add(25);

        ListManager manager = new ListManager();

        assertEquals(3, manager.getSize(list));
    }
}
