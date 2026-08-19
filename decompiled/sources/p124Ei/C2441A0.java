package p124Ei;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p179H0.AbstractC3189g;
import p179H0.C3196n;
import p229J0.AbstractC3914G1;
import p302M0.EnumC5246M;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC7973Q4;
import p594Y9.AbstractC9703B3;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Ei.A0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2441A0 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7585Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ long f7586Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f7587o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f7588p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f7589q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2441A0(long j10, EnumC5246M enumC5246M, InterfaceC1439n interfaceC1439n, int i10) {
        super(2);
        this.f7585Y = 2;
        this.f7586Z = j10;
        this.f7589q0 = enumC5246M;
        this.f7587o0 = interfaceC1439n;
        this.f7588p0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7585Y) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC7973Q4.m8272b((C2532n1) this.f7589q0, (InterfaceC10459q) this.f7587o0, this.f7586Z, (C6021p) obj, C5997d.m6447d0(this.f7588p0 | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f7588p0 | 1);
                long j10 = this.f7586Z;
                InterfaceC10459q interfaceC10459q = (InterfaceC10459q) this.f7587o0;
                AbstractC3189g.m4036b((C3196n) this.f7589q0, j10, interfaceC10459q, (C6021p) obj, iM6447d0);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iM6447d1 = C5997d.m6447d0(this.f7588p0 | 1);
                EnumC5246M enumC5246M = (EnumC5246M) this.f7589q0;
                InterfaceC1439n interfaceC1439n = (InterfaceC1439n) this.f7587o0;
                AbstractC3914G1.m4613c(this.f7586Z, enumC5246M, interfaceC1439n, (C6021p) obj, iM6447d1);
                break;
            default:
                ((Number) obj2).intValue();
                int iM6447d2 = C5997d.m6447d0(this.f7588p0 | 1);
                long j11 = this.f7586Z;
                AbstractC9703B3.m10296a((String) this.f7589q0, (InterfaceC10459q) this.f7587o0, j11, (C6021p) obj, iM6447d2);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2441A0(C3196n c3196n, long j10, InterfaceC10459q interfaceC10459q, int i10) {
        super(2);
        this.f7585Y = 1;
        this.f7589q0 = c3196n;
        this.f7586Z = j10;
        this.f7587o0 = interfaceC10459q;
        this.f7588p0 = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2441A0(Object obj, InterfaceC10459q interfaceC10459q, long j10, int i10, int i11) {
        super(2);
        this.f7585Y = i11;
        this.f7589q0 = obj;
        this.f7587o0 = interfaceC10459q;
        this.f7586Z = j10;
        this.f7588p0 = i10;
    }
}
