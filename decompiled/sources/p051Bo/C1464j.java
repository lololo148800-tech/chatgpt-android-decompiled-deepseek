package p051Bo;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16524A;
import kotlin.jvm.internal.C16525B;
import kotlin.jvm.internal.C16556x;
import mm.C17296C;
import p026Ao.C0657F;
import p049Bm.InterfaceC1439n;

/* JADX INFO: renamed from: Bo.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C1464j extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C16556x f3867Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ long f3868Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16524A f3869o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C0657F f3870p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C16524A f3871q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C16524A f3872r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C16525B f3873s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C16525B f3874t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ C16525B f3875u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1464j(C16556x c16556x, long j10, C16524A c16524a, C0657F c0657f, C16524A c16524a2, C16524A c16524a3, C16525B c16525b, C16525B c16525b2, C16525B c16525b3) {
        super(2);
        this.f3867Y = c16556x;
        this.f3868Z = j10;
        this.f3869o0 = c16524a;
        this.f3870p0 = c0657f;
        this.f3871q0 = c16524a2;
        this.f3872r0 = c16524a3;
        this.f3873s0 = c16525b;
        this.f3874t0 = c16525b2;
        this.f3875u0 = c16525b3;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int iIntValue = ((Number) obj).intValue();
        long jLongValue = ((Number) obj2).longValue();
        C0657F c0657f = this.f3870p0;
        if (iIntValue == 1) {
            C16556x c16556x = this.f3867Y;
            if (c16556x.f51285Y) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            c16556x.f51285Y = true;
            if (jLongValue < this.f3868Z) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            C16524A c16524a = this.f3869o0;
            long jM1340E = c16524a.f51261Y;
            if (jM1340E == 4294967295L) {
                jM1340E = c0657f.m1340E();
            }
            c16524a.f51261Y = jM1340E;
            C16524A c16524a2 = this.f3871q0;
            c16524a2.f51261Y = c16524a2.f51261Y == 4294967295L ? c0657f.m1340E() : 0L;
            C16524A c16524a3 = this.f3872r0;
            c16524a3.f51261Y = c16524a3.f51261Y == 4294967295L ? c0657f.m1340E() : 0L;
        } else if (iIntValue == 10) {
            if (jLongValue < 4) {
                throw new IOException("bad zip: NTFS extra too short");
            }
            c0657f.skip(4L);
            AbstractC1456b.m2067g(c0657f, (int) (jLongValue - 4), new C1463i(this.f3873s0, c0657f, this.f3874t0, this.f3875u0));
        }
        return C17296C.f55119a;
    }
}
