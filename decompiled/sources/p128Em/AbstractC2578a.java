package p128Em;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1;
import p225Im.InterfaceC3776x;

/* JADX INFO: renamed from: Em.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2578a implements InterfaceC2580c {

    /* JADX INFO: renamed from: a */
    public Object f8014a;

    @Override // p128Em.InterfaceC2579b
    public Object getValue(Object obj, InterfaceC3776x property) {
        AbstractC16544l.m18094g(property, "property");
        return this.f8014a;
    }

    @Override // p128Em.InterfaceC2580c
    public void setValue(Object obj, InterfaceC3776x property, Object obj2) {
        AbstractC16544l.m18094g(property, "property");
        if (((DescriptorRendererOptionsImpl$property$$inlined$vetoable$1) this).f52839b.isLocked()) {
            throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
        }
        this.f8014a = obj2;
    }

    public String toString() {
        return "ObservableProperty(value=" + this.f8014a + ')';
    }
}
