package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class AviaSoulsTest {

    @Test
    public void addAllTickets() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("Мск", "Питер", 350, 14, 18);
        Ticket ticket2 = new Ticket("Мск", "Ростов", 335, 11, 12);
        Ticket ticket3 = new Ticket("Ростов", "Питер", 264, 0, 6);
        Ticket ticket4 = new Ticket("Воронеж", "Питер", 773, 8, 12);
        Ticket ticket5 = new Ticket("Мск", "Воронеж", 883, 3, 8);
        Ticket ticket6 = new Ticket("Воронеж", "Ростов", 188, 5, 7);
        Ticket ticket7 = new Ticket("Тверь", "Питер", 456, 10, 14);
        Ticket ticket8 = new Ticket("Мск", "Тверь", 338, 15, 16);

        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        aviaSouls.add(ticket7);
        aviaSouls.add(ticket8);

        Ticket[] expected = {ticket1, ticket2, ticket3, ticket4, ticket5, ticket6, ticket7, ticket8};
        Ticket[] actual = aviaSouls.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void sortByPriceTickets() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("Мск", "Питер", 350, 14, 18);
        Ticket ticket2 = new Ticket("Мск", "Ростов", 335, 11, 12);
        Ticket ticket3 = new Ticket("Мск", "Питер", 264, 0, 6);
        Ticket ticket4 = new Ticket("Мск", "Питер", 773, 8, 12);
        Ticket ticket5 = new Ticket("Мск", "Воронеж", 883, 3, 8);
        Ticket ticket6 = new Ticket("Мск", "Ростов", 188, 5, 7);
        Ticket ticket7 = new Ticket("Мск", "Питер", 456, 10, 14);
        Ticket ticket8 = new Ticket("Мск", "Питер", 338, 15, 16);

        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        aviaSouls.add(ticket7);
        aviaSouls.add(ticket8);


        Ticket[] expected = {ticket3, ticket8, ticket1, ticket7, ticket4};
        Ticket[] actual = aviaSouls.search("Мск", "Питер");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void sortByPriceOneTickets() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("Мск", "Питер", 350, 14, 18);
        Ticket ticket2 = new Ticket("Мск", "Ростов", 335, 11, 12);
        Ticket ticket3 = new Ticket("Мск", "Питер", 264, 0, 6);
        Ticket ticket4 = new Ticket("Мск", "Питер", 773, 8, 12);
        Ticket ticket5 = new Ticket("Мск", "Воронеж", 883, 3, 8);
        Ticket ticket6 = new Ticket("Мск", "Ростов", 188, 5, 7);
        Ticket ticket7 = new Ticket("Мск", "Питер", 456, 10, 14);
        Ticket ticket8 = new Ticket("Мск", "Питер", 338, 15, 16);

        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        aviaSouls.add(ticket7);
        aviaSouls.add(ticket8);


        Ticket[] expected = {ticket5};
        Ticket[] actual = aviaSouls.search("Мск", "Воронеж");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void sortByPriceNullTickets() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("Мск", "Питер", 350, 14, 18);
        Ticket ticket2 = new Ticket("Мск", "Ростов", 335, 11, 12);
        Ticket ticket3 = new Ticket("Мск", "Питер", 264, 0, 6);
        Ticket ticket4 = new Ticket("Мск", "Питер", 773, 8, 12);
        Ticket ticket5 = new Ticket("Мск", "Воронеж", 883, 3, 8);
        Ticket ticket6 = new Ticket("Мск", "Ростов", 188, 5, 7);
        Ticket ticket7 = new Ticket("Мск", "Питер", 456, 10, 14);
        Ticket ticket8 = new Ticket("Мск", "Питер", 338, 15, 16);

        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        aviaSouls.add(ticket7);
        aviaSouls.add(ticket8);


        Ticket[] expected = {};
        Ticket[] actual = aviaSouls.search("Мск", "Брянск");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void sortByTimeTicket() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("Мск", "Питер", 350, 14, 16); //2
        Ticket ticket2 = new Ticket("Мск", "Ростов", 335, 11, 12);
        Ticket ticket3 = new Ticket("Мск", "Питер", 264, 10, 14);  //4
        Ticket ticket4 = new Ticket("Мск", "Питер", 773, 8, 11);  //3
        Ticket ticket5 = new Ticket("Мск", "Воронеж", 883, 3, 8);
        Ticket ticket6 = new Ticket("Мск", "Ростов", 188, 10, 14);
        Ticket ticket7 = new Ticket("Мск", "Питер", 456, 10, 15);  //5
        Ticket ticket8 = new Ticket("Мск", "Питер", 338, 15, 16); //1

        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        aviaSouls.add(ticket7);
        aviaSouls.add(ticket8);
        Comparator<Ticket> comparator = new TicketTimeComparator();


        Ticket[] expected = {ticket8, ticket1, ticket4, ticket3, ticket7};
        Ticket[] actual = aviaSouls.searchAndSortBy("Мск", "Питер", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void sortByTimeSoloTicket() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("Мск", "Питер", 350, 14, 16); //2
        Ticket ticket2 = new Ticket("Мск", "Ростов", 335, 11, 12);
        Ticket ticket3 = new Ticket("Мск", "Питер", 264, 10, 14);  //4
        Ticket ticket4 = new Ticket("Мск", "Питер", 773, 8, 11);  //3
        Ticket ticket5 = new Ticket("Мск", "Воронеж", 883, 3, 8);
        Ticket ticket6 = new Ticket("Мск", "Ростов", 188, 10, 14);
        Ticket ticket7 = new Ticket("Мск", "Питер", 456, 10, 15);  //5
        Ticket ticket8 = new Ticket("Мск", "Питер", 338, 15, 16); //1

        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        aviaSouls.add(ticket7);
        aviaSouls.add(ticket8);
        Comparator<Ticket> comparator = new TicketTimeComparator();


        Ticket[] expected = {ticket5};
        Ticket[] actual = aviaSouls.searchAndSortBy("Мск", "Воронеж", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void sortByTimeNullTicket() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("Мск", "Питер", 350, 14, 16); //2
        Ticket ticket2 = new Ticket("Мск", "Ростов", 335, 11, 12);
        Ticket ticket3 = new Ticket("Мск", "Питер", 264, 10, 14);  //4
        Ticket ticket4 = new Ticket("Мск", "Питер", 773, 8, 11);  //3
        Ticket ticket5 = new Ticket("Мск", "Воронеж", 883, 3, 8);
        Ticket ticket6 = new Ticket("Мск", "Ростов", 188, 10, 14);
        Ticket ticket7 = new Ticket("Мск", "Питер", 456, 10, 15);  //5
        Ticket ticket8 = new Ticket("Мск", "Питер", 338, 15, 16); //1

        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        aviaSouls.add(ticket7);
        aviaSouls.add(ticket8);
        Comparator<Ticket> comparator = new TicketTimeComparator();


        Ticket[] expected = {};
        Ticket[] actual = aviaSouls.searchAndSortBy("Мск", "Брянск", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }

}