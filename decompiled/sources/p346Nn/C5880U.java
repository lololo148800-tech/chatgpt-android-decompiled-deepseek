package p346Nn;

import kotlin.jvm.internal.AbstractC16544l;
import p389Pn.AbstractC6539x;
import p389Pn.C6538w;

/* JADX INFO: renamed from: Nn.U */
/* JADX INFO: loaded from: classes2.dex */
public final class C5880U extends AbstractC6539x {

    /* JADX INFO: renamed from: e */
    public final EnumC5897f0 f19210e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5880U(EnumC5897f0 padding) {
        super(AbstractC5915o0.f19280b, padding == EnumC5897f0.f19227Z ? 2 : 1, padding == EnumC5897f0.f19228o0 ? 2 : null);
        AbstractC16544l.m18094g(padding, "padding");
        C6538w c6538w = AbstractC5915o0.f19279a;
        this.f19210e = padding;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5880U) {
            if (this.f19210e == ((C5880U) obj).f19210e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f19210e.hashCode();
    }
}
