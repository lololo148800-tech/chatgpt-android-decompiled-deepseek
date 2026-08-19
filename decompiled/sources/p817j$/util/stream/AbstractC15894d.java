package p817j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.d */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC15894d {

    /* JADX INFO: renamed from: a */
    protected final int f49248a;

    /* JADX INFO: renamed from: b */
    protected int f49249b;

    /* JADX INFO: renamed from: c */
    protected int f49250c;

    /* JADX INFO: renamed from: d */
    protected long[] f49251d;

    public abstract void clear();

    protected AbstractC15894d() {
        this.f49248a = 4;
    }

    protected AbstractC15894d(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + i10);
        }
        this.f49248a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i10 - 1));
    }

    public final long count() {
        int i10 = this.f49250c;
        if (i10 == 0) {
            return this.f49249b;
        }
        return this.f49251d[i10] + ((long) this.f49249b);
    }
}
