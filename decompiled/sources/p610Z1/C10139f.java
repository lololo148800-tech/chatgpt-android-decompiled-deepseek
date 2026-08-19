package p610Z1;

import p832jb.AbstractC16182b;

/* JADX INFO: renamed from: Z1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C10139f extends AbstractC16182b {
    @Override // p832jb.AbstractC16182b
    /* JADX INFO: renamed from: b */
    public final boolean mo10732b(AbstractC10141h abstractC10141h, C10137d c10137d, C10137d c10137d2) {
        synchronized (abstractC10141h) {
            try {
                if (abstractC10141h.f30062Z != c10137d) {
                    return false;
                }
                abstractC10141h.f30062Z = c10137d2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p832jb.AbstractC16182b
    /* JADX INFO: renamed from: c */
    public final boolean mo10733c(AbstractC10141h abstractC10141h, Object obj, Object obj2) {
        synchronized (abstractC10141h) {
            try {
                if (abstractC10141h.f30061Y != obj) {
                    return false;
                }
                abstractC10141h.f30061Y = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p832jb.AbstractC16182b
    /* JADX INFO: renamed from: d */
    public final boolean mo10734d(AbstractC10141h abstractC10141h, C10140g c10140g, C10140g c10140g2) {
        synchronized (abstractC10141h) {
            try {
                if (abstractC10141h.f30063o0 != c10140g) {
                    return false;
                }
                abstractC10141h.f30063o0 = c10140g2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p832jb.AbstractC16182b
    /* JADX INFO: renamed from: e */
    public final void mo10735e(C10140g c10140g, C10140g c10140g2) {
        c10140g.f30056b = c10140g2;
    }

    @Override // p832jb.AbstractC16182b
    /* JADX INFO: renamed from: f */
    public final void mo10736f(C10140g c10140g, Thread thread) {
        c10140g.f30055a = thread;
    }
}
