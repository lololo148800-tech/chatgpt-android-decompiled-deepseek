package p610Z1;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: Z1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10134a {

    /* JADX INFO: renamed from: c */
    public static final C10134a f30039c;

    /* JADX INFO: renamed from: d */
    public static final C10134a f30040d;

    /* JADX INFO: renamed from: a */
    public final boolean f30041a;

    /* JADX INFO: renamed from: b */
    public final CancellationException f30042b;

    static {
        if (AbstractC10141h.f30057p0) {
            f30040d = null;
            f30039c = null;
        } else {
            f30040d = new C10134a(false, null);
            f30039c = new C10134a(true, null);
        }
    }

    public C10134a(boolean z6, CancellationException cancellationException) {
        this.f30041a = z6;
        this.f30042b = cancellationException;
    }
}
