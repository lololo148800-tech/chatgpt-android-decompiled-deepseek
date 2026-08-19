package p108E2;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import p021Aj.C0516a;

/* JADX INFO: renamed from: E2.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2250i extends View.BaseSavedState {
    public static final Parcelable.Creator<C2250i> CREATOR = new C0516a(27);

    /* JADX INFO: renamed from: Y */
    public int f6891Y;

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HorizontalScrollView.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" scrollPosition=");
        return AbstractC10763a.m11056n(sb2, this.f6891Y, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f6891Y);
    }
}
