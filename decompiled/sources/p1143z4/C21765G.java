package p1143z4;

import android.os.Bundle;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: z4.G */
/* JADX INFO: loaded from: classes.dex */
public final class C21765G extends AbstractC21767I {

    /* JADX INFO: renamed from: l */
    public final Class f69038l;

    public C21765G(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
        try {
            this.f69038l = Class.forName("[L" + cls.getName() + ';');
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // p1143z4.AbstractC21767I
    /* JADX INFO: renamed from: a */
    public final Object mo5893a(String key, Bundle bundle) {
        AbstractC16544l.m18094g(bundle, "bundle");
        AbstractC16544l.m18094g(key, "key");
        return (Serializable[]) bundle.get(key);
    }

    @Override // p1143z4.AbstractC21767I
    /* JADX INFO: renamed from: b */
    public final String mo5894b() {
        return this.f69038l.getName();
    }

    @Override // p1143z4.AbstractC21767I
    /* JADX INFO: renamed from: c */
    public final Object mo5895c(String str) {
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Serializable, java.io.Serializable[], java.lang.Object] */
    @Override // p1143z4.AbstractC21767I
    /* JADX INFO: renamed from: e */
    public final void mo5896e(Bundle bundle, String key, Object obj) {
        ?? r6 = (Serializable[]) obj;
        AbstractC16544l.m18094g(key, "key");
        this.f69038l.cast(r6);
        bundle.putSerializable(key, r6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C21765G.class.equals(obj.getClass())) {
            return false;
        }
        return AbstractC16544l.m18089b(this.f69038l, ((C21765G) obj).f69038l);
    }

    public final int hashCode() {
        return this.f69038l.hashCode();
    }
}
