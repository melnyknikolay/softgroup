package com.softgroup.profile.api.message;

import com.softgroup.common.protocol.RequestData;
import com.softgroup.profile.api.dto.Contact;

import java.util.List;

/**
 * Created by nikmlk on 24.02.17.
 */
public class ContactsSyncRequest implements RequestData {
    private static final long serialVersionUID = 563692140750183986L;

    private List<Contact> added_contacts;
    private List<Contact> removed_contacts;

    public List<Contact> getAdded_contacts() {
        return added_contacts;
    }

    public void setAdded_contacts(List<Contact> added_contacts) {
        this.added_contacts = added_contacts;
    }

    public List<Contact> getRemoved_contacts() {
        return removed_contacts;
    }

    public void setRemoved_contacts(List<Contact> removed_contacts) {
        this.removed_contacts = removed_contacts;
    }
}
