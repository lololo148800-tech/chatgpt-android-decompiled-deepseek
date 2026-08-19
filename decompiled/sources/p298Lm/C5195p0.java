package p298Lm;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: Lm.p0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5195p0 implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16887Y;

    /* JADX INFO: renamed from: Z */
    public final AbstractC5197q0 f16888Z;

    public /* synthetic */ C5195p0(AbstractC5197q0 abstractC5197q0, int i10) {
        this.f16887Y = i10;
        this.f16888Z = abstractC5197q0;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f16887Y) {
            case 0:
                AbstractC5197q0 abstractC5197q0 = this.f16888Z;
                PropertyGetterDescriptor getter = abstractC5197q0.mo5743r().mo5738m().getGetter();
                if (getter != null) {
                    return getter;
                }
                PropertyGetterDescriptorImpl propertyGetterDescriptorImplCreateDefaultGetter = DescriptorFactory.createDefaultGetter(abstractC5197q0.mo5743r().mo5738m(), Annotations.Companion.getEMPTY());
                AbstractC16544l.m18093f(propertyGetterDescriptorImplCreateDefaultGetter, "createDefaultGetter(...)");
                return propertyGetterDescriptorImplCreateDefaultGetter;
            default:
                return AbstractC5205u0.m5758a(this.f16888Z, true);
        }
    }
}
