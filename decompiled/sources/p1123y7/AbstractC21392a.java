package p1123y7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: y7.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21392a extends BroadcastReceiver {

    /* JADX INFO: renamed from: Y */
    public final AtomicBoolean f67901Y = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public final Intent m21774c(Context context, IntentFilter intentFilter) {
        AbstractC16544l.m18094g(context, "context");
        int i10 = Build.VERSION.SDK_INT;
        Intent intentRegisterReceiver = (i10 < 33 && i10 < 26) ? context.registerReceiver(this, intentFilter) : context.registerReceiver(this, intentFilter, 4);
        this.f67901Y.set(true);
        return intentRegisterReceiver;
    }
}
