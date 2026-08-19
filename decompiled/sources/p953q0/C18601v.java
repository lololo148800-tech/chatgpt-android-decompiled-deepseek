package p953q0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p758g0.C13756d;
import p843k1.C16308b;

/* JADX INFO: renamed from: q0.v */
/* JADX INFO: loaded from: classes.dex */
public final class C18601v extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f59247Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16308b f59248Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C18546D f59249o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18601v(C16308b c16308b, C18546D c18546d, int i10) {
        super(1);
        this.f59247Y = i10;
        this.f59248Z = c16308b;
        this.f59249o0 = c18546d;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f59247Y) {
            case 0:
                this.f59248Z.m17836f(((Number) ((C13756d) obj).m15224e()).floatValue());
                this.f59249o0.f59083c.invoke();
                break;
            default:
                this.f59248Z.m17836f(((Number) ((C13756d) obj).m15224e()).floatValue());
                this.f59249o0.f59083c.invoke();
                break;
        }
        return C17296C.f55119a;
    }
}
