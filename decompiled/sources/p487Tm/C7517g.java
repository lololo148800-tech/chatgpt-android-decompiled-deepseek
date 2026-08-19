package p487Tm;

import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMethod;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: Tm.g */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7517g extends AbstractC16541i implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public static final C7517g f23838Y = new C7517g(1, ReflectJavaMethod.class, "<init>", "<init>(Ljava/lang/reflect/Method;)V", 0);

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        Method p10 = (Method) obj;
        AbstractC16544l.m18094g(p10, "p0");
        return new ReflectJavaMethod(p10);
    }
}
