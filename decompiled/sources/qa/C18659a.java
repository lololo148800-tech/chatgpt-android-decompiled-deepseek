package qa;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import p571X9.AbstractC9306j0;
import p960q9.C18658l;

/* JADX INFO: renamed from: qa.a */
/* JADX INFO: loaded from: classes.dex */
public final class C18659a extends View.BaseSavedState {
    public static final Parcelable.Creator<C18659a> CREATOR = new C18658l(1);

    /* JADX INFO: renamed from: Y */
    public int f59416Y;

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("MaterialCheckBox.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" CheckedState=");
        int i10 = this.f59416Y;
        if (i10 != 1) {
            str = i10 != 2 ? "unchecked" : "indeterminate";
        } else {
            str = "checked";
        }
        return AbstractC9306j0.m9891j(str, "}", sb2);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeValue(Integer.valueOf(this.f59416Y));
    }
}
