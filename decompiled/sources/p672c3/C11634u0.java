package p672c3;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C6021p;
import p523V9.AbstractC8094g4;

/* JADX INFO: renamed from: c3.u0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11634u0 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f35255Y = 1;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ long f35256Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC11563A0 f35257o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1439n f35258p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f35259q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11634u0(long j10, InterfaceC11563A0 interfaceC11563A0, InterfaceC1439n interfaceC1439n, int i10) {
        super(2);
        this.f35256Z = j10;
        this.f35257o0 = interfaceC11563A0;
        this.f35258p0 = interfaceC1439n;
        this.f35259q0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f35255Y) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC8094g4.m8560a(this.f35259q0 | 1, this.f35256Z, this.f35258p0, (C6021p) obj, this.f35257o0);
                break;
            default:
                ((Number) obj2).intValue();
                int i10 = this.f35259q0 | 1;
                InterfaceC11563A0 interfaceC11563A0 = this.f35257o0;
                InterfaceC1439n interfaceC1439n = this.f35258p0;
                AbstractC8094g4.m8561b(i10, this.f35256Z, interfaceC1439n, (C6021p) obj, interfaceC11563A0);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11634u0(InterfaceC11563A0 interfaceC11563A0, long j10, InterfaceC1439n interfaceC1439n, int i10) {
        super(2);
        this.f35257o0 = interfaceC11563A0;
        this.f35256Z = j10;
        this.f35258p0 = interfaceC1439n;
        this.f35259q0 = i10;
    }
}
