package p487Tm;

import java.lang.reflect.Constructor;
import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaConstructor;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: Tm.d */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7514d extends AbstractC16541i implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public static final C7514d f23835Y = new C7514d(1, ReflectJavaConstructor.class, "<init>", "<init>(Ljava/lang/reflect/Constructor;)V", 0);

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        Constructor p10 = (Constructor) obj;
        AbstractC16544l.m18094g(p10, "p0");
        return new ReflectJavaConstructor(p10);
    }
}
