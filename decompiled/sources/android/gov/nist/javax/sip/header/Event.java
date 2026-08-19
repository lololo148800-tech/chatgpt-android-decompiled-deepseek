package android.gov.nist.javax.sip.header;

import android.gov.nist.core.Separators;
import p713e.InterfaceC13246t;

/* JADX INFO: loaded from: classes.dex */
public class Event extends ParametersHeader implements InterfaceC13246t {
    private static final long serialVersionUID = -6458387810431874841L;
    protected String eventType;

    public Event() {
        super(SIPHeaderNames.EVENT);
    }

    public String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }

    public String getEventId() {
        return getParameter(ParameterNames.f31999ID);
    }

    public String getEventType() {
        return this.eventType;
    }

    public boolean match(Event event) {
        String str = event.eventType;
        if (str == null && this.eventType != null) {
            return false;
        }
        if (str != null && this.eventType == null) {
            return false;
        }
        if (this.eventType == null && str == null) {
            return false;
        }
        if (getEventId() == null && event.getEventId() != null) {
            return false;
        }
        if ((getEventId() == null || event.getEventId() != null) && event.eventType.equalsIgnoreCase(this.eventType)) {
            return getEventId() == event.getEventId() || getEventId().equalsIgnoreCase(event.getEventId());
        }
        return false;
    }

    @Override // p713e.InterfaceC13246t
    public void setEventId(String str) {
        if (str == null) {
            throw new NullPointerException(" the eventId parameter is null");
        }
        setParameter(ParameterNames.f31999ID, str);
    }

    @Override // p713e.InterfaceC13246t
    public void setEventType(String str) {
        if (str == null) {
            throw new NullPointerException(" the eventType is null");
        }
        this.eventType = str;
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        String str = this.eventType;
        if (str != null) {
            sb2.append(str);
        }
        if (!this.parameters.isEmpty()) {
            sb2.append(Separators.SEMICOLON);
            this.parameters.encode(sb2);
        }
        return sb2;
    }
}
