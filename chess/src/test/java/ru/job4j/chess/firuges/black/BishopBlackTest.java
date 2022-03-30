package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void testPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.F8);
        Cell expected = bishopBlack.position();
        assertThat(expected, is(Cell.F8));
    }

    @Test
    public void testCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.F8);
        Figure sample = bishopBlack.copy(Cell.F8);
        assertThat(bishopBlack.position(), is(sample.position()));
    }

    @Test
    public void way() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] steps = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(steps, is(bishopBlack.way(Cell.G5)));
    }

    @Test
    public void bishopBlackIsDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        bishopBlack.way(Cell.G4);
    }
}