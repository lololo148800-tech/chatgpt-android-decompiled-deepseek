package kotlin.jvm.internal;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.Arrays;
import mm.C17304g;
import p025An.C0644w;
import p030B2.C0742X;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: kotlin.jvm.internal.l */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16544l {
    /* JADX INFO: renamed from: a */
    public static boolean m18088a(Float f10, float f11) {
        return f10 != null && f10.floatValue() == f11;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m18089b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: c */
    public static void m18090c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(str.concat(" must not be null"));
        m18099l(illegalStateException, AbstractC16544l.class.getName());
        throw illegalStateException;
    }

    /* JADX INFO: renamed from: d */
    public static void m18091d(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        m18099l(nullPointerException, AbstractC16544l.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: e */
    public static void m18092e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        m18099l(nullPointerException, AbstractC16544l.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: f */
    public static void m18093f(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        m18099l(nullPointerException, AbstractC16544l.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: g */
    public static void m18094g(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(m18097j(str));
        m18099l(nullPointerException, AbstractC16544l.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: h */
    public static void m18095h(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(m18097j(str));
        m18099l(illegalArgumentException, AbstractC16544l.class.getName());
        throw illegalArgumentException;
    }

    /* JADX INFO: renamed from: i */
    public static int m18096i(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 == i11 ? 0 : 1;
    }

    /* JADX INFO: renamed from: j */
    public static String m18097j(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = AbstractC16544l.class.getName();
        int i10 = 0;
        while (!stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        while (stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        StackTraceElement stackTraceElement = stackTrace[i10];
        StringBuilder sbM9896o = AbstractC9306j0.m9896o("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), Separators.DOT, stackTraceElement.getMethodName(), ", parameter ");
        sbM9896o.append(str);
        return sbM9896o.toString();
    }

    /* JADX INFO: renamed from: k */
    public static final C0742X m18098k(Object[] array) {
        m18094g(array, "array");
        return new C0742X(array);
    }

    /* JADX INFO: renamed from: l */
    public static void m18099l(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(stackTrace[i11].getClassName())) {
                i10 = i11;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10 + 1, length));
    }

    /* JADX INFO: renamed from: m */
    public static String m18100m(Object obj, String str) {
        return str + obj;
    }

    /* JADX INFO: renamed from: n */
    public static void m18101n() {
        C17304g c17304g = new C17304g();
        m18099l(c17304g, AbstractC16544l.class.getName());
        throw c17304g;
    }

    /* JADX INFO: renamed from: o */
    public static void m18102o() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* JADX INFO: renamed from: p */
    public static void m18103p(String str) {
        C0644w c0644w = new C0644w(AbstractC10763a.m11054l("lateinit property ", str, " has not been initialized"));
        m18099l(c0644w, AbstractC16544l.class.getName());
        throw c0644w;
    }
}
