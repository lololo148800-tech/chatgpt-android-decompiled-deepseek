package p960q9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;
import p718e4.C13280a;

/* JADX INFO: renamed from: q9.a */
/* JADX INFO: loaded from: classes.dex */
public final class C18647a extends AbstractC20851a {
    public static final Parcelable.Creator<C18647a> CREATOR = new C13280a(29);

    /* JADX INFO: renamed from: Y */
    public final int f59387Y;

    /* JADX INFO: renamed from: Z */
    public final int f59388Z;

    /* JADX INFO: renamed from: o0 */
    public final Bundle f59389o0;

    public C18647a(int i10, int i11, Bundle bundle) {
        this.f59387Y = i10;
        this.f59388Z = i11;
        this.f59389o0 = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 1, 4);
        parcel.writeInt(this.f59387Y);
        AbstractC8199t5.m8813l(parcel, 2, 4);
        parcel.writeInt(this.f59388Z);
        AbstractC8199t5.m8803b(parcel, 3, this.f59389o0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
