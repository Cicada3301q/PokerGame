import java.io.Serializable;
import java.util.ArrayList;

class SaveSlot implements Serializable
{
    private static final long serialVersionUID = 4L;
    private ArrayList<Player> playerList = new ArrayList<Player>();
    private ArrayList<Card> tableCards = new ArrayList<Card>();
    private int pot = 0;
    private Deck deck = new Deck();
    private int round = 0;
    private int amountToCall = 0;
    private Player currentPlayer;
    private Player nextPlayer;
    private Player lastPlayerToRaise;
    private Player leftOfDealer;

    public SaveSlot (ArrayList<Player> playerList, ArrayList<Card> tableCards, int pot, Deck deck, int round, int amountToCall, Player currentPlayer, Player nextPlayer, Player lastPlayerToRaise, Player leftOfDealer)
    {
        super();
        this.playerList = playerList;
        this.tableCards = tableCards;
        this.pot = pot;
        this.deck = deck;
        this.round = round;
        this.amountToCall = amountToCall;
        this.currentPlayer = currentPlayer;
        this.nextPlayer = nextPlayer;
        this.lastPlayerToRaise = lastPlayerToRaise;
        this.leftOfDealer = leftOfDealer;
    }

    public ArrayList<Player> getPlayerList()
    {
        return this.playerList;
    }
    public ArrayList<Card> getTableCards()
    {
        return this.tableCards;
    }
    public int getPot()
    {
        return this.pot;
    }
    public Deck getDeck()
    {
        return this.deck;
    }
    public int getRound()
    {
        return this.round;
    }
    public int getAmountToCall()
    {
        return this.amountToCall;
    }
    public Player getCurrentPlayer()
    {
        return this.currentPlayer;
    }
    public Player getNextPlayer()
    {
        return this.nextPlayer;
    }
    public Player getLastPlayerToRaise()
    {
        return this.lastPlayerToRaise;
    }
    public Player getLeftOfDealer()
    {
        return this.leftOfDealer;
    }
}
