package battleship;

public class Barge extends Ship
{
    private static final Integer SIZE = 1;
    private static final String NAME = "Barca";

    /**
     * @param bearing - barge bearing fhgfjfg
     * @param pos     - upper left position of the barge
     */
    public Barge(Compass bearing, IPosition pos)
    {
	super(Barge.NAME, bearing, pos);
	getPositions().add(new Position(pos.getRow(), pos.getColumn())
    }

    public Integer getSize()
    {
	return SIZE;
    }

}
