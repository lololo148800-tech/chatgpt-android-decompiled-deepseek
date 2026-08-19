package p000;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p316Mf.AbstractC5340g;
import p349O0.C5997d;
import p349O0.C6021p;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: g */
/* JADX INFO: loaded from: classes.dex */
public final class C13721g extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f43281Y = 1;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1439n f43282Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1426a f43283o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC10459q f43284p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f43285q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13721g(InterfaceC1439n interfaceC1439n, InterfaceC1426a interfaceC1426a, InterfaceC10459q interfaceC10459q, int i10) {
        super(2);
        this.f43282Z = interfaceC1439n;
        this.f43283o0 = interfaceC1426a;
        this.f43284p0 = interfaceC10459q;
        this.f43285q0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f43281Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                AbstractC17714o.m19452b(C5997d.m6447d0(this.f43285q0 | 1), this.f43283o0, this.f43282Z, c6021p, this.f43284p0);
                break;
            default:
                int iM6447d0 = C5997d.m6447d0(this.f43285q0 | 1);
                InterfaceC10459q interfaceC10459q = this.f43284p0;
                AbstractC5340g.m5881a(iM6447d0, this.f43283o0, this.f43282Z, c6021p, interfaceC10459q);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13721g(InterfaceC10459q interfaceC10459q, InterfaceC1426a interfaceC1426a, InterfaceC1439n interfaceC1439n, int i10) {
        super(2);
        this.f43284p0 = interfaceC10459q;
        this.f43283o0 = interfaceC1426a;
        this.f43282Z = interfaceC1439n;
        this.f43285q0 = i10;
    }
}
