package p225Im;

import java.lang.reflect.Type;
import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: Im.E */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3746E extends AbstractC16541i implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public static final C3746E f11403Y = new C3746E(1, AbstractC3751J.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        Type p10 = (Type) obj;
        AbstractC16544l.m18094g(p10, "p0");
        return AbstractC3751J.m4440e(p10);
    }
}
