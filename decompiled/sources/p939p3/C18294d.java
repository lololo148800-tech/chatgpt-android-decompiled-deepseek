package p939p3;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: p3.d */
/* JADX INFO: loaded from: classes.dex */
public final class C18294d extends AbstractC18293c {
    public /* synthetic */ C18294d(int i10) {
        this(C18291a.f58387b);
    }

    /* JADX INFO: renamed from: a */
    public final Object m19835a(InterfaceC18292b key) {
        AbstractC16544l.m18094g(key, "key");
        return this.f58388a.get(key);
    }

    /* JADX INFO: renamed from: b */
    public final void m19836b(InterfaceC18292b key, Object obj) {
        AbstractC16544l.m18094g(key, "key");
        this.f58388a.put(key, obj);
    }

    public C18294d(AbstractC18293c initialExtras) {
        AbstractC16544l.m18094g(initialExtras, "initialExtras");
        this.f58388a.putAll(initialExtras.f58388a);
    }
}
