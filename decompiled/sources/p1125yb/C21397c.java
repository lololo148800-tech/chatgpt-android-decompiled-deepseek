package p1125yb;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.net.TrafficStats;
import android.text.TextUtils;
import io.sentry.android.core.AbstractC15256t;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import p001A.AbstractC0010F;
import p013Ab.C0419a;
import p013Ab.C0420b;
import p013Ab.C0421c;
import p013Ab.C0422d;
import p013Ab.C0423e;
import p1060v9.AbstractC20502t;
import p1061vb.C20513d;
import p1104xb.InterfaceC21170a;
import p1148zb.C21830a;
import p1148zb.C21831b;
import p523V9.AbstractC7854B5;
import p746fa.C13599h;
import p746fa.C13606o;
import p832jb.C16187g;
import p888m8.C17198c;
import p890mb.C17206c;
import p890mb.C17216m;
import p904nb.ExecutorC17552i;
import sk.C19662a;

/* JADX INFO: renamed from: yb.c */
/* JADX INFO: loaded from: classes.dex */
public final class C21397c implements InterfaceC21398d {

    /* JADX INFO: renamed from: m */
    public static final Object f67927m = new Object();

    /* JADX INFO: renamed from: a */
    public final C16187g f67928a;

    /* JADX INFO: renamed from: b */
    public final C0422d f67929b;

    /* JADX INFO: renamed from: c */
    public final C19662a f67930c;

    /* JADX INFO: renamed from: d */
    public final C21404j f67931d;

    /* JADX INFO: renamed from: e */
    public final C17216m f67932e;

    /* JADX INFO: renamed from: f */
    public final C21402h f67933f;

    /* JADX INFO: renamed from: g */
    public final Object f67934g;

    /* JADX INFO: renamed from: h */
    public final ExecutorService f67935h;

    /* JADX INFO: renamed from: i */
    public final ExecutorC17552i f67936i;

    /* JADX INFO: renamed from: j */
    public String f67937j;

    /* JADX INFO: renamed from: k */
    public final HashSet f67938k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f67939l;

    static {
        new AtomicInteger(1);
    }

    public C21397c(C16187g c16187g, InterfaceC21170a interfaceC21170a, ExecutorService executorService, ExecutorC17552i executorC17552i) {
        c16187g.m17794a();
        C0422d c0422d = new C0422d(c16187g.f50235a, interfaceC21170a);
        C19662a c19662a = new C19662a(c16187g);
        if (C20513d.f65129Y == null) {
            C20513d.f65129Y = new C20513d();
        }
        C20513d c20513d = C20513d.f65129Y;
        if (C21404j.f67947d == null) {
            C21404j.f67947d = new C21404j(c20513d);
        }
        C21404j c21404j = C21404j.f67947d;
        C17216m c17216m = new C17216m(new C17206c(c16187g, 2));
        C21402h c21402h = new C21402h();
        this.f67934g = new Object();
        this.f67938k = new HashSet();
        this.f67939l = new ArrayList();
        this.f67928a = c16187g;
        this.f67929b = c0422d;
        this.f67930c = c19662a;
        this.f67931d = c21404j;
        this.f67932e = c17216m;
        this.f67933f = c21402h;
        this.f67935h = executorService;
        this.f67936i = executorC17552i;
    }

