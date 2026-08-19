package p702da;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import p1022t9.InterfaceC19827l;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;
import p647ak.C10707i0;

/* JADX INFO: renamed from: da.b */
/* JADX INFO: loaded from: classes.dex */
public final class C13050b extends AbstractC20851a implements InterfaceC19827l {
    public static final Parcelable.Creator<C13050b> CREATOR = new C10707i0(26);

    /* JADX INFO: renamed from: Y */
    public final int f41475Y;

    /* JADX INFO: renamed from: Z */
    public final int f41476Z;

    /* JADX INFO: renamed from: o0 */
    public final Intent f41477o0;

    public C13050b(int i10, int i11, Intent intent) {
        this.f41475Y = i10;
        this.f41476Z = i11;
        this.f41477o0 = intent;
    }

    @Override // p1022t9.InterfaceC19827l
    /* JADX INFO: renamed from: a */
    public final Status mo12680a() {
        return this.f41476Z == 0 ? Status.f36047q0 : Status.f36051u0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 1, 4);
        parcel.writeInt(this.f41475Y);
        AbstractC8199t5.m8813l(parcel, 2, 4);
        parcel.writeInt(this.f41476Z);
        AbstractC8199t5.m8806e(parcel, 3, this.f41477o0, i10);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
