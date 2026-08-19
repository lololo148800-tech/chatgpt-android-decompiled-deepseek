package fo;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.javax.sip.C10808o;
import android.location.LocationManager;
import android.media.RingtoneManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.View;
import androidx.core.graphics.drawable.IconCompat;
import com.auth0.android.request.internal.C11845d;
import com.google.firebase.messaging.FirebaseMessagingService;
import io.sentry.android.core.AbstractC15256t;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.ReferenceQueue;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPInputStream;
import kotlin.jvm.internal.AbstractC16544l;
import leakcanary.KeyedWeakReference;
import mm.C17309l;
import mm.EnumC17307j;
import org.json.JSONArray;
import org.json.JSONException;
import p001A.C0013G0;
import p001A.C0017I0;
import p001A.RunnableC0074m;
import p003A1.AbstractC0232b0;
import p007A5.ComponentCallbacks2C0378m;
import p030B2.C0795z;
import p049Bm.InterfaceC1426a;
import p1032u4.C20109c;
import p1053v3.C20421b;
import p1056v5.InterfaceC20460e;
import p1060v9.AbstractC20502t;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1139z0.C21585H;
import p117Eb.AbstractC2375e;
import p117Eb.C2387q;
import p138F8.vJO.anhfj;
import p140Fa.C2685e;
import p197Hj.C3457c;
import p229J0.C3935J4;
import p229J0.C4055g1;
import p229J0.InterfaceC3923H4;
import p257K3.C4535c;
import p273Kl.C4721G0;
import p301M.RunnableC5228j;
import p303M1.AbstractC5275a;
import p303M1.C5276b;
import p303M1.C5277c;
import p328N1.C5576C;
import p328N1.C5586b;
import p328N1.C5589e;
import p328N1.C5593i;
import p328N1.C5594j;
import p328N1.C5595k;
import p328N1.InterfaceC5584K;
import p355O7.C6141c;
import p355O7.InterfaceC6142d;
import p372P3.InterfaceC6310B;
import p372P3.InterfaceC6316H;
import p372P3.InterfaceC6335q;
import p442S2.ChoreographerFrameCallbackC6987a;
import p446S6.C7024c;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p522V8.EnumC7837d;
import p523V9.AbstractC7854B5;
import p523V9.C7999U;
import p541W6.InterfaceC8434d;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9233X;
import p571X9.C9120E;
import p593Y8.C9682i;
import p594Y9.AbstractC9942o3;
import p604Yk.C10077b;
import p615Z6.AbstractC10199Y;
import p615Z6.C10173D;
import p615Z6.C10193S;
import p615Z6.C10194T;
import p615Z6.C10223l;
import p615Z6.C10233q;
import p615Z6.C10235r;
import p615Z6.C10248x0;
import p615Z6.C10252z0;
import p615Z6.InterfaceC10197W;
import p658b5.C11242m;
import p720e6.C13287b;
import p720e6.C13288c;
import p746fa.C13599h;
import p746fa.C13606o;
import p746fa.InterfaceC13594c;
import p758g0.C13796x;
import p758g0.InterfaceC13772l;
import p774h1.InterfaceC14362r;
import p817j$.util.DesugarCollections;
import p817j$.util.concurrent.ConcurrentHashMap;
import p821j1.C16037b;
import p841k.AbstractC16283c;
import p843k1.C16308b;
import p864l5.C16826m;
import p885m4.C17165o;
import p885m4.InterfaceC17157g;
import p885m4.InterfaceC17161k;
import p893n.C17365B;
import p896n2.AbstractC17464q;
import p896n2.C17462o;
import p896n2.C17463p;
import p896n2.C17465r;
import p909nm.AbstractC17659D;
import p960q9.C18655i;
import p961qb.InterfaceC18663d;
import p985r9.C18892b;
import p987rb.InterfaceC18910a;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: fo.h */
/* JADX INFO: loaded from: classes2.dex */
public class C13711h implements InterfaceC3923H4, InterfaceC18910a, InterfaceC6335q, InterfaceC13594c, InterfaceC17157g, InterfaceC20460e {

    /* JADX INFO: renamed from: q0 */
    public static C13711h f43257q0;

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f43258Y;

    /* JADX INFO: renamed from: Z */
    public Object f43259Z;

    /* JADX INFO: renamed from: o0 */
    public Object f43260o0;

    /* JADX INFO: renamed from: p0 */
    public Object f43261p0;

    public /* synthetic */ C13711h(int i10, boolean z6) {
        this.f43258Y = i10;
    }

