package p594Y9;

import android.os.Parcel;
import android.os.Parcelable;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;

/* JADX INFO: renamed from: Y9.X4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9835X4 extends AbstractC20851a {
    public static final Parcelable.Creator<C9835X4> CREATOR = new C9864c1(8);

    /* JADX INFO: renamed from: Y */
    public final String f29336Y;

    public C9835X4(String str) {
        this.f29336Y = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8807f(parcel, 2, this.f29336Y);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
