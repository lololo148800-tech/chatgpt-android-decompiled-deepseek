package bj;

import dj.AbstractC13178c;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Set;

/* JADX INFO: renamed from: bj.d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11457d {

    /* JADX INFO: renamed from: a */
    public final Type f34647a;

    /* JADX INFO: renamed from: b */
    public final Set f34648b;

    /* JADX INFO: renamed from: c */
    public final Object f34649c;

    /* JADX INFO: renamed from: d */
    public final Method f34650d;

    /* JADX INFO: renamed from: e */
    public final int f34651e;

    /* JADX INFO: renamed from: f */
    public final AbstractC11471r[] f34652f;

    /* JADX INFO: renamed from: g */
    public final boolean f34653g;

    public AbstractC11457d(Type type, Set set, Object obj, Method method, int i10, int i11, boolean z6) {
        this.f34647a = AbstractC13178c.m14827a(type);
        this.f34648b = set;
        this.f34649c = obj;
        this.f34650d = method;
        this.f34651e = i11;
        this.f34652f = new AbstractC11471r[i10 - i11];
        this.f34653g = z6;
    }

    /* JADX INFO: renamed from: a */
    public void mo12861a(C11447L c11447l, C11458e c11458e) {
        AbstractC11471r[] abstractC11471rArr = this.f34652f;
        if (abstractC11471rArr.length > 0) {
            Method method = this.f34650d;
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            int length = genericParameterTypes.length;
            int i10 = this.f34651e;
            for (int i11 = i10; i11 < length; i11++) {
                Type type = ((ParameterizedType) genericParameterTypes[i11]).getActualTypeArguments()[0];
                Set setM14831e = AbstractC13178c.m14831e(parameterAnnotations[i11]);
                abstractC11471rArr[i11 - i10] = (AbstractC11452Q.m12853b(this.f34647a, type) && this.f34648b.equals(setM14831e)) ? c11447l.m12851c(c11458e, type, setM14831e) : c11447l.m12850b(type, setM14831e, null);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public Object mo12859b(AbstractC11477x abstractC11477x) {
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: c */
    public final Object m12862c(Object obj) {
        AbstractC11471r[] abstractC11471rArr = this.f34652f;
        Object[] objArr = new Object[abstractC11471rArr.length + 1];
        objArr[0] = obj;
        System.arraycopy(abstractC11471rArr, 0, objArr, 1, abstractC11471rArr.length);
        try {
            return this.f34650d.invoke(this.f34649c, objArr);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo12860d(AbstractC11440E abstractC11440E, Object obj) {
        throw new AssertionError();
    }
}