    /* JADX INFO: renamed from: a */
    public final void m21777a(InterfaceC21403i interfaceC21403i) {
        synchronized (this.f67934g) {
            this.f67939l.add(interfaceC21403i);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m21778b() {
        C21830a c21830aM20636h;
        synchronized (f67927m) {
            try {
                C16187g c16187g = this.f67928a;
                c16187g.m17794a();
                C19662a c19662aM20630b = C19662a.m20630b(c16187g.f50235a);
                try {
                    c21830aM20636h = this.f67930c.m20636h();
                    int i10 = c21830aM20636h.f69281b;
                    boolean z6 = true;
                    if (i10 != 2 && i10 != 1) {
                        z6 = false;
                    }
                    if (z6) {
                        String strM21784h = m21784h(c21830aM20636h);
                        C19662a c19662a = this.f67930c;
                        C17198c c17198cM22314a = c21830aM20636h.m22314a();
                        c17198cM22314a.f54901b = strM21784h;
                        c17198cM22314a.f54900a = 3;
                        c21830aM20636h = c17198cM22314a.m18935h();
                        c19662a.m20635g(c21830aM20636h);
                    }
                    if (c19662aM20630b != null) {
                        c19662aM20630b.m20637i();
                    }
                } catch (Throwable th2) {
                    if (c19662aM20630b != null) {
                        c19662aM20630b.m20637i();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        m21787k(c21830aM20636h);
        this.f67936i.execute(new RunnableC21396b(this, 2));
    }

    /* JADX INFO: renamed from: c */
    public final C21830a m21779c(C21830a c21830a) throws C21399e {
        HttpURLConnection httpURLConnectionM1079c;
        C0421c c0421cM1075f;
        C16187g c16187g = this.f67928a;
        c16187g.m17794a();
        String str = c16187g.f50237c.f50249a;
        c16187g.m17794a();
        String str2 = c16187g.f50237c.f50255g;
        String str3 = c21830a.f69283d;
        C0422d c0422d = this.f67929b;
        C0423e c0423e = c0422d.f1391c;
        if (!c0423e.m1081b()) {
            throw new C21399e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlM1071a = C0422d.m1071a("projects/" + str2 + "/installations/" + c21830a.f69280a + "/authTokens:generate");
        int i10 = 0;
        while (true) {
            if (i10 > 1) {
                throw new C21399e("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32771);
            httpURLConnectionM1079c = c0422d.m1079c(urlM1071a, str);
            try {
                try {
                    httpURLConnectionM1079c.setRequestMethod("POST");
                    httpURLConnectionM1079c.addRequestProperty(SIPHeaderNames.AUTHORIZATION, "FIS_v2 " + str3);
                    httpURLConnectionM1079c.setDoOutput(true);
                    C0422d.m1077h(httpURLConnectionM1079c);
                    int responseCode = httpURLConnectionM1079c.getResponseCode();
                    c0423e.m1083d(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        c0421cM1075f = C0422d.m1075f(httpURLConnectionM1079c);
                        break;
                    }
                    C0422d.m1072b(httpURLConnectionM1079c, null, str, str2);
                    if (responseCode == 401 || responseCode == 404) {
                        C0420b c0420bM1070a = C0421c.m1070a();
                        c0420bM1070a.f1381Z = 3;
                        c0421cM1075f = c0420bM1070a.m1051f();
                        break;
                    }
                    if (responseCode == 429) {
                        throw new C21399e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        AbstractC15256t.m16465c("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        C0420b c0420bM1070a2 = C0421c.m1070a();
                        c0420bM1070a2.f1381Z = 2;
                        c0421cM1075f = c0420bM1070a2.m1051f();
                        break;
                    }
                    httpURLConnectionM1079c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i10++;
                } catch (Throwable th2) {
                    httpURLConnectionM1079c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
            } catch (IOException | AssertionError unused) {
            }
        }
        httpURLConnectionM1079c.disconnect();
        TrafficStats.clearThreadStatsTag();
        int iM24h = AbstractC0010F.m24h(c0421cM1075f.f1386c);
        if (iM24h == 0) {
            C21404j c21404j = this.f67931d;
            c21404j.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c21404j.f67948a.getClass();
            long seconds = timeUnit.toSeconds(System.currentTimeMillis());
            C17198c c17198cM22314a = c21830a.m22314a();
            c17198cM22314a.f54902c = c0421cM1075f.f1384a;
            c17198cM22314a.f54904e = Long.valueOf(c0421cM1075f.f1385b);
            c17198cM22314a.f54905f = Long.valueOf(seconds);
            return c17198cM22314a.m18935h();
        }
        if (iM24h == 1) {
            C17198c c17198cM22314a2 = c21830a.m22314a();
            c17198cM22314a2.f54906g = "BAD CONFIG";
            c17198cM22314a2.f54900a = 5;
            return c17198cM22314a2.m18935h();
        }
        if (iM24h != 2) {
            throw new C21399e("Firebase Installations Service is unavailable. Please try again later.");
        }
        m21788l(null);
        C17198c c17198cM22314a3 = c21830a.m22314a();
        c17198cM22314a3.f54900a = 2;
        return c17198cM22314a3.m18935h();
    }

    /* JADX INFO: renamed from: d */
    public final C13606o m21780d() {
        String str;
        m21783g();
        synchronized (this) {
            str = this.f67937j;
        }
        if (str != null) {
            return AbstractC7854B5.m8117e(str);
        }
        C13599h c13599h = new C13599h();
        m21777a(new C21401g(c13599h));
        C13606o c13606o = c13599h.f42961a;
        this.f67935h.execute(new RunnableC21396b(this, 0));
        return c13606o;
    }

    /* JADX INFO: renamed from: e */
    public final C13606o m21781e() {
        m21783g();
        C13599h c13599h = new C13599h();
        m21777a(new C21400f(this.f67931d, c13599h));
        this.f67935h.execute(new RunnableC21396b(this, 1));
        return c13599h.f42961a;
    }

    /* JADX INFO: renamed from: f */
    public final void m21782f(C21830a c21830a) {
        synchronized (f67927m) {
            try {
                C16187g c16187g = this.f67928a;
                c16187g.m17794a();
                C19662a c19662aM20630b = C19662a.m20630b(c16187g.f50235a);
                try {
                    this.f67930c.m20635g(c21830a);
                    if (c19662aM20630b != null) {
                        c19662aM20630b.m20637i();
                    }
                } catch (Throwable th2) {
                    if (c19662aM20630b != null) {
                        c19662aM20630b.m20637i();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m21783g() {
        C16187g c16187g = this.f67928a;
        c16187g.m17794a();
        AbstractC20502t.m21154e(c16187g.f50237c.f50250b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c16187g.m17794a();
        AbstractC20502t.m21154e(c16187g.f50237c.f50255g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c16187g.m17794a();
        AbstractC20502t.m21154e(c16187g.f50237c.f50249a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c16187g.m17794a();
        String str = c16187g.f50237c.f50250b;
        Pattern pattern = C21404j.f67946c;
        AbstractC20502t.m21150a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        c16187g.m17794a();
        AbstractC20502t.m21150a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", C21404j.f67946c.matcher(c16187g.f50237c.f50249a).matches());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0034 A[Catch: all -> 0x0036, DONT_GENERATE, TryCatch #0 {all -> 0x0036, blocks: (B:10:0x002e, B:12:0x0034, B:16:0x0038, B:17:0x003c), top: B:26:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0038 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:10:0x002e, B:12:0x0034, B:16:0x0038, B:17:0x003c), top: B:26:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX INFO: renamed from: h */
    public final String m21784h(C21830a c21830a) {
        C21831b c21831b;
        String strM22315a;
        C16187g c16187g = this.f67928a;
        c16187g.m17794a();
        if (!c16187g.f50236b.equals("CHIME_ANDROID_SDK")) {
            C16187g c16187g2 = this.f67928a;
            c16187g2.m17794a();
            if ("[DEFAULT]".equals(c16187g2.f50236b)) {
                if (c21830a.f69281b == 1) {
                    c21831b = (C21831b) this.f67932e.get();
                    synchronized (c21831b.f69288a) {
                        try {
                            strM22315a = c21831b.m22315a();
                            if (strM22315a != null) {
                                strM22315a = c21831b.m22316b();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (TextUtils.isEmpty(strM22315a)) {
                        return strM22315a;
                    }
                    this.f67933f.getClass();
                    return C21402h.m21792a();
                }
            }
        } else if (c21830a.f69281b == 1) {
            c21831b = (C21831b) this.f67932e.get();
            synchronized (c21831b.f69288a) {
                strM22315a = c21831b.m22315a();
                if (strM22315a != null) {
                    strM22315a = c21831b.m22316b();
                }
                if (TextUtils.isEmpty(strM22315a)) {
                    return strM22315a;
                }
                this.f67933f.getClass();
                return C21402h.m21792a();
            }
        }
        this.f67933f.getClass();
        return C21402h.m21792a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [Ab.d] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [Ab.a] */
    /* JADX INFO: renamed from: i */
    public final C21830a m21785i(C21830a c21830a) throws C21399e {
        String str = c21830a.f69280a;
        String string = null;
        if (str != null && str.length() == 11) {
            C21831b c21831b = (C21831b) this.f67932e.get();
            synchronized (c21831b.f69288a) {
                try {
                    String[] strArr = C21831b.f69287c;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= 4) {
                            break;
                        }
                        String str2 = strArr[i10];
                        String string2 = c21831b.f69288a.getString("|T|" + c21831b.f69289b + "|" + str2, null);
                        if (string2 != null && !string2.isEmpty()) {
                            if (string2.startsWith("{")) {
                                try {
                                    string = new JSONObject(string2).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                string = string2;
                            }
                            break;
                        }
                        i10++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        C0422d c0422d = this.f67929b;
        C16187g c16187g = this.f67928a;
        c16187g.m17794a();
        String str3 = c16187g.f50237c.f50249a;
        String str4 = c21830a.f69280a;
        C16187g c16187g2 = this.f67928a;
        c16187g2.m17794a();
        String str5 = c16187g2.f50237c.f50255g;
        C16187g c16187g3 = this.f67928a;
        c16187g3.m17794a();
        String str6 = c16187g3.f50237c.f50250b;
        C0423e c0423e = c0422d.f1391c;
        if (!c0423e.m1081b()) {
            throw new C21399e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlM1071a = C0422d.m1071a("projects/" + str5 + "/installations");
        int i11 = 0;
        C0419a c0419a = c0422d;
        while (i11 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionM1079c = c0419a.m1079c(urlM1071a, str3);
            try {
                try {
                    httpURLConnectionM1079c.setRequestMethod("POST");
                    httpURLConnectionM1079c.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionM1079c.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    C0422d.m1076g(httpURLConnectionM1079c, str4, str6);
                    int responseCode = httpURLConnectionM1079c.getResponseCode();
                    c0423e.m1083d(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        C0419a c0419aM1074e = C0422d.m1074e(httpURLConnectionM1079c);
                        httpURLConnectionM1079c.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        c0419a = c0419aM1074e;
                    } else {
                        try {
                            C0422d.m1072b(httpURLConnectionM1079c, str6, str3, str5);
                            if (responseCode == 429) {
                                throw new C21399e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                AbstractC15256t.m16465c("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                C0419a c0419a2 = new C0419a(null, null, null, null, 2);
                                httpURLConnectionM1079c.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                c0419a = c0419a2;
                            } else {
                                httpURLConnectionM1079c.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                i11++;
                                c0419a = c0419a;
                            }
                        } catch (IOException | AssertionError unused2) {
                            httpURLConnectionM1079c.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                        httpURLConnectionM1079c.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i11++;
                        c0419a = c0419a;
                    }
                    int iM24h = AbstractC0010F.m24h(c0419a.f1379e);
                    if (iM24h != 0) {
                        if (iM24h != 1) {
                            throw new C21399e("Firebase Installations Service is unavailable. Please try again later.");
                        }
                        C17198c c17198cM22314a = c21830a.m22314a();
                        c17198cM22314a.f54906g = "BAD CONFIG";
                        c17198cM22314a.f54900a = 5;
                        return c17198cM22314a.m18935h();
                    }
                    String str7 = c0419a.f1376b;
                    String str8 = c0419a.f1377c;
                    C21404j c21404j = this.f67931d;
                    c21404j.getClass();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    c21404j.f67948a.getClass();
                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                    C0421c c0421c = c0419a.f1378d;
                    String str9 = c0421c.f1384a;
                    long j10 = c0421c.f1385b;
                    C17198c c17198cM22314a2 = c21830a.m22314a();
                    c17198cM22314a2.f54901b = str7;
                    c17198cM22314a2.f54900a = 4;
                    c17198cM22314a2.f54902c = str9;
                    c17198cM22314a2.f54903d = str8;
                    c17198cM22314a2.f54904e = Long.valueOf(j10);
                    c17198cM22314a2.f54905f = Long.valueOf(seconds);
                    return c17198cM22314a2.m18935h();
                } catch (IOException | AssertionError unused3) {
                }
            } catch (Throwable th3) {
                httpURLConnectionM1079c.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th3;
            }
        }
        throw new C21399e("Firebase Installations Service is unavailable. Please try again later.");
    }

    /* JADX INFO: renamed from: j */
    public final void m21786j(Exception exc) {
        synchronized (this.f67934g) {
            try {
                Iterator it = this.f67939l.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC21403i) it.next()).mo21791b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m21787k(C21830a c21830a) {
        synchronized (this.f67934g) {
            try {
                Iterator it = this.f67939l.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC21403i) it.next()).mo21790a(c21830a)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final synchronized void m21788l(String str) {
        this.f67937j = str;
    }

    /* JADX INFO: renamed from: m */
    public final synchronized void m21789m(C21830a c21830a, C21830a c21830a2) {
        try {
            if (this.f67938k.size() != 0 && !TextUtils.equals(c21830a.f69280a, c21830a2.f69280a)) {
                Iterator it = this.f67938k.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
