package p1143z4;

import android.os.Bundle;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: z4.E */
/* JADX INFO: loaded from: classes.dex */
public final class C21763E extends AbstractC21767I {

    /* JADX INFO: renamed from: l */
    public final Class f69036l;

    public C21763E(Class cls) {
        super(true);
        if (!Parcelable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
        }
        try {
            this.f69036l = Class.forName("[L" + cls.getName() + ';');
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // p1143z4.AbstractC21767I
    /* JADX INFO: renamed from: a */
    public final Object mo5893a(String key, Bundle bundle) {
        AbstractC16544l.m18094g(bundle, "bundle");
        AbstractC16544l.m18094g(key, "key");
        return (Parcelable[]) bundle.get(key);
    }

    @Override // p1143z4.AbstractC21767I
    /* JADX INFO: renamed from: b */
    public final String mo5894b() {
        return this.f69036l.getName();
    }

    @Override // p1143z4.AbstractC21767I
    /* JADX INFO: renamed from: c */
    public final Object mo5895c(String str) {
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    @Override // p1143z4.AbstractC21767I
    /* JADX INFO: renamed from: e */
    public final void mo5896e(Bundle bundle, String key, Object obj) {
        Parcelable[] parcelableArr = (Parcelable[]) obj;
        AbstractC16544l.m18094g(key, "key");
        this.f69036l.cast(parcelableArr);
        bundle.putParcelableArray(key, parcelableArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C21763E.class.equals(obj.getClass())) {
            return false;
        }
        return AbstractC16544l.m18089b(this.f69036l, ((C21763E) obj).f69036l);
    }

    public final int hashCode() {
        return this.f69036l.hashCode();
    }
}
