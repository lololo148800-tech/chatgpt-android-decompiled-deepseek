package p871lf;

import ai.C10616g;
import ai.C10619j;
import ai.EnumC10612c;
import ai.EnumC10617h;
import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p003A1.AbstractC0168G;
import p324Mn.C5551u;
import p483Th.C7471b;
import p559Wn.InterfaceC8975g;
import p909nm.C17689w;

/* JADX INFO: renamed from: lf.o */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C16931o {
    public static final C16930n Companion = new C16930n();

    /* JADX INFO: renamed from: m */
    public static final KSerializer[] f54367m = {null, null, null, null, null, null, null, null, null, null, null, new C11158d(C7471b.f23728a, 0)};

    /* JADX INFO: renamed from: n */
    public static final C16931o f54368n;

    /* JADX INFO: renamed from: a */
    public final String f54369a;

    /* JADX INFO: renamed from: b */
    public final String f54370b;

    /* JADX INFO: renamed from: c */
    public final String f54371c;

    /* JADX INFO: renamed from: d */
    public final C10619j f54372d;

    /* JADX INFO: renamed from: e */
    public final boolean f54373e;

    /* JADX INFO: renamed from: f */
    public final String f54374f;

    /* JADX INFO: renamed from: g */
    public final String f54375g;

    /* JADX INFO: renamed from: h */
    public final boolean f54376h;

    /* JADX INFO: renamed from: i */
    public final boolean f54377i;

    /* JADX INFO: renamed from: j */
    public final C5551u f54378j;

    /* JADX INFO: renamed from: k */
    public final C5551u f54379k;

    /* JADX INFO: renamed from: l */
    public final List f54380l;

    static {
        C10616g c10616g = EnumC10617h.Companion;
        f54368n = new C16931o(new C10619j(EnumC10612c.f31489p0));
    }

    public C16931o(int i10, String str, String str2, String str3, C10619j c10619j, boolean z6, String str4, String str5, boolean z10, boolean z11, C5551u c5551u, C5551u c5551u2, List list) {
        if (509 != (i10 & 509)) {
            AbstractC11153a0.m12389l(i10, 509, C16929m.f54366a.getDescriptor());
            throw null;
        }
        this.f54369a = str;
        if ((i10 & 2) == 0) {
            this.f54370b = null;
        } else {
            this.f54370b = str2;
        }
        this.f54371c = str3;
        this.f54372d = c10619j;
        this.f54373e = z6;
        this.f54374f = str4;
        this.f54375g = str5;
        this.f54376h = z10;
        this.f54377i = z11;
        if ((i10 & 512) == 0) {
            this.f54378j = null;
        } else {
            this.f54378j = c5551u;
        }
        if ((i10 & 1024) == 0) {
            this.f54379k = null;
        } else {
            this.f54379k = c5551u2;
        }
        this.f54380l = (i10 & 2048) == 0 ? C17689w.f56480Y : list;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0021  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16931o)) {
            return false;
        }
        C16931o c16931o = (C16931o) obj;
        if (!AbstractC16544l.m18089b(this.f54369a, c16931o.f54369a)) {
            return false;
        }
        String str = this.f54370b;
        String str2 = c16931o.f54370b;
        if (str == null) {
            if (str2 == null) {
                zM18089b = true;
            } else {
                zM18089b = false;
            }
        } else if (str2 == null) {
            zM18089b = false;
        } else {
            zM18089b = AbstractC16544l.m18089b(str, str2);
        }
        return zM18089b && AbstractC16544l.m18089b(this.f54371c, c16931o.f54371c) && AbstractC16544l.m18089b(this.f54372d, c16931o.f54372d) && this.f54373e == c16931o.f54373e && AbstractC16544l.m18089b(this.f54374f, c16931o.f54374f) && AbstractC16544l.m18089b(this.f54375g, c16931o.f54375g) && this.f54376h == c16931o.f54376h && this.f54377i == c16931o.f54377i && AbstractC16544l.m18089b(this.f54378j, c16931o.f54378j) && AbstractC16544l.m18089b(this.f54379k, c16931o.f54379k) && AbstractC16544l.m18089b(this.f54380l, c16931o.f54380l);
    }

    public final int hashCode() {
        int iHashCode = this.f54369a.hashCode() * 31;
        String str = this.f54370b;
        int iM527p = (((AbstractC0168G.m527p(AbstractC0168G.m527p((((this.f54372d.hashCode() + AbstractC0168G.m527p((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f54371c)) * 31) + (this.f54373e ? 1231 : 1237)) * 31, 31, this.f54374f), 31, this.f54375g) + (this.f54376h ? 1231 : 1237)) * 31) + (this.f54377i ? 1231 : 1237)) * 31;
        C5551u c5551u = this.f54378j;
        int iHashCode2 = (iM527p + (c5551u == null ? 0 : c5551u.f18004Y.hashCode())) * 31;
        C5551u c5551u2 = this.f54379k;
        return this.f54380l.hashCode() + ((iHashCode2 + (c5551u2 != null ? c5551u2.f18004Y.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "█";
    }

    public C16931o(C10619j c10619j) {
        C17689w c17689w = C17689w.f56480Y;
        this.f54369a = "mock";
        this.f54370b = null;
        this.f54371c = "Jawbone sharks swim in the ocean at night";
        this.f54372d = c10619j;
        this.f54373e = true;
        this.f54374f = "Mock prompt";
        this.f54375g = "l";
        this.f54376h = true;
        this.f54377i = true;
        this.f54378j = null;
        this.f54379k = null;
        this.f54380l = c17689w;
    }
}
