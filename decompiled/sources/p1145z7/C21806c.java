package p1145z7;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p102Dm.AbstractC2119a;
import p1123y7.AbstractC21392a;
import p523V9.AbstractC7889G0;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17681o;
import p984r8.C18887a;

/* JADX INFO: renamed from: z7.c */
/* JADX INFO: loaded from: classes.dex */
public final class C21806c extends AbstractC21392a implements InterfaceC21813j {

    /* JADX INFO: renamed from: p0 */
    public static final Set f69164p0 = AbstractC17678l.m19293P(new EnumC21811h[]{EnumC21811h.f69175Z, EnumC21811h.f69178q0});

    /* JADX INFO: renamed from: q0 */
    public static final Set f69165q0 = AbstractC17678l.m19293P(new Integer[]{1, 4, 2});

    /* JADX INFO: renamed from: Z */
    public final InterfaceC11256c f69166Z;

    /* JADX INFO: renamed from: o0 */
    public C21812i f69167o0;

    public C21806c(InterfaceC11256c internalLogger) {
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        this.f69166Z = internalLogger;
        this.f69167o0 = new C21812i();
    }

    @Override // p1145z7.InterfaceC21813j
    /* JADX INFO: renamed from: a */
    public final void mo22289a(Context context) {
        if (this.f67901Y.compareAndSet(true, false)) {
            context.unregisterReceiver(this);
        }
    }

    @Override // p1145z7.InterfaceC21813j
    /* JADX INFO: renamed from: b */
    public final C21812i mo18884b() {
        return this.f69167o0;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        EnumC21811h enumC21811h;
        AbstractC16544l.m18094g(context, "context");
        String action = intent != null ? intent.getAction() : null;
        if (!AbstractC16544l.m18089b(action, "android.intent.action.BATTERY_CHANGED")) {
            if (!AbstractC16544l.m18089b(action, "android.os.action.POWER_SAVE_MODE_CHANGED")) {
                AbstractC7889G0.m8185c(this.f69166Z, 2, AbstractC17681o.m19382k(EnumC11255b.f34099Z, EnumC11255b.f34100o0), new C18887a(action, 5), null, 56);
                return;
            }
            Object systemService = context.getSystemService("power");
            PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
            this.f69167o0 = C21812i.m22290a(this.f69167o0, false, 0, powerManager != null ? powerManager.isPowerSaveMode() : false, false, 11);
            return;
        }
        int intExtra = intent.getIntExtra("status", 1);
        int intExtra2 = intent.getIntExtra("level", -1);
        int intExtra3 = intent.getIntExtra("scale", 100);
        int intExtra4 = intent.getIntExtra("plugged", -1);
        if (intExtra == 2) {
            enumC21811h = EnumC21811h.f69175Z;
        } else if (intExtra == 3) {
            enumC21811h = EnumC21811h.f69176o0;
        } else if (intExtra != 4) {
            enumC21811h = intExtra != 5 ? EnumC21811h.f69174Y : EnumC21811h.f69178q0;
        } else {
            enumC21811h = EnumC21811h.f69177p0;
        }
        this.f69167o0 = C21812i.m22290a(this.f69167o0, f69164p0.contains(enumC21811h), AbstractC2119a.m3195i((intExtra2 * 100.0f) / intExtra3), false, f69165q0.contains(Integer.valueOf(intExtra4)) || !intent.getBooleanExtra("present", true), 4);
    }
}
