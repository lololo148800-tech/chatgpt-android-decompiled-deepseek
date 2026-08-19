package p275Kn;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p153Fn.AbstractC2940r;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: Kn.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C4824k extends AbstractC2940r {

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ AtomicReferenceArray f15714q0;

    public C4824k(long j10, C4824k c4824k, int i10) {
        super(j10, c4824k, i10);
        this.f15714q0 = new AtomicReferenceArray(AbstractC4823j.f15713f);
    }

    @Override // p153Fn.AbstractC2940r
    /* JADX INFO: renamed from: g */
    public final int mo2561g() {
        return AbstractC4823j.f15713f;
    }

    @Override // p153Fn.AbstractC2940r
    /* JADX INFO: renamed from: h */
    public final void mo2562h(int i10, InterfaceC18776i interfaceC18776i) {
        this.f15714q0.set(i10, AbstractC4823j.f15712e);
        m3765i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f8804o0 + ", hashCode=" + hashCode() + ']';
    }
}
