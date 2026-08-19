package p702da;

import android.os.Parcel;
import android.os.Parcelable;
import p1009s9.C19499b;
import p1060v9.C20498p;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;
import p647ak.C10707i0;

/* JADX INFO: renamed from: da.g */
/* JADX INFO: loaded from: classes.dex */
public final class C13055g extends AbstractC20851a {
    public static final Parcelable.Creator<C13055g> CREATOR = new C10707i0(29);

    /* JADX INFO: renamed from: Y */
    public final int f41482Y;

    /* JADX INFO: renamed from: Z */
    public final C19499b f41483Z;

    /* JADX INFO: renamed from: o0 */
    public final C20498p f41484o0;

    public C13055g(int i10, C19499b c19499b, C20498p c20498p) {
        this.f41482Y = i10;
        this.f41483Z = c19499b;
        this.f41484o0 = c20498p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 1, 4);
        parcel.writeInt(this.f41482Y);
        AbstractC8199t5.m8806e(parcel, 2, this.f41483Z, i10);
        AbstractC8199t5.m8806e(parcel, 3, this.f41484o0, i10);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
