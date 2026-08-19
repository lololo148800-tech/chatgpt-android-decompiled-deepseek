package p1060v9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import p1009s9.C19499b;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;
import p960q9.C18658l;

/* JADX INFO: renamed from: v9.p */
/* JADX INFO: loaded from: classes.dex */
public final class C20498p extends AbstractC20851a {
    public static final Parcelable.Creator<C20498p> CREATOR = new C18658l(24);

    /* JADX INFO: renamed from: Y */
    public final int f65087Y;

    /* JADX INFO: renamed from: Z */
    public final IBinder f65088Z;

    /* JADX INFO: renamed from: o0 */
    public final C19499b f65089o0;

    /* JADX INFO: renamed from: p0 */
    public final boolean f65090p0;

    /* JADX INFO: renamed from: q0 */
    public final boolean f65091q0;

    public C20498p(int i10, IBinder iBinder, C19499b c19499b, boolean z6, boolean z10) {
        this.f65087Y = i10;
        this.f65088Z = iBinder;
        this.f65089o0 = c19499b;
        this.f65090p0 = z6;
        this.f65091q0 = z10;
    }

    public final boolean equals(Object obj) {
        Object c20482e;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20498p)) {
            return false;
        }
        C20498p c20498p = (C20498p) obj;
        if (this.f65089o0.equals(c20498p.f65089o0)) {
            Object c20482e2 = null;
            IBinder iBinder = this.f65088Z;
            if (iBinder == null) {
                c20482e = null;
            } else {
                int i10 = AbstractBinderC20483a.f65028b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                c20482e = iInterfaceQueryLocalInterface instanceof InterfaceC20488f ? (InterfaceC20488f) iInterfaceQueryLocalInterface : new C20482E(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
            }
            IBinder iBinder2 = c20498p.f65088Z;
            if (iBinder2 != null) {
                int i11 = AbstractBinderC20483a.f65028b;
                IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                c20482e2 = iInterfaceQueryLocalInterface2 instanceof InterfaceC20488f ? (InterfaceC20488f) iInterfaceQueryLocalInterface2 : new C20482E(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 2);
            }
            if (AbstractC20502t.m21161l(c20482e, c20482e2)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 1, 4);
        parcel.writeInt(this.f65087Y);
        AbstractC8199t5.m8805d(parcel, 2, this.f65088Z);
        AbstractC8199t5.m8806e(parcel, 3, this.f65089o0, i10);
        AbstractC8199t5.m8813l(parcel, 4, 4);
        parcel.writeInt(this.f65090p0 ? 1 : 0);
        AbstractC8199t5.m8813l(parcel, 5, 4);
        parcel.writeInt(this.f65091q0 ? 1 : 0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
