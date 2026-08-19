package p166Ga;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;
import p084D4.C1917h0;
import p280L2.AbstractC4913b;

/* JADX INFO: renamed from: Ga.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3028b extends AbstractC4913b {
    public static final Parcelable.Creator<C3028b> CREATOR = new C1917h0(1);

    /* JADX INFO: renamed from: o0 */
    public final int f9115o0;

    public C3028b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f9115o0 = parcel.readInt();
    }

    @Override // p280L2.AbstractC4913b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f9115o0);
    }

    public C3028b(AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
        super(absSavedState);
        this.f9115o0 = sideSheetBehavior.f36684h;
    }
}
