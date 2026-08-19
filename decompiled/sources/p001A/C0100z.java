package p001A;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.gov.nist.core.Separators;
import android.graphics.Point;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.PlaybackMetrics;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Log;
import android.util.SparseArray;
import android.view.Surface;
import bb.AbstractC11278C;
import bb.C11276A;
import bb.C11294T;
import bb.C11333z;
import com.google.firebase.FirebaseCommonRegistrar;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import fo.C13711h;
import io.sentry.C15134J0;
import io.sentry.C15360h0;
import io.sentry.InterfaceC15137K0;
import io.sentry.InterfaceC15320b0;
import io.sentry.internal.debugmeta.C15384c;
import io.sentry.vendor.gson.stream.C15513a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import jm.InterfaceC16271b;
import kotlin.jvm.internal.AbstractC16544l;
import p030B2.C0781s;
import p057C3.C1526D;
import p057C3.C1567l;
import p083D3.AbstractC1871i;
import p083D3.C1863a;
import p083D3.C1868f;
import p083D3.C1869g;
import p083D3.C1870h;
import p083D3.C1873k;
import p1016t3.AbstractC19756F;
import p1016t3.AbstractC19764N;
import p1016t3.AbstractC19780g;
import p1016t3.C19755E;
import p1016t3.C19765O;
import p1016t3.C19769T;
import p1016t3.C19770U;
import p1016t3.C19785l;
import p1016t3.C19786m;
import p1016t3.C19788o;
import p1021t8.EnumC19815f;
import p1072w2.InterfaceC20790b;
import p1073w3.AbstractC20817s;
import p1073w3.C20810l;
import p1073w3.InterfaceC20806h;
import p1073w3.InterfaceC20807i;
import p109E3.C2291o;
import p109E3.C2293q;
import p1142z3.AbstractC21753u;
import p1142z3.C21731D;
import p1142z3.C21749q;
import p1142z3.C21752t;
import p1142z3.C21754v;
import p117Eb.AbstractServiceC2377g;
import p117Eb.C2380j;
import p133F3.AbstractC2655a;
import p133F3.C2656b;
import p133F3.C2663i;
import p167Gb.C3030a;
import p178H.C3150i0;
import p178H.C3151j;
import p178H.C3162o0;
import p178H.C3169s;
import p178H.C3170s0;
import p178H.C3179x;
import p178H.InterfaceC3168r0;
import p178H.RunnableC3167r;
import p182H3.C3212m;
import p182H3.C3217r;
import p228J.AbstractC3810L;
import p228J.AbstractC3812N;
import p228J.C3799E;
import p228J.C3809K;
import p228J.C3851n0;
import p228J.InterfaceC3819V;
import p228J.InterfaceC3820W;
import p232J3.C4249u;
import p232J3.C4253y;
import p239Ja.C4307j;
import p277L.ExecutorC4828a;
import p277L.ExecutorC4836i;
import p281L3.C4922i;
import p281L3.C4924k;
import p281L3.C4927n;
import p281L3.InterfaceC4925l;
import p301M.AbstractC5229k;
import p301M.C5222d;
import p301M.C5226h;
import p301M.C5231m;
import p301M.InterfaceC5219a;
import p301M.RunnableC5220b;
import p301M.RunnableC5228j;
import p326N.C5560b;
import p389Pn.C6518c;
import p402Qc.C6593i;
import p414R.C6769c;
import p414R.C6771e;
import p414R.C6773g;
import p414R.C6781o;
import p465T.AbstractC7173i;
import p465T.EnumC7170f;
import p514V.C7729c;
import p522V8.EnumC7837d;
import p523V9.AbstractC8072d6;
import p536W.C8408d;
import p544W9.AbstractC8577W2;
import p561X.C8990d;
import p561X.C9005s;
import p588Y2.C9614S;
import p593Y8.C9682i;
import p610Z1.C10142i;
import p610Z1.C10145l;
import p610Z1.InterfaceC10143j;
import p615Z6.C10252z0;
import p658b5.C11238i;
import p658b5.C11241l;
import p658b5.C11242m;
import p658b5.C11248s;
import p663b9.EnumC11264c;
import p692d0.C12966e;
import p723e9.C13350h;
import p745f9.C13583a;
import p745f9.C13584b;
import p745f9.C13588f;
import p745f9.C13589g;
import p745f9.InterfaceC13587e;
import p746fa.C13606o;
import p746fa.InterfaceC13592a;
import p746fa.InterfaceC13594c;
import p747fb.InterfaceFutureC13608b;
import p767g9.InterfaceC13831b;
import p791hj.C14522e;
import p817j$.util.Objects;
import p848k6.AbstractC16347a;
import p890mb.C17204a;
import p890mb.InterfaceC17207d;

