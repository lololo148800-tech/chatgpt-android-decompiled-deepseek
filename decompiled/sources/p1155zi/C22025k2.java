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

/* JADX INFO: renamed from: zi.k2 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C22025k2 {
    public static final C22021j2 Companion = new C22021j2();

    /* JADX INFO: renamed from: e */
    public static final KSerializer[] f69672e;

    /* JADX INFO: renamed from: a */
    public final String f69673a;

    /* JADX INFO: renamed from: b */
    public final String f69674b;

    /* JADX INFO: renamed from: c */
    public final List f69675c;

    /* JADX INFO: renamed from: d */
    public final Map f69676d;

    static {
        C11158d c11158d = new C11158d(C21906D2.f69450a, 0);
        C11181o0 c11181o0 = C11181o0.f33827a;
        f69672e = new KSerializer[]{null, null, c11158d, new C11131E(c11181o0, c11181o0, 1)};
    }

    public /* synthetic */ C22025k2(int i10, String str, String str2, List list, Map map) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C22017i2.f69663a.getDescriptor());
            throw null;
        }
        this.f69673a = str;
        this.f69674b = str2;
        if ((i10 & 4) == 0) {
            this.f69675c = C17689w.f56480Y;
        } else {
            this.f69675c = list;
        }
        if ((i10 & 8) == 0) {
            this.f69676d = C17690x.f56481Y;
        } else {
            this.f69676d = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22025k2)) {
            return false;
        }
        C22025k2 c22025k2 = (C22025k2) obj;
        return AbstractC16544l.m18089b(this.f69673a, c22025k2.f69673a) && AbstractC16544l.m18089b(this.f69674b, c22025k2.f69674b) && AbstractC16544l.m18089b(this.f69675c, c22025k2.f69675c) && AbstractC16544l.m18089b(this.f69676d, c22025k2.f69676d);
    }

    public final int hashCode() {
        return this.f69676d.hashCode() + AbstractC14376f.m15858x(this.f69675c, AbstractC0168G.m527p(this.f69673a.hashCode() * 31, 31, this.f69674b), 31);
    }

    public final String toString() {
        return "█";
    }
}
