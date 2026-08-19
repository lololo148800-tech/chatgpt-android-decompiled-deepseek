package p953q0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: q0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C18576e implements Parcelable {
    public static final Parcelable.Creator<C18576e> CREATOR = new C18574d();

    /* JADX INFO: renamed from: Y */
    public final int f59170Y;

    public C18576e(int i10) {
        this.f59170Y = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18576e) && this.f59170Y == ((C18576e) obj).f59170Y;
    }

    public final int hashCode() {
        return this.f59170Y;
    }

    public final String toString() {
        return AbstractC12107L1.m13826q(new StringBuilder("DefaultLazyKey(index="), this.f59170Y, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f59170Y);
    }
}
