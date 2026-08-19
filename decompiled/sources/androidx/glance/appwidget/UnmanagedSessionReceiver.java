package androidx.glance.appwidget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.pairip.VMRunner;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p672c3.C11641y;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m18067d2 = {"Landroidx/glance/appwidget/UnmanagedSessionReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "c3/y", "glance-appwidget_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class UnmanagedSessionReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final C11641y f33220a = new C11641y();

    /* JADX INFO: renamed from: b */
    public static final LinkedHashMap f33221b = new LinkedHashMap();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        VMRunner.invoke("YaQeesF2YbKncDZ8", new Object[]{this, context, intent});
    }
}
