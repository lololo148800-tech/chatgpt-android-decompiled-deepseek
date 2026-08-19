package p690cp;

/* JADX INFO: renamed from: cp.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC12915a extends AbstractC12935u {
    @Override // p690cp.AbstractC12935u
    /* JADX INFO: renamed from: d */
    public final AbstractC12935u mo14590d() {
        return (AbstractC12915a) this.f41092a;
    }

    @Override // p690cp.AbstractC12935u
    /* JADX INFO: renamed from: h */
    public final void mo14591h(AbstractC12935u abstractC12935u) {
        if (!(abstractC12935u instanceof AbstractC12915a)) {
            throw new IllegalArgumentException("Parent of block must also be block (can not be inline)");
        }
        this.f41092a = abstractC12935u;
    }
}
