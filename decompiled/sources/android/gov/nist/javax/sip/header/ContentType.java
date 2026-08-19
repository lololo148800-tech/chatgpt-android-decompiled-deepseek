package android.gov.nist.javax.sip.header;

import android.gov.nist.core.Separators;
import p713e.InterfaceC13243q;

/* JADX INFO: loaded from: classes.dex */
public class ContentType extends ParametersHeader implements InterfaceC13243q {
    private static final long serialVersionUID = 8475682204373446610L;
    protected MediaRange mediaRange;

    public ContentType() {
        super(SIPHeaderNames.CONTENT_TYPE);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.core.GenericObject
    public Object clone() {
        ContentType contentType = (ContentType) super.clone();
        MediaRange mediaRange = this.mediaRange;
        if (mediaRange != null) {
            contentType.mediaRange = (MediaRange) mediaRange.clone();
        }
        return contentType;
    }

    public int compareMediaRange(String str) {
        return (this.mediaRange.type + Separators.SLASH + this.mediaRange.subtype).compareToIgnoreCase(str);
    }

    public String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC13243q)) {
            return false;
        }
        InterfaceC13243q interfaceC13243q = (InterfaceC13243q) obj;
        return getContentType().equalsIgnoreCase(interfaceC13243q.getContentType()) && getContentSubType().equalsIgnoreCase(interfaceC13243q.getContentSubType()) && equalParameters(interfaceC13243q);
    }

    public String getCharset() {
        return getParameter("charset");
    }

    @Override // p713e.InterfaceC13195C
    public String getContentSubType() {
        MediaRange mediaRange = this.mediaRange;
        if (mediaRange == null) {
            return null;
        }
        return mediaRange.getSubtype();
    }

    @Override // p713e.InterfaceC13195C
    public String getContentType() {
        MediaRange mediaRange = this.mediaRange;
        if (mediaRange == null) {
            return null;
        }
        return mediaRange.getType();
    }

    public MediaRange getMediaRange() {
        return this.mediaRange;
    }

    public String getMediaSubType() {
        return this.mediaRange.subtype;
    }

    public String getMediaType() {
        return this.mediaRange.type;
    }

    public void setContentSubType(String str) {
        if (str == null) {
            throw new NullPointerException("null arg");
        }
        if (this.mediaRange == null) {
            this.mediaRange = new MediaRange();
        }
        this.mediaRange.setSubtype(str);
    }

    public void setContentType(String str, String str2) {
        if (this.mediaRange == null) {
            this.mediaRange = new MediaRange();
        }
        this.mediaRange.setType(str);
        this.mediaRange.setSubtype(str2);
    }

    public void setMediaRange(MediaRange mediaRange) {
        this.mediaRange = mediaRange;
    }

    public ContentType(String str, String str2) {
        this();
        setContentType(str, str2);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        this.mediaRange.encode(sb2);
        if (hasParameters()) {
            sb2.append(Separators.SEMICOLON);
            this.parameters.encode(sb2);
        }
        return sb2;
    }

    public void setContentType(String str) {
        if (str != null) {
            if (this.mediaRange == null) {
                this.mediaRange = new MediaRange();
            }
            this.mediaRange.setType(str);
            return;
        }
        throw new NullPointerException("null arg");
    }
}
