package p817j$.util.stream;

import java.util.Comparator;
import java.util.function.Consumer;
import p817j$.util.AbstractC15666Q;
import p817j$.util.Objects;
import p817j$.util.Spliterator;
import p817j$.util.Spliterators;

/* JADX INFO: renamed from: j$.util.stream.Q2 */
/* JADX INFO: loaded from: classes4.dex */
final class C15830Q2 implements Spliterator {

    /* JADX INFO: renamed from: a */
    int f49154a;

    /* JADX INFO: renamed from: b */
    final int f49155b;

    /* JADX INFO: renamed from: c */
    int f49156c;

    /* JADX INFO: renamed from: d */
    final int f49157d;

    /* JADX INFO: renamed from: e */
    Object[] f49158e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ C15874Z2 f49159f;

    @Override // p817j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC15666Q.m17256d(this);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC15666Q.m17257e(this, i10);
    }

    C15830Q2(C15874Z2 c15874z2, int i10, int i11, int i12, int i13) {
        this.f49159f = c15874z2;
        this.f49154a = i10;
        this.f49155b = i11;
        this.f49156c = i12;
        this.f49157d = i13;
        Object[][] objArr = c15874z2.f49220f;
        this.f49158e = objArr == null ? c15874z2.f49219e : objArr[i10];
    }

    @Override // p817j$.util.Spliterator
    public final long estimateSize() {
        int i10 = this.f49154a;
        int i11 = this.f49157d;
        int i12 = this.f49155b;
        if (i10 == i12) {
            return ((long) i11) - ((long) this.f49156c);
        }
        long[] jArr = this.f49159f.f49251d;
        return ((jArr[i12] + ((long) i11)) - jArr[i10]) - ((long) this.f49156c);
    }

    @Override // p817j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int i10 = this.f49154a;
        int i11 = this.f49155b;
        if (i10 >= i11 && (i10 != i11 || this.f49156c >= this.f49157d)) {
            return false;
        }
        Object[] objArr = this.f49158e;
        int i12 = this.f49156c;
        this.f49156c = i12 + 1;
        consumer.m17405p(objArr[i12]);
        if (this.f49156c == this.f49158e.length) {
            this.f49156c = 0;
            int i13 = this.f49154a + 1;
            this.f49154a = i13;
            Object[][] objArr2 = this.f49159f.f49220f;
            if (objArr2 != null && i13 <= i11) {
                this.f49158e = objArr2[i13];
            }
        }
        return true;
    }

    @Override // p817j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        C15874Z2 c15874z2;
        Objects.requireNonNull(consumer);
        int i10 = this.f49154a;
        int i11 = this.f49157d;
        int i12 = this.f49155b;
        if (i10 < i12 || (i10 == i12 && this.f49156c < i11)) {
            int i13 = this.f49156c;
            while (true) {
                c15874z2 = this.f49159f;
                if (i10 >= i12) {
                    break;
                }
                Object[] objArr = c15874z2.f49220f[i10];
                while (i13 < objArr.length) {
                    consumer.m17405p(objArr[i13]);
                    i13++;
                }
                i10++;
                i13 = 0;
            }
            Object[] objArr2 = this.f49154a == i12 ? this.f49158e : c15874z2.f49220f[i12];
            while (i13 < i11) {
                consumer.m17405p(objArr2[i13]);
                i13++;
            }
            this.f49154a = i12;
            this.f49156c = i11;
        }
    }

    @Override // p817j$.util.Spliterator
    public final Spliterator trySplit() {
        int i10 = this.f49154a;
        int i11 = this.f49155b;
        if (i10 < i11) {
            int i12 = i11 - 1;
            int i13 = this.f49156c;
            C15874Z2 c15874z2 = this.f49159f;
            C15830Q2 c15830q2 = new C15830Q2(c15874z2, i10, i12, i13, c15874z2.f49220f[i12].length);
            this.f49154a = i11;
            this.f49156c = 0;
            this.f49158e = c15874z2.f49220f[i11];
            return c15830q2;
        }
        if (i10 != i11) {
            return null;
        }
        int i14 = this.f49156c;
        int i15 = (this.f49157d - i14) / 2;
        if (i15 == 0) {
            return null;
        }
        Spliterator spliteratorM17285m = Spliterators.m17285m(this.f49158e, i14, i14 + i15);
        this.f49156c += i15;
        return spliteratorM17285m;
    }

    @Override // p817j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }
}
