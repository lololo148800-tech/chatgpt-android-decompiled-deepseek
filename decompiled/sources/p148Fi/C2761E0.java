package p148Fi;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.pairip.VMRunner;
import kotlin.jvm.internal.AbstractC16544l;
import ni.C17629c;
import p103Dn.AbstractC2124C;
import p103Dn.C2127D0;

/* JADX INFO: renamed from: Fi.E0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2761E0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final Application f8459a;

    /* JADX INFO: renamed from: b */
    public final C17629c f8460b;

    /* JADX INFO: renamed from: c */
    public final C2864y0 f8461c;

    /* JADX INFO: renamed from: d */
    public final C2127D0 f8462d;

    /* JADX INFO: renamed from: e */
    public boolean f8463e;

    /* JADX INFO: renamed from: f */
    public final C2127D0 f8464f;

    public C2761E0(Application application, C17629c scope) {
        AbstractC16544l.m18094g(application, "application");
        AbstractC16544l.m18094g(scope, "scope");
        this.f8459a = application;
        this.f8460b = scope;
        this.f8461c = AbstractC2792U0.m3712c("VoiceModeBroadcastReceiver");
        C2127D0 c2127d0M3203b = AbstractC2124C.m3203b(0, 0, null, 7);
        this.f8462d = c2127d0M3203b;
        this.f8464f = c2127d0M3203b;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        VMRunner.invoke("0Lq1oYjEpeou4fC2", new Object[]{this, context, intent});
    }
}
