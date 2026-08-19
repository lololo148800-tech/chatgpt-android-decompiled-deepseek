package p298Lm;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: Lm.r0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5199r0 implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16896Y;

    /* JADX INFO: renamed from: Z */
    public final AbstractC5201s0 f16897Z;

    public /* synthetic */ C5199r0(AbstractC5201s0 abstractC5201s0, int i10) {
        this.f16896Y = i10;
        this.f16897Z = abstractC5201s0;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f16896Y) {
            case 0:
                AbstractC5201s0 abstractC5201s0 = this.f16897Z;
                PropertySetterDescriptor setter = abstractC5201s0.mo5743r().mo5738m().getSetter();
                if (setter != null) {
                    return setter;
                }
                PropertyDescriptor propertyDescriptorMo5738m = abstractC5201s0.mo5743r().mo5738m();
                Annotations.Companion companion = Annotations.Companion;
                PropertySetterDescriptorImpl propertySetterDescriptorImplCreateDefaultSetter = DescriptorFactory.createDefaultSetter(propertyDescriptorMo5738m, companion.getEMPTY(), companion.getEMPTY());
                AbstractC16544l.m18093f(propertySetterDescriptorImplCreateDefaultSetter, "createDefaultSetter(...)");
                return propertySetterDescriptorImplCreateDefaultSetter;
            default:
                return AbstractC5205u0.m5758a(this.f16897Z, false);
        }
    }
}
