package p741f5;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.FrameMetricsAggregator;
import com.openai.chatgpt.R;
import io.sentry.C15109B;
import io.sentry.C15128H0;
import io.sentry.C15324c;
import io.sentry.C15516w;
import io.sentry.C15524y1;
import io.sentry.EnumC15375i1;
import io.sentry.EnumC15527z1;
import io.sentry.InterfaceC15127H;
import io.sentry.android.core.C15184B;
import io.sentry.android.core.C15197O;
import io.sentry.android.core.C15208a;
import io.sentry.android.core.C15246o;
import io.sentry.android.core.NetworkBreadcrumbsIntegration;
import io.sentry.android.core.RunnableC15195M;
import io.sentry.android.replay.C15289e;
import io.sentry.android.replay.C15294h;
import io.sentry.android.replay.C15295i;
import io.sentry.android.replay.C15297k;
import io.sentry.android.replay.C15300n;
import io.sentry.android.replay.C15304r;
import io.sentry.android.replay.C15307u;
import io.sentry.android.replay.C15317w;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.ViewTreeObserverOnDrawListenerC15303q;
import io.sentry.android.replay.capture.AbstractC15283n;
import io.sentry.android.replay.capture.C15280k;
import io.sentry.android.replay.capture.C15281l;
import io.sentry.cache.AbstractC15327a;
import io.sentry.protocol.C15447t;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p025An.AbstractC0575H;
import p025An.C0631p0;
import p028B.RunnableC0696c;
import p030B2.C0740V;
import p033B5.C0842z;
import p049Bm.InterfaceC1426a;
import p099Dj.C2069g;
import p1091wn.AbstractC21031l;
import p1091wn.C21020a;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p1113xn.C21307a;
import p1156zj.C22133Y;
import p1156zj.C22170l;
import p160G5.p161rK.TVCuK;
import p211I8.lPE.sRXLFOsOgS;
import p315Me.Myis.CxcULo;
import p330N4.AbstractC5636B;
import p330N4.C5650a;
import p523V9.AbstractC7942M5;
import p544W9.AbstractC8459C3;
import p544W9.AbstractC8465D3;
import p544W9.AbstractC8656j3;
import p544W9.AbstractC8710s3;
import p561X.C8990d;
import p646aj.C10624d;
import p658b5.C11238i;
import p722e8.C13332p;
import p749fd.C13628m;
import p772h.DialogC14229k;
import p772h.ViewTreeObserverOnDrawListenerC14226h;
import p784hb.C14437f;
import p791hj.C14522e;
import p804i8.C14943b;
import p822j2.C16056m;
import p849k7.C16354g;
import p896n2.AbstractC17451d;
import p896n2.C17450c;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17685s;
import p909nm.C17689w;
import p993rj.C19024D;
import p993rj.C19061w;

