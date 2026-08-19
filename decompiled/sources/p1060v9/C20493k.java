package p1060v9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;
import p960q9.C18658l;

/* JADX INFO: renamed from: v9.k */
/* JADX INFO: loaded from: classes.dex */
public final class C20493k extends AbstractC20851a {
    public static final Parcelable.Creator<C20493k> CREATOR = new C18658l(21);

    /* JADX INFO: renamed from: Y */
    public final int f65074Y;

    /* JADX INFO: renamed from: Z */
    public List f65075Z;

    public C20493k(int i10, List list) {
        this.f65074Y = i10;
        this.f65075Z = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 1, 4);
        parcel.writeInt(this.f65074Y);
        AbstractC8199t5.m8810i(parcel, 2, this.f65075Z);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
