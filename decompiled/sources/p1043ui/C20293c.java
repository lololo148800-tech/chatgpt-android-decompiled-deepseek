package p1043ui;

import kotlin.jvm.internal.AbstractC16546n;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p049Bm.InterfaceC1426a;
import p1061vb.C20513d;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;
import p417R2.C6794f;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: ui.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C20293c extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f64158Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC20298h f64159Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20293c(AbstractC20298h abstractC20298h, int i10) {
        super(0);
        this.f64158Y = i10;
        this.f64159Z = abstractC20298h;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        AbstractC20298h abstractC20298h = this.f64159Z;
        switch (this.f64158Y) {
            case 0:
                return abstractC20298h.f64174d;
            default:
                InterfaceC18776i coroutineContext = abstractC20298h.f64171a.getCoroutineContext();
                C3516e c3516e = AbstractC0593T.f1824a;
                return C6794f.m7235d(new C20513d(), AbstractC0575H.m1174c(coroutineContext.plus(ExecutorC3515d.f10633Z)), new C20293c(abstractC20298h, 0), 2);
        }
    }
}
