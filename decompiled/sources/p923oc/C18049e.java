package p923oc;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p690cp.AbstractC12935u;

/* JADX INFO: renamed from: oc.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C18049e extends AbstractC18060p {

    /* JADX INFO: renamed from: a */
    public final AbstractC12935u f57598a;

    public C18049e(AbstractC12935u node) {
        AbstractC16544l.m18094g(node, "node");
        this.f57598a = node;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18049e) && AbstractC16544l.m18089b(this.f57598a, ((C18049e) obj).f57598a);
    }

    public final int hashCode() {
        return this.f57598a.hashCode();
    }

    public final String toString() {
        return "AstCustomBlock(node=" + this.f57598a + Separators.RPAREN;
    }
}
