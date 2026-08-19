package p953q0;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: q0.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C18571b0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f59161Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C18577e0 f59162Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18571b0(C18577e0 c18577e0, int i10) {
        super(0);
        this.f59161Y = i10;
        this.f59162Z = c18577e0;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f59161Y) {
            case 0:
                C18577e0 c18577e0 = this.f59162Z;
                return Float.valueOf(c18577e0.f59171A0.mo19790a() - c18577e0.f59171A0.mo19793d());
            case 1:
                return Float.valueOf(this.f59162Z.f59171A0.mo19791b());
            default:
                return Float.valueOf(this.f59162Z.f59171A0.mo19794e());
        }
    }
}
