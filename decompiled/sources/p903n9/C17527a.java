package p903n9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import mo.C17342i;
import p1060v9.AbstractC20502t;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;
import p718e4.C13280a;

/* JADX INFO: renamed from: n9.a */
/* JADX INFO: loaded from: classes.dex */
public final class C17527a extends AbstractC20851a {
    public static final Parcelable.Creator<C17527a> CREATOR = new C13280a(21);

    /* JADX INFO: renamed from: Y */
    public final boolean f56057Y;

    /* JADX INFO: renamed from: Z */
    public final String f56058Z;

    /* JADX INFO: renamed from: o0 */
    public final String f56059o0;

    /* JADX INFO: renamed from: p0 */
    public final boolean f56060p0;

    /* JADX INFO: renamed from: q0 */
    public final String f56061q0;

    /* JADX INFO: renamed from: r0 */
    public final ArrayList f56062r0;

    /* JADX INFO: renamed from: s0 */
    public final boolean f56063s0;

    public C17527a(boolean z6, String str, String str2, boolean z10, String str3, ArrayList arrayList, boolean z11) {
        boolean z12 = true;
        if (z10 && z11) {
            z12 = false;
        }
        AbstractC20502t.m21150a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z12);
        this.f56057Y = z6;
        if (z6) {
            AbstractC20502t.m21158i(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.f56058Z = str;
        this.f56059o0 = str2;
        this.f56060p0 = z10;
        ArrayList arrayList2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2);
        }
        this.f56062r0 = arrayList2;
        this.f56061q0 = str3;
        this.f56063s0 = z11;
    }

    /* JADX INFO: renamed from: b */
    public static C17342i m19206b() {
        C17342i c17342i = new C17342i();
        c17342i.f55252a = false;
        c17342i.f55254c = null;
        c17342i.f55255d = null;
        c17342i.f55253b = true;
        return c17342i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17527a)) {
            return false;
        }
        C17527a c17527a = (C17527a) obj;
        return this.f56057Y == c17527a.f56057Y && AbstractC20502t.m21161l(this.f56058Z, c17527a.f56058Z) && AbstractC20502t.m21161l(this.f56059o0, c17527a.f56059o0) && this.f56060p0 == c17527a.f56060p0 && AbstractC20502t.m21161l(this.f56061q0, c17527a.f56061q0) && AbstractC20502t.m21161l(this.f56062r0, c17527a.f56062r0) && this.f56063s0 == c17527a.f56063s0;
    }

    public final int hashCode() {
        Boolean boolValueOf = Boolean.valueOf(this.f56057Y);
        Boolean boolValueOf2 = Boolean.valueOf(this.f56060p0);
        Boolean boolValueOf3 = Boolean.valueOf(this.f56063s0);
        return Arrays.hashCode(new Object[]{boolValueOf, this.f56058Z, this.f56059o0, boolValueOf2, this.f56061q0, this.f56062r0, boolValueOf3});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 1, 4);
        parcel.writeInt(this.f56057Y ? 1 : 0);
        AbstractC8199t5.m8807f(parcel, 2, this.f56058Z);
        AbstractC8199t5.m8807f(parcel, 3, this.f56059o0);
        AbstractC8199t5.m8813l(parcel, 4, 4);
        parcel.writeInt(this.f56060p0 ? 1 : 0);
        AbstractC8199t5.m8807f(parcel, 5, this.f56061q0);
        ArrayList arrayList = this.f56062r0;
        if (arrayList != null) {
            int iM8811j2 = AbstractC8199t5.m8811j(parcel, 6);
            parcel.writeStringList(arrayList);
            AbstractC8199t5.m8812k(parcel, iM8811j2);
        }
        AbstractC8199t5.m8813l(parcel, 7, 4);
        parcel.writeInt(this.f56063s0 ? 1 : 0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