/* JADX INFO: renamed from: A.z */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0100z implements InterfaceC5219a, InterfaceC10143j, InterfaceC20807i, InterfaceC20806h, InterfaceC13594c, InterfaceC13592a, InterfaceC17207d, InterfaceC3819V, InterfaceC4925l, InterfaceC3168r0, InterfaceC16271b, InterfaceC20790b, InterfaceC13831b, InterfaceC13587e, InterfaceC15320b0, InterfaceC15137K0 {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f428Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f429Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f430o0;

    public /* synthetic */ C0100z(Object obj, int i10, Object obj2) {
        this.f428Y = i10;
        this.f429Z = obj;
        this.f430o0 = obj2;
    }

    @Override // p746fa.InterfaceC13592a
    /* JADX INFO: renamed from: L */
    public Object mo253L(C13606o c13606o) {
        C2380j c2380j = (C2380j) this.f429Z;
        String str = (String) this.f430o0;
        synchronized (c2380j) {
            ((C12966e) c2380j.f7406b).remove(str);
        }
        return c13606o;
    }

    @Override // p767g9.InterfaceC13831b
    /* JADX INFO: renamed from: a */
    public Object mo197a() {
        switch (this.f428Y) {
            case 25:
                C13589g c13589g = (C13589g) ((C13350h) this.f429Z).f42354c;
                c13589g.getClass();
                Iterable iterable = (Iterable) this.f430o0;
                if (iterable.iterator().hasNext()) {
                    c13589g.m15109a().compileStatement("DELETE FROM events WHERE _id in " + C13589g.m15104S(iterable)).execute();
                    break;
                }
                break;
            default:
                C13350h c13350h = (C13350h) this.f429Z;
                c13350h.getClass();
                for (Map.Entry entry : ((HashMap) this.f430o0).entrySet()) {
                    ((C13589g) c13350h.f42360i).m15107E(((Integer) entry.getValue()).intValue(), EnumC11264c.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // p745f9.InterfaceC13587e
    /* JADX INFO: renamed from: apply */
    public Object mo22420apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        C13589g c13589g = (C13589g) this.f429Z;
        C13583a c13583a = c13589g.f42953p0;
        int i10 = c13583a.f42940b;
        C9682i c9682i = (C9682i) this.f430o0;
        ArrayList arrayListM15111m = c13589g.m15111m(sQLiteDatabase, c9682i, i10);
        for (EnumC7837d enumC7837d : EnumC7837d.values()) {
            if (enumC7837d != c9682i.f29190c) {
                int size = c13583a.f42940b - arrayListM15111m.size();
                if (size <= 0) {
                    break;
                }
                C13711h c13711hM10270a = C9682i.m10270a();
                c13711hM10270a.m15184G(c9682i.f29188a);
                if (enumC7837d == null) {
                    throw new NullPointerException("Null priority");
                }
                c13711hM10270a.f43261p0 = enumC7837d;
                c13711hM10270a.f43260o0 = c9682i.f29189b;
                arrayListM15111m.addAll(c13589g.m15111m(sQLiteDatabase, c13711hM10270a.m15193g(), size));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i11 = 0; i11 < arrayListM15111m.size(); i11++) {
            sb2.append(((C13584b) arrayListM15111m.get(i11)).f42944a);
            if (i11 < arrayListM15111m.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", DiagnosticsEntry.NAME_KEY, "value"}, sb2.toString(), null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                long j10 = cursorQuery.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j10));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j10), hashSet);
                }
                hashSet.add(new C13588f(cursorQuery.getString(1), cursorQuery.getString(2)));
            } catch (Throwable th2) {
                cursorQuery.close();
                throw th2;
            }
        }
        cursorQuery.close();
        ListIterator listIterator = arrayListM15111m.listIterator();
        while (listIterator.hasNext()) {
            C13584b c13584b = (C13584b) listIterator.next();
            if (map.containsKey(Long.valueOf(c13584b.f42944a))) {
                C10252z0 c10252z0M10269c = c13584b.f42946c.m10269c();
                long j11 = c13584b.f42944a;
                for (C13588f c13588f : (Set) map.get(Long.valueOf(j11))) {
                    c10252z0M10269c.m10843d(c13588f.f42947a, c13588f.f42948b);
                }
                listIterator.set(new C13584b(j11, c13584b.f42945b, c10252z0M10269c.m10846f()));
            }
        }
        return arrayListM15111m;
    }

    @Override // p610Z1.InterfaceC10143j
    /* JADX INFO: renamed from: b */
    public Object mo169b(C10142i c10142i) {
        switch (this.f428Y) {
            case 1:
                C0057d0 c0057d0 = (C0057d0) this.f429Z;
                c0057d0.getClass();
                AbstractC8577W2.m9243e().execute(new RunnableC0066i(c0057d0, (AtomicReference) this.f430o0, c10142i, 1));
                return "OnScreenFlashStart";
            case 3:
                C0007D0 c0007d0 = (C0007D0) this.f429Z;
                c0007d0.getClass();
                c0007d0.f24b.execute(new RunnableC0066i(c0007d0, c10142i, (C3179x) this.f430o0, 2));
                return "startFocusAndMetering";
            case 5:
                C0042V0 c0042v0 = (C0042V0) this.f429Z;
                c0042v0.getClass();
                ((ExecutorC4836i) c0042v0.f206o0).execute(new RunnableC0066i(c0042v0, c10142i, (C5560b) this.f430o0, 3));
                return "setZoomRatio";
            case 12:
                C3169s c3169s = (C3169s) this.f429Z;
                c3169s.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                Context context = (Context) this.f430o0;
                Executor executor = c3169s.f9526d;
                executor.execute(new RunnableC3167r(c3169s, context, executor, 1, c10142i, jElapsedRealtime));
                return "CameraX initInternal";
            case 14:
                C3170s0 c3170s0 = (C3170s0) this.f429Z;
                c3170s0.getClass();
                ((AtomicReference) this.f430o0).set(c10142i);
                return "SurfaceRequest-surface-recreation(" + c3170s0.hashCode() + Separators.RPAREN;
            case 21:
                C8408d this$0 = (C8408d) this.f429Z;
                C3169s c3169s2 = (C3169s) this.f430o0;
                AbstractC16544l.m18094g(this$0, "this$0");
                synchronized (this$0.f26140a) {
                    C5222d c5222dM5765c = C5222d.m5765c(C5231m.f16977o0);
                    C4307j c4307j = new C4307j(new C6593i(c3169s2, 17), 8);
                    ExecutorC4828a executorC4828aM9240b = AbstractC8577W2.m9240b();
                    c5222dM5765c.getClass();
                    RunnableC5220b runnableC5220bM5782f = AbstractC5229k.m5782f(c5222dM5765c, c4307j, executorC4828aM9240b);
                    runnableC5220bM5782f.mo5766a(new RunnableC5228j(runnableC5220bM5782f, 0, new C15384c(c10142i, 16, c3169s2)), AbstractC8577W2.m9240b());
                }
                return "ProcessCameraProvider-initializeCameraX";
            default:
                C9005s c9005s = (C9005s) this.f429Z;
                c9005s.getClass();
                AbstractC8072d6.m8486c("TextureViewImpl", "Surface set on Preview.");
                C3170s0 c3170s1 = c9005s.f27477h;
                ExecutorC4828a executorC4828aM9240b2 = AbstractC8577W2.m9240b();
                C6781o c6781o = new C6781o(c10142i, 2);
                Surface surface = (Surface) this.f430o0;
                c3170s1.m3999a(surface, executorC4828aM9240b2, c6781o);
                return "provideSurface[request=" + c9005s.f27477h + " surface=" + surface + "]";
        }
    }

    @Override // p178H.InterfaceC3168r0
    /* JADX INFO: renamed from: c */
    public void mo268c(C3151j c3151j) {
        C6771e c6771e = (C6771e) this.f429Z;
        c6771e.getClass();
        EnumC7170f enumC7170f = EnumC7170f.f22786Z;
        if (((C3170s0) this.f430o0).f9536c.m4022a() && c3151j.f9485d) {
            enumC7170f = EnumC7170f.f22787o0;
        }
        C6773g c6773g = c6771e.f21723Y;
        AbstractC7173i.m7546d((AtomicBoolean) c6773g.f21738o0, true);
        AbstractC7173i.m7545c((Thread) c6773g.f21740q0);
        if (((EnumC7170f) c6773g.f21748y0) != enumC7170f) {
            c6773g.f21748y0 = enumC7170f;
            c6773g.m7221o(c6773g.f21736Y);
        }
    }

    @Override // p228J.InterfaceC3819V
    /* JADX INFO: renamed from: d */
    public void mo256d(InterfaceC3820W interfaceC3820W) {
        switch (this.f428Y) {
            case 13:
                C3150i0 c3150i0 = (C3150i0) this.f429Z;
                c3150i0.getClass();
                ((InterfaceC3819V) this.f430o0).mo256d(c3150i0);
                break;
            default:
                C11241l c11241l = (C11241l) this.f429Z;
                c11241l.getClass();
                ((InterfaceC3819V) this.f430o0).mo256d(c11241l);
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (r5.equals("x-datadog-tags") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        if (r5.equals("traceparent") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        if (r5.equals("tracestate") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r1.contains(p1021t8.EnumC19815f.f62867p0) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        kotlin.jvm.internal.AbstractC16544l.m18093f(r6, "value");
        r0.m16012b(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (r5.equals("x-datadog-sampling-priority") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        if (r5.equals("x-datadog-parent-id") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008c, code lost:
    
        if (r5.equals("X-B3-SpanId") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0095, code lost:
    
        if (r5.equals("X-B3-TraceId") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009e, code lost:
    
        if (r1.contains(p1021t8.EnumC19815f.f62866o0) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a0, code lost:
    
        kotlin.jvm.internal.AbstractC16544l.m18093f(r6, "value");
        r0.m16012b(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ad, code lost:
    
        if (r5.equals("x-datadog-origin") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bc, code lost:
    
        if (r1.contains(p1021t8.EnumC19815f.f62864Y) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00be, code lost:
    
        kotlin.jvm.internal.AbstractC16544l.m18093f(r6, "value");
        r0.m16012b(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (r5.equals("X-B3-Sampled") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        if (r5.equals("x-datadog-trace-id") == false) goto L46;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // jm.InterfaceC16271b
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo389e(String key, String value) {
        C14522e c14522e = (C14522e) this.f429Z;
        Set set = (Set) this.f430o0;
        AbstractC16544l.m18093f(key, "key");
        c14522e.m16030x(key);
        switch (key.hashCode()) {
            case -1682961930:
                break;
            case -1140603879:
                break;
            case -344354804:
                break;
            case 3089:
                if (key.equals("b3")) {
                    if (set.contains(EnumC19815f.f62865Z)) {
                        AbstractC16544l.m18093f(value, "value");
                        c14522e.m16012b(key, value);
                    }
                }
                AbstractC16544l.m18093f(value, "value");
                c14522e.m16012b(key, value);
                break;
            case 304080974:
                break;
            case 762897402:
                break;
            case 1006622316:
                break;
            case 1037578799:
                break;
            case 1316815593:
                break;
            case 1767467379:
                break;
            case 1791641299:
                break;
            default:
                AbstractC16544l.m18093f(value, "value");
                c14522e.m16012b(key, value);
                break;
        }
    }

    @Override // io.sentry.InterfaceC15137K0
    /* JADX INFO: renamed from: f */
    public void mo390f(C15134J0 c15134j0) {
        ((AtomicReference) this.f429Z).set(c15134j0.f47114b);
        ((AtomicReference) this.f430o0).set(c15134j0.f47130r);
    }

    @Override // p890mb.InterfaceC17207d
    /* JADX INFO: renamed from: g */
    public Object mo391g(C11238i c11238i) {
        String strValueOf;
        switch (this.f428Y) {
            case 11:
                Context context = (Context) c11238i.mo12555a(Context.class);
                switch (((C8990d) this.f430o0).f27435Y) {
                    case 25:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        strValueOf = applicationInfo == null ? "" : String.valueOf(applicationInfo.targetSdkVersion);
                        break;
                    case 26:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        strValueOf = (applicationInfo2 != null && Build.VERSION.SDK_INT >= 24) ? String.valueOf(applicationInfo2.minSdkVersion) : "";
                        break;
                    case 27:
                        int i10 = Build.VERSION.SDK_INT;
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            strValueOf = "tv";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            strValueOf = "watch";
                        } else if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            strValueOf = (i10 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "embedded" : "";
                        } else {
                            strValueOf = "auto";
                        }
                        break;
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        strValueOf = installerPackageName == null ? "" : FirebaseCommonRegistrar.m13699a(installerPackageName);
                        break;
                }
                return new C3030a((String) this.f429Z, strValueOf);
            default:
                String str = (String) this.f429Z;
                C17204a c17204a = (C17204a) this.f430o0;
                try {
                    Trace.beginSection(str);
                    return c17204a.f54925f.mo391g(c11238i);
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override // io.sentry.InterfaceC15320b0
    /* JADX INFO: renamed from: h */
    public Object mo392h() {
        C15360h0 c15360h0 = (C15360h0) this.f430o0;
        ((C6518c) this.f429Z).getClass();
        try {
            try {
                return Integer.valueOf(((C15513a) c15360h0.f47948Z).m16713g0());
            } catch (Exception unused) {
                return Double.valueOf(((C15513a) c15360h0.f47948Z).m16701O());
            }
        } catch (Exception unused2) {
            return Long.valueOf(((C15513a) c15360h0.f47948Z).m16697E0());
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0072  */
    @Override // p281L3.InterfaceC4925l
    /* JADX INFO: renamed from: i */
    public C11294T mo393i(int i10, C19765O c19765o, int[] iArr) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        switch (this.f428Y) {
            case 17:
                int i16 = ((int[]) this.f430o0)[i10];
                C4922i c4922i = (C4922i) this.f429Z;
                int i17 = c4922i.f62629e;
                int i18 = Integer.MAX_VALUE;
                if (i17 == Integer.MAX_VALUE || (i12 = c4922i.f62630f) == Integer.MAX_VALUE) {
                    i11 = Integer.MAX_VALUE;
                } else {
                    int i19 = Integer.MAX_VALUE;
                    for (int i20 = 0; i20 < c19765o.f62602a; i20++) {
                        C19788o c19788o = c19765o.f62605d[i20];
                        int i21 = c19788o.f62758s;
                        if (i21 > 0 && (i13 = c19788o.f62759t) > 0) {
                            if (!c4922i.f62631g) {
                                i14 = i17;
                                i15 = i12;
                            } else if ((i21 > i13) != (i17 > i12)) {
                                i15 = i17;
                                i14 = i12;
                            } else {
                                i14 = i17;
                                i15 = i12;
                            }
                            int i22 = i21 * i15;
                            int i23 = i13 * i14;
                            Point point = i22 >= i23 ? new Point(i14, AbstractC20817s.m21405f(i23, i21)) : new Point(AbstractC20817s.m21405f(i22, i13), i15);
                            int i24 = c19788o.f62758s;
                            int i25 = i24 * i13;
                            if (i24 >= ((int) (point.x * 0.98f)) && i13 >= ((int) (point.y * 0.98f)) && i25 < i19) {
                                i19 = i25;
                            }
                        }
                    }
                    i11 = i19;
                }
                C11333z c11333zM12690s = AbstractC11278C.m12690s();
                int i26 = 0;
                while (i26 < c19765o.f62602a) {
                    int iM20748b = c19765o.f62605d[i26].m20748b();
                    c11333zM12690s.m12762a(new C4927n(i10, c19765o, i26, c4922i, iArr[i26], i16, i11 == i18 || (iM20748b != -1 && iM20748b <= i11)));
                    i26++;
                    i18 = Integer.MAX_VALUE;
                }
                return c11333zM12690s.m12768j();
            default:
                C11333z c11333zM12690s2 = AbstractC11278C.m12690s();
                for (int i27 = 0; i27 < c19765o.f62602a; i27++) {
                    c11333zM12690s2.m12762a(new C4924k(i10, c19765o, i27, (C4922i) this.f429Z, iArr[i27], (String) this.f430o0));
                }
                return c11333zM12690s2.m12768j();
        }
    }

    @Override // p1073w3.InterfaceC20806h
    public void invoke(Object obj) {
        C1873k c1873k = (C1873k) obj;
        c1873k.getClass();
        C1863a c1863a = (C1863a) this.f429Z;
        C4253y c4253y = c1863a.f5350d;
        if (c4253y == null) {
            return;
        }
        C4249u c4249u = (C4249u) this.f430o0;
        C19788o c19788o = (C19788o) c4249u.f13894p0;
        c19788o.getClass();
        c4253y.getClass();
        boolean z6 = false;
        C11248s c11248s = new C11248s(c19788o, c1873k.f5391b.m2784d(c1863a.f5348b, c4253y), z6, 3);
        int i10 = c4249u.f13891Y;
        if (i10 != 0) {
            if (i10 == 1) {
                c1873k.f5405p = c11248s;
                return;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                c1873k.f5406q = c11248s;
                return;
            }
        }
        c1873k.f5404o = c11248s;
    }

    /* JADX WARN: Code duplicated, block: B:238:0x0466  */
    /* JADX WARN: Code duplicated, block: B:251:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:254:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:256:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:257:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:259:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:266:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:267:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:351:0x0617 A[PHI: r4
      0x0617: PHI (r4v80 int) = (r4v79 int), (r4v78 int) binds: [B:360:0x0630, B:350:0x0615] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:370:0x0643  */
    /* JADX WARN: Code duplicated, block: B:373:0x066b  */
    /* JADX WARN: Code duplicated, block: B:399:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v31, types: [java.lang.Object, t3.o] */
    /* JADX WARN: Type inference failed for: r13v42 */
    /* JADX WARN: Type inference failed for: r13v43 */
    @Override // p1073w3.InterfaceC20807i
    /* JADX INFO: renamed from: j */
    public void mo394j(Object obj, C19786m c19786m) {
        boolean z6;
        int i10;
        int i11;
        int i12;
        char c9;
        C0781s c0781s;
        C0781s c0781s2;
        C0781s c0781s3;
        int i13;
        char c10;
        int i14;
        int i15;
        C19788o c19788o;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z10;
        int i20;
        int i21;
        boolean z11;
        Object obj2;
        int i22;
        C19788o c19788o2;
        int i23;
        C19785l c19785l;
        int i24;
        C1868f c1868f = (C1868f) this.f429Z;
        AbstractC3812N abstractC3812N = (AbstractC3812N) this.f430o0;
        C1873k c1873k = (C1873k) obj;
        SparseArray sparseArray = c1868f.f5368q0;
        SparseArray sparseArray2 = new SparseArray(c19786m.f62693a.size());
        for (int i25 = 0; i25 < c19786m.f62693a.size(); i25++) {
            int iM20745a = c19786m.m20745a(i25);
            C1863a c1863a = (C1863a) sparseArray.get(iM20745a);
            c1863a.getClass();
            sparseArray2.append(iM20745a, c1863a);
        }
        c1873k.getClass();
        if (c19786m.f62693a.size() == 0) {
            return;
        }
        for (int i26 = 0; i26 < c19786m.f62693a.size(); i26++) {
            int iM20745a2 = c19786m.m20745a(i26);
            C1863a c1863a2 = (C1863a) sparseArray2.get(iM20745a2);
            c1863a2.getClass();
            if (iM20745a2 == 0) {
                C1870h c1870h = c1873k.f5391b;
                synchronized (c1870h) {
                    try {
                        c1870h.f5385d.getClass();
                        AbstractC19764N abstractC19764N = c1870h.f5386e;
                        c1870h.f5386e = c1863a2.f5348b;
                        Iterator it = c1870h.f5384c.values().iterator();
                        while (it.hasNext()) {
                            C1869g c1869g = (C1869g) it.next();
                            if (!c1869g.m2780b(abstractC19764N, c1870h.f5386e) || c1869g.m2779a(c1863a2)) {
                                it.remove();
                                if (c1869g.f5377e) {
                                    if (c1869g.f5373a.equals(c1870h.f5387f)) {
                                        c1870h.m2781a(c1869g);
                                    }
                                    c1870h.f5385d.m2851d(c1863a2, c1869g.f5373a);
                                }
                            }
                        }
                        c1870h.m2785e(c1863a2);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else if (iM20745a2 == 11) {
                c1873k.f5391b.m2787g(c1863a2, c1873k.f5400k);
            } else {
                c1873k.f5391b.m2786f(c1863a2);
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (c19786m.f62693a.get(0)) {
            C1863a c1863a3 = (C1863a) sparseArray2.get(0);
            c1863a3.getClass();
            if (c1873k.f5399j != null) {
                c1873k.m2850c(c1863a3.f5348b, c1863a3.f5350d);
            }
        }
        if (c19786m.f62693a.get(2) && c1873k.f5399j != null) {
            C1526D c1526d = (C1526D) abstractC3812N;
            c1526d.m2256q0();
            C11276A c11276aM12699v = c1526d.f4087k1.f4258i.f16099d.f62648a.listIterator(0);
            loop3: while (true) {
                if (!c11276aM12699v.hasNext()) {
                    c19785l = null;
                    break;
                }
                C19769T c19769t = (C19769T) c11276aM12699v.next();
                for (int i27 = 0; i27 < c19769t.f62642a; i27++) {
                    if (c19769t.f62646e[i27] && (c19785l = c19769t.f62643b.f62605d[i27].f62756q) != null) {
                        break loop3;
                    }
                }
            }
            if (c19785l != null) {
                PlaybackMetrics.Builder builderM2802k = AbstractC1871i.m2802k(c1873k.f5399j);
                int i28 = 0;
                while (true) {
                    if (i28 >= c19785l.f62692p0) {
                        i24 = 1;
                        break;
                    }
                    UUID uuid = c19785l.f62689Y[i28].f62685Z;
                    if (uuid.equals(AbstractC19780g.f62672d)) {
                        i24 = 3;
                        break;
                    } else if (uuid.equals(AbstractC19780g.f62673e)) {
                        i24 = 2;
                        break;
                    } else {
                        if (uuid.equals(AbstractC19780g.f62671c)) {
                            i24 = 6;
                            break;
                        }
                        i28++;
                    }
                }
                builderM2802k.setDrmType(i24);
            }
        }
        if (c19786m.f62693a.get(1011)) {
            c1873k.f5415z++;
        }
        AbstractC19756F abstractC19756F = c1873k.f5403n;
        if (abstractC19756F == null) {
            c9 = 4;
            i11 = 6;
            i12 = 9;
        } else {
            boolean z12 = c1873k.f5411v == 4;
            int i29 = abstractC19756F.f62561Y;
            if (i29 == 1001) {
                c0781s = new C0781s(20, 0, 1);
            } else {
                if (abstractC19756F instanceof C1567l) {
                    C1567l c1567l = (C1567l) abstractC19756F;
                    z6 = c1567l.f4383o0 == 1;
                    i10 = c1567l.f4387s0;
                } else {
                    z6 = false;
                    i10 = 0;
                }
                Throwable cause = abstractC19756F.getCause();
                cause.getClass();
                if (!(cause instanceof IOException)) {
                    int i30 = 24;
                    i11 = 6;
                    i12 = 9;
                    c9 = 4;
                    if (z6 && (i10 == 0 || i10 == 1)) {
                        c0781s3 = new C0781s(35, 0, 1);
                    } else if (z6 && i10 == 3) {
                        c0781s3 = new C0781s(15, 0, 1);
                    } else {
                        if (z6 && i10 == 2) {
                            c0781s3 = new C0781s(23, 0, 1);
                        } else {
                            if (cause instanceof C3217r) {
                                c0781s2 = new C0781s(13, AbstractC20817s.m21417r(((C3217r) cause).f9714p0), 1);
                            } else if (cause instanceof C3212m) {
                                c0781s = new C0781s(14, ((C3212m) cause).f9702Y, 1);
                            } else if (cause instanceof OutOfMemoryError) {
                                c0781s = new C0781s(14, 0, 1);
                            } else if (cause instanceof C2291o) {
                                c0781s = new C0781s(17, ((C2291o) cause).f7080Y, 1);
                            } else if (cause instanceof C2293q) {
                                c0781s = new C0781s(18, ((C2293q) cause).f7082Y, 1);
                            } else if (cause instanceof MediaCodec.CryptoException) {
                                int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                switch (AbstractC20817s.m21416q(errorCode)) {
                                    case 6002:
                                        break;
                                    case 6003:
                                        i30 = 28;
                                        break;
                                    case 6004:
                                        i30 = 25;
                                        break;
                                    case 6005:
                                        i30 = 26;
                                        break;
                                    default:
                                        i30 = 27;
                                        break;
                                }
                                c0781s2 = new C0781s(i30, errorCode, 1);
                            } else {
                                c0781s = new C0781s(22, 0, 1);
                            }
                            c0781s = c0781s2;
                        }
                        c1873k.f5392c.reportPlaybackErrorEvent(AbstractC1871i.m2795d().setTimeSinceCreatedMillis(jElapsedRealtime - c1873k.f5393d).setErrorCode(c0781s.f2192b).setSubErrorCode(c0781s.f2193c).setException(abstractC19756F).build());
                        c1873k.f5389A = true;
                        c1873k.f5403n = null;
                    }
                    c0781s = c0781s3;
                } else if (cause instanceof C21754v) {
                    c0781s = new C0781s(5, ((C21754v) cause).f69011p0, 1);
                } else {
                    if ((cause instanceof AbstractC21753u) || (cause instanceof C19755E)) {
                        i13 = 9;
                        c10 = 4;
                        i14 = 6;
                        c0781s = new C0781s(z12 ? 10 : 11, 0, 1);
                    } else {
                        boolean z13 = cause instanceof C21752t;
                        if (z13 || (cause instanceof C21731D)) {
                            i13 = 9;
                            if (C20810l.m21336b(c1873k.f5390a).m21337c() == 1) {
                                c0781s = new C0781s(3, 0, 1);
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    i14 = 6;
                                    c0781s = new C0781s(6, 0, 1);
                                } else {
                                    i14 = 6;
                                    if (cause2 instanceof SocketTimeoutException) {
                                        c0781s = new C0781s(7, 0, 1);
                                    } else if (z13 && ((C21752t) cause).f69010o0 == 1) {
                                        c10 = 4;
                                        c0781s = new C0781s(4, 0, 1);
                                    } else {
                                        c10 = 4;
                                        c0781s = new C0781s(8, 0, 1);
                                    }
                                }
                                i12 = 9;
                                i11 = i14;
                            }
                            c9 = 4;
                            c1873k.f5392c.reportPlaybackErrorEvent(AbstractC1871i.m2795d().setTimeSinceCreatedMillis(jElapsedRealtime - c1873k.f5393d).setErrorCode(c0781s.f2192b).setSubErrorCode(c0781s.f2193c).setException(abstractC19756F).build());
                            c1873k.f5389A = true;
                            c1873k.f5403n = null;
                        } else if (i29 == 1002) {
                            c0781s = new C0781s(21, 0, 1);
                        } else if (cause instanceof C2656b) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            int i31 = AbstractC20817s.f66106a;
                            if (i31 >= 21 && (cause3 instanceof MediaDrm.MediaDrmStateException)) {
                                int iM21417r = AbstractC20817s.m21417r(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                switch (AbstractC20817s.m21416q(iM21417r)) {
                                    case 6002:
                                        i15 = 24;
                                        break;
                                    case 6003:
                                        i15 = 28;
                                        break;
                                    case 6004:
                                        i15 = 25;
                                        break;
                                    case 6005:
                                        i15 = 26;
                                        break;
                                    default:
                                        i15 = 27;
                                        break;
                                }
                                c0781s = new C0781s(i15, iM21417r, 1);
                            } else if (i31 >= 23 && (cause3 instanceof MediaDrmResetException)) {
                                c0781s = new C0781s(27, 0, 1);
                            } else if (cause3 instanceof NotProvisionedException) {
                                c0781s = new C0781s(24, 0, 1);
                            } else if (cause3 instanceof DeniedByServerException) {
                                c0781s = new C0781s(29, 0, 1);
                            } else if (cause3 instanceof C2663i) {
                                c0781s = new C0781s(23, 0, 1);
                            } else {
                                c0781s = cause3 instanceof AbstractC2655a ? new C0781s(28, 0, 1) : new C0781s(30, 0, 1);
                            }
                        } else if ((cause instanceof C21749q) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            c0781s = (AbstractC20817s.f66106a >= 21 && (cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new C0781s(32, 0, 1) : new C0781s(31, 0, 1);
                        } else {
                            i13 = 9;
                            c0781s = new C0781s(9, 0, 1);
                        }
                        i12 = i13;
                        i11 = 6;
                        c9 = 4;
                        c1873k.f5392c.reportPlaybackErrorEvent(AbstractC1871i.m2795d().setTimeSinceCreatedMillis(jElapsedRealtime - c1873k.f5393d).setErrorCode(c0781s.f2192b).setSubErrorCode(c0781s.f2193c).setException(abstractC19756F).build());
                        c1873k.f5389A = true;
                        c1873k.f5403n = null;
                    }
                    i12 = i13;
                    c9 = c10;
                    i11 = i14;
                }
                c1873k.f5392c.reportPlaybackErrorEvent(AbstractC1871i.m2795d().setTimeSinceCreatedMillis(jElapsedRealtime - c1873k.f5393d).setErrorCode(c0781s.f2192b).setSubErrorCode(c0781s.f2193c).setException(abstractC19756F).build());
                c1873k.f5389A = true;
                c1873k.f5403n = null;
            }
            i11 = 6;
            i12 = 9;
            c9 = 4;
            c1873k.f5392c.reportPlaybackErrorEvent(AbstractC1871i.m2795d().setTimeSinceCreatedMillis(jElapsedRealtime - c1873k.f5393d).setErrorCode(c0781s.f2192b).setSubErrorCode(c0781s.f2193c).setException(abstractC19756F).build());
            c1873k.f5389A = true;
            c1873k.f5403n = null;
        }
        int i32 = 2;
        if (c19786m.f62693a.get(2)) {
            C1526D c1526d2 = (C1526D) abstractC3812N;
            c1526d2.m2256q0();
            C19770U c19770u = c1526d2.f4087k1.f4258i.f16099d;
            boolean zM20730a = c19770u.m20730a(2);
            boolean zM20730a2 = c19770u.m20730a(1);
            boolean zM20730a3 = c19770u.m20730a(3);
            if (zM20730a || zM20730a2 || zM20730a3) {
                if (zM20730a) {
                    i16 = 7;
                    obj2 = null;
                } else {
                    if (AbstractC20817s.m21400a(c1873k.f5407r, null)) {
                        obj2 = null;
                        i16 = 7;
                    } else {
                        int i33 = c1873k.f5407r == null ? 1 : 0;
                        c1873k.f5407r = null;
                        i16 = 7;
                        obj2 = null;
                        i11 = i11;
                        i17 = 8;
                        i18 = 5;
                        i32 = 2;
                        c1873k.m2852e(1, jElapsedRealtime, null, i33);
                    }
                    if (zM20730a2) {
                        c19788o = obj2;
                    } else {
                        c19788o2 = obj2;
                        if (!AbstractC20817s.m21400a(c1873k.f5408s, c19788o2)) {
                            if (c1873k.f5408s == null) {
                                c19788o = c19788o2;
                                i23 = 1;
                            } else {
                                c19788o = c19788o2;
                                i23 = 0;
                            }
                            c1873k.f5408s = c19788o2;
                            c1873k.m2852e(0, jElapsedRealtime, c19788o2, i23);
                            c19788o = c19788o2;
                        }
                    }
                    if (!zM20730a3 && !AbstractC20817s.m21400a(c1873k.f5409t, c19788o)) {
                        if (c1873k.f5409t == null) {
                            i22 = 1;
                        } else {
                            i22 = 0;
                        }
                        c1873k.f5409t = c19788o;
                        c1873k.m2852e(2, jElapsedRealtime, c19788o, i22);
                    }
                }
                i17 = 8;
                i18 = 5;
                if (zM20730a2) {
                    c19788o2 = obj2;
                    if (!AbstractC20817s.m21400a(c1873k.f5408s, c19788o2)) {
                        if (c1873k.f5408s == null) {
                            c19788o = c19788o2;
                            i23 = 1;
                        } else {
                            c19788o = c19788o2;
                            i23 = 0;
                        }
                        c1873k.f5408s = c19788o2;
                        c1873k.m2852e(0, jElapsedRealtime, c19788o2, i23);
                        c19788o = c19788o2;
                    }
                } else {
                    c19788o = obj2;
                }
                if (!zM20730a3) {
                    if (c1873k.f5409t == null) {
                        i22 = 1;
                    } else {
                        i22 = 0;
                    }
                    c1873k.f5409t = c19788o;
                    c1873k.m2852e(2, jElapsedRealtime, c19788o, i22);
                }
            } else {
                i32 = 2;
                i11 = i11;
                c19788o = 0;
                i16 = 7;
                i17 = 8;
                i18 = 5;
            }
        } else {
            i32 = 2;
            i11 = i11;
            c19788o = 0;
            i16 = 7;
            i17 = 8;
            i18 = 5;
        }
        if (c1873k.m2848a(c1873k.f5404o)) {
            C19788o c19788o3 = (C19788o) c1873k.f5404o.f34081Z;
            if (c19788o3.f62759t != -1) {
                if (!AbstractC20817s.m21400a(c1873k.f5407r, c19788o3)) {
                    int i34 = c1873k.f5407r == null ? 1 : 0;
                    c1873k.f5407r = c19788o3;
                    c1873k.m2852e(1, jElapsedRealtime, c19788o3, i34);
                }
                c1873k.f5404o = c19788o;
            }
        }
        if (c1873k.m2848a(c1873k.f5405p)) {
            C19788o c19788o4 = (C19788o) c1873k.f5405p.f34081Z;
            if (!AbstractC20817s.m21400a(c1873k.f5408s, c19788o4)) {
                int i35 = c1873k.f5408s == null ? 1 : 0;
                c1873k.f5408s = c19788o4;
                c1873k.m2852e(0, jElapsedRealtime, c19788o4, i35);
            }
            c1873k.f5405p = c19788o;
        }
        if (c1873k.m2848a(c1873k.f5406q)) {
            C19788o c19788o5 = (C19788o) c1873k.f5406q.f34081Z;
            if (!AbstractC20817s.m21400a(c1873k.f5409t, c19788o5)) {
                int i36 = c1873k.f5409t == null ? 1 : 0;
                c1873k.f5409t = c19788o5;
                c1873k.m2852e(2, jElapsedRealtime, c19788o5, i36);
            }
            c1873k.f5406q = c19788o;
        }
        switch (C20810l.m21336b(c1873k.f5390a).m21337c()) {
            case 0:
                i19 = 0;
                break;
            case 1:
                i19 = i12;
                break;
            case 2:
                i19 = i32;
                break;
            case 3:
                i19 = 4;
                break;
            case 4:
                i19 = i18;
                break;
            case 5:
                i19 = i11;
                break;
            case 6:
            case 8:
            default:
                i19 = 1;
                break;
            case 7:
                i19 = 3;
                break;
            case 9:
                i19 = i17;
                break;
            case 10:
                i19 = i16;
                break;
        }
        if (i19 != c1873k.f5402m) {
            c1873k.f5402m = i19;
            c1873k.f5392c.reportNetworkEvent(AbstractC1871i.m2793b().setNetworkType(i19).setTimeSinceCreatedMillis(jElapsedRealtime - c1873k.f5393d).build());
        }
        C1526D c1526d3 = (C1526D) abstractC3812N;
        if (c1526d3.m2242b0() != i32) {
            z10 = false;
            c1873k.f5410u = false;
        } else {
            z10 = false;
        }
        c1526d3.m2256q0();
        if (c1526d3.f4087k1.f4255f == null) {
            c1873k.f5412w = z10;
            i20 = 10;
        } else {
            i20 = 10;
            if (c19786m.f62693a.get(10)) {
                c1873k.f5412w = true;
            }
        }
        int iM2242b0 = c1526d3.m2242b0();
        if (!c1873k.f5410u) {
            if (c1873k.f5412w) {
                z11 = true;
                i21 = 13;
            } else if (iM2242b0 == 4) {
                z11 = true;
                i21 = 11;
            } else {
                i21 = 12;
                if (iM2242b0 == i32) {
                    int i37 = c1873k.f5401l;
                    if (i37 == 0 || i37 == i32 || i37 == 12) {
                        i21 = i32;
                    } else if (c1526d3.m2241a0()) {
                        c1526d3.m2256q0();
                        if (c1526d3.f4087k1.f4263n != 0) {
                            i21 = i20;
                        } else {
                            i21 = i11;
                        }
                    } else {
                        i21 = i16;
                    }
                } else {
                    i20 = 3;
                    if (iM2242b0 != 3) {
                        z11 = true;
                        if (iM2242b0 != 1 || c1873k.f5401l == 0) {
                            i21 = c1873k.f5401l;
                        }
                    } else if (c1526d3.m2241a0()) {
                        c1526d3.m2256q0();
                        if (c1526d3.f4087k1.f4263n != 0) {
                            i21 = i12;
                        } else {
                            i21 = i20;
                        }
                    } else {
                        i21 = 4;
                    }
                }
            }
            if (c1873k.f5401l != i21) {
                c1873k.f5401l = i21;
                c1873k.f5389A = z11;
                c1873k.f5392c.reportPlaybackStateEvent(AbstractC1871i.m2804m().setState(c1873k.f5401l).setTimeSinceCreatedMillis(jElapsedRealtime - c1873k.f5393d).build());
            }
            if (c19786m.f62693a.get(1028)) {
                C1870h c1870h2 = c1873k.f5391b;
                C1863a c1863a4 = (C1863a) sparseArray2.get(1028);
                c1863a4.getClass();
                c1870h2.m2782b(c1863a4);
            }
        }
        i21 = i18;
        z11 = true;
        if (c1873k.f5401l != i21) {
            c1873k.f5401l = i21;
            c1873k.f5389A = z11;
            c1873k.f5392c.reportPlaybackStateEvent(AbstractC1871i.m2804m().setState(c1873k.f5401l).setTimeSinceCreatedMillis(jElapsedRealtime - c1873k.f5393d).build());
        }
        if (c19786m.f62693a.get(1028)) {
            C1870h c1870h3 = c1873k.f5391b;
            C1863a c1863a5 = (C1863a) sparseArray2.get(1028);
            c1863a5.getClass();
            c1870h3.m2782b(c1863a5);
        }
    }

    @Override // p1072w2.InterfaceC20790b
    public void onCancel() {
        C9614S operation = (C9614S) this.f430o0;
        AbstractC16544l.m18094g(operation, "$operation");
        ((Animator) this.f429Z).end();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + operation + " has been canceled.");
        }
    }

    @Override // p746fa.InterfaceC13594c
    /* JADX INFO: renamed from: t */
    public void mo258t(C13606o c13606o) {
        ((AbstractServiceC2377g) this.f429Z).m3474a((Intent) this.f430o0);
    }

    @Override // p301M.InterfaceC5219a
    public InterfaceFutureC13608b apply(Object obj) {
        switch (this.f428Y) {
            case 0:
                C0087s0 c0087s0 = (C0087s0) this.f429Z;
                c0087s0.m281a();
                ((C3162o0) this.f430o0).mo4507a();
                return c0087s0.m290n();
            case 1:
            case 3:
            default:
                C3851n0 c3851n0 = (C3851n0) this.f429Z;
                c3851n0.getClass();
                ArrayList arrayList = (ArrayList) this.f430o0;
                Object objMo39b = 100;
                try {
                    objMo39b = ((C3799E) arrayList.get(0)).f11483b.mo39b(C3799E.f11480j);
                    break;
                } catch (IllegalArgumentException unused) {
                }
                Integer num = (Integer) objMo39b;
                Objects.requireNonNull(num);
                int iIntValue = num.intValue();
                Object objMo39b2 = 0;
                try {
                    objMo39b2 = ((C3799E) arrayList.get(0)).f11483b.mo39b(C3799E.f11479i);
                    break;
                } catch (IllegalArgumentException unused2) {
                }
                Integer num2 = (Integer) objMo39b2;
                Objects.requireNonNull(num2);
                int iIntValue2 = num2.intValue();
                C11242m c11242m = ((C7729c) ((C4307j) c3851n0.f11646p0).f13996Z).f24371s;
                if (c11242m != null) {
                    return AbstractC5229k.m5780d(AbstractC16347a.m17947b(new C6769c((C6771e) c11242m.f34018Y, iIntValue, iIntValue2)));
                }
                return new C5231m(new Exception("Failed to take picture: pipeline is not ready."), 1);
            case 2:
                C0057d0 c0057d0 = (C0057d0) this.f429Z;
                c0057d0.getClass();
                return AbstractC16347a.m17947b(new C5226h((C10145l) this.f430o0, c0057d0.f268c, TimeUnit.SECONDS.toMillis(3L), 0));
            case 4:
                List list = (List) obj;
                C0033Q0 c0033q0 = (C0033Q0) this.f429Z;
                c0033q0.getClass();
                AbstractC8072d6.m8486c("SyncCaptureSessionBase", "[" + c0033q0 + "] getSurface done with results: " + list);
                if (list.isEmpty()) {
                    return new C5231m(new IllegalArgumentException("Unable to open capture session without surfaces"), 1);
                }
                if (list.contains(null)) {
                    return new C5231m(new C3809K("Surface closed", (AbstractC3810L) ((ArrayList) this.f430o0).get(list.indexOf(null))), 1);
                }
                return AbstractC5229k.m5779c(list);
        }
    }
}
