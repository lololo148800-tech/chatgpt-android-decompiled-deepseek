package p229J0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1155zi.EnumC21974X0;
import p124Ei.C2506f;
import p492U1.InterfaceC7537b;
import p544W9.AbstractC8614c3;
import p553Wh.C8870f;
import p948pi.C18418a;

/* JADX INFO: renamed from: J0.w3 */
/* JADX INFO: loaded from: classes.dex */
public final class C4153w3 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f13454Y = 1;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f13455Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1436k f13456o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f13457p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f13458q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f13459r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4153w3(boolean z6, InterfaceC1436k interfaceC1436k, boolean z10, C18418a c18418a, C8870f c8870f) {
        super(0);
        this.f13455Z = z6;
        this.f13456o0 = interfaceC1436k;
        this.f13457p0 = z10;
        this.f13458q0 = c18418a;
        this.f13459r0 = c8870f;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f13454Y) {
            case 0:
                return new C3880A3(this.f13455Z, (InterfaceC7537b) this.f13458q0, (EnumC3886B3) this.f13459r0, this.f13456o0, this.f13457p0);
            default:
                boolean z6 = this.f13455Z;
                boolean z10 = this.f13457p0;
                InterfaceC1436k interfaceC1436k = this.f13456o0;
                if (z6) {
                    interfaceC1436k.invoke(Boolean.valueOf(!z10));
                } else {
                    AbstractC8614c3.m9262a((C18418a) this.f13458q0, (C8870f) this.f13459r0, EnumC21974X0.f69559s0, new C2506f(interfaceC1436k, z10, 4));
                }
                return C17296C.f55119a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4153w3(boolean z6, InterfaceC7537b interfaceC7537b, EnumC3886B3 enumC3886B3, InterfaceC1436k interfaceC1436k, boolean z10) {
        super(0);
        this.f13455Z = z6;
        this.f13458q0 = interfaceC7537b;
        this.f13459r0 = enumC3886B3;
        this.f13456o0 = interfaceC1436k;
        this.f13457p0 = z10;
    }
}
