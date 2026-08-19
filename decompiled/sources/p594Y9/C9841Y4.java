package p594Y9;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;

/* JADX INFO: renamed from: Y9.Y4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9841Y4 extends AbstractC20851a {
    public static final Parcelable.Creator<C9841Y4> CREATOR = new C9864c1(3);

    /* JADX INFO: renamed from: Y */
    public final String f29339Y;

    /* JADX INFO: renamed from: Z */
    public final Rect f29340Z;

    /* JADX INFO: renamed from: o0 */
    public final ArrayList f29341o0;

    /* JADX INFO: renamed from: p0 */
    public final String f29342p0;

    /* JADX INFO: renamed from: q0 */
    public final ArrayList f29343q0;

    public C9841Y4(String str, Rect rect, ArrayList arrayList, String str2, ArrayList arrayList2) {
        this.f29339Y = str;
        this.f29340Z = rect;
        this.f29341o0 = arrayList;
        this.f29342p0 = str2;
        this.f29343q0 = arrayList2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8807f(parcel, 1, this.f29339Y);
        AbstractC8199t5.m8806e(parcel, 2, this.f29340Z, i10);
        AbstractC8199t5.m8810i(parcel, 3, this.f29341o0);
        AbstractC8199t5.m8807f(parcel, 4, this.f29342p0);
        AbstractC8199t5.m8810i(parcel, 5, this.f29343q0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
