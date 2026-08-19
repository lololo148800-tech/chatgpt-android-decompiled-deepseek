package p923oc;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p690cp.AbstractC12935u;

/* JADX INFO: renamed from: oc.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C18050f extends AbstractC18060p {

    /* JADX INFO: renamed from: a */
    public final AbstractC12935u f57599a;

    public C18050f(AbstractC12935u node) {
        AbstractC16544l.m18094g(node, "node");
        this.f57599a = node;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18050f) && AbstractC16544l.m18089b(this.f57599a, ((C18050f) obj).f57599a);
    }

    public final int hashCode() {
        return this.f57599a.hashCode();
    }

    public final String toString() {
        return "AstCustomNode(node=" + this.f57599a + Separators.RPAREN;
    }
}
