package p017Af;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC8098h0;
import p537W0.C8410b;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Af.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C0483n extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC10459q f1567Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ float f1568Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ float f1569o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C8410b f1570p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f1571q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ int f1572r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0483n(InterfaceC10459q interfaceC10459q, float f10, float f11, C8410b c8410b, int i10, int i11) {
        super(2);
        this.f1567Y = interfaceC10459q;
        this.f1568Z = f10;
        this.f1569o0 = f11;
        this.f1570p0 = c8410b;
        this.f1571q0 = i10;
        this.f1572r0 = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM6447d0 = C5997d.m6447d0(this.f1571q0 | 1);
        C8410b c8410b = this.f1570p0;
        float f10 = this.f1568Z;
        AbstractC8098h0.m8569a(this.f1567Y, f10, this.f1569o0, c8410b, (C6021p) obj, iM6447d0, this.f1572r0);
        return C17296C.f55119a;
    }
}
