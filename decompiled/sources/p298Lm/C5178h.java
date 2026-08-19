package p298Lm;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p544W9.AbstractC8704r3;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Lm.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C5178h extends AbstractC8704r3 {

    /* JADX INFO: renamed from: a */
    public final List f16859a;

    public C5178h(Class jClass) {
        AbstractC16544l.m18094g(jClass, "jClass");
        Object[] declaredMethods = jClass.getDeclaredMethods();
        AbstractC16544l.m18093f(declaredMethods, "getDeclaredMethods(...)");
        C5176g c5176g = new C5176g(0);
        if (declaredMethods.length != 0) {
            declaredMethods = Arrays.copyOf(declaredMethods, declaredMethods.length);
            AbstractC16544l.m18093f(declaredMethods, "copyOf(...)");
            if (declaredMethods.length > 1) {
                Arrays.sort(declaredMethods, c5176g);
            }
        }
        this.f16859a = AbstractC17678l.m19296c(declaredMethods);
    }

    @Override // p544W9.AbstractC8704r3
    /* JADX INFO: renamed from: a */
    public final String mo5750a() {
        return AbstractC17680n.m19349Y(this.f16859a, "", "<init>(", ")V", 0, null, C5166b.f16829s0, 24);
    }
}
