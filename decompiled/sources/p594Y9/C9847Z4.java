package p594Y9;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;

/* JADX INFO: renamed from: Y9.Z4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9847Z4 extends AbstractC20851a {
    public static final Parcelable.Creator<C9847Z4> CREATOR = new C9864c1(4);

    /* JADX INFO: renamed from: Y */
    public final String f29346Y;

    /* JADX INFO: renamed from: Z */
    public final Rect f29347Z;

    /* JADX INFO: renamed from: o0 */
    public final ArrayList f29348o0;

    /* JADX INFO: renamed from: p0 */
    public final String f29349p0;

    /* JADX INFO: renamed from: q0 */
    public final float f29350q0;

    /* JADX INFO: renamed from: r0 */
    public final float f29351r0;

    /* JADX INFO: renamed from: s0 */
    public final ArrayList f29352s0;

    public C9847Z4(float f10, float f11, Rect rect, String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
        this.f29346Y = str;
        this.f29347Z = rect;
        this.f29348o0 = arrayList;
        this.f29349p0 = str2;
        this.f29350q0 = f10;
        this.f29351r0 = f11;
        this.f29352s0 = arrayList2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8807f(parcel, 1, this.f29346Y);
        AbstractC8199t5.m8806e(parcel, 2, this.f29347Z, i10);
        AbstractC8199t5.m8810i(parcel, 3, this.f29348o0);
        AbstractC8199t5.m8807f(parcel, 4, this.f29349p0);
        AbstractC8199t5.m8813l(parcel, 5, 4);
        parcel.writeFloat(this.f29350q0);
        AbstractC8199t5.m8813l(parcel, 6, 4);
        parcel.writeFloat(this.f29351r0);
        AbstractC8199t5.m8810i(parcel, 7, this.f29352s0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
