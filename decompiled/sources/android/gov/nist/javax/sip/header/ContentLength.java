package android.gov.nist.javax.sip.header;

import android.javax.sip.C10800g;
import livekit.org.webrtc.WebrtcBuildVersion;
import p713e.InterfaceC13242p;

/* JADX INFO: loaded from: classes.dex */
public class ContentLength extends SIPHeader implements InterfaceC13242p {
    public static final String NAME_LOWER = SIPHeaderNames.CONTENT_LENGTH.toLowerCase();
    private static final long serialVersionUID = 1187190542411037027L;
    protected int contentLength;

    public ContentLength() {
        super(SIPHeaderNames.CONTENT_LENGTH);
        this.contentLength = -1;
    }

    public String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        return (obj instanceof InterfaceC13242p) && getContentLength() == ((InterfaceC13242p) obj).getContentLength();
    }

    @Override // p713e.InterfaceC13242p
    public int getContentLength() {
        return this.contentLength;
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean match(Object obj) {
        return obj instanceof ContentLength;
    }

    public void setContentLength(int i10) throws C10800g {
        if (i10 < 0) {
            throw new C10800g("JAIN-SIP Exception, ContentLength, setContentLength(), the contentLength parameter is <0");
        }
        this.contentLength = i10;
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        int i10 = this.contentLength;
        if (i10 < 0) {
            sb2.append(WebrtcBuildVersion.maint_version);
        } else {
            sb2.append(i10);
        }
        return sb2;
    }

    public ContentLength(int i10) {
        super(SIPHeaderNames.CONTENT_LENGTH);
        this.contentLength = i10;
    }
}
