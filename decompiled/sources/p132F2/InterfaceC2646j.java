package p132F2;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: F2.j */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2646j {
    boolean isAvailableOnDevice();

    void onGetCredential(Context context, C2650n c2650n, CancellationSignal cancellationSignal, Executor executor, InterfaceC2644h interfaceC2644h);
}
