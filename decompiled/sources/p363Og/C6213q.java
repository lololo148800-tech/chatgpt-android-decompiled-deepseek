package p363Og;

import cn.UfGr.EhBykzn;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p098Di.InterfaceC2062k;
import p1155zi.EnumC22055s0;
import p350O1.C6045C;
import ve.C20584h;

/* JADX INFO: renamed from: Og.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C6213q implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final EnumC22055s0 f20221a;

    /* JADX INFO: renamed from: b */
    public final C20584h f20222b;

    /* JADX INFO: renamed from: c */
    public final C6045C f20223c;

    /* JADX INFO: renamed from: d */
    public final boolean f20224d;

    /* JADX INFO: renamed from: e */
    public final boolean f20225e;

    /* JADX INFO: renamed from: e */
    public static C6213q m6731e(C6213q c6213q, C20584h c20584h, C6045C c6045c, boolean z6, boolean z10, int i10) {
        EnumC22055s0 instruction = c6213q.f20221a;
        if ((i10 & 2) != 0) {
            c20584h = c6213q.f20222b;
        }
        C20584h c20584h2 = c20584h;
        if ((i10 & 4) != 0) {
            c6045c = c6213q.f20223c;
        }
        C6045C value = c6045c;
        if ((i10 & 8) != 0) {
            z6 = c6213q.f20224d;
        }
        boolean z11 = z6;
        if ((i10 & 16) != 0) {
            z10 = c6213q.f20225e;
        }
        c6213q.getClass();
        AbstractC16544l.m18094g(instruction, "instruction");
        AbstractC16544l.m18094g(value, "value");
        return new C6213q(instruction, c20584h2, value, z11, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6213q)) {
            return false;
        }
        C6213q c6213q = (C6213q) obj;
        return this.f20221a == c6213q.f20221a && AbstractC16544l.m18089b(this.f20222b, c6213q.f20222b) && AbstractC16544l.m18089b(this.f20223c, c6213q.f20223c) && this.f20224d == c6213q.f20224d && this.f20225e == c6213q.f20225e;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0017 A[PHI: r4
      0x0017: PHI (r4v3 java.lang.String) = (r4v1 java.lang.String), (r4v4 java.lang.String) binds: [B:14:0x0023, B:7:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: f */
    public final boolean m6732f() {
        String str;
        int iOrdinal = this.f20221a.ordinal();
        C20584h c20584h = this.f20222b;
        String str2 = "";
        if (iOrdinal == 0) {
            str = c20584h != null ? c20584h.f65316b : null;
            if (str != null) {
                str2 = str;
            }
        } else {
            if (iOrdinal != 1) {
                throw new C0644w();
            }
            str = c20584h != null ? c20584h.f65317c : null;
            if (str != null) {
                str2 = str;
            }
        }
        return !str2.equals(this.f20223c.f19682a.f10934Y);
    }

    public final int hashCode() {
        int iHashCode = this.f20221a.hashCode() * 31;
        C20584h c20584h = this.f20222b;
        return ((((this.f20223c.hashCode() + ((iHashCode + (c20584h == null ? 0 : c20584h.hashCode())) * 31)) * 31) + (this.f20224d ? 1231 : 1237)) * 31) + (this.f20225e ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }

    public C6213q(EnumC22055s0 instruction, C20584h c20584h, C6045C c6045c, boolean z6, boolean z10) {
        AbstractC16544l.m18094g(instruction, "instruction");
        AbstractC16544l.m18094g(c6045c, EhBykzn.mpdMIJwOkt);
        this.f20221a = instruction;
        this.f20222b = c20584h;
        this.f20223c = c6045c;
        this.f20224d = z6;
        this.f20225e = z10;
    }
}
