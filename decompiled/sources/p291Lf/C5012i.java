package p291Lf;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p1051v0.C20416d;
import p1095x1.InterfaceC21090k;
import p349O0.C5997d;
import p349O0.C6021p;
import p544W9.AbstractC8473F;
import p635a1.InterfaceC10446d;
import p635a1.InterfaceC10459q;
import p774h1.C14356l;
import p882m1.AbstractC17140a;
import p926of.AbstractC18176m;

/* JADX INFO: renamed from: Lf.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C5012i extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16351Y = 1;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC17140a f16352Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC10459q f16353o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ float f16354p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f16355q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ int f16356r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Object f16357s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ Object f16358t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ Object f16359u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ Object f16360v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5012i(AbstractC17140a abstractC17140a, String str, InterfaceC10459q interfaceC10459q, InterfaceC10446d interfaceC10446d, InterfaceC21090k interfaceC21090k, float f10, C14356l c14356l, int i10, int i11) {
        super(2);
        this.f16352Z = abstractC17140a;
        this.f16357s0 = str;
        this.f16353o0 = interfaceC10459q;
        this.f16358t0 = interfaceC10446d;
        this.f16359u0 = interfaceC21090k;
        this.f16354p0 = f10;
        this.f16360v0 = c14356l;
        this.f16355q0 = i10;
        this.f16356r0 = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16351Y) {
            case 0:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f16355q0 | 1);
                float f10 = this.f16354p0;
                AbstractC5018o.m5646a((AbstractC18176m) this.f16357s0, (InterfaceC1426a) this.f16358t0, this.f16353o0, (C20416d) this.f16360v0, f10, this.f16352Z, (InterfaceC1426a) this.f16359u0, (C6021p) obj, iM6447d0, this.f16356r0);
                break;
            default:
                ((Number) obj2).intValue();
                int iM6447d1 = C5997d.m6447d0(this.f16355q0 | 1);
                InterfaceC21090k interfaceC21090k = (InterfaceC21090k) this.f16359u0;
                AbstractC8473F.m9106a(this.f16352Z, (String) this.f16357s0, this.f16353o0, (InterfaceC10446d) this.f16358t0, interfaceC21090k, this.f16354p0, (C14356l) this.f16360v0, (C6021p) obj, iM6447d1, this.f16356r0);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5012i(AbstractC18176m abstractC18176m, InterfaceC1426a interfaceC1426a, InterfaceC10459q interfaceC10459q, C20416d c20416d, float f10, AbstractC17140a abstractC17140a, InterfaceC1426a interfaceC1426a2, int i10, int i11) {
        super(2);
        this.f16357s0 = abstractC18176m;
        this.f16358t0 = interfaceC1426a;
        this.f16353o0 = interfaceC10459q;
        this.f16360v0 = c20416d;
        this.f16354p0 = f10;
        this.f16352Z = abstractC17140a;
        this.f16359u0 = interfaceC1426a2;
        this.f16355q0 = i10;
        this.f16356r0 = i11;
    }
}
