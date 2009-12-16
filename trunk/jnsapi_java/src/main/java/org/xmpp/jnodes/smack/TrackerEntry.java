package org.xmpp.jnodes.smack;

public class TrackerEntry {

    public enum Type {
        relay, tracker
    }

    public enum Policy {
        _public, _roster, _domain;

        public String toString() {
            return this.name().substring(1);
        }
    }

    private Type type;
    private Policy policy;
    private boolean verified = false;
    private JingleChannelIQ.Protocol protocol = JingleChannelIQ.Protocol.udp;
    private String jid;

    public TrackerEntry(final Type type, final Policy policy, final String jid, final JingleChannelIQ.Protocol protocol) {
        this.type = type;
        this.policy = policy;
        this.jid = jid;
        this.protocol = protocol;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getJid() {
        return jid;
    }

    public void setJid(String jid) {
        this.jid = jid;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public Policy getPolicy() {
        return policy;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    public JingleChannelIQ.Protocol getProtocol() {
        return protocol;
    }

    public void setProtocol(JingleChannelIQ.Protocol protocol) {
        this.protocol = protocol;
    }
}
