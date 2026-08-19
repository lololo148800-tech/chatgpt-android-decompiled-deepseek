package p229J0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p204I1.C3582M;
import p349O0.C5997d;
import p349O0.C6021p;
import p537W0.C8410b;
import p594Y9.AbstractC9739H3;
import p635a1.InterfaceC10459q;
import p895n1.C17425e;

/* JADX INFO: renamed from: J0.N3 */
/* JADX INFO: loaded from: classes.dex */
public final class C3957N3 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f12283Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C8410b f12284Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f12285o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f12286p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f12287q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ long f12288r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ long f12289s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ int f12290t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3957N3(C8410b c8410b, InterfaceC1439n interfaceC1439n, InterfaceC1439n interfaceC1439n2, C3582M c3582m, long j10, long j11, int i10, int i11) {
        super(2);
        this.f12283Y = i11;
        this.f12284Z = c8410b;
        this.f12285o0 = interfaceC1439n;
        this.f12286p0 = interfaceC1439n2;
        this.f12287q0 = c3582m;
        this.f12288r0 = j10;
        this.f12289s0 = j11;
        this.f12290t0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12283Y) {
            case 0:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f12290t0 | 1);
                C8410b c8410b = this.f12284Z;
                InterfaceC1439n interfaceC1439n = (InterfaceC1439n) this.f12286p0;
                C3582M c3582m = (C3582M) this.f12287q0;
                AbstractC3996V3.m4714c(c8410b, (InterfaceC1439n) this.f12285o0, interfaceC1439n, c3582m, this.f12288r0, this.f12289s0, (C6021p) obj, iM6447d0);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iM6447d1 = C5997d.m6447d0(this.f12290t0 | 1);
                C8410b c8410b2 = this.f12284Z;
                InterfaceC1439n interfaceC1439n2 = (InterfaceC1439n) this.f12286p0;
                C3582M c3582m2 = (C3582M) this.f12287q0;
                AbstractC3996V3.m4715d(c8410b2, (InterfaceC1439n) this.f12285o0, interfaceC1439n2, c3582m2, this.f12288r0, this.f12289s0, (C6021p) obj, iM6447d1);
                break;
            default:
                ((Number) obj2).intValue();
                int iM6447d2 = C5997d.m6447d0(this.f12290t0 | 1);
                C8410b c8410b3 = this.f12284Z;
                C17425e c17425e = (C17425e) this.f12286p0;
                InterfaceC10459q interfaceC10459q = (InterfaceC10459q) this.f12287q0;
                AbstractC9739H3.m10327b((String) this.f12285o0, c8410b3, c17425e, interfaceC10459q, this.f12288r0, this.f12289s0, (C6021p) obj, iM6447d2);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3957N3(String str, C8410b c8410b, C17425e c17425e, InterfaceC10459q interfaceC10459q, long j10, long j11, int i10) {
        super(2);
        this.f12283Y = 2;
        this.f12285o0 = str;
        this.f12284Z = c8410b;
        this.f12286p0 = c17425e;
        this.f12287q0 = interfaceC10459q;
        this.f12288r0 = j10;
        this.f12289s0 = j11;
        this.f12290t0 = i10;
    }
}
