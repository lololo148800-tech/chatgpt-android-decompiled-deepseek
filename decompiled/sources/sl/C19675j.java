package sl;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1426a;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: sl.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C19675j {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f62363a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final Object m20647a(C19666a key, InterfaceC1426a interfaceC1426a) {
        AbstractC16544l.m18094g(key, "key");
        ConcurrentHashMap concurrentHashMap = this.f62363a;
        Object obj = concurrentHashMap.get(key);
        if (obj != null) {
            return obj;
        }
        Object objInvoke = interfaceC1426a.invoke();
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(key, objInvoke);
        if (objPutIfAbsent != null) {
            objInvoke = objPutIfAbsent;
        }
        AbstractC16544l.m18092e(objInvoke, "null cannot be cast to non-null type T of io.ktor.util.ConcurrentSafeAttributes.computeIfAbsent");
        return objInvoke;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m20648b(C19666a key) {
        AbstractC16544l.m18094g(key, "key");
        return m20650d().containsKey(key);
    }

    /* JADX INFO: renamed from: c */
    public final Object m20649c(C19666a key) {
        AbstractC16544l.m18094g(key, "key");
        Object objM20651e = m20651e(key);
        if (objM20651e != null) {
            return objM20651e;
        }
        throw new IllegalStateException("No instance for key " + key);
    }

    /* JADX INFO: renamed from: d */
    public final Map m20650d() {
        return this.f62363a;
    }

    /* JADX INFO: renamed from: e */
    public final Object m20651e(C19666a key) {
        AbstractC16544l.m18094g(key, "key");
        return m20650d().get(key);
    }

    /* JADX INFO: renamed from: f */
    public final void m20652f(C19666a key, Object value) {
        AbstractC16544l.m18094g(key, "key");
        AbstractC16544l.m18094g(value, "value");
        m20650d().put(key, value);
    }
}
