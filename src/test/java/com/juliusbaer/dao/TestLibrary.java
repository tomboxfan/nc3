package com.juliusbaer.dao;

import com.juliusbaer.nc3.model.Party;

public class TestLibrary {

    public static final Party p1 = createParty("SGP001", "Tom", "F", "Fan", "范汉生", "Individual", "Here I am!", "Action Taken!", "NEW");

    private static Party createParty(String partyNumber, String firstName, String middleName, String lastName, String chineseName, String entity, String partyRemarks, String actTakenRemarks, String status) {
        Party party = new Party();
        party.setPartyNumber(partyNumber);
        party.setFirstName(firstName);
        party.setMiddleName(middleName);
        party.setLastName(lastName);
        party.setChineseName(chineseName);
        party.setEntity(entity);
        party.setPartyRemarks(partyRemarks);
        party.setActTakenRemarks(actTakenRemarks);
        party.setStatus(status);
        return party;
    }
}
