package p594Y9;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;

/* JADX INFO: renamed from: Y9.a5 */
/* JADX INFO: loaded from: classes.dex */
public final class C9854a5 extends AbstractC20851a {
    public static final Parcelable.Creator<C9854a5> CREATOR = new C9864c1(5);

    /* JADX INFO: renamed from: Y */
    public final String f29356Y;

    /* JADX INFO: renamed from: Z */
    public final Rect f29357Z;

    /* JADX INFO: renamed from: o0 */
    public final ArrayList f29358o0;

    /* JADX INFO: renamed from: p0 */
    public final String f29359p0;

    /* JADX INFO: renamed from: q0 */
    public final ArrayList f29360q0;

    /* JADX INFO: renamed from: r0 */
    public final float f29361r0;

    /* JADX INFO: renamed from: s0 */
    public final float f29362s0;

    public C9854a5(float f10, float f11, Rect rect, String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
        this.f29356Y = str;
        this.f29357Z = rect;
        this.f29358o0 = arrayList;
        this.f29359p0 = str2;
        this.f29360q0 = arrayList2;
        this.f29361r0 = f10;
        this.f29362s0 = f11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8807f(parcel, 1, this.f29356Y);
        AbstractC8199t5.m8806e(parcel, 2, this.f29357Z, i10);
        AbstractC8199t5.m8810i(parcel, 3, this.f29358o0);
        AbstractC8199t5.m8807f(parcel, 4, this.f29359p0);
        AbstractC8199t5.m8810i(parcel, 5, this.f29360q0);
        AbstractC8199t5.m8813l(parcel, 6, 4);
        parcel.writeFloat(this.f29361r0);
        AbstractC8199t5.m8813l(parcel, 7, 4);
        parcel.writeFloat(this.f29362s0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
