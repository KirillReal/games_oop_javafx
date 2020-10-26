package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import junit.framework.TestCase;
import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.Logic;
import ru.job4j.chess.OccupiedCellException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;


public class BishopBlackTest extends TestCase {

    public void testPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        assertThat(bishopBlack.position(), equalTo(Cell.findBy(2, 0)));
    }

    public void testWay() throws ImpossibleMoveException {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] expected = {Cell.D2,Cell.E3,Cell.F4,Cell.G5};
        assertThat(bishopBlack.way(Cell.G5),is(expected));
    }

    public void testIsDiagonal() throws ImpossibleMoveException {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] expected = {Cell.B2, Cell.A3};
        assertThat(bishopBlack.way(Cell.A3), is(expected));
    }

    public void testCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C7);
        assertThat(bishopBlack.copy(Cell.C7).position(), equalTo(Cell.C7));
    }
}