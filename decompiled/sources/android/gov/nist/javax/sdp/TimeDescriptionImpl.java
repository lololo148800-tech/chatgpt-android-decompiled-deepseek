package android.gov.nist.javax.sdp;

import android.gov.nist.javax.sdp.fields.RepeatField;
import android.gov.nist.javax.sdp.fields.TimeField;
import java.io.Serializable;
import java.util.Vector;
import p571X9.AbstractC9306j0;
import p668c.C11547g;
import p668c.InterfaceC11552l;

/* JADX INFO: loaded from: classes.dex */
public class TimeDescriptionImpl implements Serializable, Cloneable {
    private Vector repeatList;
    private TimeField timeImpl;

    public TimeDescriptionImpl() {
        this.timeImpl = new TimeField();
        this.repeatList = new Vector();
    }

    public void addRepeatField(RepeatField repeatField) {
        if (repeatField == null) {
            throw new NullPointerException("null repeatField");
        }
        this.repeatList.add(repeatField);
    }

    public Vector getRepeatTimes(boolean z6) {
        return this.repeatList;
    }

    public InterfaceC11552l getTime() {
        return this.timeImpl;
    }

    public void setRepeatTimes(Vector vector) {
        this.repeatList = vector;
    }

    public void setTime(InterfaceC11552l interfaceC11552l) throws C11547g {
        if (interfaceC11552l == null) {
            throw new C11547g("The parameter is null");
        }
        if (!(interfaceC11552l instanceof TimeField)) {
            throw new C11547g("The parameter is not an instance of TimeField");
        }
        this.timeImpl = (TimeField) interfaceC11552l;
    }

    public String toString() {
        String strEncode = this.timeImpl.encode();
        for (int i10 = 0; i10 < this.repeatList.size(); i10++) {
            RepeatField repeatField = (RepeatField) this.repeatList.elementAt(i10);
            StringBuilder sbM9893l = AbstractC9306j0.m9893l(strEncode);
            sbM9893l.append(repeatField.encode());
            strEncode = sbM9893l.toString();
        }
        return strEncode;
    }

    public TimeDescriptionImpl(TimeField timeField) {
        this.timeImpl = timeField;
        this.repeatList = new Vector();
    }
}
