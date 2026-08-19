package ao;

import java.lang.ref.SoftReference;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ao.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C11184q extends ClassValue {
    @Override // java.lang.ClassValue
    public final Object computeValue(Class type) {
        AbstractC16544l.m18094g(type, "type");
        C11145T c11145t = new C11145T();
        c11145t.f33782a = new SoftReference(null);
        return c11145t;
    }
}
