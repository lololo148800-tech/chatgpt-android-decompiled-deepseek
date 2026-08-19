package p339Nf;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p523V9.AbstractC8223w5;
import p736f0.AbstractC13508z;
import p736f0.C13493k;
import p758g0.AbstractC13758e;
import p926of.C18160X;

/* JADX INFO: renamed from: Nf.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C5723e extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C5723e f18534Z = new C5723e(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C5723e f18535o0 = new C5723e(1, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f18536Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5723e(int i10, int i11) {
        super(i10);
        this.f18536Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f18536Y) {
            case 0:
                AbstractC16544l.m18094g((C13493k) obj, "$this$null");
                return AbstractC8223w5.m8852d(AbstractC13508z.m15013e(AbstractC13758e.m15255t(220, 90, null, 4), 2), AbstractC13508z.m15014f(AbstractC13758e.m15255t(90, 0, null, 6), 2));
            default:
                C18160X it = (C18160X) obj;
                AbstractC16544l.m18094g(it, "it");
                return it.f57919j;
        }
    }
}
