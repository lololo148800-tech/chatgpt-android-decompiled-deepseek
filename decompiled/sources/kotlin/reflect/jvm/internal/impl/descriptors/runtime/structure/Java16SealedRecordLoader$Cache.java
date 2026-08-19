package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class Java16SealedRecordLoader$Cache {

    /* JADX INFO: renamed from: a */
    public final Method f51674a;

    /* JADX INFO: renamed from: b */
    public final Method f51675b;

    /* JADX INFO: renamed from: c */
    public final Method f51676c;

    /* JADX INFO: renamed from: d */
    public final Method f51677d;

    public Java16SealedRecordLoader$Cache(Method method, Method method2, Method method3, Method method4) {
        this.f51674a = method;
        this.f51675b = method2;
        this.f51676c = method3;
        this.f51677d = method4;
    }

    public final Method getGetPermittedSubclasses() {
        return this.f51675b;
    }

    public final Method getGetRecordComponents() {
        return this.f51677d;
    }

    public final Method isRecord() {
        return this.f51676c;
    }

    public final Method isSealed() {
        return this.f51674a;
    }
}
