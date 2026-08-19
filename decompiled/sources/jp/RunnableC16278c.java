package jp;

import p998rp.AbstractC19268g;
import p998rp.C19265d;
import p998rp.C19280s;

/* JADX INFO: renamed from: jp.c */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC16278c implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f50417Y = 1;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ long f50418Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f50419o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractC19268g f50420p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f50421q0;

    public RunnableC16278c(long j10, long j11, C19280s c19280s, C19280s c19280s2) {
        this.f50418Z = j10;
        this.f50419o0 = j11;
        this.f50420p0 = c19280s;
        this.f50421q0 = c19280s2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f50417Y) {
            case 0:
                for (long j10 = this.f50418Z; j10 < this.f50419o0; j10++) {
                    long j11 = 2 * j10;
                    long j12 = j11 + 1;
                    C19265d c19265d = (C19265d) this.f50420p0;
                    float fM20340b = c19265d.m20340b(j11);
                    C16279d c16279d = (C16279d) this.f50421q0;
                    float fM20340b2 = (c16279d.f50442t.m20340b(j11) * c19265d.m20340b(j12)) + (c16279d.f50442t.m20340b(j12) * fM20340b);
                    c19265d.m20341c((c16279d.f50442t.m20340b(j11) * c19265d.m20340b(j11)) - (c16279d.f50442t.m20340b(j12) * c19265d.m20340b(j12)), j11);
                    c19265d.m20341c(fM20340b2, j12);
                }
                break;
            default:
                for (long j13 = this.f50418Z; j13 < this.f50419o0; j13++) {
                    ((C19280s) this.f50420p0).m20345c(j13, ((C19280s) this.f50421q0).m20344b(j13));
                }
                break;
        }
    }

    public RunnableC16278c(C16279d c16279d, long j10, long j11, C19265d c19265d) {
        this.f50421q0 = c16279d;
        this.f50418Z = j10;
        this.f50419o0 = j11;
        this.f50420p0 = c19265d;
    }
}
