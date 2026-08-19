package com.google.android.gms.internal.play_billing;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11947e {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f36252a = 0;

    static {
        AbstractC11947e.class.getClassLoader();
    }

    /* JADX INFO: renamed from: a */
    public static Parcelable m13413a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: b */
    public static void m13414b(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(AbstractC10763a.m11048f(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }
}
