package p362Of;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import mm.C17309l;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p360Od.C6172d;
import p575Xd.InterfaceC9461t;

/* JADX INFO: renamed from: Of.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C6192g extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f20166Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f20167Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C6172d f20168o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC9461t f20169p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6192g(InterfaceC1436k interfaceC1436k, C6172d c6172d, InterfaceC9461t interfaceC9461t, int i10) {
        super(0);
        this.f20166Y = i10;
        this.f20167Z = interfaceC1436k;
        this.f20168o0 = c6172d;
        this.f20169p0 = interfaceC9461t;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f20166Y) {
            case 0:
                this.f20167Z.invoke(new C17309l(this.f20168o0, this.f20169p0));
                break;
            case 1:
                this.f20167Z.invoke(new C17309l(this.f20168o0, this.f20169p0));
                break;
            case 2:
                this.f20167Z.invoke(new C17309l(this.f20168o0, this.f20169p0));
                break;
            default:
                this.f20167Z.invoke(new C17309l(this.f20168o0, this.f20169p0));
                break;
        }
        return C17296C.f55119a;
    }
}
