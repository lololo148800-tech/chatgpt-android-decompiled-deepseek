package p594Y9;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;

/* JADX INFO: renamed from: Y9.c5 */
/* JADX INFO: loaded from: classes.dex */
public final class C9868c5 extends AbstractC20851a {
    public static final Parcelable.Creator<C9868c5> CREATOR = new C9864c1(7);

    /* JADX INFO: renamed from: Y */
    public final String f29375Y;

    /* JADX INFO: renamed from: Z */
    public final Rect f29376Z;

    /* JADX INFO: renamed from: o0 */
    public final ArrayList f29377o0;

    /* JADX INFO: renamed from: p0 */
    public final float f29378p0;

    /* JADX INFO: renamed from: q0 */
    public final float f29379q0;

    public C9868c5(String str, Rect rect, ArrayList arrayList, float f10, float f11) {
        this.f29375Y = str;
        this.f29376Z = rect;
        this.f29377o0 = arrayList;
        this.f29378p0 = f10;
        this.f29379q0 = f11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8807f(parcel, 1, this.f29375Y);
        AbstractC8199t5.m8806e(parcel, 2, this.f29376Z, i10);
        AbstractC8199t5.m8810i(parcel, 3, this.f29377o0);
        AbstractC8199t5.m8813l(parcel, 4, 4);
        parcel.writeFloat(this.f29378p0);
        AbstractC8199t5.m8813l(parcel, 5, 4);
        parcel.writeFloat(this.f29379q0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
