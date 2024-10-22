package rest.model;

import java.util.List;

public class ElectionParty {
    private String partyID;
    private int amountVotes;

    private ElectionPerson electionperson;


    public ElectionParty(String partyID, int amountVotes, ElectionPerson electionperson) {
        this.partyID = partyID;
        this.amountVotes = amountVotes;
        this.electionperson = electionperson;
    }

    public String getPartyID() {
        return partyID;
    }

    public void setPartyID(String partyID) {
        this.partyID = partyID;
    }

    public int getAmountVotes() {
        return amountVotes;
    }

    public void setAmountVotes(int amountVotes) {
        this.amountVotes = amountVotes;
    }

    public ElectionPerson getElectionperson() {
        return electionperson;
    }

    public void setElectionperson(ElectionPerson electionperson) {
        this.electionperson = electionperson;
    }

    /**
     * Methods
     */
    @Override
    public String toString() {
        String info = String.format("Election Info: PartyID = %s, amountVotes = %s", partyID, amountVotes );
        return info;
    }
}
