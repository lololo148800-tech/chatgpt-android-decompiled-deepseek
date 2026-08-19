package android.gov.nist.javax.sdp.fields;

import android.gov.nist.core.Separators;
import p668c.C11547g;
import p668c.InterfaceC11554n;

/* JADX INFO: loaded from: classes.dex */
public class ProtoVersionField extends SDPField implements InterfaceC11554n {
    protected int protoVersion;

    public ProtoVersionField() {
        super(SDPFieldNames.PROTO_VERSION_FIELD);
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        return AbstractC10763a.m11056n(new StringBuilder(SDPFieldNames.PROTO_VERSION_FIELD), this.protoVersion, Separators.NEWLINE);
    }

    public int getProtoVersion() {
        return this.protoVersion;
    }

    public int getVersion() {
        return getProtoVersion();
    }

    public void setProtoVersion(int i10) {
        this.protoVersion = i10;
    }

    public void setVersion(int i10) throws C11547g {
        if (i10 < 0) {
            throw new C11547g("The value is <0");
        }
        setProtoVersion(i10);
    }
}
