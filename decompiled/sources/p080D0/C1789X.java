package p080D0;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p124Ei.AbstractC2511g1;
import p349O0.InterfaceC5982V0;
import p758g0.C13778o;
import p759g1.C13800b;

/* JADX INFO: renamed from: D0.X */
/* JADX INFO: loaded from: classes.dex */
public final class C1789X extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f5127Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC5982V0 f5128Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1789X(InterfaceC5982V0 interfaceC5982V0, int i10) {
        super(0);
        this.f5127Y = i10;
        this.f5128Z = interfaceC5982V0;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        InterfaceC5982V0 interfaceC5982V0 = this.f5128Z;
        switch (this.f5127Y) {
            case 0:
                C13778o c13778o = AbstractC1793a0.f5138a;
                return new C13800b(((C13800b) interfaceC5982V0.getValue()).f43584a);
            case 1:
                return Boolean.valueOf(AbstractC2511g1.m3592d(interfaceC5982V0) >= 0.33f);
            default:
                return Float.valueOf(((Number) interfaceC5982V0.getValue()).floatValue());
        }
    }
}
