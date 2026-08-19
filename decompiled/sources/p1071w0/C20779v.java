package p1071w0;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p204I1.C3577H;
import p204I1.C3578I;
import p204I1.C3590f;

/* JADX INFO: renamed from: w0.v */
/* JADX INFO: loaded from: classes.dex */
public final class C20779v extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f65986Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C20718K0 f65987Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20779v(C20718K0 c20718k0, int i10) {
        super(0);
        this.f65986Y = i10;
        this.f65987Z = c20718k0;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        C3577H c3577h;
        switch (this.f65986Y) {
            case 0:
                C20718K0 c20718k0 = this.f65987Z;
                return Boolean.valueOf(c20718k0 != null ? ((Boolean) new C20779v(c20718k0, 2).invoke()).booleanValue() : false);
            case 1:
                C20718K0 c20718k1 = this.f65987Z;
                return Boolean.valueOf(c20718k1 != null ? ((Boolean) new C20779v(c20718k1, 2).invoke()).booleanValue() : false);
            default:
                C20718K0 c20718k2 = this.f65987Z;
                C3590f c3590f = c20718k2.f65692c;
                C3578I c3578i = (C3578I) c20718k2.f65691b.getValue();
                return Boolean.valueOf(AbstractC16544l.m18089b(c3590f, (c3578i == null || (c3577h = c3578i.f10892a) == null) ? null : c3577h.f10882a));
        }
    }
}
