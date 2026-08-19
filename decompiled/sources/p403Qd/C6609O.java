package p403Qd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p324Mn.C5551u;
import p479Td.C7320F;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Qd.O */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C6609O extends AbstractC6653q0 {
    public static final C6608N Companion = new C6608N();

    /* JADX INFO: renamed from: b */
    public final String f21333b;

    /* JADX INFO: renamed from: c */
    public final String f21334c;

    /* JADX INFO: renamed from: d */
    public final C7320F f21335d;

    /* JADX INFO: renamed from: e */
    public final C5551u f21336e;

    public /* synthetic */ C6609O(int i10, String str, String str2, C7320F c7320f, C5551u c5551u) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C6607M.f21332a.getDescriptor());
            throw null;
        }
        this.f21333b = str;
        if ((i10 & 2) == 0) {
            this.f21334c = null;
        } else {
            this.f21334c = str2;
        }
        if ((i10 & 4) == 0) {
            this.f21335d = null;
        } else {
            this.f21335d = c7320f;
        }
        if ((i10 & 8) == 0) {
            this.f21336e = null;
        } else {
            this.f21336e = c5551u;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6609O)) {
            return false;
        }
        C6609O c6609o = (C6609O) obj;
        return AbstractC16544l.m18089b(this.f21333b, c6609o.f21333b) && AbstractC16544l.m18089b(this.f21334c, c6609o.f21334c) && AbstractC16544l.m18089b(this.f21335d, c6609o.f21335d) && AbstractC16544l.m18089b(this.f21336e, c6609o.f21336e);
    }

    public final int hashCode() {
        int iHashCode = this.f21333b.hashCode() * 31;
        String str = this.f21334c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C7320F c7320f = this.f21335d;
        int iHashCode3 = (iHashCode2 + (c7320f == null ? 0 : c7320f.hashCode())) * 31;
        C5551u c5551u = this.f21336e;
        return iHashCode3 + (c5551u != null ? c5551u.f18004Y.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public C6609O(String str, String str2, C7320F c7320f, C5551u c5551u) {
        this.f21333b = str;
        this.f21334c = str2;
        this.f21335d = c7320f;
        this.f21336e = c5551u;
    }
}
