package p468T2;

import android.os.Trace;
import p1072w2.AbstractC20798j;

/* JADX INFO: renamed from: T2.l */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC7220l implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f22907Y;

    public /* synthetic */ RunnableC7220l(int i10) {
        this.f22907Y = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22907Y) {
            case 0:
                try {
                    int i10 = AbstractC20798j.f66061a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (C7218j.m7610c()) {
                        C7218j.m7609a().m7612d();
                        break;
                    }
                    return;
                } finally {
                    int i11 = AbstractC20798j.f66061a;
                    Trace.endSection();
                }
            default:
                return;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m7617a() {
    }
}
