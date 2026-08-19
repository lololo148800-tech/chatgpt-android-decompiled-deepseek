package p817j$.util.stream;

import java.util.concurrent.atomic.AtomicLong;
import p817j$.util.InterfaceC15669U;
import p817j$.util.InterfaceC15672X;
import p817j$.util.InterfaceC15676a0;
import p817j$.util.InterfaceC15709d0;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.H3 */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC15786H3 {

    /* JADX INFO: renamed from: a */
    protected final Spliterator f49080a;

    /* JADX INFO: renamed from: b */
    protected final boolean f49081b;

    /* JADX INFO: renamed from: c */
    protected final int f49082c;

    /* JADX INFO: renamed from: d */
    private final long f49083d;

    /* JADX INFO: renamed from: e */
    private final AtomicLong f49084e;

    /* JADX INFO: renamed from: c */
    protected abstract Spliterator mo17365c(Spliterator spliterator);

    AbstractC15786H3(Spliterator spliterator, long j10, long j11) {
        this.f49080a = spliterator;
        this.f49081b = j11 < 0;
        this.f49083d = j11 >= 0 ? j11 : 0L;
        this.f49082c = 128;
        this.f49084e = new AtomicLong(j11 >= 0 ? j10 + j11 : j10);
    }

    AbstractC15786H3(Spliterator spliterator, AbstractC15786H3 abstractC15786H3) {
        this.f49080a = spliterator;
        this.f49081b = abstractC15786H3.f49081b;
        this.f49084e = abstractC15786H3.f49084e;
        this.f49083d = abstractC15786H3.f49083d;
        this.f49082c = abstractC15786H3.f49082c;
    }

    /* JADX INFO: renamed from: b */
    protected final long m17380b(long j10) {
        AtomicLong atomicLong;
        long j11;
        boolean z6;
        long jMin;
        do {
            atomicLong = this.f49084e;
            j11 = atomicLong.get();
            z6 = this.f49081b;
            if (j11 != 0) {
                jMin = Math.min(j11, j10);
                if (jMin <= 0) {
                    break;
                }
            } else {
                if (z6) {
                    return j10;
                }
                return 0L;
            }
        } while (!atomicLong.compareAndSet(j11, j11 - jMin));
        if (z6) {
            return Math.max(j10 - jMin, 0L);
        }
        long j12 = this.f49083d;
        return j11 > j12 ? Math.max(jMin - (j11 - j12), 0L) : jMin;
    }

    /* JADX INFO: renamed from: d */
    protected final EnumC15781G3 m17381d() {
        if (this.f49084e.get() > 0) {
            return EnumC15781G3.MAYBE_MORE;
        }
        return this.f49081b ? EnumC15781G3.UNLIMITED : EnumC15781G3.NO_MORE;
    }

    public final Spliterator trySplit() {
        Spliterator spliteratorTrySplit;
        if (this.f49084e.get() == 0 || (spliteratorTrySplit = this.f49080a.trySplit()) == null) {
            return null;
        }
        return mo17365c(spliteratorTrySplit);
    }

    public final long estimateSize() {
        return this.f49080a.estimateSize();
    }

    public final int characteristics() {
        return this.f49080a.characteristics() & (-16465);
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC15709d0 m22581trySplit() {
        return (InterfaceC15709d0) trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC15672X m22579trySplit() {
        return (InterfaceC15672X) trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC15676a0 m22580trySplit() {
        return (InterfaceC15676a0) trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC15669U m22578trySplit() {
        return (InterfaceC15669U) trySplit();
    }
}
