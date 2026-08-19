package p817j$.util.concurrent;

import java.util.Comparator;
import java.util.function.Consumer;
import p817j$.util.AbstractC15666Q;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.concurrent.j */
/* JADX INFO: loaded from: classes4.dex */
final class C15691j extends C15697p implements Spliterator {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f48911i;

    /* JADX INFO: renamed from: j */
    long f48912j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15691j(C15693l[] c15693lArr, int i10, int i11, int i12, long j10, int i13) {
        super(c15693lArr, i10, i11, i12);
        this.f48911i = i13;
        this.f48912j = j10;
    }

    @Override // p817j$.util.Spliterator
    public final int characteristics() {
        switch (this.f48911i) {
            case 0:
                return 4353;
            default:
                return 4352;
        }
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        switch (this.f48911i) {
            case 0:
                break;
        }
        return AbstractC15666Q.m17256d(this);
    }

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        switch (this.f48911i) {
            case 0:
                break;
        }
        return AbstractC15666Q.m17257e(this, i10);
    }

    @Override // p817j$.util.Spliterator
    public final Comparator getComparator() {
        switch (this.f48911i) {
            case 0:
                throw new IllegalStateException();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // p817j$.util.Spliterator
    public final Spliterator trySplit() {
        switch (this.f48911i) {
            case 0:
                int i10 = this.f48929f;
                int i11 = this.f48930g;
                int i12 = (i10 + i11) >>> 1;
                if (i12 <= i10) {
                    return null;
                }
                C15693l[] c15693lArr = this.f48924a;
                this.f48930g = i12;
                long j10 = this.f48912j >>> 1;
                this.f48912j = j10;
                return new C15691j(c15693lArr, this.f48931h, i12, i11, j10, 0);
            default:
                int i13 = this.f48929f;
                int i14 = this.f48930g;
                int i15 = (i13 + i14) >>> 1;
                if (i15 <= i13) {
                    return null;
                }
                C15693l[] c15693lArr2 = this.f48924a;
                this.f48930g = i15;
                long j11 = this.f48912j >>> 1;
                this.f48912j = j11;
                return new C15691j(c15693lArr2, this.f48931h, i15, i14, j11, 1);
        }
    }

    @Override // p817j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        switch (this.f48911i) {
            case 0:
                consumer.getClass();
                while (true) {
                    C15693l c15693lM17322a = m17322a();
                    if (c15693lM17322a != null) {
                        consumer.accept(c15693lM17322a.f48917b);
                    }
                    break;
                }
                break;
            default:
                consumer.getClass();
                while (true) {
                    C15693l c15693lM17322a2 = m17322a();
                    if (c15693lM17322a2 != null) {
                        consumer.accept(c15693lM17322a2.f48918c);
                    }
                    break;
                }
                break;
        }
    }

    @Override // p817j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        switch (this.f48911i) {
            case 0:
                consumer.getClass();
                C15693l c15693lM17322a = m17322a();
                if (c15693lM17322a == null) {
                    return false;
                }
                consumer.accept(c15693lM17322a.f48917b);
                return true;
            default:
                consumer.getClass();
                C15693l c15693lM17322a2 = m17322a();
                if (c15693lM17322a2 == null) {
                    return false;
                }
                consumer.accept(c15693lM17322a2.f48918c);
                return true;
        }
    }

    @Override // p817j$.util.Spliterator
    public final long estimateSize() {
        switch (this.f48911i) {
            case 0:
                break;
        }
        return this.f48912j;
    }
}
