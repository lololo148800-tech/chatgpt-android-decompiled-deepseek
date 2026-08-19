package p484Ti;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.util.DisplayMetrics;
import bo.AbstractC11523k;
import bo.C11534v;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.segment.analytics.kotlin.core.AbstractC12774a;
import com.segment.analytics.kotlin.core.Settings;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.json.AbstractC16645d;
import kotlinx.serialization.json.C16644c;
import p025An.AbstractC0575H;
import p025An.C0611f0;
import p153Fn.C2925c;
import p523V9.AbstractC8010V3;
import p530Vi.AbstractC8320p;
import p530Vi.C8312h;
import p530Vi.C8317m;
import p530Vi.InterfaceC8294B;
import p554Wi.EnumC8881h;
import p554Wi.InterfaceC8882i;
import p582Xk.HXHG.bQBnquXS;
import p594Y9.AbstractC9804S3;
import p628Zk.GwZB.tpXhEMGxfXFVSh;
import p646aj.AbstractC10628h;

/* JADX INFO: renamed from: Ti.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C7476e implements InterfaceC8882i {
    public static final C7472a Companion = new C7472a();

    /* JADX INFO: renamed from: Y */
    public C8312h f23741Y;

    /* JADX INFO: renamed from: Z */
    public Context f23742Z;

    /* JADX INFO: renamed from: o0 */
    public InterfaceC8294B f23743o0;

    /* JADX INFO: renamed from: p0 */
    public C16644c f23744p0;

    /* JADX INFO: renamed from: q0 */
    public C16644c f23745q0;

    /* JADX INFO: renamed from: r0 */
    public C16644c f23746r0;

    /* JADX INFO: renamed from: s0 */
    public C16644c f23747s0;

    @Override // p554Wi.InterfaceC8882i
    /* JADX INFO: renamed from: b */
    public final void mo7803b(Settings settings, int i10) {
        AbstractC9804S3.m10428b(settings, i10);
    }

    @Override // p554Wi.InterfaceC8882i
    /* JADX INFO: renamed from: c */
    public final C8312h mo7804c() {
        C8312h c8312h = this.f23741Y;
        if (c8312h != null) {
            return c8312h;
        }
        AbstractC16544l.m18103p("analytics");
        throw null;
    }

    @Override // p554Wi.InterfaceC8882i
    public final EnumC8881h getType() {
        return EnumC8881h.f27183Y;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007c  */
    /* JADX WARN: Code duplicated, block: B:36:0x008c  */
    /* JADX WARN: Code duplicated, block: B:44:0x009d  */
    @Override // p554Wi.InterfaceC8882i
    /* JADX INFO: renamed from: a */
    public final AbstractC12774a mo7802a(AbstractC12774a abstractC12774a) {
        C11534v c11534v = new C11534v(0);
        AbstractC10628h.m11000b(c11534v, abstractC12774a.mo14507d());
        C16644c c16644c = this.f23744p0;
        String str = tpXhEMGxfXFVSh.KNJpnDQ;
        if (c16644c == null) {
            AbstractC16544l.m18103p(str);
            throw null;
        }
        c11534v.m12927c(str, c16644c);
        C16644c c16644c2 = this.f23746r0;
        if (c16644c2 == null) {
            AbstractC16544l.m18103p("device");
            throw null;
        }
        c11534v.m12927c("device", c16644c2);
        C16644c c16644c3 = this.f23745q0;
        if (c16644c3 == null) {
            AbstractC16544l.m18103p("os");
            throw null;
        }
        c11534v.m12927c("os", c16644c3);
        C16644c c16644c4 = this.f23747s0;
        if (c16644c4 == null) {
            AbstractC16544l.m18103p("screen");
            throw null;
        }
        c11534v.m12927c("screen", c16644c4);
        C11534v c11534v2 = new C11534v(0);
        Context context = this.f23742Z;
        if (context == null) {
            AbstractC16544l.m18103p("context");
            throw null;
        }
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
            Context context2 = this.f23742Z;
            if (context2 == null) {
                AbstractC16544l.m18103p("context");
                throw null;
            }
            Object systemService = context2.getSystemService("connectivity");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network[] allNetworks = connectivityManager.getAllNetworks();
            AbstractC16544l.m18093f(allNetworks, "connectivityManager.allNetworks");
            boolean z6 = false;
            boolean z10 = false;
            boolean z11 = false;
            for (Network network : allNetworks) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                if (z6) {
                    z6 = true;
                } else if (networkCapabilities != null ? networkCapabilities.hasTransport(1) : false) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z11) {
                    z11 = true;
                } else if (networkCapabilities != null ? networkCapabilities.hasTransport(0) : false) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10) {
                    z10 = true;
                } else if (networkCapabilities != null ? networkCapabilities.hasTransport(2) : false) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            AbstractC8010V3.m8324c(c11534v2, "wifi", Boolean.valueOf(z6));
            AbstractC8010V3.m8324c(c11534v2, "bluetooth", Boolean.valueOf(z10));
            AbstractC8010V3.m8324c(c11534v2, "cellular", Boolean.valueOf(z11));
        }
        c11534v.m12927c("network", c11534v2.m12925a());
        c11534v.m12927c("locale", AbstractC11523k.m12910c(Locale.getDefault().getLanguage() + '-' + Locale.getDefault().getCountry()));
        AbstractC10628h.m11001c(c11534v, "userAgent", System.getProperty("http.agent"));
        AbstractC10628h.m11001c(c11534v, "timezone", TimeZone.getDefault().getID());
        abstractC12774a.mo14515l(c11534v.m12925a());
        return abstractC12774a;
    }

    @Override // p554Wi.InterfaceC8882i
    /* JADX INFO: renamed from: d */
    public final void mo7805d(C8312h c8312h) {
        C16644c c16644cM12925a;
        this.f23741Y = c8312h;
        C8317m c8317m = c8312h.f25902Y;
        Object obj = c8317m.f25916b;
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type android.content.Context");
        this.f23742Z = (Context) obj;
        this.f23743o0 = c8312h.m8932b();
        boolean z6 = c8317m.f25918d;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AbstractC16645d element = AbstractC11523k.m12910c("Android");
        AbstractC16544l.m18094g(element, "element");
        AbstractC16645d element2 = AbstractC11523k.m12910c(Build.VERSION.RELEASE);
        AbstractC16544l.m18094g(element2, "element");
        this.f23745q0 = new C16644c(linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Context context = this.f23742Z;
        if (context == null) {
            AbstractC16544l.m18103p("context");
            throw null;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        AbstractC16645d element3 = AbstractC11523k.m12909b(Float.valueOf(displayMetrics.density));
        AbstractC16544l.m18094g(element3, "element");
        AbstractC16645d element4 = AbstractC11523k.m12909b(Integer.valueOf(displayMetrics.heightPixels));
        AbstractC16544l.m18094g(element4, "element");
        AbstractC16645d element5 = AbstractC11523k.m12909b(Integer.valueOf(displayMetrics.widthPixels));
        AbstractC16544l.m18094g(element5, "element");
        this.f23747s0 = new C16644c(linkedHashMap2);
        try {
            Context context2 = this.f23742Z;
            if (context2 == null) {
                AbstractC16544l.m18103p("context");
                throw null;
            }
            PackageManager packageManager = context2.getPackageManager();
            Context context3 = this.f23742Z;
            if (context3 == null) {
                AbstractC16544l.m18103p("context");
                throw null;
            }
            PackageInfo packageInfo = packageManager.getPackageInfo(context3.getPackageName(), 0);
            C11534v c11534v = new C11534v(0);
            AbstractC10628h.m11001c(c11534v, DiagnosticsEntry.NAME_KEY, packageInfo.applicationInfo.loadLabel(packageManager));
            AbstractC10628h.m11001c(c11534v, "version", packageInfo.versionName);
            AbstractC10628h.m11001c(c11534v, bQBnquXS.KUtlDjEoAuwSr, packageInfo.packageName);
            c11534v.m12927c("build", AbstractC11523k.m12910c(Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode)));
            c16644cM12925a = c11534v.m12925a();
            this.f23744p0 = c16644cM12925a;
            InterfaceC8294B interfaceC8294B = this.f23743o0;
            if (interfaceC8294B == null) {
                AbstractC16544l.m18103p("storage");
                throw null;
            }
            String strMo7525b = interfaceC8294B.mo7525b(9);
            if (strMo7525b == null) {
                strMo7525b = "";
            }
            C11534v c11534v2 = new C11534v(0);
            c11534v2.m12927c(ParameterNames.f31999ID, AbstractC11523k.m12910c(strMo7525b));
            c11534v2.m12927c("manufacturer", AbstractC11523k.m12910c(Build.MANUFACTURER));
            c11534v2.m12927c("model", AbstractC11523k.m12910c(Build.MODEL));
            c11534v2.m12927c(DiagnosticsEntry.NAME_KEY, AbstractC11523k.m12910c(Build.DEVICE));
            c11534v2.m12927c("type", AbstractC11523k.m12910c("android"));
            this.f23746r0 = c11534v2.m12925a();
            if (strMo7525b.length() == 0) {
                AbstractC0575H.m1156D((C2925c) mo7804c().f25903Z.f7437o0, (C0611f0) mo7804c().f25903Z.f7438p0, null, new C7475d(this, z6, null), 2);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            c16644cM12925a = AbstractC8320p.f25941a;
        }
    }
}
