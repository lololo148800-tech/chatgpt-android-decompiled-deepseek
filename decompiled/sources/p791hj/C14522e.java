package p791hj;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import android.util.SparseIntArray;
import android.view.View;
import androidx.core.app.FrameMetricsAggregator;
import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.InterfaceC11112u;
import com.openai.feature.serverstatus.impl.sunset.p684ZP.VjclRfeKsMflo;
import io.sentry.EnumC15375i1;
import io.sentry.android.core.C15184B;
import io.sentry.android.core.C15211c;
import io.sentry.android.core.RunnableC15201T;
import io.sentry.android.core.RunnableC15210b;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.protocol.C15447t;
import java.io.File;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17314q;
import mo.AbstractC17325B;
import mo.C17336c;
import mo.C17348o;
import mo.C17349p;
import mo.C17358y;
import no.AbstractC17708b;
import p003A1.C0199Q0;
import p007A5.AbstractC0369d;
import p007A5.AbstractC0371f;
import p007A5.C0375j;
import p007A5.C0377l;
import p026Ao.C0654C;
import p046Bk.p047Ep.QzvfuIgrngtl;
import p049Bm.InterfaceC1426a;
import p059C5.C1601s;
import p1004s4.C19441a;
import p1004s4.C19443c;
import p1004s4.C19446f;
import p1028u.C20089f;
import p1033u5.C20118c;
import p103Dn.C2219z0;
import p1053v3.C20420a;
import p1053v3.C20421b;
import p1061vb.C20513d;
import p1073w3.AbstractC20817s;
import p1075w5.C20825c;
import p1112xm.AbstractC21304h;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p1144z5.C21797a;
import p1144z5.InterfaceC21801e;
import p183H4.C3227b;
import p183H4.C3231f;
import p183H4.InterfaceC3232g;
import p228J.C3847l0;
import p259K5.C4544f;
import p523V9.AbstractC7841A0;
import p523V9.AbstractC8104h6;
import p523V9.AbstractC8162p0;
import p544W9.AbstractC8706s;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9276e0;
import p658b5.C11232c;
import p658b5.C11238i;
import p712dp.C13187c;
import p729ej.C13414e;
import p791hj.C14522e;
import p817j$.util.DesugarCollections;
import p817j$.util.concurrent.ConcurrentHashMap;
import p864l5.C16815b;
import p864l5.C16826m;
import p885m4.InterfaceC17157g;
import p909nm.AbstractC17665J;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17686t;
import p909nm.C17689w;
import p909nm.C17690x;
import p916o5.C17823a;
import p916o5.C17832j;
import p917o6.C17870w;
import p942p6.EnumC18300d;
import p942p6.InterfaceC18298b;
import sk.C19662a;
import sk.C19663b;

