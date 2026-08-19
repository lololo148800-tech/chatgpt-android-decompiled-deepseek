package p403Qd;

import ao.AbstractC11153a0;
import ao.C11158d;
import ao.C11181o0;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p040Bd.C0960M0;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Qd.p0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C6651p0 extends AbstractC6653q0 {
    public static final C6649o0 Companion = new C6649o0();

    /* JADX INFO: renamed from: d */
    public static final KSerializer[] f21414d = {null, new C11158d(C11181o0.f33827a, 0)};

    /* JADX INFO: renamed from: b */
    public final C0960M0 f21415b;

    /* JADX INFO: renamed from: c */
    public final List f21416c;

    public /* synthetic */ C6651p0(int i10, C0960M0 c0960m0, List list) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C6647n0.f21412a.getDescriptor());
            throw null;
        }
        this.f21415b = c0960m0;
        this.f21416c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6651p0)) {
            return false;
        }
        C6651p0 c6651p0 = (C6651p0) obj;
        return AbstractC16544l.m18089b(this.f21415b, c6651p0.f21415b) && AbstractC16544l.m18089b(this.f21416c, c6651p0.f21416c);
    }

    public final int hashCode() {
        C0960M0 c0960m0 = this.f21415b;
        return this.f21416c.hashCode() + ((c0960m0 == null ? 0 : c0960m0.hashCode()) * 31);
    }

    public final String toString() {
        return "█";
    }

    public C6651p0(C0960M0 c0960m0, List list) {
        this.f21415b = c0960m0;
        this.f21416c = list;
    }
}
