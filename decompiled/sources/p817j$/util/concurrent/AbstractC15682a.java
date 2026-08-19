package p817j$.util.concurrent;

/* JADX INFO: renamed from: j$.util.concurrent.a */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC15682a extends C15697p {

    /* JADX INFO: renamed from: i */
    final ConcurrentHashMap f48904i;

    /* JADX INFO: renamed from: j */
    C15693l f48905j;

    AbstractC15682a(C15693l[] c15693lArr, int i10, int i11, ConcurrentHashMap concurrentHashMap) {
        super(c15693lArr, i10, 0, i11);
        this.f48904i = concurrentHashMap;
        m17322a();
    }

    public final boolean hasNext() {
        return this.f48925b != null;
    }

    public final boolean hasMoreElements() {
        return this.f48925b != null;
    }

    public final void remove() {
        C15693l c15693l = this.f48905j;
        if (c15693l == null) {
            throw new IllegalStateException();
        }
        this.f48905j = null;
        this.f48904i.m17310g(c15693l.f48917b, null, null);
    }
}
