package android.gov.nist.javax.sdp.fields;

import android.gov.nist.core.Separators;
import java.util.Date;
import p668c.C11547g;
import p668c.InterfaceC11552l;

/* JADX INFO: loaded from: classes.dex */
public class TimeField extends SDPField implements InterfaceC11552l {
    protected long startTime;
    protected long stopTime;

    public TimeField() {
        super(SDPFieldNames.TIME_FIELD);
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        StringBuilder sb2 = new StringBuilder(SDPFieldNames.TIME_FIELD);
        sb2.append(this.startTime);
        sb2.append(Separators.f31991SP);
        return AbstractC10763a.m11050h(this.stopTime, Separators.NEWLINE, sb2);
    }

    public Date getStart() {
        return new Date((this.startTime - 2208988800L) * 1000);
    }

    public long getStartTime() {
        return this.startTime;
    }

    public Date getStop() {
        return new Date((this.stopTime - 2208988800L) * 1000);
    }

    public long getStopTime() {
        return this.stopTime;
    }

    public boolean getTypedTime() {
        return false;
    }

    public boolean isZero() {
        return getStartTime() == 0 && getStopTime() == 0;
    }

    public void setStart(Date date) throws C11547g {
        if (date == null) {
            throw new C11547g("The date is null");
        }
        this.startTime = (date.getTime() / 1000) + 2208988800L;
    }

    public void setStartTime(long j10) {
        this.startTime = j10;
    }

    public void setStop(Date date) throws C11547g {
        if (date == null) {
            throw new C11547g("The date is null");
        }
        this.stopTime = (date.getTime() / 1000) + 2208988800L;
    }

    public void setStopTime(long j10) {
        this.stopTime = j10;
    }

    public void setTypedTime(boolean z6) {
    }

    public void setZero() {
        setStopTime(0L);
        setStartTime(0L);
    }
}
