package com.softgroup.messenger.api.message;

import com.softgroup.common.protocol.RequestData;

import java.util.List;

/**
 * Created by nikmlk on 24.02.17.
 */
public class CreateConversationRequest implements RequestData {
    private static final long serialVersionUID = -9179734652273263170L;

    private Integer type;
    private List<Integer> members_ids;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public List<Integer> getMembers_ids() {
        return members_ids;
    }

    public void setMembers_ids(List<Integer> members_ids) {
        this.members_ids = members_ids;
    }
}
