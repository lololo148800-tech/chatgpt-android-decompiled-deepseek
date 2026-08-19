package p213Ia;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p084D4.C1917h0;
import p280L2.AbstractC4913b;
import p692d0.C12959L;

/* JADX INFO: renamed from: Ia.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3654a extends AbstractC4913b {
    public static final Parcelable.Creator<C3654a> CREATOR = new C1917h0(2);

    /* JADX INFO: renamed from: o0 */
    public final C12959L f11137o0;

    public C3654a(Parcelable parcelable) {
        super(parcelable);
        this.f11137o0 = new C12959L(0);
    }

    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f11137o0 + "}";
    }

    @Override // p280L2.AbstractC4913b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        C12959L c12959l = this.f11137o0;
        int i11 = c12959l.f41154o0;
        parcel.writeInt(i11);
        String[] strArr = new String[i11];
        Bundle[] bundleArr = new Bundle[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            strArr[i12] = (String) c12959l.m14646f(i12);
            bundleArr[i12] = (Bundle) c12959l.m14649j(i12);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public C3654a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i10 = parcel.readInt();
        String[] strArr = new String[i10];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i10];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f11137o0 = new C12959L(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            this.f11137o0.put(strArr[i11], bundleArr[i11]);
        }
    }
}
