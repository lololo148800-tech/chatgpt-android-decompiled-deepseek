package p823j3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import com.pairip.VMRunner;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: j3.d */
/* JADX INFO: loaded from: classes.dex */
public final class C16082d extends BroadcastReceiver {

    /* JADX INFO: renamed from: b */
    public static final List f49804b;

    /* JADX INFO: renamed from: c */
    public static final IntentFilter f49805c;

    /* JADX INFO: renamed from: a */
    public final C16084f f49806a;

    static {
        List listM19382k = AbstractC17681o.m19382k("android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.LIGHT_DEVICE_IDLE_MODE_CHANGED", "android.os.action.LOW_POWER_STANDBY_ENABLED_CHANGED");
        f49804b = listM19382k;
        IntentFilter intentFilter = new IntentFilter();
        Iterator it = listM19382k.iterator();
        while (it.hasNext()) {
            intentFilter.addAction((String) it.next());
        }
        f49805c = intentFilter;
    }

    public C16082d(C16084f c16084f) {
        this.f49806a = c16084f;
    }

    /* JADX INFO: renamed from: a */
    public final void m17647a(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        Object systemService = context.getSystemService("power");
        AbstractC16544l.m18092e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        PowerManager powerManager = (PowerManager) systemService;
        boolean zM17645a = C16079a.f49796a.m17645a(powerManager);
        if (i10 >= 33) {
            zM17645a = zM17645a || C16080b.f49797a.m17646a(powerManager);
        }
        if (zM17645a) {
            this.f49806a.invoke();
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        VMRunner.invoke("ILqfLgPz4gWmZTb2", new Object[]{this, context, intent});
    }
}