    /* JADX INFO: renamed from: A */
    public static void m15177A(C13711h c13711h, C5576C c5576c, C5586b c5586b, Object obj) {
        c13711h.getClass();
        c5586b.getClass();
        C5594j c5594j = new C5594j(c5576c);
        synchronized (((C2685e) c13711h.f43261p0)) {
            try {
                if (obj == null) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m15178c(C13711h c13711h, Network network, boolean z6) {
        boolean z10;
        boolean z11 = false;
        for (Network network2 : ((ConnectivityManager) c13711h.f43259Z).getAllNetworks()) {
            if (AbstractC16544l.m18089b(network2, network)) {
                z10 = z6;
            } else {
                NetworkCapabilities networkCapabilities = ((ConnectivityManager) c13711h.f43259Z).getNetworkCapabilities(network2);
                z10 = networkCapabilities != null && networkCapabilities.hasCapability(12);
            }
            if (z10) {
                z11 = true;
                break;
            }
        }
        ComponentCallbacks2C0378m componentCallbacks2C0378m = (ComponentCallbacks2C0378m) c13711h.f43260o0;
        synchronized (componentCallbacks2C0378m) {
            try {
                if (((C16826m) componentCallbacks2C0378m.f1281Y.get()) != null) {
                    componentCallbacks2C0378m.f1285q0 = z11;
                } else {
                    componentCallbacks2C0378m.m1018b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public static AbstractC10199Y m15179r(InterfaceC10197W interfaceC10197W, String str) {
        AbstractC10199Y abstractC10199YM15179r;
        AbstractC10199Y abstractC10199Y = (AbstractC10199Y) interfaceC10197W;
        if (str.equals(abstractC10199Y.f30305c)) {
            return abstractC10199Y;
        }
        for (Object obj : interfaceC10197W.getChildren()) {
            if (obj instanceof AbstractC10199Y) {
                AbstractC10199Y abstractC10199Y2 = (AbstractC10199Y) obj;
                if (str.equals(abstractC10199Y2.f30305c)) {
                    return abstractC10199Y2;
                }
                if ((obj instanceof InterfaceC10197W) && (abstractC10199YM15179r = m15179r((InterfaceC10197W) obj, str)) != null) {
                    return abstractC10199YM15179r;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static C13711h m15180u(InputStream inputStream) {
        C6141c c6141c = new C6141c();
        c6141c.f20023q0 = null;
        c6141c.f20024r0 = null;
        c6141c.f20019Y = false;
        c6141c.f20021o0 = false;
        c6141c.f20025s0 = null;
        c6141c.f20026t0 = null;
        c6141c.f20022p0 = false;
        c6141c.f20027u0 = null;
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int i10 = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (i10 == 35615) {
                inputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
            }
        } catch (IOException unused) {
        }
        try {
            inputStream.mark(4096);
            c6141c.m6703C(inputStream);
            return (C13711h) c6141c.f20023q0;
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                AbstractC15256t.m16465c("SVGParser", "Exception thrown closing input stream");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0055  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ea  */
    /* JADX INFO: renamed from: B */
    public void m15181B(Canvas canvas, C21585H c21585h) {
        boolean z6;
        boolean z10;
        ArrayList arrayList;
        if (c21585h == null) {
            c21585h = new C21585H(11, (byte) 0);
        }
        if (((C10235r) c21585h.f68345o0) == null) {
            c21585h.f68345o0 = new C10235r(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        }
        C10252z0 c10252z0 = new C10252z0();
        c10252z0.f30454Y = canvas;
        c10252z0.f30455Z = this;
        C10194T c10194t = (C10194T) this.f43259Z;
        if (c10194t == null) {
            AbstractC15256t.m16482t("SVGAndroidRenderer", "Nothing to render. Document is empty.");
            return;
        }
        C10235r c10235r = c10194t.f30328o;
        C10233q c10233q = c10194t.f30319n;
        C4535c c4535c = (C4535c) c21585h.f68344Z;
        if (c4535c == null) {
            z6 = false;
        } else {
            ArrayList arrayList2 = c4535c.f14813Z;
            if ((arrayList2 != null ? arrayList2.size() : 0) > 0) {
                z6 = true;
            } else {
                z6 = false;
            }
        }
        if (z6) {
            ((C4535c) this.f43260o0).m5281g((C4535c) c21585h.f68344Z);
        }
        c10252z0.f30456o0 = new C10248x0();
        c10252z0.f30457p0 = new Stack();
        c10252z0.m10841b0((C10248x0) c10252z0.f30456o0, C10193S.m10774a());
        C10248x0 c10248x0 = (C10248x0) c10252z0.f30456o0;
        c10248x0.f30437f = null;
        c10248x0.f30439h = false;
        ((Stack) c10252z0.f30457p0).push(new C10248x0(c10248x0));
        c10252z0.f30459r0 = new Stack();
        c10252z0.f30458q0 = new Stack();
        Boolean bool = c10194t.f30306d;
        if (bool != null) {
            ((C10248x0) c10252z0.f30456o0).f30439h = bool.booleanValue();
        }
        c10252z0.m10837Y();
        C10235r c10235r2 = new C10235r((C10235r) c21585h.f68345o0);
        C10173D c10173d = c10194t.f30297r;
        if (c10173d != null) {
            c10235r2.f30392d = c10173d.m10766b(c10252z0, c10235r2.f30392d);
        }
        C10173D c10173d2 = c10194t.f30298s;
        if (c10173d2 != null) {
            c10235r2.f30393e = c10173d2.m10766b(c10252z0, c10235r2.f30393e);
        }
        c10252z0.m10827N(c10194t, c10235r2, c10235r, c10233q);
        c10252z0.m10836X();
        C4535c c4535c2 = (C4535c) c21585h.f68344Z;
        if (c4535c2 != null) {
            ArrayList arrayList3 = c4535c2.f14813Z;
            z10 = (arrayList3 != null ? arrayList3.size() : 0) > 0;
        }
        if (!z10 || (arrayList = ((C4535c) this.f43260o0).f14813Z) == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((C10223l) it.next()).f30351c == 2) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public AbstractC10199Y m15182C(String str) {
        String strSubstring;
        if (str == null) {
            return null;
        }
        if (str.startsWith(Separators.DOUBLE_QUOTE) && str.endsWith(Separators.DOUBLE_QUOTE)) {
            str = str.substring(1, str.length() - 1).replace("\\\"", Separators.DOUBLE_QUOTE);
        } else if (str.startsWith(Separators.QUOTE) && str.endsWith(Separators.QUOTE)) {
            str = str.substring(1, str.length() - 1).replace("\\'", Separators.QUOTE);
        }
        String strReplace = str.replace(anhfj.yBQbKjlLGgY, "").replace("\\A", Separators.RETURN);
        if (strReplace.length() <= 1 || !strReplace.startsWith(Separators.POUND) || (strSubstring = strReplace.substring(1)) == null || strSubstring.length() == 0) {
            return null;
        }
        if (strSubstring.equals(((C10194T) this.f43259Z).f30305c)) {
            return (C10194T) this.f43259Z;
        }
        HashMap map = (HashMap) this.f43261p0;
        if (map.containsKey(strSubstring)) {
            return (AbstractC10199Y) map.get(strSubstring);
        }
        AbstractC10199Y abstractC10199YM15179r = m15179r((C10194T) this.f43259Z, strSubstring);
        map.put(strSubstring, abstractC10199YM15179r);
        return abstractC10199YM15179r;
    }

    @Override // p372P3.InterfaceC6335q
    /* JADX INFO: renamed from: D */
    public InterfaceC6316H mo3044D(int i10, int i11) {
        InterfaceC6335q interfaceC6335q = (InterfaceC6335q) this.f43259Z;
        if (i11 != 3) {
            return interfaceC6335q.mo3044D(i10, i11);
        }
        SparseArray sparseArray = (SparseArray) this.f43261p0;
        C17165o c17165o = (C17165o) sparseArray.get(i10);
        if (c17165o != null) {
            return c17165o;
        }
        C17165o c17165o2 = new C17165o(interfaceC6335q.mo3044D(i10, i11), (InterfaceC17161k) this.f43260o0);
        sparseArray.put(i10, c17165o2);
        return c17165o2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: E */
    public Object m15183E(C5576C c5576c, C5586b c5586b, C5589e c5589e, AbstractC19687c abstractC19687c) {
        C5595k c5595k;
        C13711h c13711h;
        C5594j c5594j;
        if (abstractC19687c instanceof C5595k) {
            c5595k = (C5595k) abstractC19687c;
            int i10 = c5595k.f18130q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c5595k.f18130q0 = i10 - Integer.MIN_VALUE;
            } else {
                c5595k = new C5595k(this, abstractC19687c);
            }
        } else {
            c5595k = new C5595k(this, abstractC19687c);
        }
        Object obj = c5595k.f18128o0;
        Object obj2 = EnumC19250a.f61036Y;
        int i11 = c5595k.f18130q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            c5586b.getClass();
            C5594j c5594j2 = new C5594j(c5576c);
            synchronized (((C2685e) this.f43261p0)) {
                try {
                    C5593i c5593i = (C5593i) ((C5276b) this.f43259Z).m5785b(c5594j2);
                    if (c5593i == null) {
                        c5593i = (C5593i) ((C5277c) this.f43260o0).m5794a(c5594j2);
                    }
                    if (c5593i != null) {
                        return c5593i.f18124a;
                    }
                    c5595k.f18126Y = this;
                    c5595k.f18127Z = c5594j2;
                    c5595k.f18130q0 = 1;
                    Object objInvoke = c5589e.invoke(c5595k);
                    if (objInvoke == obj2) {
                        return obj2;
                    }
                    c13711h = this;
                    obj = objInvoke;
                    c5594j = c5594j2;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c5594j = c5595k.f18127Z;
            c13711h = c5595k.f18126Y;
            AbstractC9233X.m9807c(obj);
        }
        synchronized (((C2685e) c13711h.f43261p0)) {
            try {
                if (obj == null) {
                    ((C5277c) c13711h.f43260o0).m5797d(c5594j, new C5593i(null));
                } else {
                    ((C5276b) c13711h.f43259Z).m5788e(c5594j, new C5593i(obj));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return obj;
    }

    @Override // p372P3.InterfaceC6335q
    /* JADX INFO: renamed from: F */
    public void mo3045F(InterfaceC6310B interfaceC6310B) {
        ((InterfaceC6335q) this.f43259Z).mo3045F(interfaceC6310B);
    }

    /* JADX INFO: renamed from: G */
    public void m15184G(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f43259Z = str;
    }

    /* JADX INFO: renamed from: H */
    public void m15185H(InterfaceC14362r interfaceC14362r) {
        ((C16037b) this.f43261p0).f49478Y.f49476c = interfaceC14362r;
    }

    /* JADX INFO: renamed from: I */
    public void m15186I(InterfaceC7537b interfaceC7537b) {
        ((C16037b) this.f43261p0).f49478Y.f49474a = interfaceC7537b;
    }

    /* JADX INFO: renamed from: J */
    public void m15187J(C16308b c16308b) {
        this.f43260o0 = c16308b;
    }

    /* JADX INFO: renamed from: K */
    public void m15188K(EnumC7546k enumC7546k) {
        ((C16037b) this.f43261p0).f49478Y.f49475b = enumC7546k;
    }

    /* JADX INFO: renamed from: L */
    public void m15189L(long j10) {
        ((C16037b) this.f43261p0).f49478Y.f49477d = j10;
    }

    /* JADX INFO: renamed from: M */
    public C0017I0 m15190M(AbstractC9942o3 abstractC9942o3, String str, C11845d c11845d, C7024c c7024c) {
        C11845d c11845dM20002q = C11845d.f35974b.m20002q();
        InterfaceC8434d client = (InterfaceC8434d) this.f43259Z;
        AbstractC16544l.m18094g(client, "client");
        AbstractC16544l.m18094g(client, "client");
        C0017I0 c0017i0 = new C0017I0();
        c0017i0.f64Y = str;
        c0017i0.f65Z = client;
        c0017i0.f66o0 = c11845d;
        c0017i0.f67p0 = c7024c;
        c0017i0.f68q0 = c11845dM20002q;
        c0017i0.f69r0 = new C13711h(abstractC9942o3);
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f43260o0;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            c0017i0.m69c((String) entry.getKey(), (String) entry.getValue());
            arrayList.add(c0017i0);
        }
        return c0017i0;
    }

    /* JADX INFO: renamed from: N */
    public void m15191N(Object obj, String str) {
        C11242m c11242m = new C11242m();
        ((C11242m) this.f43261p0).f34020o0 = c11242m;
        this.f43261p0 = c11242m;
        c11242m.f34019Z = obj;
        c11242m.f34018Y = str;
    }

    @Override // p1056v5.InterfaceC20460e
    /* JADX INFO: renamed from: a */
    public boolean mo15192a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f43259Z;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    @Override // p229J0.InterfaceC3923H4
    /* JADX INFO: renamed from: b */
    public C13796x mo3545b() {
        return null;
    }

    @Override // p229J0.InterfaceC3923H4
    /* JADX INFO: renamed from: d */
    public InterfaceC13772l mo3547d() {
        return null;
    }

    @Override // p885m4.InterfaceC17157g
    /* JADX INFO: renamed from: e */
    public int mo10555e(long j10) {
        long[] jArr = (long[]) this.f43261p0;
        int iM21401b = AbstractC20817s.m21401b(jArr, j10, false);
        if (iM21401b < jArr.length) {
            return iM21401b;
        }
        return -1;
    }

    @Override // p229J0.InterfaceC3923H4
    /* JADX INFO: renamed from: f */
    public boolean mo3549f() {
        return true;
    }

    /* JADX INFO: renamed from: g */
    public C9682i m15193g() {
        String strConcat = ((String) this.f43259Z) == null ? " backendName" : "";
        if (((EnumC7837d) this.f43261p0) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new C9682i((String) this.f43259Z, (byte[]) this.f43260o0, (EnumC7837d) this.f43261p0);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    @Override // p229J0.InterfaceC3923H4
    public C3935J4 getState() {
        return (C3935J4) this.f43259Z;
    }

    @Override // p885m4.InterfaceC17157g
    /* JADX INFO: renamed from: h */
    public long mo10557h(int i10) {
        AbstractC20800b.m21316d(i10 >= 0);
        long[] jArr = (long[]) this.f43261p0;
        AbstractC20800b.m21316d(i10 < jArr.length);
        return jArr[i10];
    }

    /* JADX INFO: renamed from: i */
    public synchronized void m15194i(Object watchedObject, String description) {
        KeyedWeakReference keyedWeakReference;
        String str;
        try {
            AbstractC16544l.m18095h(watchedObject, "watchedObject");
            AbstractC16544l.m18095h(description, "description");
            do {
                keyedWeakReference = (KeyedWeakReference) ((ReferenceQueue) this.f43261p0).poll();
                if (keyedWeakReference != null) {
                    ((LinkedHashMap) this.f43260o0).remove(keyedWeakReference.getKey());
                }
            } while (keyedWeakReference != null);
            String string = UUID.randomUUID().toString();
            AbstractC16544l.m18090c(string, "UUID.randomUUID()\n      .toString()");
            KeyedWeakReference keyedWeakReference2 = new KeyedWeakReference(watchedObject, string, description, SystemClock.uptimeMillis(), (ReferenceQueue) this.f43261p0);
            C13710g c13710g = AbstractC7854B5.f24748b;
            if (c13710g != null) {
                StringBuilder sb2 = new StringBuilder("Watching ");
                sb2.append(watchedObject instanceof Class ? watchedObject.toString() : "instance of ".concat(watchedObject.getClass().getName()));
                if (description.length() > 0) {
                    str = " (" + description + ')';
                } else {
                    str = "";
                }
                sb2.append(str);
                sb2.append(" with key ");
                sb2.append(string);
                c13710g.m15176a(sb2.toString());
            }
            ((LinkedHashMap) this.f43260o0).put(string, keyedWeakReference2);
            ExecutorC13706c.f43253Y.execute(new RunnableC5228j(this, 29, string));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: j */
    public C5593i m15195j(C5576C c5576c, C5586b c5586b) {
        C5593i c5593i;
        c5586b.getClass();
        C5594j c5594j = new C5594j(c5576c);
        synchronized (((C2685e) this.f43261p0)) {
            c5593i = (C5593i) ((C5276b) this.f43259Z).m5785b(c5594j);
            if (c5593i == null) {
                c5593i = (C5593i) ((C5277c) this.f43260o0).m5794a(c5594j);
            }
        }
        return c5593i;
    }

    @Override // p885m4.InterfaceC17157g
    /* JADX INFO: renamed from: k */
    public List mo10558k(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        while (true) {
            List list = (List) this.f43259Z;
            if (i10 >= list.size()) {
                break;
            }
            int i11 = i10 * 2;
            long[] jArr = (long[]) this.f43260o0;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                C20109c c20109c = (C20109c) list.get(i10);
                C20421b c20421b = c20109c.f63711a;
                if (c20421b.f64581e == -3.4028235E38f) {
                    arrayList2.add(c20109c);
                } else {
                    arrayList.add(c20421b);
                }
            }
            i10++;
        }
        Collections.sort(arrayList2, new C0013G0(19));
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            C20421b c20421b2 = ((C20109c) arrayList2.get(i12)).f63711a;
            arrayList.add(new C20421b(c20421b2.f64577a, c20421b2.f64578b, c20421b2.f64579c, c20421b2.f64580d, (-1) - i12, 1, c20421b2.f64583g, c20421b2.f64584h, c20421b2.f64585i, c20421b2.f64590n, c20421b2.f64591o, c20421b2.f64586j, c20421b2.f64587k, c20421b2.f64588l, c20421b2.f64589m, c20421b2.f64592p, c20421b2.f64593q));
        }
        return arrayList;
    }

    @Override // p987rb.InterfaceC18910a
    /* JADX INFO: renamed from: l */
    public /* bridge */ /* synthetic */ InterfaceC18910a mo5857l(Class cls, InterfaceC18663d interfaceC18663d) {
        switch (this.f43258Y) {
            case 12:
                ((HashMap) this.f43259Z).put(cls, interfaceC18663d);
                ((HashMap) this.f43260o0).remove(cls);
                break;
            default:
                ((HashMap) this.f43259Z).put(cls, interfaceC18663d);
                ((HashMap) this.f43260o0).remove(cls);
                break;
        }
        return this;
    }

    /* JADX INFO: renamed from: m */
    public InterfaceC14362r m15196m() {
        return ((C16037b) this.f43261p0).f49478Y.f49476c;
    }

    /* JADX INFO: renamed from: n */
    public InterfaceC7537b m15197n() {
        return ((C16037b) this.f43261p0).f49478Y.f49474a;
    }

    /* JADX INFO: renamed from: o */
    public C10235r m15198o() {
        int i10;
        float fM10767c;
        int i11;
        C10194T c10194t = (C10194T) this.f43259Z;
        C10173D c10173d = c10194t.f30297r;
        C10173D c10173d2 = c10194t.f30298s;
        if (c10173d == null || c10173d.m10771g() || (i10 = c10173d.f30118Z) == 9 || i10 == 2 || i10 == 3) {
            return new C10235r(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float fM10767c2 = c10173d.m10767c();
        if (c10173d2 == null) {
            C10235r c10235r = ((C10194T) this.f43259Z).f30328o;
            fM10767c = c10235r != null ? (c10235r.f30393e * fM10767c2) / c10235r.f30392d : fM10767c2;
        } else {
            if (c10173d2.m10771g() || (i11 = c10173d2.f30118Z) == 9 || i11 == 2 || i11 == 3) {
                return new C10235r(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            fM10767c = c10173d2.m10767c();
        }
        return new C10235r(0.0f, 0.0f, fM10767c2, fM10767c);
    }

    @Override // p885m4.InterfaceC17157g
    /* JADX INFO: renamed from: p */
    public int mo10560p() {
        return ((long[]) this.f43261p0).length;
    }

    /* JADX INFO: renamed from: q */
    public RectF m15199q() {
        C10194T c10194t = (C10194T) this.f43259Z;
        if (c10194t == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        C10235r c10235r = c10194t.f30328o;
        if (c10235r == null) {
            return null;
        }
        c10235r.getClass();
        return new RectF(c10235r.f30390b, c10235r.f30391c, c10235r.m10796c(), c10235r.m10797d());
    }

    @Override // p372P3.InterfaceC6335q
    /* JADX INFO: renamed from: s */
    public void mo3061s() {
        ((InterfaceC6335q) this.f43259Z).mo3061s();
    }

    @Override // p1056v5.InterfaceC20460e
    public void shutdown() {
        ((ConnectivityManager) this.f43259Z).unregisterNetworkCallback((C4721G0) this.f43261p0);
    }

    @Override // p746fa.InterfaceC13594c
    /* JADX INFO: renamed from: t */
    public void mo258t(C13606o c13606o) {
        C18892b c18892b = (C18892b) this.f43259Z;
        String str = (String) this.f43260o0;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f43261p0;
        synchronized (c18892b.f60231a) {
            c18892b.f60231a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public String toString() {
        switch (this.f43258Y) {
            case 11:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f43259Z);
                sb2.append('{');
                C11242m c11242m = (C11242m) ((C11242m) this.f43260o0).f34020o0;
                String str = "";
                while (c11242m != null) {
                    Object obj = c11242m.f34019Z;
                    sb2.append(str);
                    String str2 = (String) c11242m.f34018Y;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    c11242m = (C11242m) c11242m.f34020o0;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: v */
    public C16308b m15200v() {
        return (C16308b) this.f43260o0;
    }

    /* JADX INFO: renamed from: w */
    public EnumC7546k m15201w() {
        return ((C16037b) this.f43261p0).f49478Y.f49475b;
    }

    /* JADX INFO: renamed from: x */
    public long m15202x() {
        return ((C16037b) this.f43261p0).f49478Y.f49477d;
    }

    /* JADX WARN: Code duplicated, block: B:157:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:269:0x01ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x03b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:49:0x012f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0136  */
    /* JADX WARN: Code duplicated, block: B:53:0x013c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0147  */
    /* JADX WARN: Code duplicated, block: B:58:0x0159  */
    /* JADX WARN: Code duplicated, block: B:59:0x0161  */
    /* JADX WARN: Code duplicated, block: B:92:0x021e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v124 */
    /* JADX WARN: Type inference failed for: r0v125, types: [int] */
    /* JADX WARN: Type inference failed for: r0v201 */
    /* JADX WARN: Type inference failed for: r0v202 */
    /* JADX WARN: Type inference failed for: r0v203 */
    /* JADX WARN: Type inference failed for: r0v204 */
    /* JADX INFO: renamed from: y */
    public boolean m15203y() {
        C2387q c2387q;
        Bundle bundle;
        int identifier;
        String string;
        int identifier2;
        Uri defaultUri;
        Intent launchIntentForPackage;
        PendingIntent activity;
        Integer numValueOf;
        Long lValueOf;
        long[] jArr;
        int[] iArr;
        char c9;
        ?? r6;
        IconCompat iconCompat;
        boolean z6;
        int i10;
        int i11 = 9;
        char c10 = 0;
        if (((C10808o) this.f43261p0).m11076f("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.f43260o0;
        if (!((KeyguardManager) firebaseMessagingService.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == iMyPid) {
                        if (runningAppProcessInfo.importance != 100) {
                            break;
                        }
                        return false;
                    }
                }
            }
        }
        String strM11081n = ((C10808o) this.f43261p0).m11081n("gcm.n.image");
        if (TextUtils.isEmpty(strM11081n)) {
            c2387q = null;
        } else {
            try {
                c2387q = new C2387q(new URL(strM11081n));
            } catch (MalformedURLException unused) {
                AbstractC15256t.m16482t("FirebaseMessaging", "Not downloading image, bad URL: " + strM11081n);
                c2387q = null;
            }
        }
        if (c2387q != null) {
            ExecutorService executorService = (ExecutorService) this.f43259Z;
            C13599h c13599h = new C13599h();
            c2387q.f7417Z = executorService.submit(new RunnableC0074m(c2387q, 17, c13599h));
            c2387q.f7418o0 = c13599h.f42961a;
        }
        FirebaseMessagingService firebaseMessagingService2 = (FirebaseMessagingService) this.f43260o0;
        C10808o c10808o = (C10808o) this.f43261p0;
        AtomicInteger atomicInteger = AbstractC2375e.f7390a;
        try {
            ApplicationInfo applicationInfo = firebaseMessagingService2.getPackageManager().getApplicationInfo(firebaseMessagingService2.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                bundle = Bundle.EMPTY;
            }
        } catch (PackageManager.NameNotFoundException e10) {
            AbstractC15256t.m16482t("FirebaseMessaging", "Couldn't get own application info: " + e10);
        }
        Bundle bundle2 = bundle;
        String strM11081n2 = c10808o.m11081n("gcm.n.android_channel_id");
        if (Build.VERSION.SDK_INT < 26) {
            strM11081n2 = null;
        } else {
            try {
                if (firebaseMessagingService2.getPackageManager().getApplicationInfo(firebaseMessagingService2.getPackageName(), 0).targetSdkVersion < 26) {
                    strM11081n2 = null;
                } else {
                    NotificationManager notificationManager = (NotificationManager) firebaseMessagingService2.getSystemService(NotificationManager.class);
                    if (TextUtils.isEmpty(strM11081n2)) {
                        strM11081n2 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                        if (!TextUtils.isEmpty(strM11081n2)) {
                            AbstractC15256t.m16482t("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                        } else if (notificationManager.getNotificationChannel(strM11081n2) == null) {
                            AbstractC15256t.m16482t("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                        }
                        if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                            identifier = firebaseMessagingService2.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService2.getPackageName());
                            if (identifier == 0) {
                                AbstractC15256t.m16465c("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                                string = "Misc";
                            } else {
                                string = firebaseMessagingService2.getString(identifier);
                            }
                            notificationManager.createNotificationChannel(AbstractC0232b0.m747e(string));
                        }
                        strM11081n2 = "fcm_fallback_notification_channel";
                    } else if (notificationManager.getNotificationChannel(strM11081n2) == null) {
                        AbstractC15256t.m16482t("FirebaseMessaging", "Notification Channel requested (" + strM11081n2 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                        strM11081n2 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                        if (!TextUtils.isEmpty(strM11081n2)) {
                            AbstractC15256t.m16482t("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                        } else if (notificationManager.getNotificationChannel(strM11081n2) == null) {
                            AbstractC15256t.m16482t("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                        }
                        if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                            identifier = firebaseMessagingService2.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService2.getPackageName());
                            if (identifier == 0) {
                                AbstractC15256t.m16465c("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                                string = "Misc";
                            } else {
                                string = firebaseMessagingService2.getString(identifier);
                            }
                            notificationManager.createNotificationChannel(AbstractC0232b0.m747e(string));
                        }
                        strM11081n2 = "fcm_fallback_notification_channel";
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
        }
        String packageName = firebaseMessagingService2.getPackageName();
        Resources resources = firebaseMessagingService2.getResources();
        PackageManager packageManager = firebaseMessagingService2.getPackageManager();
        C17465r c17465r = new C17465r(firebaseMessagingService2, strM11081n2);
        String strM11080m = c10808o.m11080m(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(strM11080m)) {
            c17465r.f55827e = C17465r.m19163b(strM11080m);
        }
        String strM11080m2 = c10808o.m11080m(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(strM11080m2)) {
            c17465r.f55828f = C17465r.m19163b(strM11080m2);
            C17463p c17463p = new C17463p(c10, i11);
            c17463p.f55822o0 = C17465r.m19163b(strM11080m2);
            c17465r.m19167e(c17463p);
        }
        String strM11081n3 = c10808o.m11081n("gcm.n.icon");
        if (TextUtils.isEmpty(strM11081n3)) {
            identifier2 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (identifier2 != 0 || !AbstractC2375e.m3473a(resources, identifier2)) {
                try {
                } catch (PackageManager.NameNotFoundException e11) {
                    AbstractC15256t.m16482t("FirebaseMessaging", "Couldn't get own application info: " + e11);
                }
            }
            if (identifier2 != 0 || !AbstractC2375e.m3473a(resources, identifier2)) {
                identifier2 = 17301651;
            }
        } else {
            identifier2 = resources.getIdentifier(strM11081n3, "drawable", packageName);
            if ((identifier2 == 0 || !AbstractC2375e.m3473a(resources, identifier2)) && ((identifier2 = resources.getIdentifier(strM11081n3, "mipmap", packageName)) == 0 || !AbstractC2375e.m3473a(resources, identifier2))) {
                AbstractC15256t.m16482t("FirebaseMessaging", "Icon resource " + strM11081n3 + " not found. Notification will use default icon.");
                identifier2 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                identifier2 = identifier2 != 0 ? packageManager.getApplicationInfo(packageName, 0).icon : packageManager.getApplicationInfo(packageName, 0).icon;
                if (identifier2 != 0) {
                    identifier2 = 17301651;
                } else {
                    identifier2 = 17301651;
                }
            }
        }
        c17465r.f55842t.icon = identifier2;
        String strM11081n4 = c10808o.m11081n("gcm.n.sound2");
        if (TextUtils.isEmpty(strM11081n4)) {
            strM11081n4 = c10808o.m11081n("gcm.n.sound");
        }
        if (TextUtils.isEmpty(strM11081n4)) {
            defaultUri = null;
        } else if ("default".equals(strM11081n4) || resources.getIdentifier(strM11081n4, "raw", packageName) == 0) {
            defaultUri = RingtoneManager.getDefaultUri(2);
        } else {
            defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + strM11081n4);
        }
        if (defaultUri != null) {
            Notification notification = c17465r.f55842t;
            notification.sound = defaultUri;
            notification.audioStreamType = -1;
            notification.audioAttributes = AbstractC17464q.m19159a(AbstractC17464q.m19162d(AbstractC17464q.m19161c(AbstractC17464q.m19160b(), 4), 5));
        }
        String strM11081n5 = c10808o.m11081n("gcm.n.click_action");
        if (TextUtils.isEmpty(strM11081n5)) {
            String strM11081n6 = c10808o.m11081n("gcm.n.link_android");
            if (TextUtils.isEmpty(strM11081n6)) {
                strM11081n6 = c10808o.m11081n("gcm.n.link");
            }
            Uri uri = !TextUtils.isEmpty(strM11081n6) ? Uri.parse(strM11081n6) : null;
            if (uri != null) {
                launchIntentForPackage = new Intent("android.intent.action.VIEW");
                launchIntentForPackage.setPackage(packageName);
                launchIntentForPackage.setData(uri);
            } else {
                launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                if (launchIntentForPackage == null) {
                    AbstractC15256t.m16482t("FirebaseMessaging", "No activity found to launch app");
                }
            }
        } else {
            launchIntentForPackage = new Intent(strM11081n5);
            launchIntentForPackage.setPackage(packageName);
            launchIntentForPackage.setFlags(268435456);
        }
        AtomicInteger atomicInteger2 = AbstractC2375e.f7390a;
        if (launchIntentForPackage == null) {
            activity = null;
        } else {
            launchIntentForPackage.addFlags(67108864);
            Bundle bundle3 = (Bundle) c10808o.f32040Z;
            Bundle bundle4 = new Bundle(bundle3);
            for (String str : bundle3.keySet()) {
                if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                    bundle4.remove(str);
                }
            }
            launchIntentForPackage.putExtras(bundle4);
            if (c10808o.m11076f("google.c.a.e")) {
                launchIntentForPackage.putExtra("gcm.n.analytics_data", c10808o.m11085s());
            }
            activity = PendingIntent.getActivity(firebaseMessagingService2, atomicInteger2.incrementAndGet(), launchIntentForPackage, 1140850688);
        }
        c17465r.f55829g = activity;
        PendingIntent broadcast = !c10808o.m11076f("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService2, atomicInteger2.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService2.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(c10808o.m11085s())), 1140850688);
        if (broadcast != null) {
            c17465r.f55842t.deleteIntent = broadcast;
        }
        String strM11081n7 = c10808o.m11081n("gcm.n.color");
        if (TextUtils.isEmpty(strM11081n7)) {
            i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i10 != 0) {
                numValueOf = Integer.valueOf(firebaseMessagingService2.getColor(i10));
            } else {
                numValueOf = null;
            }
        } else {
            try {
                numValueOf = Integer.valueOf(Color.parseColor(strM11081n7));
            } catch (IllegalArgumentException unused3) {
                AbstractC15256t.m16482t("FirebaseMessaging", "Color is invalid: " + strM11081n7 + ". Notification will use default color.");
                i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i10 != 0) {
                    try {
                        numValueOf = Integer.valueOf(firebaseMessagingService2.getColor(i10));
                    } catch (Resources.NotFoundException unused4) {
                        AbstractC15256t.m16482t("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                        numValueOf = null;
                    }
                } else {
                    numValueOf = null;
                }
            }
        }
        if (numValueOf != null) {
            c17465r.f55838p = numValueOf.intValue();
        }
        c17465r.m19165c(16, !c10808o.m11076f("gcm.n.sticky"));
        c17465r.f55836n = c10808o.m11076f("gcm.n.local_only");
        String strM11081n8 = c10808o.m11081n("gcm.n.ticker");
        if (strM11081n8 != null) {
            c17465r.f55842t.tickerText = C17465r.m19163b(strM11081n8);
        }
        Integer numM11078j = c10808o.m11078j("gcm.n.notification_priority");
        if (numM11078j == null) {
            numM11078j = null;
        } else if (numM11078j.intValue() < -2 || numM11078j.intValue() > 2) {
            AbstractC15256t.m16482t("FirebaseMessaging", "notificationPriority is invalid " + numM11078j + ". Skipping setting notificationPriority.");
            numM11078j = null;
        }
        if (numM11078j != null) {
            c17465r.f55832j = numM11078j.intValue();
        }
        Integer numM11078j2 = c10808o.m11078j("gcm.n.visibility");
        if (numM11078j2 == null) {
            numM11078j2 = null;
        } else if (numM11078j2.intValue() < -1 || numM11078j2.intValue() > 1) {
            AbstractC15256t.m16482t("NotificationParams", "visibility is invalid: " + numM11078j2 + ". Skipping setting visibility.");
            numM11078j2 = null;
        }
        if (numM11078j2 != null) {
            c17465r.f55839q = numM11078j2.intValue();
        }
        Integer numM11078j3 = c10808o.m11078j("gcm.n.notification_count");
        if (numM11078j3 == null) {
            numM11078j3 = null;
        } else if (numM11078j3.intValue() < 0) {
            AbstractC15256t.m16482t("FirebaseMessaging", "notificationCount is invalid: " + numM11078j3 + ". Skipping setting notificationCount.");
            numM11078j3 = null;
        }
        if (numM11078j3 != null) {
            c17465r.f55831i = numM11078j3.intValue();
        }
        String strM11081n9 = c10808o.m11081n("gcm.n.event_time");
        if (TextUtils.isEmpty(strM11081n9)) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(Long.parseLong(strM11081n9));
            } catch (NumberFormatException unused5) {
                AbstractC15256t.m16482t("NotificationParams", "Couldn't parse value of " + C10808o.m11073y("gcm.n.event_time") + Separators.LPAREN + strM11081n9 + ") into a long");
                lValueOf = null;
            }
        }
        if (lValueOf != null) {
            c17465r.f55833k = true;
            c17465r.f55842t.when = lValueOf.longValue();
        }
        JSONArray jSONArrayM11079k = c10808o.m11079k("gcm.n.vibrate_timings");
        if (jSONArrayM11079k == null) {
            jArr = null;
        } else {
            try {
                if (jSONArrayM11079k.length() <= 1) {
                    throw new JSONException("vibrateTimings have invalid length");
                }
                int length = jSONArrayM11079k.length();
                jArr = new long[length];
                for (int i12 = 0; i12 < length; i12++) {
                    jArr[i12] = jSONArrayM11079k.optLong(i12);
                }
            } catch (NumberFormatException | JSONException unused6) {
                AbstractC15256t.m16482t("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArrayM11079k + ". Skipping setting vibrateTimings.");
                jArr = null;
            }
        }
        if (jArr != null) {
            c17465r.f55842t.vibrate = jArr;
        }
        JSONArray jSONArrayM11079k2 = c10808o.m11079k("gcm.n.light_settings");
        if (jSONArrayM11079k2 == null) {
            iArr = null;
        } else {
            iArr = new int[3];
            try {
                if (jSONArrayM11079k2.length() != 3) {
                    throw new JSONException("lightSettings don't have all three fields");
                }
                int color = Color.parseColor(jSONArrayM11079k2.optString(0));
                if (color == -16777216) {
                    throw new IllegalArgumentException("Transparent color is invalid");
                }
                iArr[0] = color;
                iArr[1] = jSONArrayM11079k2.optInt(1);
                iArr[2] = jSONArrayM11079k2.optInt(2);
            } catch (IllegalArgumentException e12) {
                AbstractC15256t.m16482t("NotificationParams", "LightSettings is invalid: " + jSONArrayM11079k2 + ". " + e12.getMessage() + ". Skipping setting LightSettings");
                iArr = null;
            } catch (JSONException unused7) {
                AbstractC15256t.m16482t("NotificationParams", "LightSettings is invalid: " + jSONArrayM11079k2 + ". Skipping setting LightSettings");
                iArr = null;
            }
        }
        if (iArr != null) {
            int i13 = iArr[0];
            int i14 = iArr[1];
            int i15 = iArr[2];
            Notification notification2 = c17465r.f55842t;
            notification2.ledARGB = i13;
            notification2.ledOnMS = i14;
            notification2.ledOffMS = i15;
            notification2.flags = ((i14 == 0 || i15 == 0) ? 0 : 1) | ((-2) & notification2.flags);
        }
        boolean zM11076f = c10808o.m11076f("gcm.n.default_sound");
        ?? r10 = zM11076f;
        if (c10808o.m11076f("gcm.n.default_vibrate_timings")) {
            r10 = (zM11076f ? 1 : 0) | 2;
        }
        if (c10808o.m11076f("gcm.n.default_light_settings")) {
            c9 = 4;
            r6 = (r10 == true ? 1 : 0) | 4;
        } else {
            c9 = 4;
            r6 = r10;
        }
        Notification notification3 = c17465r.f55842t;
        notification3.defaults = r6;
        if ((r6 & c9) != 0) {
            notification3.flags |= 1;
        }
        String strM11081n10 = c10808o.m11081n("gcm.n.tag");
        if (TextUtils.isEmpty(strM11081n10)) {
            strM11081n10 = "FCM-Notification:" + SystemClock.uptimeMillis();
        }
        String str2 = strM11081n10;
        if (c2387q != null) {
            try {
                C13606o c13606o = c2387q.f7418o0;
                AbstractC20502t.m21157h(c13606o);
                Bitmap bitmap = (Bitmap) AbstractC7854B5.m8114b(c13606o, 5L, TimeUnit.SECONDS);
                c17465r.m19166d(bitmap);
                C17462o c17462o = new C17462o(c10, 9);
                if (bitmap == null) {
                    iconCompat = null;
                    z6 = true;
                } else {
                    z6 = true;
                    iconCompat = new IconCompat(1);
                    iconCompat.f32892b = bitmap;
                }
                c17462o.f55819o0 = iconCompat;
                c17462o.f55820p0 = null;
                c17462o.f55821q0 = z6;
                c17465r.m19167e(c17462o);
            } catch (InterruptedException unused8) {
                AbstractC15256t.m16482t("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                c2387q.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e13) {
                AbstractC15256t.m16482t("FirebaseMessaging", "Failed to download image: " + e13.getCause());
            } catch (TimeoutException unused9) {
                AbstractC15256t.m16482t("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                c2387q.close();
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) ((FirebaseMessagingService) this.f43260o0).getSystemService("notification")).notify(str2, 0, c17465r.m19164a());
        return true;
    }

    /* JADX INFO: renamed from: z */
    public boolean m15204z() {
        C13711h c13711h;
        return ((InterfaceC5584K) this.f43259Z).getValue() != this.f43261p0 || ((c13711h = (C13711h) this.f43260o0) != null && c13711h.m15204z());
    }

    public /* synthetic */ C13711h(Object obj, Object obj2, Object obj3, int i10) {
        this.f43258Y = i10;
        this.f43259Z = obj;
        this.f43260o0 = obj2;
        this.f43261p0 = obj3;
    }

    public C13711h(String str) {
        this.f43258Y = 11;
        C11242m c11242m = new C11242m();
        this.f43260o0 = c11242m;
        this.f43261p0 = c11242m;
        this.f43259Z = str;
    }

    public C13711h(AbstractC9942o3 abstractC9942o3) {
        this.f43258Y = 13;
        this.f43259Z = abstractC9942o3;
        this.f43260o0 = new LinkedHashMap();
        this.f43261p0 = new LinkedHashMap();
    }

    public C13711h(InterfaceC8434d client, C7024c c7024c) {
        this.f43258Y = 20;
        AbstractC16544l.m18094g(client, "client");
        this.f43259Z = client;
        this.f43261p0 = c7024c;
        String string = Locale.getDefault().toString();
        AbstractC16544l.m18093f(string, "getDefault().toString()");
        this.f43260o0 = AbstractC17659D.m19246h(new C17309l(SIPHeaderNames.ACCEPT_LANGUAGE, string.length() <= 0 ? "en_US" : string));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C13711h(int i10) {
        this(new long[10], new long[10], new long[10], 21);
        this.f43258Y = i10;
        switch (i10) {
            case 6:
                this.f43259Z = new C5276b(16);
                C5277c c5277c = new C5277c();
                c5277c.f17352a = AbstractC5275a.f17342a;
                c5277c.f17353b = AbstractC5275a.f17343b;
                c5277c.f17354c = 0;
                this.f43260o0 = c5277c;
                this.f43261p0 = new C2685e();
                break;
            case 12:
                this.f43259Z = new HashMap();
                this.f43260o0 = new HashMap();
                this.f43261p0 = C7999U.f25279c;
                break;
            case 15:
                this.f43259Z = new HashMap();
                this.f43260o0 = new HashMap();
                this.f43261p0 = C9120E.f27878c;
                break;
            case 21:
                break;
            default:
                this.f43259Z = new LinkedHashSet();
                this.f43260o0 = new LinkedHashMap();
                this.f43261p0 = new ReferenceQueue();
                break;
        }
    }

    public C13711h(InterfaceC6142d interfaceC6142d) {
        this.f43258Y = 5;
        this.f43259Z = interfaceC6142d;
        this.f43260o0 = new ConcurrentHashMap();
        this.f43261p0 = new CopyOnWriteArraySet();
    }

    public C13711h(ArrayList arrayList) {
        this.f43258Y = 28;
        this.f43259Z = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        this.f43260o0 = new long[arrayList.size() * 2];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            C20109c c20109c = (C20109c) arrayList.get(i10);
            int i11 = i10 * 2;
            long[] jArr = (long[]) this.f43260o0;
            jArr[i11] = c20109c.f63712b;
            jArr[i11 + 1] = c20109c.f63713c;
        }
        long[] jArr2 = (long[]) this.f43260o0;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f43261p0 = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    public C13711h(InterfaceC6335q interfaceC6335q, InterfaceC17161k interfaceC17161k) {
        this.f43258Y = 23;
        this.f43259Z = interfaceC6335q;
        this.f43260o0 = interfaceC17161k;
        this.f43261p0 = new SparseArray();
    }

    public C13711h(FirebaseMessagingService firebaseMessagingService, C10808o c10808o, ExecutorService executorService) {
        this.f43258Y = 3;
        this.f43259Z = executorService;
        this.f43260o0 = firebaseMessagingService;
        this.f43261p0 = c10808o;
    }

    public C13711h(View view) {
        this.f43258Y = 7;
        this.f43259Z = view;
        this.f43260o0 = AbstractC9227W.m9799b(EnumC17307j.f55134Z, new C3457c(this, 24));
        C13288c c13288c = new C13288c();
        if (Build.VERSION.SDK_INT >= 30) {
            C0795z c0795z = new C0795z(view, 3);
            c0795z.f2210o0 = view;
            c13288c.f42001Y = c0795z;
        } else {
            c13288c.f42001Y = new C13287b(view, 3);
        }
        this.f43261p0 = c13288c;
    }

    public C13711h(C16037b c16037b) {
        this.f43258Y = 22;
        this.f43261p0 = c16037b;
        this.f43259Z = new C10077b(this, 11);
    }

    public C13711h(Runnable runnable) {
        this.f43258Y = 1;
        this.f43260o0 = new CopyOnWriteArrayList();
        this.f43261p0 = new HashMap();
        this.f43259Z = runnable;
    }

    public C13711h(Context context, LocationManager locationManager) {
        this.f43258Y = 24;
        this.f43261p0 = new C17365B();
        this.f43259Z = context;
        this.f43260o0 = locationManager;
    }

    public C13711h(ConnectivityManager connectivityManager, ComponentCallbacks2C0378m componentCallbacks2C0378m) {
        this.f43258Y = 29;
        this.f43259Z = connectivityManager;
        this.f43260o0 = componentCallbacks2C0378m;
        C4721G0 c4721g0 = new C4721G0(this, 3);
        this.f43261p0 = c4721g0;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), c4721g0);
    }

    public C13711h(C13711h c13711h) {
        this.f43258Y = 21;
        this.f43259Z = Arrays.copyOf((long[]) c13711h.f43259Z, 10);
        this.f43260o0 = Arrays.copyOf((long[]) c13711h.f43260o0, 10);
        this.f43261p0 = Arrays.copyOf((long[]) c13711h.f43261p0, 10);
    }

    public C13711h(AbstractC16283c openDocumentLauncher, AbstractC16283c selectFromPhotoLibraryLauncher, Context context) {
        this.f43258Y = 8;
        AbstractC16544l.m18094g(openDocumentLauncher, "openDocumentLauncher");
        AbstractC16544l.m18094g(selectFromPhotoLibraryLauncher, "selectFromPhotoLibraryLauncher");
        this.f43259Z = openDocumentLauncher;
        this.f43260o0 = selectFromPhotoLibraryLauncher;
        this.f43261p0 = context;
    }

    public C13711h(InterfaceC5584K interfaceC5584K, C13711h c13711h) {
        this.f43258Y = 9;
        this.f43259Z = interfaceC5584K;
        this.f43260o0 = c13711h;
        this.f43261p0 = interfaceC5584K.getValue();
    }

    public C13711h(C18655i c18655i) {
        this.f43258Y = 10;
        this.f43258Y = 10;
        this.f43259Z = c18655i;
        this.f43260o0 = Choreographer.getInstance();
        this.f43261p0 = new ChoreographerFrameCallbackC6987a(this);
    }

    public C13711h(C3935J4 c3935j4, InterfaceC1426a interfaceC1426a) {
        this.f43258Y = 4;
        this.f43259Z = c3935j4;
        this.f43260o0 = interfaceC1426a;
        this.f43261p0 = new C4055g1(this, 1);
    }
}
