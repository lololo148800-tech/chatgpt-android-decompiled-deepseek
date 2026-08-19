package p106E0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC3980S2;
import p349O0.C5997d;
import p349O0.C6021p;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: E0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2235i extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f6847Y = 0;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC10459q f6848Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f6849o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ long f6850p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f6851q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ float f6852r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ int f6853s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2235i(InterfaceC10459q interfaceC10459q, long j10, float f10, long j11, int i10, int i11) {
        super(2);
        this.f6848Z = interfaceC10459q;
        this.f6849o0 = j10;
        this.f6852r0 = f10;
        this.f6850p0 = j11;
        this.f6851q0 = i10;
        this.f6853s0 = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6847Y) {
            case 0:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f6853s0 | 1);
                long j10 = this.f6849o0;
                float f10 = this.f6852r0;
                InterfaceC10459q interfaceC10459q = this.f6848Z;
                long j11 = this.f6850p0;
                AbstractC2236j.m3267a(f10, this.f6851q0, iM6447d0, j10, j11, (C6021p) obj, interfaceC10459q);
                break;
            default:
                ((Number) obj2).intValue();
                int iM6447d1 = C5997d.m6447d0(this.f6853s0 | 1);
                long j12 = this.f6849o0;
                long j13 = this.f6850p0;
                InterfaceC10459q interfaceC10459q2 = this.f6848Z;
                int i10 = this.f6851q0;
                AbstractC3980S2.m4670d(this.f6852r0, i10, iM6447d1, j12, j13, (C6021p) obj, interfaceC10459q2);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2235i(InterfaceC10459q interfaceC10459q, long j10, long j11, int i10, float f10, int i11) {
        super(2);
        this.f6848Z = interfaceC10459q;
        this.f6849o0 = j10;
        this.f6850p0 = j11;
        this.f6851q0 = i10;
        this.f6852r0 = f10;
        this.f6853s0 = i11;
    }
}
