package p817j$.util.stream;

import p817j$.util.InterfaceC15669U;
import p817j$.util.InterfaceC15672X;
import p817j$.util.InterfaceC15676a0;
import p817j$.util.InterfaceC15709d0;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.A3 */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC15751A3 {

    /* JADX INFO: renamed from: a */
    final long f49028a;

    /* JADX INFO: renamed from: b */
    final long f49029b;

    /* JADX INFO: renamed from: c */
    Spliterator f49030c;

    /* JADX INFO: renamed from: d */
    long f49031d;

    /* JADX INFO: renamed from: e */
    long f49032e;

    /* JADX INFO: renamed from: a */
    protected abstract Spliterator mo17359a(Spliterator spliterator, long j10, long j11, long j12, long j13);

    AbstractC15751A3(Spliterator spliterator, long j10, long j11, long j12, long j13) {
        this.f49030c = spliterator;
        this.f49028a = j10;
        this.f49029b = j11;
        this.f49031d = j12;
        this.f49032e = j13;
    }

    public final Spliterator trySplit() {
        long j10 = this.f49032e;
        if (this.f49028a >= j10 || this.f49031d >= j10) {
            return null;
        }
        while (true) {
            Spliterator spliteratorTrySplit = this.f49030c.trySplit();
            if (spliteratorTrySplit == null) {
                return null;
            }
            long jEstimateSize = spliteratorTrySplit.estimateSize() + this.f49031d;
            long jMin = Math.min(jEstimateSize, this.f49029b);
            long j11 = this.f49028a;
            if (j11 >= jMin) {
                this.f49031d = jMin;
            } else {
                long j12 = this.f49029b;
                if (jMin >= j12) {
                    this.f49030c = spliteratorTrySplit;
                    this.f49032e = jMin;
                } else {
                    long j13 = this.f49031d;
                    if (j13 >= j11 && jEstimateSize <= j12) {
                        this.f49031d = jMin;
                        return spliteratorTrySplit;
                    }
                    this.f49031d = jMin;
                    return mo17359a(spliteratorTrySplit, j11, j12, j13, jMin);
                }
            }
        }
    }

    public final long estimateSize() {
        long j10 = this.f49032e;
        long j11 = this.f49028a;
        if (j11 < j10) {
            return j10 - Math.max(j11, this.f49031d);
        }
        return 0L;
    }

    public final int characteristics() {
        return this.f49030c.characteristics();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC15709d0 m22577trySplit() {
        return (InterfaceC15709d0) trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC15672X m22575trySplit() {
        return (InterfaceC15672X) trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC15676a0 m22576trySplit() {
        return (InterfaceC15676a0) trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC15669U m22574trySplit() {
        return (InterfaceC15669U) trySplit();
    }
}
