package p572Xa;

import p594Y9.AbstractC9888f4;
import p817j$.util.Objects;

/* JADX INFO: renamed from: Xa.j */
/* JADX INFO: loaded from: classes.dex */
public final class C9416j extends AbstractC9414h {

    /* JADX INFO: renamed from: p0 */
    public static final C9416j f28392p0 = new C9416j(new Object[0]);

    /* JADX INFO: renamed from: o0 */
    public final transient Object[] f28393o0;

    public C9416j(Object[] objArr) {
        this.f28393o0 = objArr;
    }

    @Override // p572Xa.AbstractC9414h, p572Xa.AbstractC9411e
    /* JADX INFO: renamed from: f */
    public final int mo9988f(Object[] objArr) {
        System.arraycopy(this.f28393o0, 0, objArr, 0, 0);
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC9888f4.m10538a(i10, 0);
        Object obj = this.f28393o0[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // p572Xa.AbstractC9411e
    /* JADX INFO: renamed from: i */
    public final int mo9989i() {
        return 0;
    }

    @Override // p572Xa.AbstractC9411e
    /* JADX INFO: renamed from: j */
    public final int mo9990j() {
        return 0;
    }

    @Override // p572Xa.AbstractC9411e
    /* JADX INFO: renamed from: m */
    public final Object[] mo9991m() {
        return this.f28393o0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }
}
