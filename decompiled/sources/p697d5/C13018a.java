package p697d5;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: d5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C13018a {

    /* JADX INFO: renamed from: c */
    public static final C13018a f41302c;

    /* JADX INFO: renamed from: d */
    public static final C13018a f41303d;

    /* JADX INFO: renamed from: a */
    public final boolean f41304a;

    /* JADX INFO: renamed from: b */
    public final CancellationException f41305b;

    static {
        if (AbstractC13025h.f41322p0) {
            f41303d = null;
            f41302c = null;
        } else {
            f41303d = new C13018a(false, null);
            f41302c = new C13018a(true, null);
        }
    }

    public C13018a(boolean z6, CancellationException cancellationException) {
        this.f41304a = z6;
        this.f41305b = cancellationException;
    }
}
