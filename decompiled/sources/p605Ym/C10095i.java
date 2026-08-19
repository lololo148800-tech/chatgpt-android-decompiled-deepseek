package p605Ym;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: renamed from: Ym.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C10095i {

    /* JADX INFO: renamed from: a */
    public final Name f29887a;

    /* JADX INFO: renamed from: b */
    public final JavaClass f29888b;

    public C10095i(Name name, JavaClass javaClass) {
        AbstractC16544l.m18094g(name, "name");
        this.f29887a = name;
        this.f29888b = javaClass;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10095i) {
            if (AbstractC16544l.m18089b(this.f29887a, ((C10095i) obj).f29887a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f29887a.hashCode();
    }
}
