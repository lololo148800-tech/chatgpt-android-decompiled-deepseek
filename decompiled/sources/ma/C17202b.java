package ma;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p084D4.C1917h0;
import p280L2.AbstractC4913b;

/* JADX INFO: renamed from: ma.b */
/* JADX INFO: loaded from: classes.dex */
public final class C17202b extends AbstractC4913b {
    public static final Parcelable.Creator<C17202b> CREATOR = new C1917h0(6);

    /* JADX INFO: renamed from: o0 */
    public final int f54911o0;

    /* JADX INFO: renamed from: p0 */
    public final int f54912p0;

    /* JADX INFO: renamed from: q0 */
    public final boolean f54913q0;

    /* JADX INFO: renamed from: r0 */
    public final boolean f54914r0;

    /* JADX INFO: renamed from: s0 */
    public final boolean f54915s0;

    public C17202b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f54911o0 = parcel.readInt();
        this.f54912p0 = parcel.readInt();
        this.f54913q0 = parcel.readInt() == 1;
        this.f54914r0 = parcel.readInt() == 1;
        this.f54915s0 = parcel.readInt() == 1;
    }

    @Override // p280L2.AbstractC4913b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f54911o0);
        parcel.writeInt(this.f54912p0);
        parcel.writeInt(this.f54913q0 ? 1 : 0);
        parcel.writeInt(this.f54914r0 ? 1 : 0);
        parcel.writeInt(this.f54915s0 ? 1 : 0);
    }

    public C17202b(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f54911o0 = bottomSheetBehavior.f36423M;
        this.f54912p0 = bottomSheetBehavior.f36447f;
        this.f54913q0 = bottomSheetBehavior.f36439b;
        this.f54914r0 = bottomSheetBehavior.f36420J;
        this.f54915s0 = bottomSheetBehavior.f36421K;
    }
}
