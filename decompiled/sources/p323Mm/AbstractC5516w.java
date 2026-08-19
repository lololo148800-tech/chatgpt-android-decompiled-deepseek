package p323Mm;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;

/* JADX INFO: renamed from: Mm.w */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5516w extends AbstractC5517x {

    /* JADX INFO: renamed from: e */
    public final boolean f17968e;

    public /* synthetic */ AbstractC5516w(Method method, boolean z6, int i10) {
        this(method, (i10 & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z6, method.getGenericParameterTypes());
    }

    /* JADX INFO: renamed from: f */
    public final Object m5921f(Object obj, Object[] args) {
        AbstractC16544l.m18094g(args, "args");
        return this.f17968e ? C17296C.f55119a : ((Method) this.f17969a).invoke(obj, Arrays.copyOf(args, args.length));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC5516w(Method method, boolean z6, Type[] typeArr) {
        Type genericReturnType = method.getGenericReturnType();
        AbstractC16544l.m18093f(genericReturnType, "getGenericReturnType(...)");
        super(method, genericReturnType, z6 ? method.getDeclaringClass() : null, typeArr);
        this.f17968e = genericReturnType.equals(Void.TYPE);
    }
}
