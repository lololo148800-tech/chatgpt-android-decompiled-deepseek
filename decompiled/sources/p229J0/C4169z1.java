package p229J0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p537W0.C8410b;
import p594Y9.AbstractC9739H3;
import p635a1.InterfaceC10459q;
import p882m1.AbstractC17140a;
import p895n1.C17425e;

/* JADX INFO: renamed from: J0.z1 */
/* JADX INFO: loaded from: classes.dex */
public final class C4169z1 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f13556Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f13557Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC10459q f13558o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ long f13559p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f13560q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ int f13561r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Object f13562s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4169z1(int i10, C8410b c8410b, C17425e c17425e, InterfaceC10459q interfaceC10459q, long j10, int i11) {
        super(2);
        this.f13556Y = 2;
        this.f13560q0 = i10;
        this.f13557Z = c8410b;
        this.f13562s0 = c17425e;
        this.f13558o0 = interfaceC10459q;
        this.f13559p0 = j10;
        this.f13561r0 = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13556Y) {
            case 0:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f13560q0 | 1);
                C17425e c17425e = (C17425e) this.f13562s0;
                String str = (String) this.f13557Z;
                AbstractC3878A1.m4597b(c17425e, str, this.f13558o0, this.f13559p0, (C6021p) obj, iM6447d0, this.f13561r0);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iM6447d1 = C5997d.m6447d0(this.f13560q0 | 1);
                String str2 = (String) this.f13557Z;
                AbstractC3878A1.m4596a((AbstractC17140a) this.f13562s0, str2, this.f13558o0, this.f13559p0, (C6021p) obj, iM6447d1, this.f13561r0);
                break;
            default:
                ((Number) obj2).intValue();
                int iM6447d2 = C5997d.m6447d0(this.f13561r0 | 1);
                C8410b c8410b = (C8410b) this.f13557Z;
                C17425e c17425e2 = (C17425e) this.f13562s0;
                AbstractC9739H3.m10328c(this.f13560q0, c8410b, c17425e2, this.f13558o0, this.f13559p0, (C6021p) obj, iM6447d2);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4169z1(Object obj, String str, InterfaceC10459q interfaceC10459q, long j10, int i10, int i11, int i12) {
        super(2);
        this.f13556Y = i12;
        this.f13562s0 = obj;
        this.f13557Z = str;
        this.f13558o0 = interfaceC10459q;
        this.f13559p0 = j10;
        this.f13560q0 = i10;
        this.f13561r0 = i11;
    }
}
