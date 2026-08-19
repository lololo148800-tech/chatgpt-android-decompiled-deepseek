package p293Lh;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p773h0.C14322z0;

/* JADX INFO: renamed from: Lh.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C5077w extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16616Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C14322z0 f16617Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5077w(C14322z0 c14322z0, int i10) {
        super(0);
        this.f16616Y = i10;
        this.f16617Z = c14322z0;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f16616Y) {
            case 0:
                C14322z0 c14322z0 = this.f16617Z;
                return Boolean.valueOf(c14322z0.f44952a.m6412g() < c14322z0.f44955d.m6412g());
            case 1:
                return Boolean.valueOf(this.f16617Z.f44952a.m6412g() > 0);
            default:
                C14322z0 c14322z1 = this.f16617Z;
                return Boolean.valueOf(c14322z1.f44952a.m6412g() < c14322z1.f44955d.m6412g());
        }
    }
}
