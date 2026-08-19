package p594Y9;

/* JADX INFO: renamed from: Y9.C */
/* JADX INFO: loaded from: classes.dex */
public final class C9705C extends AbstractC9950q {

    /* JADX INFO: renamed from: o0 */
    public final transient Object[] f29235o0;

    /* JADX INFO: renamed from: p0 */
    public final transient int f29236p0;

    /* JADX INFO: renamed from: q0 */
    public final transient int f29237q0 = 1;

    public C9705C(int i10, Object[] objArr) {
        this.f29235o0 = objArr;
        this.f29236p0 = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC10003y4.m10643b(i10, this.f29237q0);
        Object obj = this.f29235o0[i10 + i10 + this.f29236p0];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29237q0;
    }
}
