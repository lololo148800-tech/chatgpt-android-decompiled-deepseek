package p903n9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p1060v9.AbstractC20502t;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;
import p718e4.C13280a;
import p817j$.util.Objects;

/* JADX INFO: renamed from: n9.c */
/* JADX INFO: loaded from: classes.dex */
public final class C17529c extends AbstractC20851a {
    public static final Parcelable.Creator<C17529c> CREATOR = new C13280a(23);

    /* JADX INFO: renamed from: Y */
    public final boolean f56066Y;

    /* JADX INFO: renamed from: Z */
    public final byte[] f56067Z;

    /* JADX INFO: renamed from: o0 */
    public final String f56068o0;

    public C17529c(boolean z6, byte[] bArr, String str) {
        if (z6) {
            AbstractC20502t.m21157h(bArr);
            AbstractC20502t.m21157h(str);
        }
        this.f56066Y = z6;
        this.f56067Z = bArr;
        this.f56068o0 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17529c)) {
            return false;
        }
        C17529c c17529c = (C17529c) obj;
        return this.f56066Y == c17529c.f56066Y && Arrays.equals(this.f56067Z, c17529c.f56067Z) && Objects.equals(this.f56068o0, c17529c.f56068o0);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f56067Z) + (Objects.hash(Boolean.valueOf(this.f56066Y), this.f56068o0) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 1, 4);
        parcel.writeInt(this.f56066Y ? 1 : 0);
        AbstractC8199t5.m8804c(parcel, 2, this.f56067Z);
        AbstractC8199t5.m8807f(parcel, 3, this.f56068o0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
