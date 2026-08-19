package p229J0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: J0.O2 */
/* JADX INFO: loaded from: classes.dex */
public final class C3961O2 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC10459q f12310Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ long f12311Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ float f12312o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ long f12313p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f12314q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ int f12315r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ int f12316s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3961O2(InterfaceC10459q interfaceC10459q, long j10, float f10, long j11, int i10, int i11, int i12) {
        super(2);
        this.f12310Y = interfaceC10459q;
        this.f12311Z = j10;
        this.f12312o0 = f10;
        this.f12313p0 = j11;
        this.f12314q0 = i10;
        this.f12315r0 = i11;
        this.f12316s0 = i12;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM6447d0 = C5997d.m6447d0(this.f12315r0 | 1);
        float f10 = this.f12312o0;
        AbstractC3980S2.m4668b(this.f12310Y, this.f12311Z, f10, this.f12313p0, this.f12314q0, (C6021p) obj, iM6447d0, this.f12316s0);
        return C17296C.f55119a;
    }
}
