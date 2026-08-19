package android.gov.nist.javax.sdp.fields;

import android.gov.nist.core.GenericObject;
import android.gov.nist.core.Separators;
import java.util.LinkedList;
import java.util.ListIterator;
import p315Me.Myis.CxcULo;
import p668c.C11547g;
import p668c.InterfaceC11542b;

/* JADX INFO: loaded from: classes.dex */
public class RepeatField extends SDPField implements InterfaceC11542b {
    private static final long serialVersionUID = -6415338212212641819L;
    protected TypedTime activeDuration;
    protected SDPObjectList offsets;
    protected TypedTime repeatInterval;

    public RepeatField() {
        super(SDPFieldNames.REPEAT_FIELD);
        this.offsets = new SDPObjectList();
    }

    public void addOffset(TypedTime typedTime) {
        this.offsets.add((SDPObject) typedTime);
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        RepeatField repeatField = (RepeatField) super.clone();
        TypedTime typedTime = this.repeatInterval;
        if (typedTime != null) {
            repeatField.repeatInterval = (TypedTime) typedTime.clone();
        }
        TypedTime typedTime2 = this.activeDuration;
        if (typedTime2 != null) {
            repeatField.activeDuration = (TypedTime) typedTime2.clone();
        }
        SDPObjectList sDPObjectList = this.offsets;
        if (sDPObjectList != null) {
            repeatField.offsets = (SDPObjectList) sDPObjectList.clone();
        }
        return repeatField;
    }

    public int getActiveDuration() {
        TypedTime typedTime = this.activeDuration;
        if (typedTime == null) {
            return -1;
        }
        return typedTime.getTime();
    }

    public int[] getOffsetArray() {
        LinkedList offsets = getOffsets();
        int[] iArr = new int[offsets.size()];
        for (int i10 = 0; i10 < offsets.size(); i10++) {
            iArr[i10] = ((TypedTime) offsets.get(i10)).getTime();
        }
        return iArr;
    }

    public LinkedList getOffsets() {
        return this.offsets;
    }

    public int getRepeatInterval() {
        TypedTime typedTime = this.repeatInterval;
        if (typedTime == null) {
            return -1;
        }
        return typedTime.getTime();
    }

    public boolean getTypedTime() {
        return true;
    }

    public void setActiveDuration(TypedTime typedTime) {
        this.activeDuration = typedTime;
    }

    public void setOffsetArray(int[] iArr) {
        for (int i10 : iArr) {
            TypedTime typedTime = new TypedTime();
            typedTime.setTime(i10);
            addOffset(typedTime);
        }
    }

    public void setRepeatInterval(TypedTime typedTime) {
        this.repeatInterval = typedTime;
    }

    public void setTypedTime(boolean z6) {
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        StringBuilder sb2 = new StringBuilder(SDPFieldNames.REPEAT_FIELD);
        sb2.append(this.repeatInterval.encode());
        String str = CxcULo.GxBpAby;
        sb2.append(str);
        sb2.append(this.activeDuration.encode());
        ListIterator<GenericObject> listIterator = this.offsets.listIterator();
        while (listIterator.hasNext()) {
            TypedTime typedTime = (TypedTime) listIterator.next();
            sb2.append(str);
            sb2.append(typedTime.encode());
        }
        sb2.append(Separators.NEWLINE);
        return sb2.toString();
    }

    public void setActiveDuration(int i10) throws C11547g {
        if (i10 < 0) {
            throw new C11547g("The active Duration is <0");
        }
        if (this.activeDuration == null) {
            this.activeDuration = new TypedTime();
        }
        this.activeDuration.setTime(i10);
    }

    public void setRepeatInterval(int i10) throws C11547g {
        if (i10 < 0) {
            throw new C11547g("The repeat interval is <0");
        }
        if (this.repeatInterval == null) {
            this.repeatInterval = new TypedTime();
        }
        this.repeatInterval.setTime(i10);
    }
}
