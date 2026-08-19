package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Visibility {

    /* JADX INFO: renamed from: a */
    public final String f51422a;

    /* JADX INFO: renamed from: b */
    public final boolean f51423b;

    public Visibility(String str, boolean z6) {
        this.f51422a = str;
        this.f51423b = z6;
    }

    public Integer compareTo(Visibility visibility) {
        AbstractC16544l.m18094g(visibility, "visibility");
        return Visibilities.INSTANCE.compareLocal$compiler_common(this, visibility);
    }

    public String getInternalDisplayName() {
        return this.f51422a;
    }

    public final boolean isPublicAPI() {
        return this.f51423b;
    }

    public Visibility normalize() {
        return this;
    }

    public final String toString() {
        return getInternalDisplayName();
    }
}
