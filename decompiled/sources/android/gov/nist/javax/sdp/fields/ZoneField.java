package android.gov.nist.javax.sdp.fields;

import android.gov.nist.core.GenericObject;
import android.gov.nist.core.Separators;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.ListIterator;
import p668c.C11547g;
import p668c.InterfaceC11542b;

/* JADX INFO: loaded from: classes.dex */
public class ZoneField extends SDPField implements InterfaceC11542b {
    protected SDPObjectList zoneAdjustments;

    public ZoneField() {
        super(SDPFieldNames.ZONE_FIELD);
        this.zoneAdjustments = new SDPObjectList();
    }

    public void addZoneAdjustment(ZoneAdjustment zoneAdjustment) {
        this.zoneAdjustments.add((SDPObject) zoneAdjustment);
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        ZoneField zoneField = (ZoneField) super.clone();
        SDPObjectList sDPObjectList = this.zoneAdjustments;
        if (sDPObjectList != null) {
            zoneField.zoneAdjustments = (SDPObjectList) sDPObjectList.clone();
        }
        return zoneField;
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        StringBuilder sb2 = new StringBuilder(SDPFieldNames.ZONE_FIELD);
        ListIterator<GenericObject> listIterator = this.zoneAdjustments.listIterator();
        int i10 = 0;
        while (listIterator.hasNext()) {
            ZoneAdjustment zoneAdjustment = (ZoneAdjustment) listIterator.next();
            if (i10 > 0) {
                sb2.append(Separators.f31991SP);
            }
            sb2.append(zoneAdjustment.encode());
            i10++;
        }
        sb2.append(Separators.NEWLINE);
        return sb2.toString();
    }

    public boolean getTypedTime() {
        return false;
    }

    public SDPObjectList getZoneAdjustments() {
        return this.zoneAdjustments;
    }

    public void setTypedTime(boolean z6) {
    }

    public void setZoneAdjustments(Hashtable hashtable) throws C11547g {
        if (hashtable == null) {
            throw new C11547g("The map is null");
        }
        Enumeration enumerationKeys = hashtable.keys();
        while (enumerationKeys.hasMoreElements()) {
            Object objNextElement = enumerationKeys.nextElement();
            if (!(objNextElement instanceof Date)) {
                throw new C11547g("The map is not well-formated ");
            }
            ZoneAdjustment zoneAdjustment = new ZoneAdjustment();
            zoneAdjustment.setTime(((Date) objNextElement).getTime());
            addZoneAdjustment(zoneAdjustment);
        }
    }

    public Hashtable getZoneAdjustments(boolean z6) {
        Hashtable hashtable = new Hashtable();
        SDPObjectList zoneAdjustments = getZoneAdjustments();
        if (zoneAdjustments == null) {
            if (z6) {
                return new Hashtable();
            }
            return null;
        }
        while (true) {
            ZoneAdjustment zoneAdjustment = (ZoneAdjustment) zoneAdjustments.next();
            if (zoneAdjustment == null) {
                return hashtable;
            }
            hashtable.put(new Date(zoneAdjustment.getTime()), Integer.valueOf(Long.valueOf(zoneAdjustment.getTime()).toString()));
        }
    }
}
