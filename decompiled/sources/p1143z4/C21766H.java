package p1143z4;

import android.os.Bundle;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: z4.H */
/* JADX INFO: loaded from: classes.dex */
public class C21766H extends AbstractC21767I {

    /* JADX INFO: renamed from: l */
    public final Class f69039l;

    public C21766H(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
        if (!cls.isEnum()) {
            this.f69039l = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
    }

    @Override // p1143z4.AbstractC21767I
    /* JADX INFO: renamed from: a */
    public final Object mo5893a(String key, Bundle bundle) {
        AbstractC16544l.m18094g(bundle, "bundle");
        AbstractC16544l.m18094g(key, "key");
        return (Serializable) bundle.get(key);
    }

    @Override // p1143z4.AbstractC21767I
    /* JADX INFO: renamed from: b */
    public String mo5894b() {
        return this.f69039l.getName();
    }

    @Override // p1143z4.AbstractC21767I
    /* JADX INFO: renamed from: e */
    public final void mo5896e(Bundle bundle, String key, Object obj) {
        Serializable value = (Serializable) obj;
        AbstractC16544l.m18094g(key, "key");
        AbstractC16544l.m18094g(value, "value");
        this.f69039l.cast(value);
        bundle.putSerializable(key, value);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21766H)) {
            return false;
        }
        return AbstractC16544l.m18089b(this.f69039l, ((C21766H) obj).f69039l);
    }

    @Override // p1143z4.AbstractC21767I
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Serializable mo5895c(String str) {
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final int hashCode() {
        return this.f69039l.hashCode();
    }

    public C21766H(int i10, Class cls) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.f69039l = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
    }
}
