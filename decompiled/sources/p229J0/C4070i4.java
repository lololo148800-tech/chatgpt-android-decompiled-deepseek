package p229J0;

import androidx.compose.p650ui.draw.AbstractC10861a;
import kotlin.jvm.internal.AbstractC16546n;
import p003A1.C0248f0;
import p049Bm.InterfaceC1440o;
import p278L0.AbstractC4879i0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9177N2;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p894n0.InterfaceC17406l;

/* JADX INFO: renamed from: J0.i4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4070i4 extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC17406l f12947Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f12948Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f12949o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C4052f4 f12950p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ float f12951q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ float f12952r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4070i4(InterfaceC17406l interfaceC17406l, boolean z6, boolean z10, C4052f4 c4052f4, float f10, float f11) {
        super(3);
        this.f12947Y = interfaceC17406l;
        this.f12948Z = z6;
        this.f12949o0 = z10;
        this.f12950p0 = c4052f4;
        this.f12951q0 = f10;
        this.f12952r0 = f11;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C6021p c6021p = (C6021p) obj2;
        ((Number) obj3).intValue();
        c6021p.m6524S(-891038934);
        InterfaceC5985X interfaceC5985XM5512d = AbstractC4879i0.m5512d(this.f12948Z, this.f12949o0, ((Boolean) AbstractC9177N2.m9733c(this.f12947Y, c6021p, 0).getValue()).booleanValue(), this.f12950p0, this.f12951q0, this.f12952r0, c6021p, 0);
        C10456n c10456n = C10456n.f30959Y;
        float f10 = AbstractC4094m4.f13114a;
        InterfaceC10459q interfaceC10459qM11297c = AbstractC10861a.m11297c(c10456n, new C0248f0(interfaceC5985XM5512d, 17));
        c6021p.m6553p(false);
        return interfaceC10459qM11297c;
    }
}
