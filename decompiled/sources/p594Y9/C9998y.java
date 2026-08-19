package p594Y9;

/* JADX INFO: renamed from: Y9.y */
/* JADX INFO: loaded from: classes.dex */
public final class C9998y extends AbstractC9950q {

    /* JADX INFO: renamed from: q0 */
    public static final C9998y f29584q0 = new C9998y(0, new Object[0]);

    /* JADX INFO: renamed from: o0 */
    public final transient Object[] f29585o0;

    /* JADX INFO: renamed from: p0 */
    public final transient int f29586p0;

    public C9998y(int i10, Object[] objArr) {
        this.f29585o0 = objArr;
        this.f29586p0 = i10;
    }

    @Override // p594Y9.AbstractC9950q, p594Y9.AbstractC9926m
    /* JADX INFO: renamed from: f */
    public final int mo10285f(Object[] objArr) {
        Object[] objArr2 = this.f29585o0;
        int i10 = this.f29586p0;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC10003y4.m10643b(i10, this.f29586p0);
        Object obj = this.f29585o0[i10];
        obj.getClass();
        return obj;
    }

    @Override // p594Y9.AbstractC9926m
    /* JADX INFO: renamed from: i */
    public final int mo10584i() {
        return this.f29586p0;
    }

    @Override // p594Y9.AbstractC9926m
    /* JADX INFO: renamed from: j */
    public final int mo10585j() {
        return 0;
    }

    @Override // p594Y9.AbstractC9926m
    /* JADX INFO: renamed from: m */
    public final Object[] mo10586m() {
        return this.f29585o0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29586p0;
    }
}
