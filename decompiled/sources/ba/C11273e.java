package ba;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import p1022t9.InterfaceC19827l;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;
import p647ak.C10707i0;

/* JADX INFO: renamed from: ba.e */
/* JADX INFO: loaded from: classes.dex */
public final class C11273e extends AbstractC20851a implements InterfaceC19827l {
    public static final Parcelable.Creator<C11273e> CREATOR = new C10707i0(6);

    /* JADX INFO: renamed from: Y */
    public final Status f34147Y;

    /* JADX INFO: renamed from: Z */
    public final C11274f f34148Z;

    public C11273e(Status status, C11274f c11274f) {
        this.f34147Y = status;
        this.f34148Z = c11274f;
    }

    @Override // p1022t9.InterfaceC19827l
    /* JADX INFO: renamed from: a */
    public final Status mo12680a() {
        return this.f34147Y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8806e(parcel, 1, this.f34147Y, i10);
        AbstractC8199t5.m8806e(parcel, 2, this.f34148Z, i10);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
