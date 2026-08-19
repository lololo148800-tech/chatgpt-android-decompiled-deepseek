package p281L3;

import p003A1.AbstractC0168G;
import p1016t3.C19765O;

/* JADX INFO: renamed from: L3.f */
/* JADX INFO: loaded from: classes.dex */
public final class C4919f extends AbstractC4926m implements Comparable {

    /* JADX INFO: renamed from: q0 */
    public final int f16033q0;

    /* JADX INFO: renamed from: r0 */
    public final int f16034r0;

    public C4919f(int i10, C19765O c19765o, int i11, C4922i c4922i, int i12) {
        super(i10, c19765o, i11);
        this.f16033q0 = AbstractC0168G.m526o(i12, c4922i.f16052w) ? 1 : 0;
        this.f16034r0 = this.f16069p0.m20748b();
    }

    @Override // p281L3.AbstractC4926m
    /* JADX INFO: renamed from: a */
    public final int mo5527a() {
        return this.f16033q0;
    }

    @Override // p281L3.AbstractC4926m
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo5528b(AbstractC4926m abstractC4926m) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f16034r0, ((C4919f) obj).f16034r0);
    }
}
