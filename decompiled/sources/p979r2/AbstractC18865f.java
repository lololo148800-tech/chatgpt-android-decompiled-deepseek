package p979r2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import io.sentry.android.core.AbstractC15256t;
import io.sentry.android.core.RunnableC15195M;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p084D4.C1949x0;
import p1036u9.C20168n;
import p1096x2.AbstractC21112g;
import p1096x2.C21109d;
import p1096x2.C21111f;
import p1096x2.CallableC21110e;
import p414R.C6772f;
import p468T2.RunnableC7216h;
import p519V4.RunnableC7757e;
import p523V9.AbstractC8020X;
import p544W9.AbstractC8447A3;
import p692d0.C12959L;
import p746fa.ExecutorC13605n;
import p784hb.C14438g;
import p817j$.util.DesugarCollections;
import p817j$.util.Objects;
import p904nb.RunnableC17544a;
import p955q2.AbstractC18610b;
import p955q2.C18613e;
import p955q2.C18615g;
import p955q2.InterfaceC18612d;

/* JADX INFO: renamed from: r2.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC18865f {

    /* JADX INFO: renamed from: a */
    public static final AbstractC8020X f60093a;

    /* JADX INFO: renamed from: b */
    public static final C1949x0 f60094b;

    /* JADX WARN: Code duplicated, block: B:18:0x0048  */
    static {
        Trace.beginSection(AbstractC8447A3.m9053f("TypefaceCompat static init"));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f60093a = new C18870k();
        } else if (i10 >= 28) {
            f60093a = new C18869j();
        } else if (i10 >= 26) {
            f60093a = new C18868i();
        } else if (i10 < 24) {
            f60093a = new C18866g();
        } else {
            Method method = C18867h.f60102c;
            if (method == null) {
                AbstractC15256t.m16482t("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f60093a = new C18867h();
            } else {
                f60093a = new C18866g();
            }
        }
        f60094b = new C1949x0(16);
        Trace.endSection();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    /* JADX INFO: renamed from: a */
    public static Typeface m20176a(Context context, InterfaceC18612d interfaceC18612d, Resources resources, int i10, String str, int i11, int i12, AbstractC18610b abstractC18610b, boolean z6) {
        Typeface typefaceMo8357g;
        Typeface typefaceCreate;
        List listUnmodifiableList;
        int i13 = 21;
        int i14 = 2;
        boolean z10 = false;
        int i15 = -3;
        if (interfaceC18612d instanceof C18615g) {
            C18615g c18615g = (C18615g) interfaceC18612d;
            String str2 = c18615g.f59293e;
            if (str2 == null || str2.isEmpty()) {
                typefaceCreate = null;
            } else {
                typefaceCreate = Typeface.create(str2, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                    typefaceCreate = null;
                }
            }
            if (typefaceCreate != null) {
                if (abstractC18610b != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC17544a(abstractC18610b, i14, typefaceCreate));
                }
                return typefaceCreate;
            }
            boolean z11 = !z6 ? abstractC18610b != null : c18615g.f59292d != 0;
            int i16 = z6 ? c18615g.f59291c : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            C14438g c14438g = new C14438g();
            c14438g.f45414Y = abstractC18610b;
            C21109d c21109d = c18615g.f59290b;
            if (c21109d != null) {
                Object[] objArr = {c18615g.f59289a, c21109d};
                ArrayList arrayList = new ArrayList(2);
                for (int i17 = 0; i17 < 2; i17++) {
                    Object obj = objArr[i17];
                    Objects.requireNonNull(obj);
                    arrayList.add(obj);
                }
                listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
            } else {
                Object[] objArr2 = {c18615g.f59289a};
                ArrayList arrayList2 = new ArrayList(1);
                Object obj2 = objArr2[0];
                Objects.requireNonNull(obj2);
                arrayList2.add(obj2);
                listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList2);
            }
            List list = listUnmodifiableList;
            ExecutorC13605n executorC13605n = new ExecutorC13605n(handler, 2);
            C20168n c20168n = new C20168n(c14438g, 3, executorC13605n);
            if (!z11) {
                String strM21582a = AbstractC21112g.m21582a(i12, list);
                Typeface typeface = (Typeface) AbstractC21112g.f67059a.m3122g(strM21582a);
                if (typeface != null) {
                    executorC13605n.execute(new RunnableC15195M(c14438g, typeface, z10, i13));
                    typefaceMo8357g = typeface;
                } else {
                    C6772f c6772f = new C6772f(c20168n, 1);
                    synchronized (AbstractC21112g.f67061c) {
                        try {
                            C12959L c12959l = AbstractC21112g.f67062d;
                            ArrayList arrayList3 = (ArrayList) c12959l.get(strM21582a);
                            if (arrayList3 != null) {
                                arrayList3.add(c6772f);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(c6772f);
                                c12959l.put(strM21582a, arrayList4);
                                CallableC21110e callableC21110e = new CallableC21110e(strM21582a, context, list, i12, 1);
                                ThreadPoolExecutor threadPoolExecutor = AbstractC21112g.f67060b;
                                C6772f c6772f2 = new C6772f(strM21582a, 2);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                RunnableC7757e runnableC7757e = new RunnableC7757e();
                                runnableC7757e.f24464Z = callableC21110e;
                                runnableC7757e.f24465o0 = c6772f2;
                                runnableC7757e.f24466p0 = handler2;
                                threadPoolExecutor.execute(runnableC7757e);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    typefaceMo8357g = null;
                }
            } else {
                if (list.size() > 1) {
                    throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
                }
                C21109d c21109d2 = (C21109d) list.get(0);
                C1949x0 c1949x0 = AbstractC21112g.f67059a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj3 = new Object[]{c21109d2}[0];
                Objects.requireNonNull(obj3);
                arrayList5.add(obj3);
                String strM21582a2 = AbstractC21112g.m21582a(i12, DesugarCollections.unmodifiableList(arrayList5));
                Typeface typeface2 = (Typeface) AbstractC21112g.f67059a.m3122g(strM21582a2);
                if (typeface2 != null) {
                    executorC13605n.execute(new RunnableC15195M(c14438g, typeface2, z10, i13));
                    typefaceMo8357g = typeface2;
                } else if (i16 == -1) {
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj4 = new Object[]{c21109d2}[0];
                    Objects.requireNonNull(obj4);
                    arrayList6.add(obj4);
                    C21111f c21111fM21583b = AbstractC21112g.m21583b(strM21582a2, context, DesugarCollections.unmodifiableList(arrayList6), i12);
                    c20168n.m20991g(c21111fM21583b);
                    typefaceMo8357g = c21111fM21583b.f67057a;
                } else {
                    try {
                        try {
                            try {
                                C21111f c21111f = (C21111f) AbstractC21112g.f67060b.submit(new CallableC21110e(strM21582a2, context, c21109d2, i12, 0)).get(i16, TimeUnit.MILLISECONDS);
                                c20168n.m20991g(c21111f);
                                typefaceMo8357g = c21111f.f67057a;
                            } catch (InterruptedException e10) {
                                throw e10;
                            }
                        } catch (ExecutionException e11) {
                            throw new RuntimeException(e11);
                        } catch (TimeoutException unused) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused2) {
                        ((ExecutorC13605n) c20168n.f63876o0).execute(new RunnableC7216h((C14438g) c20168n.f63875Z, i15, 5));
                        typefaceMo8357g = null;
                    }
                }
            }
        } else {
            typefaceMo8357g = f60093a.mo8357g(context, (C18613e) interfaceC18612d, resources, i12);
            if (abstractC18610b != null) {
                if (typefaceMo8357g != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC17544a(abstractC18610b, i14, typefaceMo8357g));
                } else {
                    abstractC18610b.m19969a(-3);
                }
            }
        }
        if (typefaceMo8357g != null) {
            f60094b.m3126k(m20177b(resources, i10, str, i11, i12), typefaceMo8357g);
        }
        return typefaceMo8357g;
    }

    /* JADX INFO: renamed from: b */
    public static String m20177b(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }
}
