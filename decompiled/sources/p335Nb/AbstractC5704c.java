package p335Nb;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p214Ib.C3674q;
import p544W9.AbstractC8633f4;

/* JADX INFO: renamed from: Nb.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5704c {

    /* JADX INFO: renamed from: a */
    public static final AbstractC8633f4 f18489a;

    static {
        AbstractC8633f4 c5702a;
        try {
            c5702a = new C5703b();
        } catch (NoSuchMethodException unused) {
            c5702a = new C5702a();
        }
        f18489a = c5702a;
    }

    /* JADX INFO: renamed from: a */
    public static void m6147a(AccessibleObject accessibleObject, StringBuilder sb2) {
        sb2.append('(');
        Class<?>[] parameterTypes = accessibleObject instanceof Method ? ((Method) accessibleObject).getParameterTypes() : ((Constructor) accessibleObject).getParameterTypes();
        for (int i10 = 0; i10 < parameterTypes.length; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(parameterTypes[i10].getSimpleName());
        }
        sb2.append(')');
    }

    /* JADX INFO: renamed from: b */
    public static String m6148b(Constructor constructor) {
        StringBuilder sb2 = new StringBuilder(constructor.getDeclaringClass().getName());
        m6147a(constructor, sb2);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: c */
    public static String m6149c(Field field) {
        return field.getDeclaringClass().getName() + Separators.POUND + field.getName();
    }

    /* JADX INFO: renamed from: d */
    public static String m6150d(AccessibleObject accessibleObject, boolean z6) {
        String str;
        if (accessibleObject instanceof Field) {
            str = "field '" + m6149c((Field) accessibleObject) + Separators.QUOTE;
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb2 = new StringBuilder(method.getName());
            m6147a(method, sb2);
            str = "method '" + method.getDeclaringClass().getName() + Separators.POUND + sb2.toString() + Separators.QUOTE;
        } else if (accessibleObject instanceof Constructor) {
            str = "constructor '" + m6148b((Constructor) accessibleObject) + Separators.QUOTE;
        } else {
            str = "<unknown AccessibleObject> " + accessibleObject.toString();
        }
        if (!z6 || !Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    /* JADX INFO: renamed from: e */
    public static void m6151e(AccessibleObject accessibleObject) {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e10) {
            throw new C3674q(AbstractC10763a.m11054l("Failed making ", m6150d(accessibleObject, false), " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type."), e10);
        }
    }
}
