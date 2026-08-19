package p225Im;

import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: Im.I */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3750I extends AbstractC16541i implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public static final C3750I f11409Y = new C3750I(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        Class p10 = (Class) obj;
        AbstractC16544l.m18094g(p10, "p0");
        return p10.getComponentType();
    }
}
