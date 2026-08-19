package android.gov.nist.javax.sdp.fields;

import android.gov.nist.core.Separators;
import p571X9.AbstractC9306j0;
import p668c.C11547g;
import p668c.InterfaceC11542b;

/* JADX INFO: loaded from: classes.dex */
public class BandwidthField extends SDPField implements InterfaceC11542b {
    protected int bandwidth;
    protected String bwtype;

    public BandwidthField() {
        super(SDPFieldNames.BANDWIDTH_FIELD);
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        String str = this.bwtype;
        String strM9891j = SDPFieldNames.BANDWIDTH_FIELD;
        if (str != null) {
            strM9891j = AbstractC9306j0.m9891j(this.bwtype, ":", new StringBuilder(SDPFieldNames.BANDWIDTH_FIELD));
        }
        return AbstractC10763a.m11056n(AbstractC9306j0.m9893l(strM9891j), this.bandwidth, Separators.NEWLINE);
    }

    public int getBandwidth() {
        return this.bandwidth;
    }

    public String getBwtype() {
        return this.bwtype;
    }

    public String getType() {
        return getBwtype();
    }

    public int getValue() {
        return getBandwidth();
    }

    public void setBandwidth(int i10) {
        this.bandwidth = i10;
    }

    public void setBwtype(String str) {
        this.bwtype = str;
    }

    public void setType(String str) throws C11547g {
        if (str == null) {
            throw new C11547g("The type is null");
        }
        setBwtype(str);
    }

    public void setValue(int i10) {
        setBandwidth(i10);
    }
}
