package android.gov.nist.javax.sip.header;

import p713e.InterfaceC13201I;

/* JADX INFO: loaded from: classes.dex */
public class Priority extends SIPHeader implements InterfaceC13201I {
    public static final String EMERGENCY = "emergency";
    public static final String NON_URGENT = "non-urgent";
    public static final String NORMAL = "normal";
    public static final String URGENT = "urgent";
    private static final long serialVersionUID = 3837543366074322106L;
    protected String priority;

    public Priority() {
        super(SIPHeaderNames.PRIORITY);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        sb2.append(this.priority);
        return sb2;
    }

    public String getPriority() {
        return this.priority;
    }

    public void setPriority(String str) {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception,Priority, setPriority(), the priority parameter is null");
        }
        this.priority = str;
    }
}
