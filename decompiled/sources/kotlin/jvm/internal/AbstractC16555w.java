package kotlin.jvm.internal;

import p024Am.C0560a;
import p225Im.InterfaceC3755c;
import p225Im.InterfaceC3776x;
import p882m1.clb.WGTYqNchEpHca;

/* JADX INFO: renamed from: kotlin.jvm.internal.w */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16555w extends AbstractC16535c implements InterfaceC3776x {
    private final boolean syntheticJavaProperty;

    public AbstractC16555w(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.syntheticJavaProperty = (i10 & 2) == 2;
    }

    @Override // kotlin.jvm.internal.AbstractC16535c
    public InterfaceC3755c compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16555w) {
            AbstractC16555w abstractC16555w = (AbstractC16555w) obj;
            return getOwner().equals(abstractC16555w.getOwner()) && getName().equals(abstractC16555w.getName()) && getSignature().equals(abstractC16555w.getSignature()) && AbstractC16544l.m18089b(getBoundReceiver(), abstractC16555w.getBoundReceiver());
        }
        if (obj instanceof InterfaceC3776x) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // p225Im.InterfaceC3776x
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // p225Im.InterfaceC3776x
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        InterfaceC3755c interfaceC3755cCompute = compute();
        if (interfaceC3755cCompute != this) {
            return interfaceC3755cCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.AbstractC16535c
    public InterfaceC3776x getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException(WGTYqNchEpHca.VpkYQGAHBf);
        }
        InterfaceC3755c interfaceC3755cCompute = compute();
        if (interfaceC3755cCompute != this) {
            return (InterfaceC3776x) interfaceC3755cCompute;
        }
        throw new C0560a();
    }
}
