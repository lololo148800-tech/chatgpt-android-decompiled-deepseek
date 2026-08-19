package p773h0;

import android.os.Build;
import androidx.compose.foundation.MagnifierElement;
import p049Bm.InterfaceC1436k;
import p156G1.C2974u;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: h0.f0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14282f0 {

    /* JADX INFO: renamed from: a */
    public static final C2974u f44819a = new C2974u("MagnifierPositionInRoot");

    /* JADX INFO: renamed from: a */
    public static boolean m15571a() {
        return Build.VERSION.SDK_INT >= 28;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC10459q m15572b(InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, InterfaceC14304q0 interfaceC14304q0) {
        return m15571a() ? new MagnifierElement(interfaceC1436k, null, interfaceC1436k2, Float.NaN, true, 9205357640488583168L, Float.NaN, Float.NaN, true, interfaceC14304q0) : C10456n.f30959Y;
    }
}
