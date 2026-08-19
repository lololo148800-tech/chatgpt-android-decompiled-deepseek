package p817j$.util.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import p817j$.lang.InterfaceC15531a;
import p817j$.util.Objects;
import p817j$.util.Spliterators;
import p817j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.Z2 */
/* JADX INFO: loaded from: classes4.dex */
class C15874Z2 extends AbstractC15894d implements Consumer, Iterable, InterfaceC15531a {

    /* JADX INFO: renamed from: e */
    protected Object[] f49219e = new Object[1 << 4];

    /* JADX INFO: renamed from: f */
    protected Object[][] f49220f;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.Spliterator.Wrapper.convert(spliterator());
    }

    C15874Z2() {
    }

    /* JADX INFO: renamed from: s */
    protected final void m17439s(long j10) {
        long length;
        int i10 = this.f49250c;
        if (i10 == 0) {
            length = this.f49219e.length;
        } else {
            length = this.f49251d[i10] + ((long) this.f49220f[i10].length);
        }
        if (j10 > length) {
            if (this.f49220f == null) {
                Object[][] objArr = new Object[8][];
                this.f49220f = objArr;
                this.f49251d = new long[8];
                objArr[0] = this.f49219e;
            }
            int i11 = i10 + 1;
            while (j10 > length) {
                Object[][] objArr2 = this.f49220f;
                if (i11 >= objArr2.length) {
                    int length2 = objArr2.length * 2;
                    this.f49220f = (Object[][]) Arrays.copyOf(objArr2, length2);
                    this.f49251d = Arrays.copyOf(this.f49251d, length2);
                }
                int iMin = this.f49248a;
                if (i11 != 0 && i11 != 1) {
                    iMin = Math.min((iMin + i11) - 1, 30);
                }
                int i12 = 1 << iMin;
                Object[][] objArr3 = this.f49220f;
                objArr3[i11] = new Object[i12];
                long[] jArr = this.f49251d;
                int i13 = i11 - 1;
                jArr[i11] = jArr[i13] + ((long) objArr3[i13].length);
                length += (long) i12;
                i11++;
            }
        }
    }

    @Override // p817j$.util.stream.AbstractC15894d
    public final void clear() {
        Object[][] objArr = this.f49220f;
        if (objArr != null) {
            this.f49219e = objArr[0];
            int i10 = 0;
            while (true) {
                Object[] objArr2 = this.f49219e;
                if (i10 >= objArr2.length) {
                    break;
                }
                objArr2[i10] = null;
                i10++;
            }
            this.f49220f = null;
            this.f49251d = null;
        } else {
            for (int i11 = 0; i11 < this.f49249b; i11++) {
                this.f49219e[i11] = null;
            }
        }
        this.f49249b = 0;
        this.f49250c = 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.m17281i(spliterator());
    }

    @Override // java.lang.Iterable, p817j$.lang.InterfaceC15531a
    public void forEach(Consumer consumer) {
        for (int i10 = 0; i10 < this.f49250c; i10++) {
            for (Object obj : this.f49220f[i10]) {
                consumer.m17405p(obj);
            }
        }
        for (int i11 = 0; i11 < this.f49249b; i11++) {
            consumer.m17405p(this.f49219e[i11]);
        }
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public void m17405p(Object obj) {
        long length;
        int i10 = this.f49249b;
        Object[] objArr = this.f49219e;
        if (i10 == objArr.length) {
            if (this.f49220f == null) {
                Object[][] objArr2 = new Object[8][];
                this.f49220f = objArr2;
                this.f49251d = new long[8];
                objArr2[0] = objArr;
            }
            int i11 = this.f49250c;
            int i12 = i11 + 1;
            Object[][] objArr3 = this.f49220f;
            if (i12 >= objArr3.length || objArr3[i12] == null) {
                if (i11 == 0) {
                    length = objArr.length;
                } else {
                    length = ((long) objArr3[i11].length) + this.f49251d[i11];
                }
                m17439s(length + 1);
            }
            this.f49249b = 0;
            int i13 = this.f49250c + 1;
            this.f49250c = i13;
            this.f49219e = this.f49220f[i13];
        }
        Object[] objArr4 = this.f49219e;
        int i14 = this.f49249b;
        this.f49249b = i14 + 1;
        objArr4[i14] = obj;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Objects.requireNonNull(arrayList);
        forEach(new C15800K2(8, arrayList));
        return "SpinedBuffer:" + arrayList.toString();
    }

    @Override // java.lang.Iterable
    public p817j$.util.Spliterator spliterator() {
        return new C15830Q2(this, 0, this.f49250c, 0, this.f49249b);
    }
}
