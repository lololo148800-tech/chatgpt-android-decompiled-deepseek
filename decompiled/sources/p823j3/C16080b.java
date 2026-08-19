package p823j3;

import android.os.PowerManager;

/* JADX INFO: renamed from: j3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C16080b {

    /* JADX INFO: renamed from: a */
    public static final C16080b f49797a = new C16080b();

    /* JADX INFO: renamed from: a */
    public final boolean m17646a(PowerManager powerManager) {
        return powerManager.isLowPowerStandbyEnabled() || powerManager.isDeviceLightIdleMode();
    }
}
