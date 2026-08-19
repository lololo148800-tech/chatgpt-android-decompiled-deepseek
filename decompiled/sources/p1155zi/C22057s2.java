package p1155zi;

import ao.AbstractC11153a0;
import ao.C11131E;
import ao.C11158d;
import ao.C11181o0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;
import p775h2.AbstractC14376f;
import p909nm.C17689w;
import p909nm.C17690x;

/* JADX INFO: renamed from: zi.s2 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C22057s2 {
    public static final C22053r2 Companion = new C22053r2();

    /* JADX INFO: renamed from: g */
    public static final KSerializer[] f69746g;

    /* JADX INFO: renamed from: a */
    public final String f69747a;

    /* JADX INFO: renamed from: b */
    public final String f69748b;

    /* JADX INFO: renamed from: c */
    public final String f69749c;

    /* JADX INFO: renamed from: d */
    public final List f69750d;

    /* JADX INFO: renamed from: e */
    public final boolean f69751e;

    /* JADX INFO: renamed from: f */
    public final Map f69752f;

    static {
        C11158d c11158d = new C11158d(C21906D2.f69450a, 0);
        C11181o0 c11181o0 = C11181o0.f33827a;
        f69746g = new KSerializer[]{null, null, null, c11158d, null, new C11131E(c11181o0, c11181o0, 1)};
    }

    public /* synthetic */ C22057s2(int i10, String str, String str2, String str3, List list, boolean z6, Map map) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, C22049q2.f69738a.getDescriptor());
            throw null;
        }
        this.f69747a = str;
        this.f69748b = str2;
        this.f69749c = str3;
        if ((i10 & 8) == 0) {
            this.f69750d = C17689w.f56480Y;
        } else {
            this.f69750d = list;
        }
        if ((i10 & 16) == 0) {
            this.f69751e = false;
        } else {
            this.f69751e = z6;
        }
        if ((i10 & 32) == 0) {
            this.f69752f = C17690x.f56481Y;
        } else {
            this.f69752f = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22057s2)) {
            return false;
        }
        C22057s2 c22057s2 = (C22057s2) obj;
        return AbstractC16544l.m18089b(this.f69747a, c22057s2.f69747a) && AbstractC16544l.m18089b(this.f69748b, c22057s2.f69748b) && AbstractC16544l.m18089b(this.f69749c, c22057s2.f69749c) && AbstractC16544l.m18089b(this.f69750d, c22057s2.f69750d) && this.f69751e == c22057s2.f69751e && AbstractC16544l.m18089b(this.f69752f, c22057s2.f69752f);
    }

    public final int hashCode() {
        return this.f69752f.hashCode() + ((AbstractC14376f.m15858x(this.f69750d, AbstractC0168G.m527p(AbstractC0168G.m527p(this.f69747a.hashCode() * 31, 31, this.f69748b), 31, this.f69749c), 31) + (this.f69751e ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "█";
    }
}
