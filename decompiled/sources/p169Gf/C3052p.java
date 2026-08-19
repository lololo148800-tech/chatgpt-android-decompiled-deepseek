package p169Gf;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p403Qd.C6600F;
import p523V9.AbstractC7997T5;
import p575Xd.C9436E;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Gf.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C3052p extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f9209Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C6600F f9210Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C9436E f9211o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1436k f9212p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC10459q f9213q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ int f9214r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3052p(C6600F c6600f, C9436E c9436e, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, int i10, int i11) {
        super(2);
        this.f9209Y = i11;
        this.f9210Z = c6600f;
        this.f9211o0 = c9436e;
        this.f9212p0 = interfaceC1436k;
        this.f9213q0 = interfaceC10459q;
        this.f9214r0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9209Y) {
            case 0:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f9214r0 | 1);
                C9436E c9436e = this.f9211o0;
                InterfaceC1436k interfaceC1436k = this.f9212p0;
                AbstractC7997T5.m8301a(this.f9210Z, c9436e, interfaceC1436k, this.f9213q0, (C6021p) obj, iM6447d0);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iM6447d1 = C5997d.m6447d0(this.f9214r0 | 1);
                C9436E c9436e2 = this.f9211o0;
                InterfaceC1436k interfaceC1436k2 = this.f9212p0;
                AbstractC7997T5.m8301a(this.f9210Z, c9436e2, interfaceC1436k2, this.f9213q0, (C6021p) obj, iM6447d1);
                break;
            default:
                ((Number) obj2).intValue();
                AbstractC7997T5.m8302b(this.f9210Z, this.f9211o0, this.f9212p0, this.f9213q0, (C6021p) obj, C5997d.m6447d0(this.f9214r0 | 1));
                break;
        }
        return C17296C.f55119a;
    }
}
