package p594Y9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;

/* JADX INFO: renamed from: Y9.b5 */
/* JADX INFO: loaded from: classes.dex */
public final class C9861b5 extends AbstractC20851a {
    public static final Parcelable.Creator<C9861b5> CREATOR = new C9864c1(6);

    /* JADX INFO: renamed from: Y */
    public final String f29369Y;

    /* JADX INFO: renamed from: Z */
    public final ArrayList f29370Z;

    public C9861b5(String str, ArrayList arrayList) {
        this.f29369Y = str;
        this.f29370Z = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8807f(parcel, 1, this.f29369Y);
        AbstractC8199t5.m8810i(parcel, 2, this.f29370Z);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
