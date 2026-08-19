package p298Lm;

import io.sentry.internal.debugmeta.C15384c;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Lm.c */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5168c {

    /* JADX INFO: renamed from: a */
    public static final C15384c f16839a;

    /* JADX INFO: renamed from: b */
    public static final C15384c f16840b;

    /* JADX INFO: renamed from: c */
    public static final C15384c f16841c;

    /* JADX INFO: renamed from: d */
    public static final C15384c f16842d;

    /* JADX INFO: renamed from: e */
    public static final C15384c f16843e;

    static {
        C5166b c5166b = C5166b.f16824Z;
        int i10 = AbstractC5164a.f16821a;
        f16839a = new C15384c(c5166b);
        f16840b = new C15384c(C5166b.f16825o0);
        f16841c = new C15384c(C5166b.f16826p0);
        f16842d = new C15384c(C5166b.f16827q0);
        f16843e = new C15384c(C5166b.f16828r0);
    }

    /* JADX INFO: renamed from: a */
    public static final C5134D m5744a(Class jClass) {
        AbstractC16544l.m18094g(jClass, "jClass");
        Object objM16640o = f16839a.m16640o(jClass);
        AbstractC16544l.m18092e(objM16640o, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (C5134D) objM16640o;
    }
}
