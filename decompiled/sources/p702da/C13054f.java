package p702da;

import android.os.Parcel;
import android.os.Parcelable;
import p1060v9.C20497o;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;
import p647ak.C10707i0;

/* JADX INFO: renamed from: da.f */
/* JADX INFO: loaded from: classes.dex */
public final class C13054f extends AbstractC20851a {
    public static final Parcelable.Creator<C13054f> CREATOR = new C10707i0(28);

    /* JADX INFO: renamed from: Y */
    public final int f41480Y;

    /* JADX INFO: renamed from: Z */
    public final C20497o f41481Z;

    public C13054f(int i10, C20497o c20497o) {
        this.f41480Y = i10;
        this.f41481Z = c20497o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 1, 4);
        parcel.writeInt(this.f41480Y);
        AbstractC8199t5.m8806e(parcel, 2, this.f41481Z, i10);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
