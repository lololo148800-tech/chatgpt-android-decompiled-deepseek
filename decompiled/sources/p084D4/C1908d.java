package p084D4;

import p849k7.C16361n;
import p994rk.C19067A1;

/* JADX INFO: renamed from: D4.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1908d extends AbstractC1906c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ RunnableC1910e f5578d;

    public C1908d(RunnableC1910e runnableC1910e) {
        this.f5578d = runnableC1910e;
    }

    @Override // p084D4.AbstractC1906c
    /* JADX INFO: renamed from: a */
    public final boolean mo3020a(int i10, int i11) {
        RunnableC1910e runnableC1910e = this.f5578d;
        Object obj = runnableC1910e.f5582Y.get(i10);
        Object obj2 = runnableC1910e.f5583Z.get(i11);
        if (obj != null && obj2 != null) {
            ((C16361n) runnableC1910e.f5585p0.f5598b.f34017Z).getClass();
            return ((C19067A1) obj).equals((C19067A1) obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    @Override // p084D4.AbstractC1906c
    /* JADX INFO: renamed from: b */
    public final boolean mo3021b(int i10, int i11) {
        RunnableC1910e runnableC1910e = this.f5578d;
        Object obj = runnableC1910e.f5582Y.get(i10);
        Object obj2 = runnableC1910e.f5583Z.get(i11);
        if (obj == null || obj2 == null) {
            return obj == null && obj2 == null;
        }
        ((C16361n) runnableC1910e.f5585p0.f5598b.f34017Z).getClass();
        return ((C19067A1) obj).equals((C19067A1) obj2);
    }

    @Override // p084D4.AbstractC1906c
    /* JADX INFO: renamed from: g */
    public final void mo3022g(int i10, int i11) {
        RunnableC1910e runnableC1910e = this.f5578d;
        Object obj = runnableC1910e.f5582Y.get(i10);
        Object obj2 = runnableC1910e.f5583Z.get(i11);
        if (obj == null || obj2 == null) {
            throw new AssertionError();
        }
        Object obj3 = runnableC1910e.f5585p0.f5598b.f34017Z;
    }

    @Override // p084D4.AbstractC1906c
    /* JADX INFO: renamed from: h */
    public final int mo3023h() {
        return this.f5578d.f5583Z.size();
    }

    @Override // p084D4.AbstractC1906c
    /* JADX INFO: renamed from: i */
    public final int mo3024i() {
        return this.f5578d.f5582Y.size();
    }
}
