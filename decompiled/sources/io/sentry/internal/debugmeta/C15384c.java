package io.sentry.internal.debugmeta;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.gov.nist.core.Separators;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Bundle;
import android.os.Handler;
import android.util.SparseIntArray;
import androidx.lifecycle.C11069E;
import com.openai.chatgpt.app.MainApplication;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import io.sentry.android.core.AbstractC15256t;
import io.sentry.clientreport.C15333a;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17312o;
import p001A.C0018J;
import p001A.C0042V0;
import p001A.C0084r;
import p001A.RunnableC0066i;
import p026Ao.AbstractC0668b;
import p026Ao.C0675i;
import p026Ao.C0678l;
import p037B9.MeDP.MpoABj;
import p049Bm.InterfaceC1436k;
import p117Eb.C2392v;
import p140Fa.C2685e;
import p140Fa.C2700t;
import p144Fe.AbstractC2721a;
import p178H.C3124Q;
import p178H.C3164p0;
import p178H.C3169s;
import p178H.InterfaceC3121N;
import p202I.C3535k;
import p221Ii.RunnableC3724c;
import p228J.C3822Y;
import p228J.InterfaceC3831d0;
import p228J.InterfaceC3833e0;
import p277L.ExecutorC4836i;
import p283L5.AbstractC4941g;
import p301M.InterfaceC5221c;
import p303M1.C5276b;
import p310M9.C5311e;
import p357Oa.C6161n;
import p451Sb.C7102a;
import p474T8.C7271i;
import p474T8.C7277o;
import p474T8.InterfaceC7263a;
import p474T8.InterfaceC7272j;
import p520V5.C7770H;
import p523V9.AbstractC8072d6;
import p544W9.AbstractC8488H2;
import p544W9.AbstractC8577W2;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9306j0;
import p572Xa.C9408b;
import p610Z1.C10142i;
import p610Z1.C10145l;
import p655b2.C11220d;
import p655b2.C11221e;
import p658b5.C11232c;
import p658b5.C11241l;
import p661b7.InterfaceC11256c;
import p720e6.C13287b;
import p720e6.C13288c;
import p746fa.C13599h;
import p746fa.C13606o;
import p746fa.InterfaceC13592a;
import p746fa.InterfaceC13594c;
import p764g6.AbstractC13821a;
import p784hb.C14437f;
import p817j$.util.concurrent.ConcurrentHashMap;
import p890mb.C17206c;
import p909nm.C17689w;
import p972qm.C18778k;
import p985r9.C18892b;
import p985r9.C18894d;
import p985r9.ExecutorC18898h;

