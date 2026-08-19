package p305M3;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p1073w3.AbstractC20817s;
import p468T2.ThreadFactoryC7209a;

/* JADX INFO: renamed from: M3.l */
/* JADX INFO: loaded from: classes.dex */
public final class C5292l {

    /* JADX INFO: renamed from: d */
    public static final C5289i f17442d = new C5289i(2, -9223372036854775807L);

    /* JADX INFO: renamed from: e */
    public static final C5289i f17443e = new C5289i(3, -9223372036854775807L);

    /* JADX INFO: renamed from: a */
    public final ExecutorService f17444a;

    /* JADX INFO: renamed from: b */
    public HandlerC5290j f17445b;

    /* JADX INFO: renamed from: c */
    public IOException f17446c;

    public C5292l(String str) {
        String strConcat = "ExoPlayer:Loader:".concat(str);
        int i10 = AbstractC20817s.f66106a;
        this.f17444a = Executors.newSingleThreadExecutor(new ThreadFactoryC7209a(strConcat, 1));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5832a() {
        return this.f17445b != null;
    }
}
