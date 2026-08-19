package p1143z4;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: z4.F */
/* JADX INFO: loaded from: classes.dex */
public final class C21764F extends AbstractC21767I {

    /* JADX INFO: renamed from: l */
    public final Class f69037l;

    public C21764F(Class cls) {
        super(true);
        if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
            this.f69037l = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
    }

    @Override // p1143z4.AbstractC21767I
    /* JADX INFO: renamed from: a */
    public final Object mo5893a(String key, Bundle bundle) {
        AbstractC16544l.m18094g(bundle, "bundle");
        AbstractC16544l.m18094g(key, "key");
        return bundle.get(key);
    }

    @Override // p1143z4.AbstractC21767I
    /* JADX INFO: renamed from: b */
    public final String mo5894b() {
        return this.f69037l.getName();
    }

    @Override // p1143z4.AbstractC21767I
    /* JADX INFO: renamed from: c */
    public final Object mo5895c(String str) {
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // p1143z4.AbstractC21767I
    /* JADX INFO: renamed from: e */
    public final void mo5896e(Bundle bundle, String key, Object obj) {
        AbstractC16544l.m18094g(key, "key");
        this.f69037l.cast(obj);
        if (obj == null || (obj instanceof Parcelable)) {
            bundle.putParcelable(key, (Parcelable) obj);
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(key, (Serializable) obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C21764F.class.equals(obj.getClass())) {
            return false;
        }
        return AbstractC16544l.m18089b(this.f69037l, ((C21764F) obj).f69037l);
    }

    public final int hashCode() {
        return this.f69037l.hashCode();
    }
}
