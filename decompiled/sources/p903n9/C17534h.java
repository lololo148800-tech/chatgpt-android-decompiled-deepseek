package p903n9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p1060v9.AbstractC20502t;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;
import p718e4.C13280a;

/* JADX INFO: renamed from: n9.h */
/* JADX INFO: loaded from: classes.dex */
public final class C17534h extends AbstractC20851a {
    public static final Parcelable.Creator<C17534h> CREATOR = new C13280a(25);

    /* JADX INFO: renamed from: Y */
    public final C17537k f56085Y;

    /* JADX INFO: renamed from: Z */
    public final String f56086Z;

    /* JADX INFO: renamed from: o0 */
    public final int f56087o0;

    public C17534h(C17537k c17537k, String str, int i10) {
        AbstractC20502t.m21157h(c17537k);
        this.f56085Y = c17537k;
        this.f56086Z = str;
        this.f56087o0 = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17534h)) {
            return false;
        }
        C17534h c17534h = (C17534h) obj;
        return AbstractC20502t.m21161l(this.f56085Y, c17534h.f56085Y) && AbstractC20502t.m21161l(this.f56086Z, c17534h.f56086Z) && this.f56087o0 == c17534h.f56087o0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f56085Y, this.f56086Z});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8806e(parcel, 1, this.f56085Y, i10);
        AbstractC8199t5.m8807f(parcel, 2, this.f56086Z);
        AbstractC8199t5.m8813l(parcel, 3, 4);
        parcel.writeInt(this.f56087o0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
