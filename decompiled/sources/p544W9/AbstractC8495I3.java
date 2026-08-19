package p544W9;

import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17314q;
import p298Lm.C5140G;
import p298Lm.C5150L;
import p323Mm.C5497d;
import p571X9.AbstractC9227W;

/* JADX INFO: renamed from: W9.I3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8495I3 {
    /* JADX INFO: renamed from: a */
    public static final Object m9153a(Class annotationClass, Map map, List methods) {
        AbstractC16544l.m18094g(annotationClass, "annotationClass");
        AbstractC16544l.m18094g(methods, "methods");
        C17314q c17314qM9800c = AbstractC9227W.m9800c(new C5140G(map, 5));
        Object objNewProxyInstance = Proxy.newProxyInstance(annotationClass.getClassLoader(), new Class[]{annotationClass}, new C5497d(annotationClass, map, AbstractC9227W.m9800c(new C5150L(annotationClass, 2, map)), c17314qM9800c, methods));
        AbstractC16544l.m18092e(objNewProxyInstance, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return objNewProxyInstance;
    }

    /* JADX INFO: renamed from: b */
    public static int m9154b(char c9, CharSequence charSequence, int i10) {
        int length = charSequence.length();
        while (i10 < length) {
            if (charSequence.charAt(i10) == c9) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m9155c(int i10) {
        switch (Character.getType(i10)) {
            default:
                if (i10 != 36 && i10 != 43 && i10 != 94 && i10 != 96 && i10 != 124 && i10 != 126) {
                    switch (i10) {
                        case 60:
                        case 61:
                        case 62:
                            break;
                        default:
                            return false;
                    }
                }
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                return true;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m9156d(int i10) {
        return i10 == 9 || i10 == 10 || i10 == 12 || i10 == 13 || i10 == 32 || Character.getType(i10) == 12;
    }

    /* JADX INFO: renamed from: e */
    public static int m9157e(int i10, int i11, CharSequence charSequence) {
        while (i10 < i11) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    /* JADX INFO: renamed from: f */
    public static int m9158f(int i10, int i11, CharSequence charSequence) {
        while (i10 >= i11) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i10;
            }
            i10--;
        }
        return i11 - 1;
    }
}
