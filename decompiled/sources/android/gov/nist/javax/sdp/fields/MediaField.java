package android.gov.nist.javax.sdp.fields;

import android.gov.nist.core.Separators;
import java.util.Vector;
import p571X9.AbstractC9306j0;
import p668c.C11547g;
import p668c.InterfaceC11545e;

/* JADX INFO: loaded from: classes.dex */
public class MediaField extends SDPField implements InterfaceC11545e {
    protected Vector formats;
    protected String media;
    protected int nports;
    protected int port;
    protected String proto;

    public MediaField() {
        super(SDPFieldNames.MEDIA_FIELD);
        this.formats = new Vector();
    }

    private String encodeFormats() {
        StringBuilder sb2 = new StringBuilder(this.formats.size() * 3);
        for (int i10 = 0; i10 < this.formats.size(); i10++) {
            sb2.append(this.formats.elementAt(i10));
            if (i10 < this.formats.size() - 1) {
                sb2.append(Separators.f31991SP);
            }
        }
        return sb2.toString();
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        MediaField mediaField = (MediaField) super.clone();
        Vector vector = this.formats;
        if (vector != null) {
            mediaField.formats = (Vector) vector.clone();
        }
        return mediaField;
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        String str = this.media;
        String string = SDPFieldNames.MEDIA_FIELD;
        if (str != null) {
            string = SDPFieldNames.MEDIA_FIELD + this.media.toLowerCase() + Separators.f31991SP + this.port;
        }
        if (this.nports > 1) {
            StringBuilder sbM9895n = AbstractC9306j0.m9895n(string, Separators.SLASH);
            sbM9895n.append(this.nports);
            string = sbM9895n.toString();
        }
        if (this.proto != null) {
            StringBuilder sbM9895n2 = AbstractC9306j0.m9895n(string, Separators.f31991SP);
            sbM9895n2.append(this.proto);
            string = sbM9895n2.toString();
        }
        if (this.formats != null) {
            StringBuilder sbM9895n3 = AbstractC9306j0.m9895n(string, Separators.f31991SP);
            sbM9895n3.append(encodeFormats());
            string = sbM9895n3.toString();
        }
        return AbstractC10763a.m11052j(string, Separators.NEWLINE);
    }

    public Vector getFormats() {
        return this.formats;
    }

    public String getMedia() {
        return this.media;
    }

    public Vector getMediaFormats(boolean z6) {
        if (z6 || this.formats.size() != 0) {
            return this.formats;
        }
        return null;
    }

    public int getMediaPort() {
        return getPort();
    }

    @Override // p668c.InterfaceC11545e
    public String getMediaType() {
        return getMedia();
    }

    public int getNports() {
        return this.nports;
    }

    public int getPort() {
        return this.port;
    }

    public int getPortCount() {
        return getNports();
    }

    public String getProto() {
        return this.proto;
    }

    public String getProtocol() {
        return getProto();
    }

    public void setFormats(Vector vector) {
        this.formats = vector;
    }

    public void setMedia(String str) {
        this.media = str;
    }

    public void setMediaFormats(Vector vector) throws C11547g {
        if (vector == null) {
            throw new C11547g("The mediaFormats is null");
        }
        this.formats = vector;
    }

    public void setMediaPort(int i10) throws C11547g {
        if (i10 < 0) {
            throw new C11547g("The port is < 0");
        }
        setPort(i10);
    }

    public void setMediaType(String str) throws C11547g {
        if (str == null) {
            throw new C11547g("The mediaType is null");
        }
        setMedia(str);
    }

    public void setNports(int i10) {
        this.nports = i10;
    }

    public void setPort(int i10) {
        this.port = i10;
    }

    public void setPortCount(int i10) throws C11547g {
        if (i10 < 0) {
            throw new C11547g("The port count is < 0");
        }
        setNports(i10);
    }

    public void setProto(String str) {
        this.proto = str;
    }

    public void setProtocol(String str) throws C11547g {
        if (str == null) {
            throw new C11547g("The protocol is null");
        }
        setProto(str);
    }
}
