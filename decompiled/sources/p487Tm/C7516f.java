package p487Tm;

import java.lang.reflect.Field;
import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaField;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: Tm.f */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7516f extends AbstractC16541i implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public static final C7516f f23837Y = new C7516f(1, ReflectJavaField.class, "<init>", "<init>(Ljava/lang/reflect/Field;)V", 0);

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        Field p10 = (Field) obj;
        AbstractC16544l.m18094g(p10, "p0");
        return new ReflectJavaField(p10);
    }
}
