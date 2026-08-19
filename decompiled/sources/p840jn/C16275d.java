package p840jn;

import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: jn.d */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C16275d extends AbstractC16541i implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public static final C16275d f50404Y = new C16275d(1, ValueParameterDescriptor.class, "declaresDefaultValue", "declaresDefaultValue()Z", 0);

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        ValueParameterDescriptor p10 = (ValueParameterDescriptor) obj;
        AbstractC16544l.m18094g(p10, "p0");
        return Boolean.valueOf(p10.declaresDefaultValue());
    }
}
