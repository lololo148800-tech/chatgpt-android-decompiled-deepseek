package p117Eb;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p1104xb.InterfaceC21170a;
import p720e6.C13287b;
import p890mb.C17216m;
import p904nb.ScheduledExecutorServiceC17549f;
import p904nb.ThreadFactoryC17545b;

/* JADX INFO: renamed from: Eb.l */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2382l implements InterfaceC21170a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7408a;

    public /* synthetic */ C2382l(int i10) {
        this.f7408a = i10;
    }

    @Override // p1104xb.InterfaceC21170a
    public final Object get() {
        switch (this.f7408a) {
            case 0:
                C13287b c13287b = FirebaseMessaging.f36849k;
                return null;
            case 1:
                return Collections.emptySet();
            case 2:
                return null;
            case 3:
                C17216m c17216m = ExecutorsRegistrar.f36842a;
                StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                int i10 = Build.VERSION.SDK_INT;
                builderDetectNetwork.detectResourceMismatches();
                if (i10 >= 26) {
                    builderDetectNetwork.detectUnbufferedIo();
                }
                return new ScheduledExecutorServiceC17549f(Executors.newFixedThreadPool(4, new ThreadFactoryC17545b("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f36845d.get());
            case 4:
                C17216m c17216m2 = ExecutorsRegistrar.f36842a;
                return new ScheduledExecutorServiceC17549f(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new ThreadFactoryC17545b("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f36845d.get());
            case 5:
                C17216m c17216m3 = ExecutorsRegistrar.f36842a;
                return new ScheduledExecutorServiceC17549f(Executors.newCachedThreadPool(new ThreadFactoryC17545b("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f36845d.get());
            default:
                C17216m c17216m4 = ExecutorsRegistrar.f36842a;
                return Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC17545b("Firebase Scheduler", 0, null));
        }
    }
}
