package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class Java16RecordComponentsLoader$Cache {

    /* JADX INFO: renamed from: a */
    public final Method f51672a;

    /* JADX INFO: renamed from: b */
    public final Method f51673b;

    public Java16RecordComponentsLoader$Cache(Method method, Method method2) {
        this.f51672a = method;
        this.f51673b = method2;
    }

    public final Method getGetAccessor() {
        return this.f51673b;
    }

    public final Method getGetType() {
        return this.f51672a;
    }
}