/* JADX INFO: renamed from: io.sentry.internal.debugmeta.c */
/* JADX INFO: loaded from: classes3.dex */
public class C15384c implements InterfaceC15382a, InterfaceC5221c, InterfaceC3833e0, InterfaceC13594c, InterfaceC7263a, InterfaceC3121N, InterfaceC13592a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f47966Y;

    /* JADX INFO: renamed from: Z */
    public Object f47967Z;

    /* JADX INFO: renamed from: o0 */
    public Object f47968o0;

    public /* synthetic */ C15384c(int i10, boolean z6) {
        this.f47966Y = i10;
    }

    /* JADX INFO: renamed from: p */
    public static int m16634p(int i10, int i11) {
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            i12++;
            if (i12 == i11) {
                i13++;
                i12 = 0;
            } else if (i12 > i11) {
                i13++;
                i12 = 1;
            }
        }
        return i12 + 1 > i11 ? i13 + 1 : i13;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003a A[Catch: IOException -> 0x005b, TryCatch #0 {IOException -> 0x005b, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:21:0x0042, B:19:0x003a, B:20:0x003d, B:23:0x0047, B:24:0x004a, B:27:0x005d), top: B:31:0x0000 }] */
    /* JADX INFO: renamed from: u */
    public static C15384c m16635u(String... strArr) {
        String str;
        try {
            C0678l[] c0678lArr = new C0678l[strArr.length];
            C0675i c0675i = new C0675i();
            for (int i10 = 0; i10 < strArr.length; i10++) {
                String str2 = strArr[i10];
                String[] strArr2 = AbstractC13821a.f43825q0;
                c0675i.m1436f1(34);
                int length = str2.length();
                int i11 = 0;
                for (int i12 = 0; i12 < length; i12++) {
                    char cCharAt = str2.charAt(i12);
                    if (cCharAt < 128) {
                        str = strArr2[cCharAt];
                        if (str != null) {
                            if (i11 < i12) {
                                c0675i.m1443k1(i11, i12, str2);
                            }
                            c0675i.m1444l1(str);
                            i11 = i12 + 1;
                        }
                    } else {
                        if (cCharAt == 8232) {
                            str = "\\u2028";
                        } else if (cCharAt == 8233) {
                            str = "\\u2029";
                        }
                        if (i11 < i12) {
                            c0675i.m1443k1(i11, i12, str2);
                        }
                        c0675i.m1444l1(str);
                        i11 = i12 + 1;
                    }
                }
                if (i11 < length) {
                    c0675i.m1443k1(i11, length, str2);
                }
                c0675i.m1436f1(34);
                c0675i.readByte();
                c0678lArr[i10] = c0675i.m1417C0(c0675i.f1970Z);
            }
            return new C15384c((String[]) strArr.clone(), 21, AbstractC0668b.m1407g(c0678lArr));
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    /* JADX INFO: renamed from: v */
    private final void m16636v(C13606o c13606o) {
        C6161n c6161n = (C6161n) this.f47967Z;
        C13599h c13599h = (C13599h) this.f47968o0;
        synchronized (c6161n.f20055f) {
            c6161n.f20054e.remove(c13599h);
        }
    }

    @Override // p301M.InterfaceC5221c
    /* JADX INFO: renamed from: J */
    public void mo3912J(Throwable th2) {
        switch (this.f47966Y) {
            case 6:
                if (!(th2 instanceof C3164p0)) {
                    AbstractC4941g.m5559R(null, ((C10142i) this.f47967Z).m10747a(null));
                } else {
                    AbstractC4941g.m5559R(null, ((C10145l) this.f47968o0).cancel(false));
                }
                break;
            case 7:
                AbstractC8488H2.m9140a();
                C2392v c2392v = (C2392v) this.f47968o0;
                if (((C3535k) this.f47967Z) == ((C3535k) c2392v.f7436Z)) {
                    AbstractC8072d6.m8492i("CaptureNode", "request aborted, id=" + ((C3535k) c2392v.f7436Z).f10689a);
                    C11241l c11241l = (C11241l) c2392v.f7440r0;
                    if (c11241l != null) {
                        c11241l.f34017Z = null;
                    }
                    c2392v.f7436Z = null;
                }
                break;
            default:
                ((C10142i) this.f47967Z).m10748b(th2);
                break;
        }
    }

    @Override // p746fa.InterfaceC13592a
    /* JADX INFO: renamed from: L */
    public Object mo253L(C13606o c13606o) {
        Bundle bundle;
        C18892b c18892b = (C18892b) this.f47967Z;
        c18892b.getClass();
        return (c13606o.m15132k() && (bundle = (Bundle) c13606o.m15130i()) != null && bundle.containsKey("google.messenger")) ? c18892b.m20206a((Bundle) this.f47968o0).m15133l(ExecutorC18898h.f60246o0, C18894d.f60241p0) : c13606o;
    }

    @Override // p474T8.InterfaceC7263a
    /* JADX INFO: renamed from: a */
    public List mo7721a() {
        return (ArrayList) this.f47967Z;
    }

    @Override // p474T8.InterfaceC7263a
    /* JADX INFO: renamed from: b */
    public boolean mo7722b() {
        return false;
    }

    @Override // p178H.InterfaceC3121N
    /* JADX INFO: renamed from: c */
    public void mo3915c(C3124Q c3124q) {
        ((C18778k) this.f47967Z).resumeWith(new C17312o(AbstractC9233X.m9806b(c3124q)));
    }

    @Override // p474T8.InterfaceC7263a
    /* JADX INFO: renamed from: d */
    public List mo7723d() {
        return (C17689w) this.f47968o0;
    }

    @Override // p228J.InterfaceC3833e0
    /* JADX INFO: renamed from: e */
    public void mo4563e(Executor executor, InterfaceC3831d0 interfaceC3831d0) {
        synchronized (((HashMap) this.f47968o0)) {
            C3822Y c3822y = (C3822Y) ((HashMap) this.f47968o0).get(interfaceC3831d0);
            if (c3822y != null) {
                c3822y.f11574Y.set(false);
            }
            C3822Y c3822y2 = new C3822Y(executor, (C0042V0) interfaceC3831d0);
            ((HashMap) this.f47968o0).put(interfaceC3831d0, c3822y2);
            AbstractC8577W2.m9243e().execute(new RunnableC0066i(this, c3822y, c3822y2, 9));
        }
    }

    @Override // p178H.InterfaceC3121N
    /* JADX INFO: renamed from: f */
    public void mo3917f(C13288c outputFileResults) {
        AbstractC16544l.m18094g(outputFileResults, "outputFileResults");
        ((C18778k) this.f47967Z).resumeWith(new C17312o((File) this.f47968o0));
    }

    @Override // p474T8.InterfaceC7263a
    /* JADX INFO: renamed from: g */
    public boolean mo7724g() {
        return false;
    }

    @Override // io.sentry.internal.debugmeta.InterfaceC15382a
    /* JADX INFO: renamed from: h */
    public List mo16633h() {
        switch (this.f47966Y) {
            case 0:
                InterfaceC15127H interfaceC15127H = (InterfaceC15127H) this.f47967Z;
                ArrayList arrayList = new ArrayList();
                try {
                    Enumeration<URL> resources = ((ClassLoader) this.f47968o0).getResources("sentry-debug-meta.properties");
                    while (resources.hasMoreElements()) {
                        URL urlNextElement = resources.nextElement();
                        try {
                            InputStream inputStreamOpenStream = urlNextElement.openStream();
                            try {
                                Properties properties = new Properties();
                                properties.load(inputStreamOpenStream);
                                arrayList.add(properties);
                                interfaceC15127H.mo16298o(EnumC15375i1.INFO, "Debug Meta Data Properties loaded from %s", urlNextElement);
                                if (inputStreamOpenStream != null) {
                                    inputStreamOpenStream.close();
                                }
                            } catch (Throwable th2) {
                                if (inputStreamOpenStream != null) {
                                    try {
                                        inputStreamOpenStream.close();
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                    }
                                    break;
                                }
                                throw th2;
                            }
                        } catch (RuntimeException e10) {
                            interfaceC15127H.mo16296g(EnumC15375i1.ERROR, e10, "%s file is malformed.", urlNextElement);
                        }
                        break;
                    }
                } catch (IOException e11) {
                    interfaceC15127H.mo16296g(EnumC15375i1.ERROR, e11, "Failed to load %s", "sentry-debug-meta.properties");
                }
                if (!arrayList.isEmpty()) {
                    return arrayList;
                }
                interfaceC15127H.mo16298o(EnumC15375i1.INFO, "No %s file was found.", "sentry-debug-meta.properties");
                return null;
            default:
                InterfaceC15127H interfaceC15127H2 = (InterfaceC15127H) this.f47967Z;
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(((Context) this.f47968o0).getAssets().open("sentry-debug-meta.properties"));
                    try {
                        Properties properties2 = new Properties();
                        properties2.load(bufferedInputStream);
                        List listSingletonList = Collections.singletonList(properties2);
                        bufferedInputStream.close();
                        return listSingletonList;
                    } catch (Throwable th4) {
                        try {
                            bufferedInputStream.close();
                            break;
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                } catch (FileNotFoundException e12) {
                    interfaceC15127H2.mo16296g(EnumC15375i1.INFO, e12, "%s file was not found.", "sentry-debug-meta.properties");
                    return null;
                } catch (IOException e13) {
                    interfaceC15127H2.mo16297h(EnumC15375i1.ERROR, "Error getting Proguard UUIDs.", e13);
                    return null;
                } catch (RuntimeException e14) {
                    interfaceC15127H2.mo16296g(EnumC15375i1.ERROR, e14, "%s file is malformed.", "sentry-debug-meta.properties");
                    return null;
                }
        }
    }

    @Override // p228J.InterfaceC3833e0
    /* JADX INFO: renamed from: i */
    public void mo4565i(InterfaceC3831d0 interfaceC3831d0) {
        synchronized (((HashMap) this.f47968o0)) {
            try {
                C3822Y c3822y = (C3822Y) ((HashMap) this.f47968o0).remove(interfaceC3831d0);
                if (c3822y != null) {
                    c3822y.f11574Y.set(false);
                    AbstractC8577W2.m9243e().execute(new RunnableC3724c(this, 3, c3822y));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m16637k() {
        C5311e c5311e = (C5311e) this.f47967Z;
        if (c5311e != null) {
            ((AtomicBoolean) c5311e.f17485o0).set(true);
            ((ScheduledFuture) c5311e.f17484Z).cancel(true);
        }
        this.f47967Z = null;
    }

    /* JADX INFO: renamed from: l */
    public int mo1474l(ArrayList arrayList, ExecutorC4836i executorC4836i, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f47967Z).captureBurst(arrayList, new C0084r(executorC4836i, captureCallback), (Handler) ((C13287b) this.f47968o0).f42000Z);
    }

    /* JADX INFO: renamed from: m */
    public void m16638m() {
        this.f47967Z = null;
        this.f47968o0 = null;
    }

    /* JADX INFO: renamed from: o */
    public Object m16640o(Class key) {
        AbstractC16544l.m18094g(key, "key");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f47968o0;
        V v2 = concurrentHashMap.get(key);
        if (v2 != 0) {
            return v2;
        }
        Object objInvoke = ((InterfaceC1436k) this.f47967Z).invoke(key);
        V vPutIfAbsent = concurrentHashMap.putIfAbsent(key, objInvoke);
        return vPutIfAbsent == 0 ? objInvoke : vPutIfAbsent;
    }

    @Override // p301M.InterfaceC5221c, p746fa.InterfaceC13596e
    public void onSuccess(Object obj) {
        switch (this.f47966Y) {
            case 6:
                AbstractC4941g.m5559R(null, ((C10142i) this.f47967Z).m10747a(null));
                break;
            case 7:
                break;
            default:
                ((C10142i) this.f47967Z).m10747a((C3169s) this.f47968o0);
                break;
        }
    }

    /* JADX INFO: renamed from: q */
    public Object mo8038q(C2700t c2700t) {
        return (C7770H) this.f47968o0;
    }

    /* JADX INFO: renamed from: r */
    public Object m16641r(float f10, float f11, Object obj, Object obj2, float f12, float f13, float f14) {
        C2700t c2700t = (C2700t) this.f47967Z;
        c2700t.f8305a = f10;
        c2700t.f8306b = f11;
        c2700t.f8310f = obj;
        c2700t.f8311g = obj2;
        c2700t.f8307c = f12;
        c2700t.f8308d = f13;
        c2700t.f8309e = f14;
        return mo8038q(c2700t);
    }

    /* JADX INFO: renamed from: s */
    public void m16642s() {
        ((SparseIntArray) this.f47967Z).clear();
    }

    @Override // p746fa.InterfaceC13594c
    /* JADX INFO: renamed from: t */
    public void mo258t(C13606o c13606o) {
        switch (this.f47966Y) {
            case 11:
                m16636v(c13606o);
                return;
            default:
                C9408b c9408b = (C9408b) this.f47967Z;
                C13599h c13599h = (C13599h) this.f47968o0;
                synchronized (c9408b.f28372f) {
                    c9408b.f28371e.remove(c13599h);
                    break;
                }
                return;
        }
    }

    public String toString() {
        switch (this.f47966Y) {
            case 20:
                String string = "[ ";
                if (((C11221e) this.f47967Z) != null) {
                    for (int i10 = 0; i10 < 9; i10++) {
                        StringBuilder sbM9893l = AbstractC9306j0.m9893l(string);
                        sbM9893l.append(((C11221e) this.f47967Z).f33974t0[i10]);
                        sbM9893l.append(Separators.f31991SP);
                        string = sbM9893l.toString();
                    }
                }
                StringBuilder sbM9895n = AbstractC9306j0.m9895n(string, "] ");
                sbM9895n.append((C11221e) this.f47967Z);
                return sbM9895n.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: w */
    public int mo1475w(CaptureRequest captureRequest, ExecutorC4836i executorC4836i, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f47967Z).setRepeatingRequest(captureRequest, new C0084r(executorC4836i, captureCallback), (Handler) ((C13287b) this.f47968o0).f42000Z);
    }

    public /* synthetic */ C15384c(Object obj, int i10) {
        this.f47966Y = i10;
        this.f47967Z = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List] */
    /* JADX INFO: renamed from: n */
    public ArrayList m16639n() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        C14437f c14437f = (C14437f) this.f47968o0;
        Context context = (Context) this.f47967Z;
        String str = MpoABj.SPXtjgOMqm;
        Class cls = (Class) c14437f.f45413Y;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                AbstractC15256t.m16482t(str, "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) cls), 128);
                if (serviceInfo == null) {
                    AbstractC15256t.m16482t(str, cls + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            AbstractC15256t.m16482t(str, "Application info not found.");
        }
        if (bundle == null) {
            AbstractC15256t.m16482t(str, "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C17206c((String) it.next(), 0));
        }
        return arrayList2;
    }

    public /* synthetic */ C15384c(Object obj, int i10, Object obj2) {
        this.f47966Y = i10;
        this.f47967Z = obj;
        this.f47968o0 = obj2;
    }

    public /* synthetic */ C15384c(Object obj, Object obj2, boolean z6, int i10) {
        this.f47966Y = i10;
        this.f47968o0 = obj;
        this.f47967Z = obj2;
    }

    public C15384c(C7102a c7102a, C15333a c15333a) {
        this.f47966Y = 12;
        C11232c c11232c = AbstractC2721a.f8363a;
        this.f47967Z = c7102a;
        this.f47968o0 = c15333a;
    }

    public C15384c(InterfaceC11256c internalLogger) {
        this.f47966Y = 22;
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        this.f47967Z = internalLogger;
        this.f47968o0 = new ConcurrentHashMap();
    }

    public C15384c(InterfaceC1436k interfaceC1436k) {
        this.f47966Y = 9;
        this.f47967Z = interfaceC1436k;
        this.f47968o0 = new ConcurrentHashMap();
    }

    public C15384c(InterfaceC15127H interfaceC15127H) {
        this.f47966Y = 0;
        ClassLoader classLoader = C15384c.class.getClassLoader();
        this.f47967Z = interfaceC15127H;
        this.f47968o0 = classLoader == null ? ClassLoader.getSystemClassLoader() : classLoader;
    }

    public C15384c(MainApplication mainApplication, InterfaceC15127H interfaceC15127H) {
        this.f47966Y = 25;
        Context applicationContext = mainApplication.getApplicationContext();
        this.f47968o0 = applicationContext != null ? applicationContext : mainApplication;
        this.f47967Z = interfaceC15127H;
    }

    @Override // p474T8.InterfaceC7263a
    /* JADX INFO: renamed from: j */
    public void mo7725j() {
    }

    public C15384c(C7770H c7770h) {
        this.f47966Y = 23;
        this.f47967Z = new C2700t();
        this.f47968o0 = c7770h;
    }

    public C15384c(CameraCaptureSession cameraCaptureSession, C13287b c13287b) {
        this.f47966Y = 2;
        cameraCaptureSession.getClass();
        this.f47967Z = cameraCaptureSession;
        this.f47968o0 = c13287b;
    }

    public C15384c(C11220d c11220d) {
        this.f47966Y = 20;
        this.f47968o0 = c11220d;
    }

    public C15384c(List list, Map permissionStatuses) {
        this.f47966Y = 14;
        AbstractC16544l.m18094g(permissionStatuses, "permissionStatuses");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = (String) list.get(i10);
            InterfaceC7272j interfaceC7272j = (InterfaceC7272j) permissionStatuses.get(str);
            if (interfaceC7272j == null) {
                interfaceC7272j = C7271i.f23054a;
            }
            arrayList.add(new C7277o(str, interfaceC7272j));
        }
        this.f47967Z = arrayList;
        this.f47968o0 = C17689w.f56480Y;
    }

    public C15384c(int i10) {
        this.f47966Y = i10;
        switch (i10) {
            case 8:
                this.f47967Z = new C11069E();
                this.f47968o0 = new HashMap();
                break;
            case 10:
                this.f47967Z = new C2685e();
                this.f47968o0 = new C5276b(16);
                break;
            case 23:
                this.f47967Z = new C2700t();
                this.f47968o0 = null;
                break;
            default:
                this.f47967Z = new SparseIntArray();
                this.f47968o0 = new SparseIntArray();
                break;
        }
    }

    public C15384c(C0018J c0018j) {
        this.f47966Y = 1;
        this.f47968o0 = c0018j;
        this.f47967Z = null;
    }
}
