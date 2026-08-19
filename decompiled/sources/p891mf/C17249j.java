package p891mf;

import com.openai.feature.jawbone.tools.JawboneToolViewModel;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1081wc.C20869O;
import p1081wc.InterfaceC20904w;
import p324Mn.C5551u;
import p505Uf.C7638A;
import p571X9.AbstractC9233X;
import p909nm.C17690x;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: mf.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C17249j extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC20904w f55033Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ JawboneToolViewModel f55034Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f55035o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f55036p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C7638A f55037q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C5551u f55038r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17249j(InterfaceC20904w interfaceC20904w, JawboneToolViewModel jawboneToolViewModel, String str, boolean z6, C7638A c7638a, C5551u c5551u, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f55033Y = interfaceC20904w;
        this.f55034Z = jawboneToolViewModel;
        this.f55035o0 = str;
        this.f55036p0 = z6;
        this.f55037q0 = c7638a;
        this.f55038r0 = c5551u;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C17249j(this.f55033Y, this.f55034Z, this.f55035o0, this.f55036p0, this.f55037q0, this.f55038r0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C17249j c17249j = (C17249j) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c17249j.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C7638A c7638a;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        this.f55033Y.mo21447a(C20869O.f66438g, C17690x.f56481Y);
        C17244e c17244e = new C17244e(this.f55035o0);
        JawboneToolViewModel jawboneToolViewModel = this.f55034Z;
        jawboneToolViewModel.m14395k(c17244e);
        if (this.f55036p0 && (c7638a = this.f55037q0) != null) {
            jawboneToolViewModel.m14395k(new C17245f(c7638a, this.f55038r0));
        }
        return C17296C.f55119a;
    }
}
