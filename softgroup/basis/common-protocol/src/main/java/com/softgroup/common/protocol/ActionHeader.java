package com.softgroup.common.protocol;

import java.io.Serializable;
import java.util.UUID;

public class ActionHeader implements Serializable {
    private static final long serialVersionUID = -6161658016500127613L;

    private String uuid;
    private String originUuid;
    private String command;
    private String type;
    private String version;

    public ActionHeader() {
        uuid = UUID.randomUUID().toString();
    }

    private ActionHeader(String originUuid, String command, String type, String version) {
        this.originUuid = originUuid;
        this.command = command;
        this.type = type;
        this.version = version;
    }

    public static class Builder{

        private String originUuid;
        private String command;
        private String type;
        private String version;

        public Builder() {
        }
        public Builder(ActionHeader header) {
            this.originUuid = header.getUuid();
            this.command = header.getCommand();
            this.type = header.getType();
            this.version = header.getVersion();
        }


        public Builder setOriginUuid(String originUuid) {
            this.originUuid = originUuid;
            return this;
        }

        public Builder setCommand(String command) {
            this.command = command;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setVersion(String version) {
            this.version = version;
            return this;
        }

        public ActionHeader build() {
            return new ActionHeader(originUuid, command, type, version);
        }
    }

    public String getUuid() {
        return uuid;
    }

    public String getOriginUuid() {
        return originUuid;
    }

    public String getCommand() {
        return command;
    }

    public String getType() {
        return type;
    }

    public String getVersion() {
        return version;
    }


}
