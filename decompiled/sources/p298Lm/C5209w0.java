package p298Lm;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mm.InterfaceC17306i;
import p024Am.C0560a;
import p049Bm.InterfaceC1426a;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: Lm.w0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5209w0 implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final C5213y0 f16926Y;

    /* JADX INFO: renamed from: Z */
    public final int f16927Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f16928o0;

    public C5209w0(C5213y0 c5213y0, int i10, InterfaceC17306i interfaceC17306i) {
        this.f16926Y = c5213y0;
        this.f16927Z = i10;
        this.f16928o0 = interfaceC17306i;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, mm.i] */
    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        Type type;
        C5213y0 c5213y0 = this.f16926Y;
        C5135D0 c5135d0 = c5213y0.f16936Z;
        Type type2 = c5135d0 != null ? (Type) c5135d0.invoke() : null;
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            Class<?> componentType = cls.isArray() ? cls.getComponentType() : Object.class;
            AbstractC16544l.m18091d(componentType);
            return componentType;
        }
        boolean z6 = type2 instanceof GenericArrayType;
        int i10 = this.f16927Z;
        if (z6) {
            if (i10 == 0) {
                Type genericComponentType = ((GenericArrayType) type2).getGenericComponentType();
                AbstractC16544l.m18091d(genericComponentType);
                return genericComponentType;
            }
            throw new C0560a("Array type has been queried for a non-0th argument: " + c5213y0);
        }
        if (!(type2 instanceof ParameterizedType)) {
            throw new C0560a("Non-generic type has been queried for arguments: " + c5213y0);
        }
        Type type3 = (Type) ((List) this.f16928o0.getValue()).get(i10);
        if (!(type3 instanceof WildcardType)) {
            return type3;
        }
        WildcardType wildcardType = (WildcardType) type3;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        AbstractC16544l.m18093f(lowerBounds, "getLowerBounds(...)");
        Type type4 = (Type) AbstractC17678l.m19317x(lowerBounds);
        if (type4 == null) {
            Type[] upperBounds = wildcardType.getUpperBounds();
            AbstractC16544l.m18093f(upperBounds, "getUpperBounds(...)");
            type = (Type) AbstractC17678l.m19316w(upperBounds);
        } else {
            type = type4;
        }
        AbstractC16544l.m18091d(type);
        return type;
    }
}
