package tf;

import kotlin.jvm.internal.AbstractC16544l;
import p1155zi.AbstractC21955Q1;

/* JADX INFO: renamed from: tf.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C19930o implements InterfaceC19938w {

    /* JADX INFO: renamed from: a */
    public final AbstractC21955Q1 f63187a;

    /* JADX INFO: renamed from: b */
    public final AbstractC21955Q1 f63188b;

    public C19930o(AbstractC21955Q1 result, AbstractC21955Q1 abstractC21955Q1) {
        AbstractC16544l.m18094g(result, "result");
        this.f63187a = result;
        this.f63188b = abstractC21955Q1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19930o)) {
            return false;
        }
        C19930o c19930o = (C19930o) obj;
        return AbstractC16544l.m18089b(this.f63187a, c19930o.f63187a) && AbstractC16544l.m18089b(this.f63188b, c19930o.f63188b);
    }

    public final int hashCode() {
        int iHashCode = this.f63187a.hashCode() * 31;
        AbstractC21955Q1 abstractC21955Q1 = this.f63188b;
        return iHashCode + (abstractC21955Q1 == null ? 0 : abstractC21955Q1.hashCode());
    }

    public final String toString() {
        return "█";
    }
}
