package p263K9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p1060v9.AbstractC20502t;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: K9.s */
/* JADX INFO: loaded from: classes.dex */
public final class C4599s extends AbstractC20851a {
    public static final Parcelable.Creator<C4599s> CREATOR = new C4576X(9);

    /* JADX INFO: renamed from: Y */
    public final String f14986Y;

    public C4599s(String str) {
        AbstractC20502t.m21157h(str);
        this.f14986Y = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4599s) {
            return this.f14986Y.equals(((C4599s) obj).f14986Y);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14986Y});
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f14986Y, "'}", new StringBuilder("FidoAppIdExtension{appid='"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8807f(parcel, 2, this.f14986Y);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
