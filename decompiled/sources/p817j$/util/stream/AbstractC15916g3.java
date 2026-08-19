package p817j$.util.stream;

import java.util.Comparator;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import p817j$.util.AbstractC15666Q;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.g3 */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC15916g3 implements Spliterator {

    /* JADX INFO: renamed from: a */
    final boolean f49296a;

    /* JADX INFO: renamed from: b */
    final AbstractC15882b f49297b;

    /* JADX INFO: renamed from: c */
    private Supplier f49298c;

    /* JADX INFO: renamed from: d */
    Spliterator f49299d;

    /* JADX INFO: renamed from: e */
    InterfaceC15963o2 f49300e;

    /* JADX INFO: renamed from: f */
    BooleanSupplier f49301f;

    /* JADX INFO: renamed from: g */
    long f49302g;

    /* JADX INFO: renamed from: h */
    AbstractC15894d f49303h;

    /* JADX INFO: renamed from: i */
    boolean f49304i;

    /* JADX INFO: renamed from: d */
    abstract void mo17401d();

    /* JADX INFO: renamed from: e */
    abstract AbstractC15916g3 mo17402e(Spliterator spliterator);

    @Override // p817j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC15666Q.m17257e(this, i10);
    }

    AbstractC15916g3(AbstractC15882b abstractC15882b, Supplier supplier, boolean z6) {
        this.f49297b = abstractC15882b;
        this.f49298c = supplier;
        this.f49299d = null;
        this.f49296a = z6;
    }

    AbstractC15916g3(AbstractC15882b abstractC15882b, Spliterator spliterator, boolean z6) {
        this.f49297b = abstractC15882b;
        this.f49298c = null;
        this.f49299d = spliterator;
        this.f49296a = z6;
    }

    /* JADX INFO: renamed from: c */
    final void m17481c() {
        if (this.f49299d == null) {
            this.f49299d = (Spliterator) this.f49298c.get();
            this.f49298c = null;
        }
    }

    /* JADX INFO: renamed from: a */
    final boolean m17480a() {
        AbstractC15894d abstractC15894d = this.f49303h;
        if (abstractC15894d == null) {
            if (this.f49304i) {
                return false;
            }
            m17481c();
            mo17401d();
            this.f49302g = 0L;
            this.f49300e.mo17364l(this.f49299d.getExactSizeIfKnown());
            return m17479b();
        }
        long j10 = this.f49302g + 1;
        this.f49302g = j10;
        boolean z6 = j10 < abstractC15894d.count();
        if (z6) {
            return z6;
        }
        this.f49302g = 0L;
        this.f49303h.clear();
        return m17479b();
    }

    @Override // p817j$.util.Spliterator
    public Spliterator trySplit() {
        if (!this.f49296a || this.f49303h != null || this.f49304i) {
            return null;
        }
        m17481c();
        Spliterator spliteratorTrySplit = this.f49299d.trySplit();
        if (spliteratorTrySplit == null) {
            return null;
        }
        return mo17402e(spliteratorTrySplit);
    }

    /* JADX INFO: renamed from: b */
    private boolean m17479b() {
        while (this.f49303h.count() == 0) {
            if (this.f49300e.mo17358n() || !this.f49301f.getAsBoolean()) {
                if (this.f49304i) {
                    return false;
                }
                this.f49300e.mo17363k();
                this.f49304i = true;
            }
        }
        return true;
    }

    @Override // p817j$.util.Spliterator
    public final long estimateSize() {
        m17481c();
        return this.f49299d.estimateSize();
    }

    @Override // p817j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        m17481c();
        if (EnumC15904e3.SIZED.m17475r(this.f49297b.m17449J())) {
            return this.f49299d.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // p817j$.util.Spliterator
    public final int characteristics() {
        m17481c();
        int iM17470A = EnumC15904e3.m17470A(this.f49297b.m17449J()) & EnumC15904e3.f49265f;
        return (iM17470A & 64) != 0 ? (iM17470A & (-16449)) | (this.f49299d.characteristics() & 16448) : iM17470A;
    }

    @Override // p817j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC15666Q.m17257e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.f49299d);
    }
}
