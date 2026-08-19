package p871lf;

import ao.AbstractC11153a0;
import ao.C11131E;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import mm.C17309l;
import p324Mn.C5551u;
import p559Wn.InterfaceC8975g;
import p909nm.AbstractC17660E;

/* JADX INFO: renamed from: lf.x */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C16940x {
    public static final C16939w Companion = new C16939w();

    /* JADX INFO: renamed from: c */
    public static final KSerializer[] f54387c = {new C11131E(C16932p.f54381a, C16929m.f54366a, 1), null};

    /* JADX INFO: renamed from: a */
    public final Map f54388a;

    /* JADX INFO: renamed from: b */
    public final C5551u f54389b;

    static {
        C16931o.Companion.getClass();
        C16931o c16931o = C16931o.f54368n;
        AbstractC17660E.m19258c(new C17309l(new C16934r(c16931o.f54369a), c16931o));
    }

    public /* synthetic */ C16940x(int i10, Map map, C5551u c5551u) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C16938v.f54386a.getDescriptor());
            throw null;
        }
        this.f54388a = map;
        if ((i10 & 2) == 0) {
            this.f54389b = null;
        } else {
            this.f54389b = c5551u;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C16940x m18591a(C16940x c16940x, Map bones, C5551u c5551u, int i10) {
        if ((i10 & 1) != 0) {
            bones = c16940x.f54388a;
        }
        if ((i10 & 2) != 0) {
            c5551u = c16940x.f54389b;
        }
        c16940x.getClass();
        AbstractC16544l.m18094g(bones, "bones");
        return new C16940x(bones, c5551u);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16940x)) {
            return false;
        }
        C16940x c16940x = (C16940x) obj;
        return AbstractC16544l.m18089b(this.f54388a, c16940x.f54388a) && AbstractC16544l.m18089b(this.f54389b, c16940x.f54389b);
    }

    public final int hashCode() {
        int iHashCode = this.f54388a.hashCode() * 31;
        C5551u c5551u = this.f54389b;
        return iHashCode + (c5551u == null ? 0 : c5551u.f18004Y.hashCode());
    }

    public final String toString() {
        return "█";
    }

    public C16940x(Map map) {
        this.f54388a = map;
        this.f54389b = null;
    }

    public C16940x(Map map, C5551u c5551u) {
        this.f54388a = map;
        this.f54389b = c5551u;
    }
}