/* JADX INFO: renamed from: f5.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC13542a implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f42864Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f42865Z;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RunnableC13542a(InterfaceC1426a interfaceC1426a) {
        this.f42864Y = 13;
        this.f42865Z = (AbstractC16546n) interfaceC1426a;
    }

    public /* synthetic */ RunnableC13542a(C15208a c15208a, C8990d c8990d) {
        this.f42864Y = 4;
        this.f42865Z = c15208a;
    }

    /* JADX WARN: Code duplicated, block: B:208:0x04ce  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, mm.i] */
    /* JADX WARN: Type inference failed for: r0v56, types: [Bm.a, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r2v59, types: [Bm.a, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object, mm.i] */
    @Override // java.lang.Runnable
    public final void run() {
        File file;
        Date dateM9341i;
        EnumC15527z1 enumC15527z1ValueOf;
        String str;
        String str2;
        Iterable linkedList;
        Field field;
        Bitmap bitmap;
        Object obj;
        int i10 = 8;
        int i11 = 9;
        Throwable th2 = null;
        C15289e c15289e = null;
        boolean z6 = false;
        switch (this.f42864Y) {
            case 0:
                ((C0631p0) this.f42865Z).mo1275e(null);
                return;
            case 1:
                ViewTreeObserverOnDrawListenerC14226h this$0 = (ViewTreeObserverOnDrawListenerC14226h) this.f42865Z;
                AbstractC16544l.m18094g(this$0, "this$0");
                Runnable runnable = this$0.f44667Z;
                if (runnable != null) {
                    runnable.run();
                    this$0.f44667Z = null;
                    return;
                }
                return;
            case 2:
                DialogC14229k.m15534b((DialogC14229k) this.f42865Z);
                return;
            case 3:
                C14943b this$1 = (C14943b) this.f42865Z;
                AbstractC16544l.m18094g(this$1, "this$0");
                this$1.m16110w(new C13332p());
                return;
            case 4:
                C15208a c15208a = (C15208a) this.f42865Z;
                c15208a.getClass();
                c15208a.f47446t0 = SystemClock.uptimeMillis();
                c15208a.f47447u0.set(false);
                return;
            case 5:
                ((FrameMetricsAggregator) ((C14522e) this.f42865Z).f45761Y).f32883a.mo17943n();
                return;
            case 6:
                ((C15246o) this.f42865Z).m16446a(null, true);
                return;
            case 7:
                NetworkBreadcrumbsIntegration networkBreadcrumbsIntegration = (NetworkBreadcrumbsIntegration) this.f42865Z;
                synchronized (networkBreadcrumbsIntegration.f47361p0) {
                    try {
                        if (networkBreadcrumbsIntegration.f47364s0 != null) {
                            Context context = networkBreadcrumbsIntegration.f47358Y;
                            InterfaceC15127H interfaceC15127H = networkBreadcrumbsIntegration.f47360o0;
                            C15184B c15184b = networkBreadcrumbsIntegration.f47359Z;
                            C15197O c15197o = networkBreadcrumbsIntegration.f47364s0;
                            c15184b.getClass();
                            ConnectivityManager connectivityManagerM12529j0 = C11238i.m12529j0(context, interfaceC15127H);
                            if (connectivityManagerM12529j0 != null) {
                                try {
                                    connectivityManagerM12529j0.unregisterNetworkCallback(c15197o);
                                } catch (Throwable th3) {
                                    interfaceC15127H.mo16297h(EnumC15375i1.WARNING, sRXLFOsOgS.vmErCxD, th3);
                                }
                            }
                            networkBreadcrumbsIntegration.f47360o0.mo16298o(EnumC15375i1.DEBUG, "NetworkBreadcrumbsIntegration removed.", new Object[0]);
                        }
                        networkBreadcrumbsIntegration.f47364s0 = null;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                    break;
                }
                return;
            case 8:
                ReplayIntegration this$2 = (ReplayIntegration) this.f42865Z;
                AbstractC16544l.m18094g(this$2, "this$0");
                C15524y1 c15524y1 = this$2.f47657o0;
                if (c15524y1 == null) {
                    AbstractC16544l.m18103p("options");
                    throw null;
                }
                String str3 = (String) AbstractC15327a.m16536b(c15524y1, ".scope-cache", "replay.json", String.class, null);
                String str4 = TVCuK.Dknv;
                if (str3 == null) {
                    this$2.m16491S(str4);
                    return;
                }
                C15447t c15447t = new C15447t(str3);
                if (c15447t.equals(C15447t.f48216Z)) {
                    this$2.m16491S(str4);
                    return;
                }
                C15524y1 c15524y2 = this$2.f47657o0;
                if (c15524y2 == null) {
                    AbstractC16544l.m18103p("options");
                    throw null;
                }
                String cacheDirPath = c15524y2.getCacheDirPath();
                if (cacheDirPath == null || cacheDirPath.length() == 0) {
                    c15524y2.getLogger().mo16298o(EnumC15375i1.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new Object[0]);
                    file = null;
                } else {
                    String cacheDirPath2 = c15524y2.getCacheDirPath();
                    AbstractC16544l.m18091d(cacheDirPath2);
                    file = new File(cacheDirPath2, CxcULo.WdYTaOzzoplvD + c15447t);
                    file.mkdirs();
                }
                File file2 = new File(file, ".ongoing_segment");
                if (file2.exists()) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2), C21307a.f67720a), 8192);
                    try {
                        Iterator it = ((C21020a) AbstractC21031l.m21484h(new C0740V(bufferedReader, 6))).iterator();
                        while (it.hasNext()) {
                            List listM21697e0 = AbstractC21322p.m21697e0((String) it.next(), new String[]{Separators.EQUALS}, 2, 2);
                            linkedHashMap.put((String) listM21697e0.get(0), (String) listM21697e0.get(1));
                            th2 = null;
                        }
                        AbstractC7942M5.m8232a(bufferedReader, th2);
                        String str5 = (String) linkedHashMap.get("config.height");
                        Integer numM21736w = str5 != null ? AbstractC21329w.m21736w(str5) : null;
                        String str6 = (String) linkedHashMap.get("config.width");
                        Integer numM21736w2 = str6 != null ? AbstractC21329w.m21736w(str6) : null;
                        String str7 = (String) linkedHashMap.get("config.frame-rate");
                        Integer numM21736w3 = str7 != null ? AbstractC21329w.m21736w(str7) : null;
                        String str8 = (String) linkedHashMap.get("config.bit-rate");
                        Integer numM21736w4 = str8 != null ? AbstractC21329w.m21736w(str8) : null;
                        String str9 = (String) linkedHashMap.get("segment.id");
                        Integer numM21736w5 = str9 != null ? AbstractC21329w.m21736w(str9) : null;
                        try {
                            String str10 = (String) linkedHashMap.get("segment.timestamp");
                            if (str10 == null) {
                                str10 = str4;
                            }
                            dateM9341i = AbstractC8656j3.m9342j(str10);
                        } catch (Throwable unused) {
                            dateM9341i = null;
                        }
                        try {
                            String str11 = (String) linkedHashMap.get("replay.type");
                            if (str11 == null) {
                                str11 = str4;
                            }
                            enumC15527z1ValueOf = EnumC15527z1.valueOf(str11);
                        } catch (Throwable unused2) {
                            enumC15527z1ValueOf = null;
                        }
                        if (numM21736w == null || numM21736w2 == null || numM21736w3 == null || numM21736w4 == null || numM21736w5 == null) {
                            str = str3;
                            str2 = "options";
                        } else {
                            str2 = "options";
                            str = str3;
                            if (numM21736w5.intValue() != -1 && dateM9341i != null && enumC15527z1ValueOf != null) {
                                C15304r c15304r = new C15304r(numM21736w2.intValue(), numM21736w.intValue(), 1.0f, 1.0f, numM21736w3.intValue(), numM21736w4.intValue());
                                C15294h c15294h = new C15294h(c15524y2, c15447t);
                                File fileM16518k = c15294h.m16518k();
                                if (fileM16518k != null) {
                                    fileM16518k.listFiles(new C10624d(c15294h, 2));
                                }
                                ArrayList arrayList = c15294h.f47778s0;
                                if (arrayList.isEmpty()) {
                                    c15524y2.getLogger().mo16298o(EnumC15375i1.DEBUG, "No frames found for replay: %s, deleting the replay", c15447t);
                                    AbstractC8459C3.m9077a(file);
                                } else {
                                    if (arrayList.size() > 1) {
                                        AbstractC17685s.m19392u(arrayList, new C0842z(14));
                                    }
                                    EnumC15527z1 enumC15527z1 = EnumC15527z1.SESSION;
                                    int iIntValue = enumC15527z1ValueOf == enumC15527z1 ? numM21736w5.intValue() : 0;
                                    if (enumC15527z1ValueOf != enumC15527z1) {
                                        dateM9341i = AbstractC8656j3.m9341i(((C15295i) AbstractC17680n.m19341Q(arrayList)).f47782b);
                                        AbstractC16544l.m18093f(dateM9341i, "{\n                // in ….timestamp)\n            }");
                                    }
                                    Date date = dateM9341i;
                                    long time = (((C15295i) AbstractC17680n.m19351a0(arrayList)).f47782b - date.getTime()) + ((long) (1000 / numM21736w3.intValue()));
                                    String str12 = (String) linkedHashMap.get("replay.recording");
                                    if (str12 == null) {
                                        linkedList = C17689w.f56480Y;
                                    } else {
                                        C15128H0 c15128h0 = (C15128H0) c15524y2.getSerializer().mo16323c(new StringReader(str12), C15128H0.class);
                                        if ((c15128h0 != null ? c15128h0.f47094Z : null) != null) {
                                            List list = c15128h0.f47094Z;
                                            AbstractC16544l.m18091d(list);
                                            linkedList = new LinkedList(list);
                                        } else {
                                            linkedList = null;
                                        }
                                        if (linkedList == null) {
                                            linkedList = C17689w.f56480Y;
                                        }
                                    }
                                    c15289e = new C15289e(c15304r, c15294h, date, iIntValue, time, enumC15527z1ValueOf, (String) linkedHashMap.get("replay.screen-at-start"), AbstractC17680n.m19370t0(linkedList, new C0842z(15)));
                                }
                            }
                            c15289e = null;
                        }
                        c15524y2.getLogger().mo16298o(EnumC15375i1.DEBUG, "Incorrect segment values found for replay: %s, deleting the replay", c15447t);
                        AbstractC8459C3.m9077a(file);
                        c15289e = null;
                        break;
                    } catch (Throwable th5) {
                        try {
                            throw th5;
                        } catch (Throwable th6) {
                            AbstractC7942M5.m8232a(bufferedReader, th5);
                            throw th6;
                        }
                    }
                } else {
                    c15524y2.getLogger().mo16298o(EnumC15375i1.DEBUG, "No ongoing segment found for replay: %s", c15447t);
                    AbstractC8459C3.m9077a(file);
                    str = str3;
                    str2 = "options";
                }
                if (c15289e == null) {
                    this$2.m16491S(str4);
                    return;
                }
                C15524y1 c15524y3 = this$2.f47657o0;
                if (c15524y3 == null) {
                    AbstractC16544l.m18103p(str2);
                    throw null;
                }
                Object objM16536b = AbstractC15327a.m16536b(c15524y3, ".scope-cache", "breadcrumbs.json", List.class, new C15324c(0));
                List list2 = objM16536b instanceof List ? (List) objM16536b : null;
                C15109B c15109b = this$2.f47658p0;
                C15524y1 c15524y4 = this$2.f47657o0;
                if (c15524y4 == null) {
                    AbstractC16544l.m18103p(str2);
                    throw null;
                }
                C15304r c15304r2 = c15289e.f47755a;
                AbstractC15283n abstractC15283nM16510a = C15280k.m16510a(c15109b, c15524y4, c15289e.f47759e, c15289e.f47757c, c15447t, c15289e.f47758d, c15304r2.f47814b, c15304r2.f47813a, c15289e.f47760f, c15289e.f47756b, c15304r2.f47817e, c15304r2.f47818f, c15289e.f47761g, list2, new LinkedList(c15289e.f47762h));
                if (abstractC15283nM16510a instanceof C15281l) {
                    C15516w c15516wM9087a = AbstractC8465D3.m9087a(new C15297k());
                    C15281l c15281l = (C15281l) abstractC15283nM16510a;
                    C15109B c15109b2 = this$2.f47658p0;
                    if (c15109b2 != null) {
                        c15516wM9087a.f48471f = c15281l.f47740b;
                        c15109b2.mo16254w(c15281l.f47739a, c15516wM9087a);
                    }
                }
                this$2.m16491S(str);
                return;
            case 9:
                C15300n c15300n = (C15300n) this.f42865Z;
                if (c15300n.f47791Y.get()) {
                    return;
                }
                C13628m c13628m = new C13628m(c15300n, 21);
                try {
                    Object value = C15307u.f47822b.getValue();
                    if (value == null || (field = (Field) C15307u.f47823c.getValue()) == null) {
                        return;
                    }
                    Object obj2 = field.get(value);
                    AbstractC16544l.m18092e(obj2, "null cannot be cast to non-null type java.util.ArrayList<android.view.View>{ kotlin.collections.TypeAliasesKt.ArrayList<android.view.View> }");
                    field.set(value, c13628m.invoke((ArrayList) obj2));
                    return;
                } catch (Throwable th7) {
                    Log.w("WindowManagerSpy", th7);
                    return;
                }
            case 10:
                C15317w this$3 = (C15317w) this.f42865Z;
                AbstractC16544l.m18094g(this$3, "this$0");
                ViewTreeObserverOnDrawListenerC15303q viewTreeObserverOnDrawListenerC15303q = this$3.f47856t0;
                if (viewTreeObserverOnDrawListenerC15303q != null) {
                    boolean z10 = viewTreeObserverOnDrawListenerC15303q.f47811x0.get();
                    C15524y1 c15524y5 = viewTreeObserverOnDrawListenerC15303q.f47801Z;
                    if (!z10) {
                        c15524y5.getLogger().mo16298o(EnumC15375i1.DEBUG, "ScreenshotRecorder is paused, not capturing screenshot", new Object[0]);
                        return;
                    }
                    if (!viewTreeObserverOnDrawListenerC15303q.f47810w0.get() && (bitmap = viewTreeObserverOnDrawListenerC15303q.f47812y0) != null && !bitmap.isRecycled()) {
                        c15524y5.getLogger().mo16298o(EnumC15375i1.DEBUG, "Content hasn't changed, repeating last known frame", new Object[0]);
                        Bitmap bitmap2 = viewTreeObserverOnDrawListenerC15303q.f47812y0;
                        if (bitmap2 != null) {
                            ReplayIntegration replayIntegration = viewTreeObserverOnDrawListenerC15303q.f47804q0;
                            Bitmap bitmapCopy = bitmap2.copy(Bitmap.Config.ARGB_8888, false);
                            AbstractC16544l.m18093f(bitmapCopy, "it.copy(ARGB_8888, false)");
                            replayIntegration.m16492T(bitmapCopy);
                            return;
                        }
                        return;
                    }
                    WeakReference weakReference = viewTreeObserverOnDrawListenerC15303q.f47805r0;
                    View view = weakReference != null ? (View) weakReference.get() : null;
                    if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
                        c15524y5.getLogger().mo16298o(EnumC15375i1.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
                        return;
                    }
                    Window windowM9416b = AbstractC8710s3.m9416b(view);
                    if (windowM9416b == null) {
                        c15524y5.getLogger().mo16298o(EnumC15375i1.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
                        return;
                    }
                    C15304r c15304r3 = viewTreeObserverOnDrawListenerC15303q.f47800Y;
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c15304r3.f47813a, c15304r3.f47814b, Bitmap.Config.ARGB_8888);
                    AbstractC16544l.m18093f(bitmapCreateBitmap, "createBitmap(\n          …onfig.ARGB_8888\n        )");
                    RunnableC0696c runnableC0696c = new RunnableC0696c(viewTreeObserverOnDrawListenerC15303q, windowM9416b, bitmapCreateBitmap, view, 9);
                    C14437f c14437f = viewTreeObserverOnDrawListenerC15303q.f47802o0;
                    c14437f.getClass();
                    ((Handler) c14437f.f45413Y).post(runnableC0696c);
                    return;
                }
                return;
            case 11:
                C16354g this$4 = (C16354g) this.f42865Z;
                AbstractC16544l.m18094g(this$4, "this$0");
                this$4.m17955z();
                return;
            case 12:
                Activity activity = (Activity) this.f42865Z;
                if (activity.isFinishing()) {
                    return;
                }
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 28) {
                    Class cls = AbstractC17451d.f55793a;
                    activity.recreate();
                    return;
                }
                Class cls2 = AbstractC17451d.f55793a;
                Object[] objArr = i12 == 26 || i12 == 27;
                Method method = AbstractC17451d.f55798f;
                if ((objArr == false || method != null) && (AbstractC17451d.f55797e != null || AbstractC17451d.f55796d != null)) {
                    try {
                        Object obj3 = AbstractC17451d.f55795c.get(activity);
                        if (obj3 != null && (obj = AbstractC17451d.f55794b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            C17450c c17450c = new C17450c(activity);
                            application.registerActivityLifecycleCallbacks(c17450c);
                            Handler handler = AbstractC17451d.f55799g;
                            handler.post(new RunnableC15195M(c17450c, obj3, z6, i10));
                            try {
                                if (i12 == 26 || i12 == 27) {
                                    Boolean bool = Boolean.FALSE;
                                    method.invoke(obj, obj3, null, null, 0, bool, null, null, bool, bool);
                                } else {
                                    activity.recreate();
                                }
                                handler.post(new RunnableC15195M(application, c17450c, z6, i11));
                                return;
                            } catch (Throwable th8) {
                                handler.post(new RunnableC15195M(application, c17450c, z6, i11));
                                throw th8;
                            }
                        }
                    } catch (Throwable unused3) {
                    }
                }
                activity.recreate();
                return;
            case 13:
                ((AbstractC16546n) this.f42865Z).invoke();
                return;
            case 14:
                C19024D this$5 = (C19024D) this.f42865Z;
                AbstractC16544l.m18094g(this$5, "this$0");
                AbstractC0575H.m1156D(this$5.f60624i, null, null, new C19061w(this$5, null), 3);
                return;
            case 15:
                C22170l this$6 = (C22170l) this.f42865Z;
                AbstractC16544l.m18094g(this$6, "this$0");
                ?? r6 = this$6.f70159i;
                if (r6 != 0) {
                    r6.invoke();
                }
                this$6.m22393c();
                return;
            case 16:
                C2069g this_with = (C2069g) this.f42865Z;
                AbstractC16544l.m18094g(this_with, "$this_with");
                ObjectAnimator duration = ObjectAnimator.ofFloat(this_with.f6360i, "alpha", 0.9f, 0.0f).setDuration(500L);
                duration.setInterpolator(new LinearInterpolator());
                duration.start();
                FrameLayout frameLayout = this_with.f6352a;
                frameLayout.setHapticFeedbackEnabled(true);
                frameLayout.performHapticFeedback(1, 2);
                return;
            default:
                C22133Y this$7 = (C22133Y) this.f42865Z;
                AbstractC16544l.m18094g(this$7, "this$0");
                C2069g c2069g = this$7.f69966a;
                if (c2069g.f6353b.getTop() < c2069g.f6359h.getBottom() + c2069g.f6352a.getContext().getResources().getDimensionPixelOffset(R.dimen.pi2_governmentid_buttons_min_margin)) {
                    Context context2 = c2069g.f6352a.getContext();
                    C16056m c16056m = this$7.f69967b;
                    c16056m.getClass();
                    c16056m.m17636c((ConstraintLayout) LayoutInflater.from(context2).inflate(R.layout.pi2_governmentid_review_low_space, (ViewGroup) null));
                    AbstractC5636B.m6041a(c2069g.f6355d, new C5650a());
                    c16056m.m17634a(c2069g.f6356e);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ RunnableC13542a(Object obj, int i10) {
        this.f42864Y = i10;
        this.f42865Z = obj;
    }
}
