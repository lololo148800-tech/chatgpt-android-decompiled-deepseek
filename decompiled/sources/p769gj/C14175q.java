package p769gj;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p729ej.C13425p;

/* JADX INFO: renamed from: gj.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C14175q implements Parcelable {
    public static final C14174p CREATOR = new C14174p();

    /* JADX INFO: renamed from: Y */
    public final C13425p f44561Y;

    public C14175q(C13425p c13425p) {
        this.f44561Y = c13425p;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC16544l.m18094g(dest, "dest");
        dest.writeByteArray(this.f44561Y.m14963a().mo1382q());
    }
}
