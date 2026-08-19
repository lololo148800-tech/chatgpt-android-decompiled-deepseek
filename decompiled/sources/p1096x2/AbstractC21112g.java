package p1096x2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.gov.nist.core.Separators;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import com.statsig.androidsdk.ErrorBoundaryKt;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p084D4.C1949x0;
import p277L.ThreadFactoryC4832e;
import p523V9.AbstractC8020X;
import p544W9.AbstractC8447A3;
import p692d0.C12959L;
import p826j6.C16137F;
import p979r2.AbstractC18865f;

/* JADX INFO: renamed from: x2.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21112g {

    /* JADX INFO: renamed from: a */
    public static final C1949x0 f67059a = new C1949x0(16);

    /* JADX INFO: renamed from: b */
    public static final ThreadPoolExecutor f67060b;

    /* JADX INFO: renamed from: c */
    public static final Object f67061c;

    /* JADX INFO: renamed from: d */
    public static final C12959L f67062d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, ErrorBoundaryKt.SAMPLING_RATE, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC4832e(1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f67060b = threadPoolExecutor;
        f67061c = new Object();
        f67062d = new C12959L(0);
    }

    /* JADX INFO: renamed from: a */
    public static String m21582a(int i10, List list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < list.size(); i11++) {
            sb2.append(((C21109d) list.get(i11)).f67051e);
            sb2.append("-");
            sb2.append(i10);
            if (i11 < list.size() - 1) {
                sb2.append(Separators.SEMICOLON);
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: b */
    public static C21111f m21583b(String str, Context context, List list, int i10) {
        int i11;
        Typeface typefaceMo8358h;
        Trace.beginSection(AbstractC8447A3.m9053f("getFontSync"));
        C1949x0 c1949x0 = f67059a;
        try {
            Typeface typeface = (Typeface) c1949x0.m3122g(str);
            if (typeface != null) {
                C21111f c21111f = new C21111f(typeface);
                Trace.endSection();
                return c21111f;
            }
            try {
                C16137F c16137fM21579a = AbstractC21108c.m21579a(context, list);
                int i12 = c16137fM21579a.f50063Z;
                List list2 = (List) c16137fM21579a.f50064o0;
                if (i12 == 0) {
                    C21113h[] c21113hArr = (C21113h[]) list2.get(0);
                    if (c21113hArr == null || c21113hArr.length == 0) {
                        i11 = 1;
                    } else {
                        int length = c21113hArr.length;
                        int i13 = 0;
                        while (true) {
                            if (i13 >= length) {
                                i11 = 0;
                                break;
                            }
                            int i14 = c21113hArr[i13].f67067e;
                            if (i14 != 0) {
                                if (i14 >= 0) {
                                    i11 = i14;
                                    break;
                                }
                                i11 = -3;
                                break;
                            }
                            i13++;
                        }
                    }
                } else {
                    if (i12 != 1) {
                        i11 = -3;
                        break;
                    }
                    i11 = -2;
                }
                if (i11 != 0) {
                    C21111f c21111f2 = new C21111f(i11);
                    Trace.endSection();
                    return c21111f2;
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    C21113h[] c21113hArr2 = (C21113h[]) list2.get(0);
                    AbstractC8020X abstractC8020X = AbstractC18865f.f60093a;
                    Trace.beginSection(AbstractC8447A3.m9053f("TypefaceCompat.createFromFontInfo"));
                    try {
                        typefaceMo8358h = AbstractC18865f.f60093a.mo8358h(context, c21113hArr2, i10);
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                } else {
                    AbstractC8020X abstractC8020X2 = AbstractC18865f.f60093a;
                    Trace.beginSection(AbstractC8447A3.m9053f("TypefaceCompat.createFromFontInfoWithFallback"));
                    try {
                        typefaceMo8358h = AbstractC18865f.f60093a.mo8359i(context, list2, i10);
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                if (typefaceMo8358h == null) {
                    C21111f c21111f3 = new C21111f(-3);
                    Trace.endSection();
                    return c21111f3;
                }
                c1949x0.m3126k(str, typefaceMo8358h);
                C21111f c21111f4 = new C21111f(typefaceMo8358h);
                Trace.endSection();
                return c21111f4;
            } catch (PackageManager.NameNotFoundException unused) {
                C21111f c21111f5 = new C21111f(-1);
                Trace.endSection();
                return c21111f5;
            }
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }
}
