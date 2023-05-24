package test;

import model.ExceptionCNPNull;
import model.ExceptionNenascut;
import model.IPersoana;
import model.Persoana;
import org.junit.jupiter.api.Assertions;

import java.time.Duration;

import static org.junit.Assert.*;

class PersoanaTest {

    @org.junit.jupiter.api.Test
    void getVarstaTestRight() {
        IPersoana persoana = new Persoana("Andrei", "1970828284487");
        assertEquals(25, persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void getVarstaTestBoundaryNouNascut() {
        IPersoana persoana = new Persoana("Andrei", "5230524123456");
        assertEquals(0, persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void getVarstaTestsBoundaryLimInferioara() {
        IPersoana persoana = new Persoana("Andrei", "5000101123456");
        assertEquals(23, persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void getVarstaTestsBoundaryLimSuerioara() {
        IPersoana persoana = new Persoana("Andrei", "2991231123456");
        assertEquals(23, persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void getVarstaTestError() {
        IPersoana persoana = new Persoana("Andrei", "5232508123456");
        assertThrows(ExceptionNenascut.class, () -> {
            persoana.getVarsta();
        });
    }


    @org.junit.jupiter.api.Test
    void getVarstaTestTime() {
        IPersoana persoana = new Persoana("Andrei", "5230304123456");
        Assertions.assertTimeout(Duration.ofMillis(100), () -> persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void cnpTestConformance() {
        Persoana persoana = new Persoana("Andrei", "5230304123456");
        assertEquals(13, persoana.CNP.length());
    }

    @org.junit.jupiter.api.Test
    void ordineVarstaTestOrder() {
        IPersoana persoana = new Persoana("Andrei", "2230302123456");
        IPersoana persoana1 = new Persoana("Andreea", "2250304123456");
        assertTrue(persoana1.getVarsta() < persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void cnpInexistent() {
        IPersoana persoana = new Persoana("Maria", null);
        assertThrows(ExceptionCNPNull.class, () -> persoana.getVarsta());
    }
}