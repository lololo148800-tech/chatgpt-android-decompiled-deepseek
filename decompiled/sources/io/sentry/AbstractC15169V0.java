package io.sentry;

/* JADX INFO: renamed from: io.sentry.V0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15169V0 implements Comparable {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC15169V0 abstractC15169V0) {
        return Long.valueOf(mo16356d()).compareTo(Long.valueOf(abstractC15169V0.mo16356d()));
    }

    /* JADX INFO: renamed from: b */
    public long mo16354b(AbstractC15169V0 abstractC15169V0) {
        return mo16356d() - abstractC15169V0.mo16356d();
    }

    /* JADX INFO: renamed from: c */
    public long mo16355c(AbstractC15169V0 abstractC15169V0) {
        return (abstractC15169V0 == null || compareTo(abstractC15169V0) >= 0) ? mo16356d() : abstractC15169V0.mo16356d();
    }

    /* JADX INFO: renamed from: d */
    public abstract long mo16356d();
}
