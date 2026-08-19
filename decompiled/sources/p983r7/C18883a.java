package p983r7;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p1123y7.AbstractC21392a;
import p1145z7.C21807d;
import p1145z7.InterfaceC21808e;
import p165G9.C3024j;
import p310M9.C5311e;
import p676c7.C11685d;
import p909nm.AbstractC17665J;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: r7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C18883a extends AbstractC21392a implements InterfaceC18886d {

    /* JADX INFO: renamed from: q0 */
    public static final Set f60192q0 = AbstractC17678l.m19293P(new Integer[]{0, 4, 5, 2, 3});

    /* JADX INFO: renamed from: r0 */
    public static final Set f60193r0 = AbstractC17678l.m19293P(new Integer[]{1, 2, 4, 7, 11, 16});

    /* JADX INFO: renamed from: s0 */
    public static final Set f60194s0 = AbstractC17678l.m19293P(new Integer[]{3, 5, 6, 8, 9, 10, 12, 14, 15, 17});

    /* JADX INFO: renamed from: t0 */
    public static final Set f60195t0 = AbstractC17678l.m19293P(new Integer[]{13, 18, 19});

    /* JADX INFO: renamed from: u0 */
    public static final Set f60196u0 = AbstractC17665J.m19268h(20);

    /* JADX INFO: renamed from: Z */
    public final C5311e f60197Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC21808e f60198o0;

    /* JADX INFO: renamed from: p0 */
    public C11685d f60199p0;

    public C18883a(C5311e c5311e) {
        InterfaceC21808e.f69170n0.getClass();
        C3024j c3024j = C21807d.f69169b;
        this.f60197Z = c5311e;
        this.f60198o0 = c3024j;
        this.f60199p0 = new C11685d(0, null, null, null, null, null, null, 127);
    }

    @Override // p983r7.InterfaceC18886d
    /* JADX INFO: renamed from: a */
    public final void mo17961a(Context context) {
        if (this.f67901Y.compareAndSet(true, false)) {
            context.unregisterReceiver(this);
        }
    }

    @Override // p983r7.InterfaceC18886d
    /* JADX INFO: renamed from: k */
    public final void mo17962k(Context context) {
        AbstractC16544l.m18094g(context, "context");
        onReceive(context, m21774c(context, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE")));
    }

    @Override // p983r7.InterfaceC18886d
    /* JADX INFO: renamed from: o */
    public final C11685d mo17963o() {
        return this.f60199p0;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C11685d c11685d;
        String str;
        String str2;
        Object simCarrierIdName;
        AbstractC16544l.m18094g(context, "context");
        Object systemService = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            c11685d = new C11685d(1, null, null, null, null, null, null, 126);
        } else if (activeNetworkInfo.getType() == 1) {
            c11685d = new C11685d(3, null, null, null, null, null, null, 126);
        } else {
            int i10 = 9;
            if (activeNetworkInfo.getType() == 9) {
                c11685d = new C11685d(2, null, null, null, null, null, null, 126);
            } else if (f60192q0.contains(Integer.valueOf(activeNetworkInfo.getType()))) {
                int subtype = activeNetworkInfo.getSubtype();
                if (f60193r0.contains(Integer.valueOf(subtype))) {
                    i10 = 6;
                } else if (f60194s0.contains(Integer.valueOf(subtype))) {
                    i10 = 7;
                } else if (f60195t0.contains(Integer.valueOf(subtype))) {
                    i10 = 8;
                } else if (!f60196u0.contains(Integer.valueOf(subtype))) {
                    i10 = 10;
                }
                int i11 = i10;
                switch (subtype) {
                    case 1:
                        str = "GPRS";
                        str2 = str;
                        break;
                    case 2:
                        str = "Edge";
                        str2 = str;
                        break;
                    case 3:
                        str = "UMTS";
                        str2 = str;
                        break;
                    case 4:
                        str = "CDMA";
                        str2 = str;
                        break;
                    case 5:
                        str = "CDMAEVDORev0";
                        str2 = str;
                        break;
                    case 6:
                        str = "CDMAEVDORevA";
                        str2 = str;
                        break;
                    case 7:
                        str = "CDMA1x";
                        str2 = str;
                        break;
                    case 8:
                        str = "HSDPA";
                        str2 = str;
                        break;
                    case 9:
                        str = "HSUPA";
                        str2 = str;
                        break;
                    case 10:
                        str = "HSPA";
                        str2 = str;
                        break;
                    case 11:
                        str = "iDen";
                        str2 = str;
                        break;
                    case 12:
                        str = "CDMAEVDORevB";
                        str2 = str;
                        break;
                    case 13:
                        str = "LTE";
                        str2 = str;
                        break;
                    case 14:
                        str = "eHRPD";
                        str2 = str;
                        break;
                    case 15:
                        str = "HSPA+";
                        str2 = str;
                        break;
                    case 16:
                        str = "GSM";
                        str2 = str;
                        break;
                    case 17:
                        str = "TD_SCDMA";
                        str2 = str;
                        break;
                    case 18:
                        str = "IWLAN";
                        str2 = str;
                        break;
                    case 19:
                        str = "LTE_CA";
                        str2 = str;
                        break;
                    case 20:
                        str = "New Radio";
                        str2 = str;
                        break;
                    default:
                        str2 = null;
                        break;
                }
                if (((C3024j) this.f60198o0).f9112Z >= 28) {
                    Object systemService2 = context.getSystemService("phone");
                    TelephonyManager telephonyManager = systemService2 instanceof TelephonyManager ? (TelephonyManager) systemService2 : null;
                    if (telephonyManager == null || (simCarrierIdName = telephonyManager.getSimCarrierIdName()) == null) {
                        simCarrierIdName = "Unknown Carrier Name";
                    }
                    c11685d = new C11685d(i11, simCarrierIdName.toString(), telephonyManager != null ? Long.valueOf(telephonyManager.getSimCarrierId()) : null, null, null, null, str2, 56);
                } else {
                    c11685d = new C11685d(i11, null, null, null, null, null, str2, 62);
                }
            } else {
                c11685d = new C11685d(12, null, null, null, null, null, null, 126);
            }
        }
        this.f60199p0 = c11685d;
        this.f60197Z.m5846A(c11685d);
    }
}
