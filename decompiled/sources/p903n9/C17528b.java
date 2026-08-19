package p903n9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p1060v9.AbstractC20502t;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;
import p718e4.C13280a;

/* JADX INFO: renamed from: n9.b */
/* JADX INFO: loaded from: classes.dex */
public final class C17528b extends AbstractC20851a {
    public static final Parcelable.Creator<C17528b> CREATOR = new C13280a(22);

    /* JADX INFO: renamed from: Y */
    public final boolean f56064Y;

    /* JADX INFO: renamed from: Z */
    public final String f56065Z;

    public C17528b(String str, boolean z6) {
        if (z6) {
            AbstractC20502t.m21157h(str);
        }
        this.f56064Y = z6;
        this.f56065Z = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17528b)) {
            return false;
        }
        C17528b c17528b = (C17528b) obj;
        return this.f56064Y == c17528b.f56064Y && AbstractC20502t.m21161l(this.f56065Z, c17528b.f56065Z);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f56064Y), this.f56065Z});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 1, 4);
        parcel.writeInt(this.f56064Y ? 1 : 0);
        AbstractC8199t5.m8807f(parcel, 2, this.f56065Z);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