/* JADX INFO: renamed from: hj.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C14522e implements InterfaceC17157g {

    /* JADX INFO: renamed from: Y */
    public Object f45761Y;

    /* JADX INFO: renamed from: Z */
    public Object f45762Z;

    /* JADX INFO: renamed from: o0 */
    public Object f45763o0;

    /* JADX INFO: renamed from: p0 */
    public Object f45764p0;

    /* JADX INFO: renamed from: q0 */
    public Object f45765q0;

    public C14522e(String str, String str2, List monthList) {
        String str3;
        AbstractC16544l.m18094g(monthList, "monthList");
        this.f45761Y = monthList;
        List listM21696d0 = str != null ? AbstractC21322p.m21696d0(str, new char[]{'-'}, 6) : null;
        listM21696d0 = (listM21696d0 == null || listM21696d0.size() != 3) ? AbstractC17681o.m19382k("", "", "") : listM21696d0;
        this.f45762Z = AbstractC8706s.m9413a((String) listM21696d0.get(0));
        try {
            str3 = (String) monthList.get(Integer.parseInt((String) listM21696d0.get(1)) - 1);
        } catch (NumberFormatException unused) {
            str3 = str2 == null ? "" : str2;
        }
        this.f45763o0 = AbstractC8706s.m9413a(str3);
        this.f45764p0 = AbstractC8706s.m9413a((String) listM21696d0.get(2));
        this.f45765q0 = new C2219z0(new C19663b(this, null));
    }

    /* JADX INFO: renamed from: A */
    public synchronized Map m16009A(C15447t c15447t) {
        if (!m16027u()) {
            return null;
        }
        Map map = (Map) ((ConcurrentHashMap) this.f45763o0).get(c15447t);
        ((ConcurrentHashMap) this.f45763o0).remove(c15447t);
        return map;
    }

    /* JADX INFO: renamed from: B */
    public void m16010B(String url) {
        AbstractC16544l.m18094g(url, "url");
        if (AbstractC21329w.m21734u(url, "ws:", true)) {
            String strSubstring = url.substring(3);
            AbstractC16544l.m18093f(strSubstring, "this as java.lang.String).substring(startIndex)");
            url = "http:".concat(strSubstring);
        } else if (AbstractC21329w.m21734u(url, "wss:", true)) {
            String strSubstring2 = url.substring(4);
            AbstractC16544l.m18093f(strSubstring2, "this as java.lang.String).substring(startIndex)");
            url = "https:".concat(strSubstring2);
        }
        AbstractC16544l.m18094g(url, "<this>");
        C13187c c13187c = new C13187c(1);
        c13187c.m14844f(null, url);
        this.f45762Z = c13187c.m14841c();
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m16011a(Activity activity) {
        if (m16027u()) {
            m16031y(new RunnableC15210b(this, activity, 0), "FrameMetricsAggregator.add");
            C15211c c15211cM16019l = m16019l();
            if (c15211cM16019l != null) {
                ((WeakHashMap) this.f45764p0).put(activity, c15211cM16019l);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m16012b(String name, String value) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(value, "value");
        ((C3847l0) this.f45763o0).m4574a(name, value);
    }

    /* JADX INFO: renamed from: c */
    public void m16013c(List headers) {
        AbstractC16544l.m18094g(headers, "headers");
        ((ArrayList) this.f45763o0).addAll(headers);
    }

    /* JADX INFO: renamed from: d */
    public void m16014d(String key, InterfaceC3232g interfaceC3232g) {
        AbstractC16544l.m18094g(key, "key");
        m16021n();
        this.f45763o0 = interfaceC3232g;
        this.f45764p0 = key;
        if (((LinkedHashMap) this.f45761Y) != null) {
            return;
        }
        C3231f c3231fMo4127h = interfaceC3232g.mo4127h();
        AbstractC16544l.m18093f(c3231fMo4127h, "parentOwner.savedStateRegistry");
        AbstractC11105n abstractC11105nMo7809i = interfaceC3232g.mo7809i();
        AbstractC16544l.m18093f(abstractC11105nMo7809i, "parentOwner.lifecycle");
        try {
            c3231fMo4127h.m4125f(key, new C0199Q0(this, 5));
            abstractC11105nMo7809i.mo7806a((C3227b) this.f45765q0);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException("Error registering SavedStateProvider: key \"" + key + "\" is already in use on parent SavedStateRegistryOwner " + interfaceC3232g + ".\nThis is most easily remedied by giving your container Screen rendering a unique Compatible.compatibilityKey, perhaps by wrapping it with Named.", e10);
        }
    }

    @Override // p885m4.InterfaceC17157g
    /* JADX INFO: renamed from: e */
    public int mo10555e(long j10) {
        long[] jArr = (long[]) this.f45762Z;
        int iM21401b = AbstractC20817s.m21401b(jArr, j10, false);
        if (iM21401b < jArr.length) {
            return iM21401b;
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public C11238i m16015f() {
        return new C11238i((EnumC18300d) this.f45761Y, (String) this.f45764p0, (ArrayList) this.f45763o0, (InterfaceC18298b) this.f45762Z);
    }

    /* JADX INFO: renamed from: g */
    public C16826m m16016g() {
        C20825c c20825c = (C20825c) this.f45762Z;
        final int i10 = 0;
        C17314q c17314qM9800c = AbstractC9227W.m9800c(new InterfaceC1426a(this) { // from class: l5.d

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ C14522e f53959Z;

            {
                this.f53959Z = this;
            }

            @Override // p049Bm.InterfaceC1426a
            public final Object invoke() {
                int i11;
                int largeMemoryClass;
                C17832j c17832jM19574a;
                switch (i10) {
                    case 0:
                        Context context = (Context) this.f53959Z.f45761Y;
                        Bitmap.Config config = AbstractC0371f.f1262a;
                        double d10 = 0.2d;
                        try {
                            Object systemService = context.getSystemService((Class<Object>) ActivityManager.class);
                            AbstractC16544l.m18091d(systemService);
                            if (((ActivityManager) systemService).isLowRamDevice()) {
                                d10 = 0.15d;
                            }
                        } catch (Exception unused) {
                        }
                        C4544f c4544f = new C4544f(1);
                        if (d10 > 0.0d) {
                            Bitmap.Config config2 = AbstractC0371f.f1262a;
                            try {
                                Object systemService2 = context.getSystemService((Class<Object>) ActivityManager.class);
                                AbstractC16544l.m18091d(systemService2);
                                ActivityManager activityManager = (ActivityManager) systemService2;
                                largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                            } catch (Exception unused2) {
                                largeMemoryClass = 256;
                            }
                            double d11 = d10 * ((double) largeMemoryClass);
                            double d12 = 1024;
                            i11 = (int) (d11 * d12 * d12);
                            break;
                        } else {
                            i11 = 0;
                        }
                        return new C20118c(i11 > 0 ? new C19662a(i11, c4544f) : new C13414e(c4544f), c4544f);
                    default:
                        C14522e c14522e = this.f53959Z;
                        C0377l c0377l = C0377l.f1279Y;
                        Context context2 = (Context) c14522e.f45761Y;
                        synchronized (c0377l) {
                            try {
                                c17832jM19574a = C0377l.f1280Z;
                                if (c17832jM19574a == null) {
                                    C17823a c17823a = new C17823a();
                                    Bitmap.Config config3 = AbstractC0371f.f1262a;
                                    File cacheDir = context2.getCacheDir();
                                    if (cacheDir == null) {
                                        throw new IllegalStateException("cacheDir == null");
                                    }
                                    cacheDir.mkdirs();
                                    File fileM21645h = AbstractC21304h.m21645h(cacheDir, "image_cache");
                                    String str = C0654C.f1910Z;
                                    c17823a.f56855a = C20513d.m21170o(fileM21645h);
                                    c17832jM19574a = c17823a.m19574a();
                                    C0377l.f1280Z = c17832jM19574a;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return c17832jM19574a;
                }
            }
        });
        C17314q c17314qM9800c2 = (C17314q) this.f45763o0;
        if (c17314qM9800c2 == null) {
            final int i11 = 1;
            c17314qM9800c2 = AbstractC9227W.m9800c(new InterfaceC1426a(this) { // from class: l5.d

                /* JADX INFO: renamed from: Z */
                public final /* synthetic */ C14522e f53959Z;

                {
                    this.f53959Z = this;
                }

                @Override // p049Bm.InterfaceC1426a
                public final Object invoke() {
                    int i12;
                    int largeMemoryClass;
                    C17832j c17832jM19574a;
                    switch (i11) {
                        case 0:
                            Context context = (Context) this.f53959Z.f45761Y;
                            Bitmap.Config config = AbstractC0371f.f1262a;
                            double d10 = 0.2d;
                            try {
                                Object systemService = context.getSystemService((Class<Object>) ActivityManager.class);
                                AbstractC16544l.m18091d(systemService);
                                if (((ActivityManager) systemService).isLowRamDevice()) {
                                    d10 = 0.15d;
                                }
                            } catch (Exception unused) {
                            }
                            C4544f c4544f = new C4544f(1);
                            if (d10 > 0.0d) {
                                Bitmap.Config config2 = AbstractC0371f.f1262a;
                                try {
                                    Object systemService2 = context.getSystemService((Class<Object>) ActivityManager.class);
                                    AbstractC16544l.m18091d(systemService2);
                                    ActivityManager activityManager = (ActivityManager) systemService2;
                                    largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                                } catch (Exception unused2) {
                                    largeMemoryClass = 256;
                                }
                                double d11 = d10 * ((double) largeMemoryClass);
                                double d12 = 1024;
                                i12 = (int) (d11 * d12 * d12);
                                break;
                            } else {
                                i12 = 0;
                            }
                            return new C20118c(i12 > 0 ? new C19662a(i12, c4544f) : new C13414e(c4544f), c4544f);
                        default:
                            C14522e c14522e = this.f53959Z;
                            C0377l c0377l = C0377l.f1279Y;
                            Context context2 = (Context) c14522e.f45761Y;
                            synchronized (c0377l) {
                                try {
                                    c17832jM19574a = C0377l.f1280Z;
                                    if (c17832jM19574a == null) {
                                        C17823a c17823a = new C17823a();
                                        Bitmap.Config config3 = AbstractC0371f.f1262a;
                                        File cacheDir = context2.getCacheDir();
                                        if (cacheDir == null) {
                                            throw new IllegalStateException("cacheDir == null");
                                        }
                                        cacheDir.mkdirs();
                                        File fileM21645h = AbstractC21304h.m21645h(cacheDir, "image_cache");
                                        String str = C0654C.f1910Z;
                                        c17823a.f56855a = C20513d.m21170o(fileM21645h);
                                        c17832jM19574a = c17823a.m19574a();
                                        C0377l.f1280Z = c17832jM19574a;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            return c17832jM19574a;
                    }
                }
            });
        }
        C17314q c17314q = c17314qM9800c2;
        C17314q c17314qM9800c3 = AbstractC9227W.m9800c(new C1601s(26));
        C16815b c16815b = (C16815b) this.f45764p0;
        if (c16815b == null) {
            C17689w c17689w = C17689w.f56480Y;
            c16815b = new C16815b(c17689w, c17689w, c17689w, c17689w, c17689w);
        }
        return new C16826m((Context) this.f45761Y, c20825c, c17314qM9800c, c17314q, c17314qM9800c3, c16815b, (C0375j) this.f45765q0);
    }

    @Override // p885m4.InterfaceC17157g
    /* JADX INFO: renamed from: h */
    public long mo10557h(int i10) {
        return ((long[]) this.f45762Z)[i10];
    }

    /* JADX INFO: renamed from: i */
    public C17358y m16017i() {
        Map mapUnmodifiableMap;
        C17349p c17349p = (C17349p) this.f45762Z;
        if (c17349p == null) {
            throw new IllegalStateException("url == null");
        }
        String str = (String) this.f45764p0;
        C17348o c17348oM4577d = ((C3847l0) this.f45763o0).m4577d();
        AbstractC17325B abstractC17325B = (AbstractC17325B) this.f45765q0;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f45761Y;
        byte[] bArr = AbstractC17708b.f56536a;
        AbstractC16544l.m18094g(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            mapUnmodifiableMap = C17690x.f56481Y;
        } else {
            mapUnmodifiableMap = DesugarCollections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            AbstractC16544l.m18093f(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new C17358y(c17349p, str, c17348oM4577d, abstractC17325B, mapUnmodifiableMap);
    }

    /* JADX INFO: renamed from: j */
    public void m16018j(C17336c cacheControl) {
        AbstractC16544l.m18094g(cacheControl, "cacheControl");
        String string = cacheControl.toString();
        if (string.length() == 0) {
            m16030x("Cache-Control");
        } else {
            m16024r("Cache-Control", string);
        }
    }

    @Override // p885m4.InterfaceC17157g
    /* JADX INFO: renamed from: k */
    public List mo10558k(long j10) {
        C19443c c19443c = (C19443c) this.f45761Y;
        ArrayList<Pair> arrayList = new ArrayList();
        c19443c.m20524g(j10, c19443c.f61661h, arrayList);
        TreeMap treeMap = new TreeMap();
        c19443c.m20526i(j10, false, c19443c.f61661h, treeMap);
        HashMap map = (HashMap) this.f45764p0;
        c19443c.m20525h(j10, (Map) this.f45763o0, map, c19443c.f61661h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) ((HashMap) this.f45765q0).get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                C19446f c19446f = (C19446f) map.get(pair.first);
                c19446f.getClass();
                arrayList2.add(new C20421b(null, null, null, bitmapDecodeByteArray, c19446f.f61681c, 0, c19446f.f61683e, c19446f.f61680b, 0, Integer.MIN_VALUE, -3.4028235E38f, c19446f.f61684f, c19446f.f61685g, false, -16777216, c19446f.f61688j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C19446f c19446f2 = (C19446f) map.get(entry.getKey());
            c19446f2.getClass();
            C20420a c20420a = (C20420a) entry.getValue();
            CharSequence charSequence = c20420a.f64541a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (C19441a c19441a : (C19441a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C19441a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c19441a), spannableStringBuilder.getSpanEnd(c19441a), (CharSequence) "");
            }
            for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
                if (spannableStringBuilder.charAt(i10) == ' ') {
                    int i11 = i10 + 1;
                    int i12 = i11;
                    while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                        i12++;
                    }
                    int i13 = i12 - i11;
                    if (i13 > 0) {
                        spannableStringBuilder.delete(i10, i13 + i10);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
                if (spannableStringBuilder.charAt(i14) == '\n') {
                    int i15 = i14 + 1;
                    if (spannableStringBuilder.charAt(i15) == ' ') {
                        spannableStringBuilder.delete(i15, i14 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
                if (spannableStringBuilder.charAt(i16) == ' ') {
                    int i17 = i16 + 1;
                    if (spannableStringBuilder.charAt(i17) == '\n') {
                        spannableStringBuilder.delete(i16, i17);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            c20420a.f64545e = c19446f2.f61681c;
            c20420a.f64546f = c19446f2.f61682d;
            c20420a.f64547g = c19446f2.f61683e;
            c20420a.f64548h = c19446f2.f61680b;
            c20420a.f64552l = c19446f2.f61684f;
            c20420a.f64551k = c19446f2.f61687i;
            c20420a.f64550j = c19446f2.f61686h;
            c20420a.f64556p = c19446f2.f61688j;
            arrayList2.add(c20420a.m21081a());
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: l */
    public C15211c m16019l() {
        FrameMetricsAggregator frameMetricsAggregator;
        int i10;
        int i11;
        SparseIntArray sparseIntArray;
        if (!m16027u() || (frameMetricsAggregator = (FrameMetricsAggregator) this.f45761Y) == null) {
            return null;
        }
        SparseIntArray[] sparseIntArrayArrMo17939j = frameMetricsAggregator.f32883a.mo17939j();
        int i12 = 0;
        if (sparseIntArrayArrMo17939j == null || sparseIntArrayArrMo17939j.length <= 0 || (sparseIntArray = sparseIntArrayArrMo17939j[0]) == null) {
            i10 = 0;
            i11 = 0;
        } else {
            int i13 = 0;
            i10 = 0;
            i11 = 0;
            while (i12 < sparseIntArray.size()) {
                int iKeyAt = sparseIntArray.keyAt(i12);
                int iValueAt = sparseIntArray.valueAt(i12);
                i13 += iValueAt;
                if (iKeyAt > 700) {
                    i11 += iValueAt;
                } else if (iKeyAt > 16) {
                    i10 += iValueAt;
                }
                i12++;
            }
            i12 = i13;
        }
        return new C15211c(i12, i10, i11);
    }

    /* JADX INFO: renamed from: m */
    public void m16020m(int i10) {
        InterfaceC21801e c21797a = i10 > 0 ? new C21797a(i10) : InterfaceC21801e.f69163a;
        C20825c c20825c = (C20825c) this.f45762Z;
        this.f45762Z = new C20825c(c20825c.f66161a, c20825c.f66162b, c20825c.f66163c, c20825c.f66164d, c21797a, c20825c.f66166f, c20825c.f66167g, c20825c.f66168h, c20825c.f66169i, c20825c.f66170j, c20825c.f66171k, c20825c.f66172l, c20825c.f66173m, c20825c.f66174n, c20825c.f66175o);
    }

    /* JADX INFO: renamed from: n */
    public void m16021n() {
        AbstractC11105n abstractC11105nMo7809i;
        C3231f c3231fMo4127h;
        InterfaceC3232g interfaceC3232g = (InterfaceC3232g) this.f45763o0;
        if (interfaceC3232g != null && (c3231fMo4127h = interfaceC3232g.mo4127h()) != null) {
            String str = (String) this.f45764p0;
            AbstractC16544l.m18091d(str);
            ((C20089f) c3231fMo4127h.f9800d).mo20918j(str);
        }
        InterfaceC3232g interfaceC3232g2 = (InterfaceC3232g) this.f45763o0;
        if (interfaceC3232g2 != null && (abstractC11105nMo7809i = interfaceC3232g2.mo7809i()) != null) {
            abstractC11105nMo7809i.mo7808c((C3227b) this.f45765q0);
        }
        this.f45763o0 = null;
        this.f45764p0 = null;
    }

    /* JADX INFO: renamed from: o */
    public Date m16022o() {
        try {
            List listM21696d0 = AbstractC21322p.m21696d0(m16023q(), new char[]{'-'}, 6);
            Calendar calendar = Calendar.getInstance();
            calendar.set(1, Integer.parseInt((String) listM21696d0.get(0)));
            calendar.set(2, Integer.parseInt((String) listM21696d0.get(1)) - 1);
            calendar.set(5, Integer.parseInt((String) listM21696d0.get(2)));
            return calendar.getTime();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p885m4.InterfaceC17157g
    /* JADX INFO: renamed from: p */
    public int mo10560p() {
        return ((long[]) this.f45762Z).length;
    }

    /* JADX INFO: renamed from: r */
    public void m16024r(String name, String value) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(value, "value");
        C3847l0 c3847l0 = (C3847l0) this.f45763o0;
        c3847l0.getClass();
        AbstractC9276e0.m9845b(name);
        AbstractC9276e0.m9846c(value, name);
        c3847l0.m4582i(name);
        c3847l0.m4575b(name, value);
    }

    /* JADX INFO: renamed from: s */
    public void m16025s(C17348o headers) {
        AbstractC16544l.m18094g(headers, "headers");
        this.f45763o0 = headers.m19016q();
    }

    /* JADX INFO: renamed from: t */
    public void m16026t(View view, String str) {
        InterfaceC11112u interfaceC11112uM8090b = AbstractC7841A0.m8090b(view);
        if (interfaceC11112uM8090b == null) {
            throw new IllegalArgumentException(("Expected " + view + '(' + str + ") to have a ViewTreeLifecycleOwner. Use WorkflowLifecycleOwner to fix that.").toString());
        }
        C14518a c14518a = new C14518a(str, interfaceC11112uM8090b);
        if (((C14518a) ((LinkedHashMap) this.f45762Z).put(str, c14518a)) != null) {
            throw new IllegalArgumentException(str + " is already in use, it cannot be used to register " + view);
        }
        InterfaceC3232g interfaceC3232gM8583b = AbstractC8104h6.m8583b(view);
        if (interfaceC3232gM8583b != null) {
            throw new IllegalArgumentException(view + " already has ViewTreeSavedStateRegistryOwner: " + interfaceC3232gM8583b);
        }
        AbstractC8104h6.m8585d(view, c14518a);
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f45761Y;
        if (linkedHashMap == null) {
            return;
        }
        c14518a.f45753o0.m349s((Bundle) linkedHashMap.remove(str));
    }

    /* JADX INFO: renamed from: u */
    public boolean m16027u() {
        if (((FrameMetricsAggregator) this.f45761Y) != null) {
            SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f45762Z;
            if (sentryAndroidOptions.isEnableFramesTracking() && !sentryAndroidOptions.isEnablePerformanceV2()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public void m16029w(AbstractCollection abstractCollection) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f45762Z;
        Iterator it = AbstractC17665J.m19264d(linkedHashMap.keySet(), abstractCollection).iterator();
        while (it.hasNext()) {
            linkedHashMap.remove((String) it.next());
        }
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.f45761Y;
        if (linkedHashMap2 == null) {
            return;
        }
        AbstractC17686t.m19402z(AbstractC17665J.m19264d(linkedHashMap2.keySet(), abstractCollection), linkedHashMap2.keySet());
    }

    /* JADX INFO: renamed from: x */
    public void m16030x(String name) {
        AbstractC16544l.m18094g(name, "name");
        ((C3847l0) this.f45763o0).m4582i(name);
    }

    /* JADX INFO: renamed from: y */
    public void m16031y(Runnable runnable, String str) {
        try {
            if (Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId()) {
                runnable.run();
            } else {
                C15184B c15184b = (C15184B) this.f45765q0;
                ((Handler) c15184b.f47305a).post(new RunnableC15201T(this, runnable, str, 1));
            }
        } catch (Throwable unused) {
            if (str != null) {
                ((SentryAndroidOptions) this.f45762Z).getLogger().mo16298o(EnumC15375i1.WARNING, "Failed to execute ".concat(str), new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public void m16032z(Class type, Object obj) {
        AbstractC16544l.m18094g(type, "type");
        if (obj == null) {
            ((LinkedHashMap) this.f45761Y).remove(type);
            return;
        }
        if (((LinkedHashMap) this.f45761Y).isEmpty()) {
            this.f45761Y = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f45761Y;
        Object objCast = type.cast(obj);
        AbstractC16544l.m18091d(objCast);
        linkedHashMap.put(type, objCast);
    }

    /* JADX INFO: renamed from: q */
    public String m16023q() {
        String strM12488l = ((C11232c) this.f45762Z).m12488l();
        String strM12488l2 = ((C11232c) this.f45763o0).m12488l();
        String strM12488l3 = ((C11232c) this.f45764p0).m12488l();
        List list = (List) this.f45761Y;
        AbstractC16544l.m18094g(list, "<this>");
        int iIndexOf = list.indexOf(strM12488l2);
        String strM21686T = iIndexOf > -1 ? AbstractC21322p.m21686T(2, String.valueOf(iIndexOf + 1)) : null;
        if (strM12488l == null || strM12488l.length() == 0 || strM21686T == null || strM21686T.length() == 0 || strM12488l3 == null || strM12488l3.length() == 0) {
            return QzvfuIgrngtl.qDHGHSUDa;
        }
        return strM12488l + "-" + strM21686T + "-" + strM12488l3;
    }

    /* JADX INFO: renamed from: v */
    public void m16028v(String method, AbstractC17325B abstractC17325B) {
        AbstractC16544l.m18094g(method, "method");
        if (method.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (abstractC17325B == null) {
            if (method.equals("POST") || method.equals("PUT") || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("REPORT")) {
                throw new IllegalArgumentException(AbstractC10763a.m11054l("method ", method, VjclRfeKsMflo.bKlKBSFuBeNcq).toString());
            }
        } else if (!AbstractC8162p0.m8732d(method)) {
            throw new IllegalArgumentException(AbstractC10763a.m11054l("method ", method, " must not have a request body.").toString());
        }
        this.f45764p0 = method;
        this.f45765q0 = abstractC17325B;
    }

    public C14522e(C19443c c19443c, HashMap map, HashMap map2, HashMap map3) {
        this.f45761Y = c19443c;
        this.f45764p0 = map2;
        this.f45765q0 = map3;
        this.f45763o0 = DesugarCollections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        c19443c.m20522d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        this.f45762Z = jArr;
    }

    public C14522e(int i10) {
        switch (i10) {
            case 3:
                this.f45761Y = new LinkedHashMap();
                this.f45764p0 = "GET";
                this.f45763o0 = new C3847l0(3);
                break;
            default:
                this.f45762Z = new LinkedHashMap();
                this.f45765q0 = new C3227b(this, 5);
                break;
        }
    }

    public C14522e(EnumC18300d enumC18300d, String url) {
        AbstractC16544l.m18094g(url, "url");
        this.f45761Y = enumC18300d;
        this.f45764p0 = url;
        this.f45763o0 = new ArrayList();
        this.f45765q0 = C17870w.f56967a;
    }

    public C14522e(Context context) {
        this.f45761Y = context.getApplicationContext();
        this.f45762Z = AbstractC0369d.f1260a;
        this.f45763o0 = null;
        this.f45764p0 = null;
        this.f45765q0 = new C0375j();
    }
}
