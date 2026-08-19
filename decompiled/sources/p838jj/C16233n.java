package p838jj;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: jj.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C16233n implements Parcelable {
    public static final C16232m CREATOR = new C16232m();

    /* JADX INFO: renamed from: Y */
    public final String f50354Y;

    /* JADX INFO: renamed from: Z */
    public final Bundle f50355Z;

    public C16233n(String compatibilityKey, Bundle bundle) {
        AbstractC16544l.m18094g(compatibilityKey, "compatibilityKey");
        this.f50354Y = compatibilityKey;
        this.f50355Z = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16233n)) {
            return false;
        }
        C16233n c16233n = (C16233n) obj;
        return AbstractC16544l.m18089b(this.f50354Y, c16233n.f50354Y) && AbstractC16544l.m18089b(this.f50355Z, c16233n.f50355Z);
    }

    public final int hashCode() {
        return this.f50355Z.hashCode() + (this.f50354Y.hashCode() * 31);
    }

    public final String toString() {
        return "KeyAndBundle(compatibilityKey=" + this.f50354Y + ", bundle=" + this.f50355Z + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        AbstractC16544l.m18094g(parcel, "parcel");
        parcel.writeString(this.f50354Y);
        parcel.writeBundle(this.f50355Z);
    }
}
