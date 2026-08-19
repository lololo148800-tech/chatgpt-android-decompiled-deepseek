package p903n9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p1060v9.AbstractC20502t;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;
import p718e4.C13280a;

/* JADX INFO: renamed from: n9.k */
/* JADX INFO: loaded from: classes.dex */
public final class C17537k extends AbstractC20851a {
    public static final Parcelable.Creator<C17537k> CREATOR = new C13280a(28);

    /* JADX INFO: renamed from: Y */
    public final String f56098Y;

    /* JADX INFO: renamed from: Z */
    public final String f56099Z;

    public C17537k(String str, String str2) {
        AbstractC20502t.m21158i(str, "Account identifier cannot be null");
        String strTrim = str.trim();
        AbstractC20502t.m21154e(strTrim, "Account identifier cannot be empty");
        this.f56098Y = strTrim;
        AbstractC20502t.m21153d(str2);
        this.f56099Z = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17537k)) {
            return false;
        }
        C17537k c17537k = (C17537k) obj;
        return AbstractC20502t.m21161l(this.f56098Y, c17537k.f56098Y) && AbstractC20502t.m21161l(this.f56099Z, c17537k.f56099Z);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f56098Y, this.f56099Z});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8807f(parcel, 1, this.f56098Y);
        AbstractC8199t5.m8807f(parcel, 2, this.f56099Z);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
