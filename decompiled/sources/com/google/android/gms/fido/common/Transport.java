package com.google.android.gms.fido.common;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p125Ej.C2566j;
import p212I9.C3653a;
import p449S9.C7082m0;

/* JADX INFO: loaded from: classes.dex */
public enum Transport implements ReflectedParcelable {
    /* JADX INFO: Fake field, exist only in values array */
    BLUETOOTH_CLASSIC("bt"),
    /* JADX INFO: Fake field, exist only in values array */
    BLUETOOTH_LOW_ENERGY("ble"),
    /* JADX INFO: Fake field, exist only in values array */
    NFC("nfc"),
    /* JADX INFO: Fake field, exist only in values array */
    USB("usb"),
    /* JADX INFO: Fake field, exist only in values array */
    INTERNAL("internal"),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID("cable"),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID_V2("hybrid");

    public static final Parcelable.Creator<Transport> CREATOR = new C2566j(9);

    /* JADX INFO: renamed from: Y */
    public final String f36092Y;

    Transport(String str) {
        this.f36092Y = str;
    }

    /* JADX INFO: renamed from: a */
    public static Transport m13211a(String str) throws C3653a {
        if (str.equals("hybrid")) {
            C7082m0.f22563a.mo3914a();
            throw null;
        }
        for (Transport transport : values()) {
            if (str.equals(transport.f36092Y)) {
                return transport;
            }
        }
        throw new C3653a(AbstractC10763a.m11054l("Transport ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f36092Y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f36092Y);
    }
}
