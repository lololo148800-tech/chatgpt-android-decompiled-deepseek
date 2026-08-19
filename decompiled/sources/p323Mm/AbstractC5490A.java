package p323Mm;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Mm.A */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5490A implements InterfaceC5500g {

    /* JADX INFO: renamed from: a */
    public final Method f17921a;

    /* JADX INFO: renamed from: b */
    public final List f17922b;

    /* JADX INFO: renamed from: c */
    public final Class f17923c;

    public AbstractC5490A(Method method, List list) {
        this.f17921a = method;
        this.f17922b = list;
        Class<?> returnType = method.getReturnType();
        AbstractC16544l.m18093f(returnType, "getReturnType(...)");
        this.f17923c = returnType;
    }

    @Override // p323Mm.InterfaceC5500g
    /* JADX INFO: renamed from: a */
    public final List mo5916a() {
        return this.f17922b;
    }

    @Override // p323Mm.InterfaceC5500g
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Member mo5917b() {
        return null;
    }

    @Override // p323Mm.InterfaceC5500g
    /* JADX INFO: renamed from: c */
    public final boolean mo5918c() {
        return false;
    }

    @Override // p323Mm.InterfaceC5500g
    public final Type getReturnType() {
        return this.f17923c;
    }
}
