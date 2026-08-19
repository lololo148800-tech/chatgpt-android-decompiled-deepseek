package p080D0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC8120j6;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: D0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1802f extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f5173Y = 1;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1426a f5174Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f5175o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC10459q f5176p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f5177q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1802f(InterfaceC1426a interfaceC1426a, boolean z6, InterfaceC10459q interfaceC10459q, int i10) {
        super(2);
        this.f5174Z = interfaceC1426a;
        this.f5175o0 = z6;
        this.f5176p0 = interfaceC10459q;
        this.f5177q0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f5173Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                AbstractC1807h0.m2617f(C5997d.m6447d0(this.f5177q0 | 1), this.f5174Z, c6021p, this.f5176p0, this.f5175o0);
                break;
            default:
                AbstractC8120j6.m8623a(C5997d.m6447d0(this.f5177q0 | 1), this.f5174Z, c6021p, this.f5176p0, this.f5175o0);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1802f(InterfaceC10459q interfaceC10459q, InterfaceC1426a interfaceC1426a, boolean z6, int i10) {
        super(2);
        this.f5176p0 = interfaceC10459q;
        this.f5174Z = interfaceC1426a;
        this.f5175o0 = z6;
        this.f5177q0 = i10;
    }
}
