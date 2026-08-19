package p870le;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1081wc.C20859E;
import p1081wc.InterfaceC20904w;
import p1155zi.EnumC21974X0;
import p544W9.AbstractC8614c3;
import p547Wc.C8804n;
import p553Wh.C8870f;
import p909nm.C17690x;
import p948pi.C18418a;

/* JADX INFO: renamed from: le.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C16844A extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54025Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC20904w f54026Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C18418a f54027o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C8870f f54028p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC1436k f54029q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC1426a f54030r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16844A(InterfaceC20904w interfaceC20904w, C18418a c18418a, C8870f c8870f, InterfaceC1436k interfaceC1436k, InterfaceC1426a interfaceC1426a, int i10) {
        super(0);
        this.f54025Y = i10;
        this.f54026Z = interfaceC20904w;
        this.f54027o0 = c18418a;
        this.f54028p0 = c8870f;
        this.f54029q0 = interfaceC1436k;
        this.f54030r0 = interfaceC1426a;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f54025Y) {
            case 0:
                this.f54026Z.mo21448b(C20859E.f66352f, "camera", C17690x.f56481Y);
                AbstractC8614c3.m9262a(this.f54027o0, this.f54028p0, EnumC21974X0.f69558r0, new C8804n(this.f54029q0, this.f54030r0, 1));
                break;
            default:
                this.f54026Z.mo21448b(C20859E.f66352f, "photo_library", C17690x.f56481Y);
                AbstractC8614c3.m9262a(this.f54027o0, this.f54028p0, EnumC21974X0.f69558r0, new C8804n(this.f54029q0, this.f54030r0, 2));
                break;
        }
        return C17296C.f55119a;
    }
}
