package p523V9;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.gov.nist.core.Separators;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.RunnableC0101z0;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1081wc.AbstractC20875V;
import p1081wc.InterfaceC20904w;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p1113xn.C21307a;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC4141u3;
import p229J0.AbstractC4152w2;
import p229J0.C3880A3;
import p229J0.C3949M0;
import p229J0.C4135t3;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p537W0.AbstractC8411c;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p746fa.C13599h;
import tf.C19913S;
import tf.C19914T;

/* JADX INFO: renamed from: V9.B4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7853B4 {
    /* JADX INFO: renamed from: a */
    public static final void m8109a(InterfaceC1426a onDismissRequest, InterfaceC1436k onShare, InterfaceC1426a onDeleteLink, boolean z6, boolean z10, boolean z11, String assetPointer, InterfaceC10459q interfaceC10459q, C3880A3 c3880a3, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        C3880A3 c3880a3M4785f;
        int i12;
        InterfaceC10459q interfaceC10459q3;
        C3880A3 c3880a4;
        AbstractC16544l.m18094g(onDismissRequest, "onDismissRequest");
        AbstractC16544l.m18094g(onShare, "onShare");
        AbstractC16544l.m18094g(onDeleteLink, "onDeleteLink");
        AbstractC16544l.m18094g(assetPointer, "assetPointer");
        c6021p.m6526U(1135671153);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(onDismissRequest) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onShare) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(onDeleteLink) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6544g(z6) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6544g(z10) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c6021p.m6544g(z11) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c6021p.m6542f(assetPointer) ? 1048576 : 524288;
        }
        int i13 = 12582912 | i11;
        if ((100663296 & i10) == 0) {
            i13 = 46137344 | i11;
        }
        if ((38347923 & i13) == 38347922 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q3 = interfaceC10459q;
            c3880a4 = c3880a3;
        } else {
            c6021p.m6519N();
            if ((i10 & 1) == 0 || c6021p.m6561x()) {
                interfaceC10459q2 = C10456n.f30959Y;
                c3880a3M4785f = AbstractC4152w2.m4785f(6, 2, c6021p, true);
                i12 = i13 & (-234881025);
            } else {
                c6021p.m6517L();
                interfaceC10459q2 = interfaceC10459q;
                c3880a3M4785f = c3880a3;
                i12 = i13 & (-234881025);
            }
            c6021p.m6554q();
            InterfaceC20904w interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            c6021p.m6524S(-270671773);
            Object objM6514H = c6021p.m6514H();
            if (objM6514H == C6013l.f19514a) {
                objM6514H = C5997d.m6430Q(Boolean.TRUE, C5975S.f19448r0);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC4152w2.m4780a(onDismissRequest, interfaceC10459q2, c3880a3M4785f, 0.0f, ((C4135t3) c6021p.m6548k(AbstractC4141u3.f13417a)).f13379c, ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12234p, 0L, 0.0f, 0L, null, null, null, AbstractC8411c.m8969c(-1422072882, c6021p, new C19913S(z11, onDeleteLink, onShare, z6, z10, onDismissRequest, assetPointer, (InterfaceC5985X) objM6514H, interfaceC20904w)), c6021p, (i12 & 14) | ((i12 >> 18) & 112), 384, 4040);
            interfaceC10459q3 = interfaceC10459q2;
            c3880a4 = c3880a3M4785f;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C19914T(onDismissRequest, onShare, onDeleteLink, z6, z10, z11, assetPointer, interfaceC10459q3, c3880a4, i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m8110b(String encoded) {
        AbstractC16544l.m18094g(encoded, "encoded");
        byte[] bArrDecode = Base64.decode(encoded, 11);
        AbstractC16544l.m18093f(bArrDecode, "decode(encoded, Base64.U…RAP or Base64.NO_PADDING)");
        return new String(bArrDecode, C21307a.f67720a);
    }

    /* JADX INFO: renamed from: c */
    public static void m8111c(Context context) {
        boolean z6;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (AbstractC7861C4.m8134b(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            z6 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? true : applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (Build.VERSION.SDK_INT >= 29) {
            new RunnableC0101z0(context, z6, new C13599h(), 2).run();
        } else {
            AbstractC7854B5.m8117e(null);
        }
    }

    /* JADX INFO: renamed from: d */
    public static String[] m8112d(String token) {
        AbstractC16544l.m18094g(token, "token");
        String[] strArr = (String[]) AbstractC21322p.m21697e0(token, new String[]{Separators.DOT}, 0, 6).toArray(new String[0]);
        if (strArr.length == 2 && AbstractC21329w.m21725l(token, Separators.DOT, false)) {
            strArr = new String[]{strArr[0], strArr[1], ""};
        }
        if (strArr.length == 3) {
            return strArr;
        }
        throw new IllegalArgumentException(String.format("The token was expected to have 3 parts, but got %s.", Arrays.copyOf(new Object[]{Integer.valueOf(strArr.length)}, 1)));
    }
}
