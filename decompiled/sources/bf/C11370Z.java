package bf;

import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p1155zi.C21897B1;
import p559Wn.InterfaceC8975g;
import p775h2.AbstractC14376f;
import p909nm.C17689w;

/* JADX INFO: renamed from: bf.Z */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C11370Z {
    public static final C11369Y Companion = new C11369Y();

    /* JADX INFO: renamed from: d */
    public static final KSerializer[] f34374d;

    /* JADX INFO: renamed from: a */
    public final List f34375a;

    /* JADX INFO: renamed from: b */
    public final List f34376b;

    /* JADX INFO: renamed from: c */
    public final C21897B1 f34377c;

    static {
        C11371a c11371a = C11371a.f34378a;
        f34374d = new KSerializer[]{new C11158d(c11371a, 0), new C11158d(c11371a, 0), C21897B1.Companion.serializer(c11371a)};
    }

    public /* synthetic */ C11370Z(int i10, List list, List list2, C21897B1 c21897b1) {
        int i11 = i10 & 1;
        C17689w c17689w = C17689w.f56480Y;
        if (i11 == 0) {
            this.f34375a = c17689w;
        } else {
            this.f34375a = list;
        }
        if ((i10 & 2) == 0) {
            this.f34376b = c17689w;
        } else {
            this.f34376b = list2;
        }
        if ((i10 & 4) == 0) {
            this.f34377c = new C21897B1();
        } else {
            this.f34377c = c21897b1;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C11370Z m12781a(C11370Z c11370z, List fetched, C21897B1 snorlax, int i10) {
        List bootstrap = c11370z.f34375a;
        if ((i10 & 2) != 0) {
            fetched = c11370z.f34376b;
        }
        if ((i10 & 4) != 0) {
            snorlax = c11370z.f34377c;
        }
        c11370z.getClass();
        AbstractC16544l.m18094g(bootstrap, "bootstrap");
        AbstractC16544l.m18094g(fetched, "fetched");
        AbstractC16544l.m18094g(snorlax, "snorlax");
        return new C11370Z(bootstrap, fetched, snorlax);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11370Z)) {
            return false;
        }
        C11370Z c11370z = (C11370Z) obj;
        return AbstractC16544l.m18089b(this.f34375a, c11370z.f34375a) && AbstractC16544l.m18089b(this.f34376b, c11370z.f34376b) && AbstractC16544l.m18089b(this.f34377c, c11370z.f34377c);
    }

    public final int hashCode() {
        return this.f34377c.hashCode() + AbstractC14376f.m15858x(this.f34376b, this.f34375a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "█";
    }

    public C11370Z(List bootstrap, List fetched, C21897B1 snorlax) {
        AbstractC16544l.m18094g(bootstrap, "bootstrap");
        AbstractC16544l.m18094g(fetched, "fetched");
        AbstractC16544l.m18094g(snorlax, "snorlax");
        this.f34375a = bootstrap;
        this.f34376b = fetched;
        this.f34377c = snorlax;
    }
}
