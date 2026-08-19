package p406Qg;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC8063c5;
import p571X9.AbstractC9165L2;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Qg.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C6728x extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f21613Y = 1;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f21614Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f21615o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC10459q f21616p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f21617q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6728x(InterfaceC1436k interfaceC1436k, boolean z6, InterfaceC10459q interfaceC10459q, int i10) {
        super(2);
        this.f21614Z = interfaceC1436k;
        this.f21615o0 = z6;
        this.f21616p0 = interfaceC10459q;
        this.f21617q0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f21613Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                AbstractC9165L2.m9714a(C5997d.m6447d0(this.f21617q0 | 1), this.f21614Z, c6021p, this.f21616p0, this.f21615o0);
                break;
            default:
                AbstractC8063c5.m8461d(C5997d.m6447d0(this.f21617q0 | 1), this.f21614Z, c6021p, this.f21616p0, this.f21615o0);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6728x(boolean z6, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, int i10) {
        super(2);
        this.f21615o0 = z6;
        this.f21614Z = interfaceC1436k;
        this.f21616p0 = interfaceC10459q;
        this.f21617q0 = i10;
    }
}
