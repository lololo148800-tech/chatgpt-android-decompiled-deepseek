package p346Nn;

import kotlin.jvm.internal.AbstractC16544l;
import p389Pn.AbstractC6539x;
import p389Pn.C6538w;

/* JADX INFO: renamed from: Nn.u0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5927u0 extends AbstractC6539x {

    /* JADX INFO: renamed from: e */
    public final EnumC5897f0 f19303e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5927u0(EnumC5897f0 padding) {
        super(AbstractC5895e0.f19222b, padding == EnumC5897f0.f19227Z ? 2 : 1, padding == EnumC5897f0.f19228o0 ? 2 : null);
        AbstractC16544l.m18094g(padding, "padding");
        C6538w c6538w = AbstractC5895e0.f19221a;
        this.f19303e = padding;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5927u0) {
            if (this.f19303e == ((C5927u0) obj).f19303e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f19303e.hashCode();
    }
}
