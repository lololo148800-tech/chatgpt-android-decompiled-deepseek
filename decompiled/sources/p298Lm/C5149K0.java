package p298Lm;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Lm.K0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5149K0 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f16788a;

    /* JADX INFO: renamed from: b */
    public final int f16789b;

    public C5149K0(ClassLoader classLoader) {
        AbstractC16544l.m18094g(classLoader, "classLoader");
        this.f16788a = new WeakReference(classLoader);
        this.f16789b = System.identityHashCode(classLoader);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C5149K0) && this.f16788a.get() == ((C5149K0) obj).f16788a.get();
    }

    public final int hashCode() {
        return this.f16789b;
    }

    public final String toString() {
        String string;
        ClassLoader classLoader = (ClassLoader) this.f16788a.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
