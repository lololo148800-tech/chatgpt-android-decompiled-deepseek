package af;

import androidx.compose.foundation.layout.AbstractC10844c;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C6021p;
import p594Y9.AbstractC9818V;
import p635a1.C10456n;
import p911o0.AbstractC17780r;

/* JADX INFO: renamed from: af.V */
/* JADX INFO: loaded from: classes3.dex */
public final class C10565V extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ float f31364Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10565V(float f10) {
        super(2);
        this.f31364Y = f10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C6021p c6021p = (C6021p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC17780r.m19507a(AbstractC9818V.m10458b(AbstractC10844c.m11252l(C10456n.f30959Y, this.f31364Y), true, false, 0.0f, 14), c6021p, 0);
        }
        return C17296C.f55119a;
    }
}
