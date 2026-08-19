package p736f0;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p758g0.C13771k0;
import p758g0.C13777n0;

/* JADX INFO: renamed from: f0.u */
/* JADX INFO: loaded from: classes.dex */
public final class C13503u extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f42752Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13771k0 f42753Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13503u(C13771k0 c13771k0, int i10) {
        super(1);
        this.f42752Y = i10;
        this.f42753Z = c13771k0;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f42752Y) {
            case 0:
                return Boolean.valueOf(!AbstractC16544l.m18089b(obj, this.f42753Z.f43492d.getValue()));
            case 1:
                return new C13777n0(this.f42753Z, 0);
            default:
                return new C13777n0(this.f42753Z, 1);
        }
    }
}
