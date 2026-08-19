package p246Ji;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import mm.InterfaceC17302e;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p098Di.InterfaceC2062k;
import p1062vd.C20549b0;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC8063c5;
import p544W9.AbstractC8745y2;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Ji.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C4368h extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f14229Y = 0;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC10459q f14230Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ float f14231o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f14232p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC2062k f14233q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC17302e f14234r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4368h(C4365e c4365e, InterfaceC10459q interfaceC10459q, float f10, InterfaceC1426a interfaceC1426a, int i10) {
        super(2);
        this.f14233q0 = c4365e;
        this.f14230Z = interfaceC10459q;
        this.f14231o0 = f10;
        this.f14234r0 = interfaceC1426a;
        this.f14232p0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14229Y) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC8745y2.m9486a((C4365e) this.f14233q0, this.f14230Z, this.f14231o0, (InterfaceC1426a) this.f14234r0, (C6021p) obj, C5997d.m6447d0(this.f14232p0 | 1));
                break;
            default:
                ((Number) obj2).intValue();
                AbstractC8063c5.m8458a((C20549b0) this.f14233q0, (InterfaceC1436k) this.f14234r0, this.f14230Z, this.f14231o0, (C6021p) obj, C5997d.m6447d0(this.f14232p0 | 1));
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4368h(C20549b0 c20549b0, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, float f10, int i10) {
        super(2);
        this.f14233q0 = c20549b0;
        this.f14234r0 = interfaceC1436k;
        this.f14230Z = interfaceC10459q;
        this.f14231o0 = f10;
        this.f14232p0 = i10;
    }
}
