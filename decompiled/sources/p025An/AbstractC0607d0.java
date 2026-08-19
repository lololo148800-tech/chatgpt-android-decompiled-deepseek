package p025An;

import p909nm.C17677k;

/* JADX INFO: renamed from: An.d0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0607d0 extends AbstractC0563B {

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ int f1846q0 = 0;

    /* JADX INFO: renamed from: Z */
    public long f1847Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f1848o0;

    /* JADX INFO: renamed from: p0 */
    public C17677k f1849p0;

    /* JADX INFO: renamed from: Z0 */
    public final void m1238Z0(boolean z6) {
        long j10 = this.f1847Z - (z6 ? 4294967296L : 1L);
        this.f1847Z = j10;
        if (j10 <= 0 && this.f1848o0) {
            shutdown();
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final void m1239a1(AbstractC0591Q abstractC0591Q) {
        C17677k c17677k = this.f1849p0;
        if (c17677k == null) {
            c17677k = new C17677k();
            this.f1849p0 = c17677k;
        }
        c17677k.addLast(abstractC0591Q);
    }

    /* JADX INFO: renamed from: b1 */
    public abstract Thread mo1200b1();

    /* JADX INFO: renamed from: c1 */
    public final void m1240c1(boolean z6) {
        this.f1847Z = (z6 ? 4294967296L : 1L) + this.f1847Z;
        if (z6) {
            return;
        }
        this.f1848o0 = true;
    }

    /* JADX INFO: renamed from: d1 */
    public final boolean m1241d1() {
        return this.f1847Z >= 4294967296L;
    }

    /* JADX INFO: renamed from: e1 */
    public abstract long mo1231e1();

    /* JADX INFO: renamed from: f1 */
    public final boolean m1242f1() {
        C17677k c17677k = this.f1849p0;
        if (c17677k == null) {
            return false;
        }
        AbstractC0591Q abstractC0591Q = (AbstractC0591Q) (c17677k.isEmpty() ? null : c17677k.removeFirst());
        if (abstractC0591Q == null) {
            return false;
        }
        abstractC0591Q.run();
        return true;
    }

    /* JADX INFO: renamed from: g1 */
    public void mo1201g1(long j10, AbstractRunnableC0601a0 abstractRunnableC0601a0) {
        RunnableC0577I.f1807u0.m1235l1(j10, abstractRunnableC0601a0);
    }

    public abstract void shutdown();
}
