package ru.job4j.chess;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.KingBlack;
import ru.job4j.chess.firuges.black.KnightBlack;

import java.time.LocalDateTime;

public class LogicTest {
    @Ignore
    @Test(expected = OccupiedCellException.class)
    public void moveOccupied()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException
    {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new KnightBlack(Cell.D2));
        logic.move(Cell.C1,Cell.D2);
    }

    @Test(expected = FigureNotFoundException.class)
    public void moveFigureNotFound()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.H6, Cell.C1);
    }
    @Test(expected = ImpossibleMoveException.class)
    public void testTestMove()
        throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
            Logic logic = new Logic();
            logic.add(new BishopBlack(Cell.C1));
            logic.move(Cell.C1,Cell.C2);
        }



}
