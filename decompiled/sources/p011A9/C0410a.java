package p011A9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import p1022t9.InterfaceC19825j;
import p1060v9.AbstractC20502t;
import p1078w9.AbstractC20851a;
import p523V9.AbstractC8199t5;

/* JADX INFO: renamed from: A9.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0410a extends AbstractC20851a {
    public static final Parcelable.Creator<C0410a> CREATOR = new C0412c();

    /* JADX INFO: renamed from: Y */
    public final ArrayList f1366Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f1367Z;

    /* JADX INFO: renamed from: o0 */
    public final String f1368o0;

    /* JADX INFO: renamed from: p0 */
    public final String f1369p0;

    public C0410a(ArrayList arrayList, boolean z6, String str, String str2) {
        AbstractC20502t.m21157h(arrayList);
        this.f1366Y = arrayList;
        this.f1367Z = z6;
        this.f1368o0 = str;
        this.f1369p0 = str2;
    }

    /* JADX INFO: renamed from: b */
    public static C0410a m1022b(List list, boolean z6) {
        TreeSet treeSet = new TreeSet(C0411b.f1370Y);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((InterfaceC19825j) it.next()).mo7961a());
        }
        return new C0410a(new ArrayList(treeSet), z6, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0410a)) {
            return false;
        }
        C0410a c0410a = (C0410a) obj;
        return this.f1367Z == c0410a.f1367Z && AbstractC20502t.m21161l(this.f1366Y, c0410a.f1366Y) && AbstractC20502t.m21161l(this.f1368o0, c0410a.f1368o0) && AbstractC20502t.m21161l(this.f1369p0, c0410a.f1369p0);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f1367Z), this.f1366Y, this.f1368o0, this.f1369p0});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8810i(parcel, 1, this.f1366Y);
        AbstractC8199t5.m8813l(parcel, 2, 4);
        parcel.writeInt(this.f1367Z ? 1 : 0);
        AbstractC8199t5.m8807f(parcel, 3, this.f1368o0);
        AbstractC8199t5.m8807f(parcel, 4, this.f1369p0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
