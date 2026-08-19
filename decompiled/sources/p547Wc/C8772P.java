package p547Wc;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import mm.InterfaceC17302e;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p537W0.C8410b;
import p635a1.InterfaceC10459q;
import p870le.AbstractC16912v0;
import ye.EnumC21517f;

/* JADX INFO: renamed from: Wc.P */
/* JADX INFO: loaded from: classes3.dex */
public final class C8772P extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f26752Y = 0;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f26753Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f26754o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f26755p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f26756q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC17302e f26757r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ InterfaceC17302e f26758s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ Object f26759t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8772P(C8775T c8775t, boolean z6, boolean z10, C8410b c8410b, InterfaceC10459q interfaceC10459q, C8410b c8410b2, int i10) {
        super(2);
        this.f26756q0 = c8775t;
        this.f26753Z = z6;
        this.f26754o0 = z10;
        this.f26757r0 = c8410b;
        this.f26759t0 = interfaceC10459q;
        this.f26758s0 = c8410b2;
        this.f26755p0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f26752Y) {
            case 0:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f26755p0 | 1);
                C8410b c8410b = (C8410b) this.f26758s0;
                C8410b c8410b2 = (C8410b) this.f26757r0;
                AbstractC8773Q.m9528a((C8775T) this.f26756q0, this.f26753Z, this.f26754o0, c8410b2, (InterfaceC10459q) this.f26759t0, c8410b, (C6021p) obj, iM6447d0);
                break;
            default:
                ((Number) obj2).intValue();
                int iM6447d1 = C5997d.m6447d0(this.f26755p0 | 1);
                InterfaceC1436k interfaceC1436k = (InterfaceC1436k) this.f26758s0;
                InterfaceC1436k interfaceC1436k2 = (InterfaceC1436k) this.f26759t0;
                AbstractC16912v0.m18583c(this.f26753Z, (EnumC21517f) this.f26756q0, this.f26754o0, (InterfaceC1426a) this.f26757r0, interfaceC1436k, interfaceC1436k2, (C6021p) obj, iM6447d1);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8772P(boolean z6, EnumC21517f enumC21517f, boolean z10, InterfaceC1426a interfaceC1426a, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, int i10) {
        super(2);
        this.f26753Z = z6;
        this.f26756q0 = enumC21517f;
        this.f26754o0 = z10;
        this.f26757r0 = interfaceC1426a;
        this.f26758s0 = interfaceC1436k;
        this.f26759t0 = interfaceC1436k2;
        this.f26755p0 = i10;
    }
}
