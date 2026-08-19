package p239Ja;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import p084D4.C1917h0;
import p280L2.AbstractC4913b;

/* JADX INFO: renamed from: Ja.C */
/* JADX INFO: loaded from: classes.dex */
public final class C4297C extends AbstractC4913b {
    public static final Parcelable.Creator<C4297C> CREATOR = new C1917h0(3);

    /* JADX INFO: renamed from: o0 */
    public CharSequence f13972o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f13973p0;

    public C4297C(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f13972o0 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f13973p0 = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f13972o0) + "}";
    }

    @Override // p280L2.AbstractC4913b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        TextUtils.writeToParcel(this.f13972o0, parcel, i10);
        parcel.writeInt(this.f13973p0 ? 1 : 0);
    }
}
