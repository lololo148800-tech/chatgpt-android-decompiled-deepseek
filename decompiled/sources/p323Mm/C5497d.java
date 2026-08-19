package p323Mm;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17314q;
import p024Am.C0560a;
import p523V9.AbstractC8138m0;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: Mm.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C5497d implements InvocationHandler {

    /* JADX INFO: renamed from: a */
    public final Class f17949a;

    /* JADX INFO: renamed from: b */
    public final Map f17950b;

    /* JADX INFO: renamed from: c */
    public final C17314q f17951c;

    /* JADX INFO: renamed from: d */
    public final C17314q f17952d;

    /* JADX INFO: renamed from: e */
    public final List f17953e;

    public C5497d(Class cls, Map map, C17314q c17314q, C17314q c17314q2, List list) {
        this.f17949a = cls;
        this.f17950b = map;
        this.f17951c = c17314q;
        this.f17952d = c17314q2;
        this.f17953e = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        boolean zM18089b;
        boolean z6;
        String name = method.getName();
        Class cls = this.f17949a;
        if (name != null) {
            int iHashCode = name.hashCode();
            if (iHashCode != -1776922004) {
                if (iHashCode != 147696667) {
                    if (iHashCode == 1444986633 && name.equals("annotationType")) {
                        return cls;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(((Number) this.f17952d.getValue()).intValue());
                }
            } else if (name.equals("toString")) {
                return (String) this.f17951c.getValue();
            }
        }
        boolean zM18089b2 = AbstractC16544l.m18089b(name, "equals");
        Map map = this.f17950b;
        boolean z10 = false;
        if (!zM18089b2 || objArr == null || objArr.length != 1) {
            if (map.containsKey(name)) {
                return map.get(name);
            }
            StringBuilder sb2 = new StringBuilder("Method is not supported: ");
            sb2.append(method);
            sb2.append(" (args: ");
            if (objArr == null) {
                objArr = new Object[0];
            }
            sb2.append(AbstractC17678l.m19291N(objArr));
            sb2.append(')');
            throw new C0560a(sb2.toString());
        }
        Object objM19288K = AbstractC17678l.m19288K(objArr);
        Annotation annotation = objM19288K instanceof Annotation ? (Annotation) objM19288K : null;
        if (AbstractC16544l.m18089b(annotation != null ? AbstractC8138m0.m8667b(AbstractC8138m0.m8666a(annotation)) : null, cls)) {
            List list = this.f17953e;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z6 = true;
                        break;
                    }
                    Method method2 = (Method) it.next();
                    Object obj2 = map.get(method2.getName());
                    Object objInvoke = method2.invoke(objM19288K, null);
                    if (obj2 instanceof boolean[]) {
                        AbstractC16544l.m18092e(objInvoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                        zM18089b = Arrays.equals((boolean[]) obj2, (boolean[]) objInvoke);
                    } else if (obj2 instanceof char[]) {
                        AbstractC16544l.m18092e(objInvoke, "null cannot be cast to non-null type kotlin.CharArray");
                        zM18089b = Arrays.equals((char[]) obj2, (char[]) objInvoke);
                    } else if (obj2 instanceof byte[]) {
                        AbstractC16544l.m18092e(objInvoke, "null cannot be cast to non-null type kotlin.ByteArray");
                        zM18089b = Arrays.equals((byte[]) obj2, (byte[]) objInvoke);
                    } else if (obj2 instanceof short[]) {
                        AbstractC16544l.m18092e(objInvoke, "null cannot be cast to non-null type kotlin.ShortArray");
                        zM18089b = Arrays.equals((short[]) obj2, (short[]) objInvoke);
                    } else if (obj2 instanceof int[]) {
                        AbstractC16544l.m18092e(objInvoke, "null cannot be cast to non-null type kotlin.IntArray");
                        zM18089b = Arrays.equals((int[]) obj2, (int[]) objInvoke);
                    } else if (obj2 instanceof float[]) {
                        AbstractC16544l.m18092e(objInvoke, "null cannot be cast to non-null type kotlin.FloatArray");
                        zM18089b = Arrays.equals((float[]) obj2, (float[]) objInvoke);
                    } else if (obj2 instanceof long[]) {
                        AbstractC16544l.m18092e(objInvoke, "null cannot be cast to non-null type kotlin.LongArray");
                        zM18089b = Arrays.equals((long[]) obj2, (long[]) objInvoke);
                    } else if (obj2 instanceof double[]) {
                        AbstractC16544l.m18092e(objInvoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                        zM18089b = Arrays.equals((double[]) obj2, (double[]) objInvoke);
                    } else if (obj2 instanceof Object[]) {
                        AbstractC16544l.m18092e(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
                        zM18089b = Arrays.equals((Object[]) obj2, (Object[]) objInvoke);
                    } else {
                        zM18089b = AbstractC16544l.m18089b(obj2, objInvoke);
                    }
                    if (!zM18089b) {
                        z6 = false;
                        break;
                    }
                }
            } else {
                z6 = true;
                break;
            }
            if (z6) {
                z10 = true;
            }
        }
        return Boolean.valueOf(z10);
    }
}
