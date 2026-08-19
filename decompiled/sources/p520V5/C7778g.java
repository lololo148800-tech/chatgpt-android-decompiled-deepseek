package p520V5;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import p263K9.C4576X;

/* JADX INFO: renamed from: V5.g */
/* JADX INFO: loaded from: classes.dex */
public final class C7778g extends View.BaseSavedState {
    public static final Parcelable.Creator<C7778g> CREATOR = new C4576X(20);

    /* JADX INFO: renamed from: Y */
    public String f24564Y;

    /* JADX INFO: renamed from: Z */
    public int f24565Z;

    /* JADX INFO: renamed from: o0 */
    public float f24566o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f24567p0;

    /* JADX INFO: renamed from: q0 */
    public String f24568q0;

    /* JADX INFO: renamed from: r0 */
    public int f24569r0;

    /* JADX INFO: renamed from: s0 */
    public int f24570s0;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.f24564Y);
        parcel.writeFloat(this.f24566o0);
        parcel.writeInt(this.f24567p0 ? 1 : 0);
        parcel.writeString(this.f24568q0);
        parcel.writeInt(this.f24569r0);
        parcel.writeInt(this.f24570s0);
    }
}
