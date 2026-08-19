package p283L5;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* JADX INFO: renamed from: L5.f */
/* JADX INFO: loaded from: classes.dex */
public final class C4940f implements InterfaceC4939e {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f16110b;

    /* JADX INFO: renamed from: c */
    public final ConnectivityManager f16111c;

    public /* synthetic */ C4940f(ConnectivityManager connectivityManager, int i10) {
        this.f16110b = i10;
        this.f16111c = connectivityManager;
    }

    @Override // p283L5.InterfaceC4939e
    /* JADX INFO: renamed from: a */
    public final boolean mo5548a() {
        switch (this.f16110b) {
            case 0:
                NetworkInfo activeNetworkInfo = this.f16111c.getActiveNetworkInfo();
                return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
            default:
                ConnectivityManager connectivityManager = this.f16111c;
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                return networkCapabilities != null && networkCapabilities.hasCapability(12);
        }
    }
}
