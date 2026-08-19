package p1027tp;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: tp.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C20072p {

    /* JADX INFO: renamed from: a */
    public final Method f63568a;

    /* JADX INFO: renamed from: b */
    public final List f63569b;

    public C20072p(Method method, ArrayList arrayList) {
        this.f63568a = method;
        this.f63569b = DesugarCollections.unmodifiableList(arrayList);
    }

    public final String toString() {
        Method method = this.f63568a;
        return String.format("%s.%s() %s", method.getDeclaringClass().getName(), method.getName(), this.f63569b);
    }
}
