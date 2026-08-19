package p697d5;

import p523V9.AbstractC7925K4;

/* JADX INFO: renamed from: d5.f */
/* JADX INFO: loaded from: classes.dex */
public final class C13023f extends AbstractC7925K4 {
    @Override // p523V9.AbstractC7925K4
    /* JADX INFO: renamed from: b */
    public final boolean mo8216b(AbstractC13025h abstractC13025h, C13020c c13020c, C13020c c13020c2) {
        synchronized (abstractC13025h) {
            try {
                if (abstractC13025h.f41327Z != c13020c) {
                    return false;
                }
                abstractC13025h.f41327Z = c13020c2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p523V9.AbstractC7925K4
    /* JADX INFO: renamed from: c */
    public final boolean mo8217c(AbstractC13025h abstractC13025h, Object obj, Object obj2) {
        synchronized (abstractC13025h) {
            try {
                if (abstractC13025h.f41326Y != obj) {
                    return false;
                }
                abstractC13025h.f41326Y = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p523V9.AbstractC7925K4
    /* JADX INFO: renamed from: d */
    public final boolean mo8218d(AbstractC13025h abstractC13025h, C13024g c13024g, C13024g c13024g2) {
        synchronized (abstractC13025h) {
            try {
                if (abstractC13025h.f41328o0 != c13024g) {
                    return false;
                }
                abstractC13025h.f41328o0 = c13024g2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p523V9.AbstractC7925K4
    /* JADX INFO: renamed from: g */
    public final void mo8219g(C13024g c13024g, C13024g c13024g2) {
        c13024g.f41321b = c13024g2;
    }

    @Override // p523V9.AbstractC7925K4
    /* JADX INFO: renamed from: h */
    public final void mo8220h(C13024g c13024g, Thread thread) {
        c13024g.f41320a = thread;
    }
}
