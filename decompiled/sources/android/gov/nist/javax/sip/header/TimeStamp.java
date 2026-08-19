package android.gov.nist.javax.sip.header;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.javax.sip.C10800g;
import p713e.InterfaceC13223c0;

/* JADX INFO: loaded from: classes.dex */
public class TimeStamp extends SIPHeader implements InterfaceC13223c0 {
    private static final long serialVersionUID = -3711322366481232720L;
    protected int delay;
    protected float delayFloat;
    protected long timeStamp;
    private float timeStampFloat;

    public TimeStamp() {
        super(SIPHeaderNames.TIMESTAMP);
        this.timeStamp = -1L;
        this.delayFloat = -1.0f;
        this.timeStampFloat = -1.0f;
        this.delay = -1;
    }

    private String getDelayAsString() {
        int i10 = this.delay;
        if (i10 == -1 && this.delayFloat == -1.0f) {
            return "";
        }
        return i10 != -1 ? Integer.toString(i10) : Float.toString(this.delayFloat);
    }

    private String getTimeStampAsString() {
        long j10 = this.timeStamp;
        if (j10 == -1 && this.timeStampFloat == -1.0f) {
            return "";
        }
        return j10 != -1 ? Long.toString(j10) : Float.toString(this.timeStampFloat);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        String timeStampAsString = getTimeStampAsString();
        String delayAsString = getDelayAsString();
        if (timeStampAsString.equals("") && delayAsString.equals("")) {
            sb2.append("");
            return sb2;
        }
        if (!timeStampAsString.equals("")) {
            sb2.append(timeStampAsString);
        }
        if (!delayAsString.equals("")) {
            sb2.append(Separators.f31991SP);
            sb2.append(delayAsString);
        }
        return sb2;
    }

    public float getDelay() {
        float f10 = this.delayFloat;
        return f10 == -1.0f ? this.delay : f10;
    }

    @Override // p713e.InterfaceC13223c0
    public long getTime() {
        long j10 = this.timeStamp;
        return j10 == -1 ? (long) this.timeStampFloat : j10;
    }

    public int getTimeDelay() {
        int i10 = this.delay;
        return i10 == -1 ? (int) this.delayFloat : i10;
    }

    public float getTimeStamp() {
        float f10 = this.timeStampFloat;
        return f10 == -1.0f ? this.timeStamp : f10;
    }

    public boolean hasDelay() {
        return this.delay != -1;
    }

    public void removeDelay() {
        this.delay = -1;
    }

    public void setDelay(float f10) throws C10800g {
        if (f10 < 0.0f && f10 != -1.0f) {
            throw new C10800g("JAIN-SIP Exception, TimeStamp, setDelay(), the delay parameter is <0");
        }
        this.delayFloat = f10;
        this.delay = -1;
    }

    public void setTime(long j10) throws C10800g {
        if (j10 < -1) {
            throw new C10800g("Illegal timestamp");
        }
        this.timeStamp = j10;
        this.timeStampFloat = -1.0f;
    }

    public void setTimeDelay(int i10) throws C10800g {
        if (i10 < -1) {
            throw new C10800g(AbstractC10763a.m11048f(i10, "Value out of range "));
        }
        this.delay = i10;
        this.delayFloat = -1.0f;
    }

    public void setTimeStamp(float f10) {
        if (f10 < 0.0f) {
            throw new C10800g("JAIN-SIP Exception, TimeStamp, setTimeStamp(), the timeStamp parameter is <0");
        }
        this.timeStamp = -1L;
        this.timeStampFloat = f10;
    }
}
