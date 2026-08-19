package p346Nn;

import kotlin.jvm.internal.AbstractC16544l;
import p389Pn.AbstractC6539x;
import p389Pn.C6528m;

/* JADX INFO: renamed from: Nn.V */
/* JADX INFO: loaded from: classes2.dex */
public final class C5881V extends AbstractC6539x {

    /* JADX INFO: renamed from: e */
    public final EnumC5897f0 f19211e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5881V(EnumC5897f0 padding) {
        super(AbstractC5908l.f19239b, padding == EnumC5897f0.f19227Z ? 2 : 1, padding == EnumC5897f0.f19228o0 ? 2 : null);
        AbstractC16544l.m18094g(padding, "padding");
        C6528m c6528m = AbstractC5908l.f19238a;
        this.f19211e = padding;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5881V) {
            if (this.f19211e == ((C5881V) obj).f19211e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f19211e.hashCode();
    }
}
