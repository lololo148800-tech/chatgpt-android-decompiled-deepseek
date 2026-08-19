package p870le;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1441p;
import p1040ue.AbstractC20211i;
import p1040ue.C20206d;
import p225Im.InterfaceC3759g;
import p229J0.AbstractC3984T1;
import p349O0.C6013l;
import p349O0.C6021p;
import p523V9.AbstractC8071d5;
import p635a1.C10456n;
import p736f0.C13489g;

/* JADX INFO: renamed from: le.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C16897o extends AbstractC16546n implements InterfaceC1441p {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54255Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f54256Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC3759g f54257o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16897o(int i10, InterfaceC3759g interfaceC3759g, boolean z6) {
        super(4);
        this.f54255Y = i10;
        this.f54256Z = z6;
        this.f54257o0 = interfaceC3759g;
    }

    @Override // p049Bm.InterfaceC1441p
    /* JADX INFO: renamed from: d */
    public final Object mo985d(Object obj, Object obj2, Object obj3, Object obj4) {
        C13489g AnimatedContent = (C13489g) obj;
        C20206d targetDecoration = (C20206d) obj2;
        C6021p c6021p = (C6021p) obj3;
        int iIntValue = ((Number) obj4).intValue();
        AbstractC16544l.m18094g(AnimatedContent, "$this$AnimatedContent");
        AbstractC16544l.m18094g(targetDecoration, "targetDecoration");
        boolean z6 = true;
        boolean z10 = this.f54255Y == 0;
        c6021p.m6524S(-1248249142);
        InterfaceC3759g interfaceC3759g = this.f54257o0;
        boolean zM6542f = c6021p.m6542f(interfaceC3759g);
        if ((((iIntValue & 112) ^ 48) <= 32 || !c6021p.m6545h(targetDecoration)) && (iIntValue & 48) != 32) {
            z6 = false;
        }
        boolean z11 = z6 | zM6542f;
        Object objM6514H = c6021p.m6514H();
        if (z11 || objM6514H == C6013l.f19514a) {
            objM6514H = new C16895n(interfaceC3759g, targetDecoration, 0);
            c6021p.m6537c0(objM6514H);
        }
        c6021p.m6553p(false);
        AbstractC20211i.m21012b(z10, this.f54256Z, targetDecoration, (InterfaceC1436k) objM6514H, c6021p, (iIntValue << 3) & 896);
        if (!this.f54256Z) {
            AbstractC3984T1.m4692k(AbstractC8071d5.m8483b(C10456n.f30959Y, 0.38f), 0.0f, 0L, c6021p, 6, 6);
        }
        return C17296C.f55119a;
    }
}
