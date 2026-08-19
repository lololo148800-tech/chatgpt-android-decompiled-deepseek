package p870le;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1081wc.C20859E;
import p1081wc.InterfaceC20904w;
import p1155zi.EnumC21974X0;
import p225Im.InterfaceC3759g;
import p544W9.AbstractC8614c3;
import p553Wh.C8870f;
import p909nm.C17690x;
import p948pi.C18418a;

/* JADX INFO: renamed from: le.t0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C16908t0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54306Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC20904w f54307Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1436k f54308o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C18418a f54309p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C8870f f54310q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC3759g f54311r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16908t0(InterfaceC20904w interfaceC20904w, InterfaceC1436k interfaceC1436k, C18418a c18418a, C8870f c8870f, InterfaceC3759g interfaceC3759g, int i10) {
        super(0);
        this.f54306Y = i10;
        this.f54307Z = interfaceC20904w;
        this.f54308o0 = interfaceC1436k;
        this.f54309p0 = c18418a;
        this.f54310q0 = c8870f;
        this.f54311r0 = interfaceC3759g;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f54306Y) {
            case 0:
                this.f54307Z.mo21448b(C20859E.f66352f, "photo_library", C17690x.f56481Y);
                this.f54308o0.invoke(Boolean.FALSE);
                AbstractC8614c3.m9262a(this.f54309p0, this.f54310q0, EnumC21974X0.f69559s0, new C16862T(this.f54311r0, 2));
                break;
            case 1:
                this.f54307Z.mo21448b(C20859E.f66352f, "camera", C17690x.f56481Y);
                this.f54308o0.invoke(Boolean.FALSE);
                AbstractC8614c3.m9262a(this.f54309p0, this.f54310q0, EnumC21974X0.f69559s0, new C16862T(this.f54311r0, 3));
                break;
            default:
                this.f54307Z.mo21448b(C20859E.f66352f, "files", C17690x.f56481Y);
                this.f54308o0.invoke(Boolean.FALSE);
                AbstractC8614c3.m9262a(this.f54309p0, this.f54310q0, EnumC21974X0.f69559s0, new C16862T(this.f54311r0, 4));
                break;
        }
        return C17296C.f55119a;
    }
}
