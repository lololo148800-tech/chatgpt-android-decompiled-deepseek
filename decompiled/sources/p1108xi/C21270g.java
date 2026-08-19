package p1108xi;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import mm.C17321x;
import p559Wn.InterfaceC8975g;
import p774h1.C14365u;

/* JADX INFO: renamed from: xi.g */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21270g {
    public static final C21266c Companion = new C21266c();

    /* JADX INFO: renamed from: d */
    public static final KSerializer[] f67643d = {null, null, new C11158d(C21267d.f67638a, 0)};

    /* JADX INFO: renamed from: a */
    public final C14365u f67644a;

    /* JADX INFO: renamed from: b */
    public final C14365u f67645b;

    /* JADX INFO: renamed from: c */
    public final List f67646c;

    public C21270g(int i10, C14365u c14365u, C14365u c14365u2, List list) {
        if (4 != (i10 & 4)) {
            AbstractC11153a0.m12389l(i10, 4, C21265b.f67637a.getDescriptor());
            throw null;
        }
        if ((i10 & 1) == 0) {
            this.f67644a = null;
        } else {
            this.f67644a = c14365u;
        }
        if ((i10 & 2) == 0) {
            this.f67645b = null;
        } else {
            this.f67645b = c14365u2;
        }
        this.f67646c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21270g)) {
            return false;
        }
        C21270g c21270g = (C21270g) obj;
        return AbstractC16544l.m18089b(this.f67644a, c21270g.f67644a) && AbstractC16544l.m18089b(this.f67645b, c21270g.f67645b) && AbstractC16544l.m18089b(this.f67646c, c21270g.f67646c);
    }

    public final int hashCode() {
        C14365u c14365u = this.f67644a;
        int iM18981a = (c14365u == null ? 0 : C17321x.m18981a(c14365u.f45062a)) * 31;
        C14365u c14365u2 = this.f67645b;
        return this.f67646c.hashCode() + ((iM18981a + (c14365u2 != null ? C17321x.m18981a(c14365u2.f45062a) : 0)) * 31);
    }

    public final String toString() {
        return "█";
    }
}
