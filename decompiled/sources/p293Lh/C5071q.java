package p293Lh;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p349O0.C6021p;
import p544W9.AbstractC8680n3;
import p773h0.C14322z0;
import p911o0.InterfaceC17763i0;

/* JADX INFO: renamed from: Lh.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C5071q extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC17763i0 f16582Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ EnumC5070p f16583Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1439n f16584o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ float f16585p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ boolean f16586q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C14322z0 f16587r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ InterfaceC1439n f16588s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ InterfaceC1440o f16589t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5071q(InterfaceC17763i0 interfaceC17763i0, EnumC5070p enumC5070p, InterfaceC1439n interfaceC1439n, float f10, boolean z6, C14322z0 c14322z0, InterfaceC1439n interfaceC1439n2, InterfaceC1440o interfaceC1440o) {
        super(3);
        this.f16582Y = interfaceC17763i0;
        this.f16583Z = enumC5070p;
        this.f16584o0 = interfaceC1439n;
        this.f16585p0 = f10;
        this.f16586q0 = z6;
        this.f16587r0 = c14322z0;
        this.f16588s0 = interfaceC1439n2;
        this.f16589t0 = interfaceC1440o;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC17763i0 paddings = (InterfaceC17763i0) obj;
        C6021p c6021p = (C6021p) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC16544l.m18094g(paddings, "paddings");
        if ((iIntValue & 6) == 0) {
            iIntValue |= c6021p.m6542f(paddings) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC8680n3.m9370c(paddings, this.f16582Y, this.f16583Z, this.f16584o0, this.f16585p0, this.f16586q0, this.f16587r0, this.f16588s0, this.f16589t0, c6021p, iIntValue & 14);
        }
        return C17296C.f55119a;
    }
}
