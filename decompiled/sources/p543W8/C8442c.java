package p543W8;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import p523V9.AbstractC8158o4;
import p570X8.AbstractC9073a;
import p570X8.AbstractC9087o;
import p570X8.AbstractC9089q;
import p570X8.AbstractC9090r;
import p570X8.AbstractC9091s;
import p570X8.AbstractC9094v;
import p570X8.C9074b;
import p570X8.C9075c;
import p570X8.C9076d;
import p570X8.C9077e;
import p570X8.C9078f;
import p570X8.C9079g;
import p570X8.C9080h;
import p570X8.C9081i;
import p570X8.C9082j;
import p570X8.C9083k;
import p570X8.C9084l;
import p570X8.C9086n;
import p570X8.EnumC9092t;
import p570X8.EnumC9093u;
import p571X9.AbstractC9306j0;
import p593Y8.C9681h;
import p615Z6.C10252z0;
import p616Z8.InterfaceC10260h;
import p729ej.C13414e;
import p782h9.InterfaceC14430a;
import sb.C19517d;

/* JADX INFO: renamed from: W8.c */
/* JADX INFO: loaded from: classes.dex */
public final class C8442c implements InterfaceC10260h {

    /* JADX INFO: renamed from: a */
    public final C13414e f26284a;

    /* JADX INFO: renamed from: b */
    public final ConnectivityManager f26285b;

    /* JADX INFO: renamed from: c */
    public final Context f26286c;

    /* JADX INFO: renamed from: d */
    public final URL f26287d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC14430a f26288e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC14430a f26289f;

    /* JADX INFO: renamed from: g */
    public final int f26290g;

    public C8442c(Context context, InterfaceC14430a interfaceC14430a, InterfaceC14430a interfaceC14430a2) {
        C19517d c19517d = new C19517d();
        C9075c c9075c = C9075c.f27800a;
        c19517d.mo5857l(AbstractC9087o.class, c9075c);
        c19517d.mo5857l(C9081i.class, c9075c);
        C9078f c9078f = C9078f.f27813a;
        c19517d.mo5857l(AbstractC9091s.class, c9078f);
        c19517d.mo5857l(C9084l.class, c9078f);
        C9076d c9076d = C9076d.f27802a;
        c19517d.mo5857l(AbstractC9089q.class, c9076d);
        c19517d.mo5857l(C9082j.class, c9076d);
        C9074b c9074b = C9074b.f27787a;
        c19517d.mo5857l(AbstractC9073a.class, c9074b);
        c19517d.mo5857l(C9080h.class, c9074b);
        C9077e c9077e = C9077e.f27805a;
        c19517d.mo5857l(AbstractC9090r.class, c9077e);
        c19517d.mo5857l(C9083k.class, c9077e);
        C9079g c9079g = C9079g.f27821a;
        c19517d.mo5857l(AbstractC9094v.class, c9079g);
        c19517d.mo5857l(C9086n.class, c9079g);
        c19517d.f61985p0 = true;
        this.f26284a = new C13414e(c19517d);
        this.f26286c = context;
        this.f26285b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f26287d = m9043b(C8440a.f26275c);
        this.f26288e = interfaceC14430a2;
        this.f26289f = interfaceC14430a;
        this.f26290g = 130000;
    }

    /* JADX INFO: renamed from: b */
    public static URL m9043b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException(AbstractC9306j0.m9889h("Invalid url: ", str), e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00af  */
    /* JADX WARN: Code duplicated, block: B:30:0x010a  */
    /* JADX INFO: renamed from: a */
    public final C9681h m9044a(C9681h c9681h) {
        int type;
        int subtype;
        HashMap map;
        NetworkInfo activeNetworkInfo = this.f26285b.getActiveNetworkInfo();
        C10252z0 c10252z0M10269c = c9681h.m10269c();
        int i10 = Build.VERSION.SDK_INT;
        HashMap map2 = (HashMap) c10252z0M10269c.f30459r0;
        if (map2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map2.put("sdk-version", String.valueOf(i10));
        c10252z0M10269c.m10843d("model", Build.MODEL);
        c10252z0M10269c.m10843d("hardware", Build.HARDWARE);
        c10252z0M10269c.m10843d("device", Build.DEVICE);
        c10252z0M10269c.m10843d("product", Build.PRODUCT);
        c10252z0M10269c.m10843d("os-uild", Build.ID);
        c10252z0M10269c.m10843d("manufacturer", Build.MANUFACTURER);
        c10252z0M10269c.m10843d("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap map3 = (HashMap) c10252z0M10269c.f30459r0;
        if (map3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map3.put("tz-offset", String.valueOf(offset));
        int i11 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = EnumC9093u.f27858Y;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap map4 = (HashMap) c10252z0M10269c.f30459r0;
        if (map4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = EnumC9092t.f27856Y;
                subtype = 100;
            } else if (((EnumC9092t) EnumC9092t.f27856Y.get(subtype)) == null) {
            }
            map = (HashMap) c10252z0M10269c.f30459r0;
            if (map != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            map.put("mobile-subtype", String.valueOf(subtype));
            c10252z0M10269c.m10843d("country", Locale.getDefault().getCountry());
            c10252z0M10269c.m10843d("locale", Locale.getDefault().getLanguage());
            Context context = this.f26286c;
            c10252z0M10269c.m10843d("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i11 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e10) {
                AbstractC8158o4.m8718c("CctTransportBackend", "Unable to find version code for package", e10);
            }
            c10252z0M10269c.m10843d("application_build", Integer.toString(i11));
            return c10252z0M10269c.m10846f();
        }
        SparseArray sparseArray3 = EnumC9092t.f27856Y;
        subtype = 0;
        map = (HashMap) c10252z0M10269c.f30459r0;
        if (map != null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put("mobile-subtype", String.valueOf(subtype));
        c10252z0M10269c.m10843d("country", Locale.getDefault().getCountry());
        c10252z0M10269c.m10843d("locale", Locale.getDefault().getLanguage());
        Context context2 = this.f26286c;
        c10252z0M10269c.m10843d("mcc_mnc", ((TelephonyManager) context2.getSystemService("phone")).getSimOperator());
        i11 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
        c10252z0M10269c.m10843d("application_build", Integer.toString(i11));
        return c10252z0M10269c.m10846f();
    }
}
