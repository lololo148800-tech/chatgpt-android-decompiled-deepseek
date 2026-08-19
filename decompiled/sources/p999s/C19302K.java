package p999s;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import p960q9.C18658l;

/* JADX INFO: renamed from: s.K */
/* JADX INFO: loaded from: classes.dex */
public final class C19302K extends View.BaseSavedState {
    public static final Parcelable.Creator<C19302K> CREATOR = new C18658l(3);

    /* JADX INFO: renamed from: Y */
    public boolean f61160Y;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeByte(this.f61160Y ? (byte) 1 : (byte) 0);
    }
}
