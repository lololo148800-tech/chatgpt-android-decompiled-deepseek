package p124Ei;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Ei.H0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2455H0 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7626Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2532n1 f7627Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1436k f7628o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1426a f7629p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC1426a f7630q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC10459q f7631r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ int f7632s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2455H0(C2532n1 c2532n1, InterfaceC1436k interfaceC1436k, InterfaceC1426a interfaceC1426a, InterfaceC1426a interfaceC1426a2, InterfaceC10459q interfaceC10459q, int i10, int i11) {
        super(2);
        this.f7626Y = i11;
        this.f7627Z = c2532n1;
        this.f7628o0 = interfaceC1436k;
        this.f7629p0 = interfaceC1426a;
        this.f7630q0 = interfaceC1426a2;
        this.f7631r0 = interfaceC10459q;
        this.f7632s0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7626Y) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC2511g1.m3598j(this.f7627Z, this.f7628o0, this.f7629p0, this.f7630q0, this.f7631r0, (C6021p) obj, C5997d.m6447d0(this.f7632s0 | 1));
                break;
            default:
                ((Number) obj2).intValue();
                AbstractC2511g1.m3599k(this.f7627Z, this.f7628o0, this.f7629p0, this.f7630q0, this.f7631r0, (C6021p) obj, C5997d.m6447d0(this.f7632s0 | 1));
                break;
        }
        return C17296C.f55119a;
    }
}
