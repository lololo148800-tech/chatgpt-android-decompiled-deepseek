package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import p333N9.AbstractC5680a;
import p826j6.BinderC16133B;
import p826j6.BinderC16134C;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.b */
/* JADX INFO: loaded from: classes.dex */
public final class C11935b extends AbstractC5680a implements InterfaceC11943d {
    /* JADX INFO: renamed from: A */
    public final Bundle m13401A(int i10, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel parcelM6119p = m6119p();
        parcelM6119p.writeInt(i10);
        parcelM6119p.writeString(str);
        parcelM6119p.writeString(str2);
        int i11 = AbstractC11947e.f36252a;
        parcelM6119p.writeInt(1);
        bundle.writeToParcel(parcelM6119p, 0);
        parcelM6119p.writeInt(1);
        bundle2.writeToParcel(parcelM6119p, 0);
        Parcel parcelM6120q = m6120q(parcelM6119p, 901);
        Bundle bundle3 = (Bundle) AbstractC11947e.m13413a(parcelM6120q, Bundle.CREATOR);
        parcelM6120q.recycle();
        return bundle3;
    }

    /* JADX INFO: renamed from: B */
    public final void m13402B(String str, Bundle bundle, BinderC16133B binderC16133B) {
        Parcel parcelM6119p = m6119p();
        parcelM6119p.writeInt(18);
        parcelM6119p.writeString(str);
        int i10 = AbstractC11947e.f36252a;
        parcelM6119p.writeInt(1);
        bundle.writeToParcel(parcelM6119p, 0);
        parcelM6119p.writeStrongBinder(binderC16133B);
        m6121r(parcelM6119p, 1301);
    }

    /* JADX INFO: renamed from: C */
    public final void m13403C(String str, Bundle bundle, BinderC16134C binderC16134C) {
        Parcel parcelM6119p = m6119p();
        parcelM6119p.writeInt(12);
        parcelM6119p.writeString(str);
        int i10 = AbstractC11947e.f36252a;
        parcelM6119p.writeInt(1);
        bundle.writeToParcel(parcelM6119p, 0);
        parcelM6119p.writeStrongBinder(binderC16134C);
        m6121r(parcelM6119p, 1201);
    }

    /* JADX INFO: renamed from: s */
    public final int m13404s(int i10, String str, String str2, Bundle bundle) {
        Parcel parcelM6119p = m6119p();
        parcelM6119p.writeInt(i10);
        parcelM6119p.writeString(str);
        parcelM6119p.writeString(str2);
        int i11 = AbstractC11947e.f36252a;
        parcelM6119p.writeInt(1);
        bundle.writeToParcel(parcelM6119p, 0);
        Parcel parcelM6120q = m6120q(parcelM6119p, 10);
        int i12 = parcelM6120q.readInt();
        parcelM6120q.recycle();
        return i12;
    }

    /* JADX INFO: renamed from: t */
    public final Bundle m13405t(String str, String str2, Bundle bundle) {
        Parcel parcelM6119p = m6119p();
        parcelM6119p.writeInt(9);
        parcelM6119p.writeString(str);
        parcelM6119p.writeString(str2);
        int i10 = AbstractC11947e.f36252a;
        parcelM6119p.writeInt(1);
        bundle.writeToParcel(parcelM6119p, 0);
        Parcel parcelM6120q = m6120q(parcelM6119p, 902);
        Bundle bundle2 = (Bundle) AbstractC11947e.m13413a(parcelM6120q, Bundle.CREATOR);
        parcelM6120q.recycle();
        return bundle2;
    }

    /* JADX INFO: renamed from: u */
    public final Bundle m13406u(String str, String str2, Bundle bundle) {
        Parcel parcelM6119p = m6119p();
        parcelM6119p.writeInt(9);
        parcelM6119p.writeString(str);
        parcelM6119p.writeString(str2);
        int i10 = AbstractC11947e.f36252a;
        parcelM6119p.writeInt(1);
        bundle.writeToParcel(parcelM6119p, 0);
        Parcel parcelM6120q = m6120q(parcelM6119p, 12);
        Bundle bundle2 = (Bundle) AbstractC11947e.m13413a(parcelM6120q, Bundle.CREATOR);
        parcelM6120q.recycle();
        return bundle2;
    }

    /* JADX INFO: renamed from: v */
    public final Bundle m13407v(String str, String str2, String str3) {
        Parcel parcelM6119p = m6119p();
        parcelM6119p.writeInt(3);
        parcelM6119p.writeString(str);
        parcelM6119p.writeString(str2);
        parcelM6119p.writeString(str3);
        parcelM6119p.writeString(null);
        Parcel parcelM6120q = m6120q(parcelM6119p, 3);
        Bundle bundle = (Bundle) AbstractC11947e.m13413a(parcelM6120q, Bundle.CREATOR);
        parcelM6120q.recycle();
        return bundle;
    }

    /* JADX INFO: renamed from: w */
    public final Bundle m13408w(int i10, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelM6119p = m6119p();
        parcelM6119p.writeInt(i10);
        parcelM6119p.writeString(str);
        parcelM6119p.writeString(str2);
        parcelM6119p.writeString(str3);
        parcelM6119p.writeString(null);
        int i11 = AbstractC11947e.f36252a;
        parcelM6119p.writeInt(1);
        bundle.writeToParcel(parcelM6119p, 0);
        Parcel parcelM6120q = m6120q(parcelM6119p, 8);
        Bundle bundle2 = (Bundle) AbstractC11947e.m13413a(parcelM6120q, Bundle.CREATOR);
        parcelM6120q.recycle();
        return bundle2;
    }

    /* JADX INFO: renamed from: x */
    public final Bundle m13409x(String str, String str2, String str3, Bundle bundle) {
        Parcel parcelM6119p = m6119p();
        parcelM6119p.writeInt(6);
        parcelM6119p.writeString(str);
        parcelM6119p.writeString(str2);
        parcelM6119p.writeString(str3);
        int i10 = AbstractC11947e.f36252a;
        parcelM6119p.writeInt(1);
        bundle.writeToParcel(parcelM6119p, 0);
        Parcel parcelM6120q = m6120q(parcelM6119p, 9);
        Bundle bundle2 = (Bundle) AbstractC11947e.m13413a(parcelM6120q, Bundle.CREATOR);
        parcelM6120q.recycle();
        return bundle2;
    }

    /* JADX INFO: renamed from: y */
    public final Bundle m13410y(String str, String str2, String str3) {
        Parcel parcelM6119p = m6119p();
        parcelM6119p.writeInt(3);
        parcelM6119p.writeString(str);
        parcelM6119p.writeString(str2);
        parcelM6119p.writeString(str3);
        Parcel parcelM6120q = m6120q(parcelM6119p, 4);
        Bundle bundle = (Bundle) AbstractC11947e.m13413a(parcelM6120q, Bundle.CREATOR);
        parcelM6120q.recycle();
        return bundle;
    }

    /* JADX INFO: renamed from: z */
    public final Bundle m13411z(int i10, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelM6119p = m6119p();
        parcelM6119p.writeInt(i10);
        parcelM6119p.writeString(str);
        parcelM6119p.writeString(str2);
        parcelM6119p.writeString(str3);
        int i11 = AbstractC11947e.f36252a;
        parcelM6119p.writeInt(1);
        bundle.writeToParcel(parcelM6119p, 0);
        Parcel parcelM6120q = m6120q(parcelM6119p, 11);
        Bundle bundle2 = (Bundle) AbstractC11947e.m13413a(parcelM6120q, Bundle.CREATOR);
        parcelM6120q.recycle();
        return bundle2;
    }
}
