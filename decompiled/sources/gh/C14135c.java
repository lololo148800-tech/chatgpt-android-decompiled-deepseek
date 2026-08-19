package gh;

import ao.AbstractC11153a0;
import ao.C11131E;
import ao.C11158d;
import ao.C11181o0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p1071w0.AbstractC20734X;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: gh.c */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C14135c {
    public static final C14134b Companion = new C14134b();

    /* JADX INFO: renamed from: d */
    public static final KSerializer[] f44475d;

    /* JADX INFO: renamed from: a */
    public final C14141i f44476a;

    /* JADX INFO: renamed from: b */
    public final Map f44477b;

    /* JADX INFO: renamed from: c */
    public final List f44478c;

    static {
        C11181o0 c11181o0 = C11181o0.f33827a;
        f44475d = new KSerializer[]{null, new C11131E(c11181o0, c11181o0, 1), new C11158d(c11181o0, 0)};
    }

    public /* synthetic */ C14135c(int i10, C14141i c14141i, Map map, List list) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, C14133a.f44474a.getDescriptor());
            throw null;
        }
        this.f44476a = c14141i;
        this.f44477b = map;
        this.f44478c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14135c)) {
            return false;
        }
        C14135c c14135c = (C14135c) obj;
        return AbstractC16544l.m18089b(this.f44476a, c14135c.f44476a) && AbstractC16544l.m18089b(this.f44477b, c14135c.f44477b) && AbstractC16544l.m18089b(this.f44478c, c14135c.f44478c);
    }

    public final int hashCode() {
        return this.f44478c.hashCode() + AbstractC20734X.m21250u(this.f44476a.hashCode() * 31, 31, this.f44477b);
    }

    public final String toString() {
        return "█";
    }
}
