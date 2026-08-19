package p571X9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;

/* JADX INFO: renamed from: X9.Q4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9197Q4 extends AbstractC20851a {
    public static final Parcelable.Creator<C9197Q4> CREATOR = new C9270d0(4);

    /* JADX INFO: renamed from: Y */
    public final int f27985Y;

    /* JADX INFO: renamed from: Z */
    public final ArrayList f27986Z;

    public C9197Q4(int i10, ArrayList arrayList) {
        this.f27985Y = i10;
        this.f27986Z = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 1, 4);
        parcel.writeInt(this.f27985Y);
        AbstractC8199t5.m8810i(parcel, 2, this.f27986Z);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
