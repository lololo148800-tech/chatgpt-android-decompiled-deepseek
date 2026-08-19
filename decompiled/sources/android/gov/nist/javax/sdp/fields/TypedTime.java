package android.gov.nist.javax.sdp.fields;

import p571X9.AbstractC9306j0;

/* JADX INFO: loaded from: classes.dex */
public class TypedTime extends SDPObject {
    int time;
    String unit;

    @Override // android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        String str = "" + Integer.toString(this.time);
        if (this.unit == null) {
            return str;
        }
        StringBuilder sbM9893l = AbstractC9306j0.m9893l(str);
        sbM9893l.append(this.unit);
        return sbM9893l.toString();
    }

    public int getTime() {
        return this.time;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setTime(int i10) {
        this.time = i10;
    }

    public void setUnit(String str) {
        this.unit = str;
    }
}
