package android.gov.nist.javax.sdp.fields;

import android.gov.nist.core.Separators;
import p571X9.AbstractC9306j0;

/* JADX INFO: loaded from: classes.dex */
public class ZoneAdjustment extends SDPObject {
    protected TypedTime offset;
    protected String sign;
    protected long time;

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        ZoneAdjustment zoneAdjustment = (ZoneAdjustment) super.clone();
        TypedTime typedTime = this.offset;
        if (typedTime != null) {
            zoneAdjustment.offset = (TypedTime) typedTime.clone();
        }
        return zoneAdjustment;
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        String strM11052j = AbstractC10763a.m11052j(Long.toString(this.time), Separators.f31991SP);
        if (this.sign != null) {
            StringBuilder sbM9893l = AbstractC9306j0.m9893l(strM11052j);
            sbM9893l.append(this.sign);
            strM11052j = sbM9893l.toString();
        }
        StringBuilder sbM9893l2 = AbstractC9306j0.m9893l(strM11052j);
        sbM9893l2.append(this.offset.encode());
        return sbM9893l2.toString();
    }

    public TypedTime getOffset() {
        return this.offset;
    }

    public long getTime() {
        return this.time;
    }

    public void setOffset(TypedTime typedTime) {
        this.offset = typedTime;
    }

    public void setSign(String str) {
        this.sign = str;
    }

    public void setTime(long j10) {
        this.time = j10;
    }
}
