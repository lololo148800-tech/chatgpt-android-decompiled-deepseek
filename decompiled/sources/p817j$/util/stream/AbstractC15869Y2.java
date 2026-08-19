package p817j$.util.stream;

import java.util.Arrays;
import p817j$.lang.InterfaceC15531a;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.Y2 */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC15869Y2 extends AbstractC15894d implements Iterable, InterfaceC15531a {

    /* JADX INFO: renamed from: e */
    Object f49213e;

    /* JADX INFO: renamed from: f */
    Object[] f49214f;

    /* JADX INFO: renamed from: c */
    public abstract Object mo17423c(int i10);

    /* JADX INFO: renamed from: s */
    protected abstract void mo17424s(Object obj, int i10, int i11, Object obj2);

    public abstract Spliterator spliterator();

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    /* JADX INFO: renamed from: t */
    protected abstract int mo17425t(Object obj);

    /* JADX INFO: renamed from: w */
    protected abstract Object[] mo17426w();

    AbstractC15869Y2(int i10) {
        super(i10);
        this.f49213e = mo17423c(1 << this.f49248a);
    }

    AbstractC15869Y2() {
        this.f49213e = mo17423c(16);
    }

    /* JADX INFO: renamed from: v */
    protected final void m17437v(long j10) {
        long jMo17425t;
        int i10 = this.f49250c;
        if (i10 == 0) {
            jMo17425t = mo17425t(this.f49213e);
        } else {
            jMo17425t = ((long) mo17425t(this.f49214f[i10])) + this.f49251d[i10];
        }
        if (j10 > jMo17425t) {
            if (this.f49214f == null) {
                Object[] objArrMo17426w = mo17426w();
                this.f49214f = objArrMo17426w;
                this.f49251d = new long[8];
                objArrMo17426w[0] = this.f49213e;
            }
            int i11 = this.f49250c + 1;
            while (j10 > jMo17425t) {
                Object[] objArr = this.f49214f;
                if (i11 >= objArr.length) {
                    int length = objArr.length * 2;
                    this.f49214f = Arrays.copyOf(objArr, length);
                    this.f49251d = Arrays.copyOf(this.f49251d, length);
                }
                int iMin = this.f49248a;
                if (i11 != 0 && i11 != 1) {
                    iMin = Math.min((iMin + i11) - 1, 30);
                }
                int i12 = 1 << iMin;
                this.f49214f[i11] = mo17423c(i12);
                long[] jArr = this.f49251d;
                int i13 = i11 - 1;
                jArr[i11] = jArr[i13] + ((long) mo17425t(this.f49214f[i13]));
                jMo17425t += (long) i12;
                i11++;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    protected final int m17436u(long j10) {
        if (this.f49250c == 0) {
            if (j10 < this.f49249b) {
                return 0;
            }
            throw new IndexOutOfBoundsException(Long.toString(j10));
        }
        if (j10 >= count()) {
            throw new IndexOutOfBoundsException(Long.toString(j10));
        }
        for (int i10 = 0; i10 <= this.f49250c; i10++) {
            if (j10 < this.f49251d[i10] + ((long) mo17425t(this.f49214f[i10]))) {
                return i10;
            }
        }
        throw new IndexOutOfBoundsException(Long.toString(j10));
    }

    /* JADX INFO: renamed from: r */
    public void mo17400r(int i10, Object obj) {
        long j10 = i10;
        long jCount = count() + j10;
        if (jCount > mo17425t(obj) || jCount < j10) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f49250c == 0) {
            System.arraycopy(this.f49213e, 0, obj, i10, this.f49249b);
            return;
        }
        for (int i11 = 0; i11 < this.f49250c; i11++) {
            Object obj2 = this.f49214f[i11];
            System.arraycopy(obj2, 0, obj, i10, mo17425t(obj2));
            i10 += mo17425t(this.f49214f[i11]);
        }
        int i12 = this.f49249b;
        if (i12 > 0) {
            System.arraycopy(this.f49213e, 0, obj, i10, i12);
        }
    }

    /* JADX INFO: renamed from: d */
    public Object mo17398d() {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object objMo17423c = mo17423c((int) jCount);
        mo17400r(0, objMo17423c);
        return objMo17423c;
    }

    /* JADX INFO: renamed from: x */
    protected final void m17438x() {
        long jMo17425t;
        if (this.f49249b == mo17425t(this.f49213e)) {
            if (this.f49214f == null) {
                Object[] objArrMo17426w = mo17426w();
                this.f49214f = objArrMo17426w;
                this.f49251d = new long[8];
                objArrMo17426w[0] = this.f49213e;
            }
            int i10 = this.f49250c;
            int i11 = i10 + 1;
            Object[] objArr = this.f49214f;
            if (i11 >= objArr.length || objArr[i11] == null) {
                if (i10 == 0) {
                    jMo17425t = mo17425t(this.f49213e);
                } else {
                    jMo17425t = ((long) mo17425t(objArr[i10])) + this.f49251d[i10];
                }
                m17437v(jMo17425t + 1);
            }
            this.f49249b = 0;
            int i12 = this.f49250c + 1;
            this.f49250c = i12;
            this.f49213e = this.f49214f[i12];
        }
    }

    @Override // p817j$.util.stream.AbstractC15894d
    public final void clear() {
        Object[] objArr = this.f49214f;
        if (objArr != null) {
            this.f49213e = objArr[0];
            this.f49214f = null;
            this.f49251d = null;
        }
        this.f49249b = 0;
        this.f49250c = 0;
    }

    /* JADX INFO: renamed from: e */
    public void mo17399e(Object obj) {
        for (int i10 = 0; i10 < this.f49250c; i10++) {
            Object obj2 = this.f49214f[i10];
            mo17424s(obj2, 0, mo17425t(obj2), obj);
        }
        mo17424s(this.f49213e, 0, this.f49249b, obj);
    }
}
