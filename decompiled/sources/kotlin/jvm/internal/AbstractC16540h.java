package kotlin.jvm.internal;

import p024Am.C0560a;
import p225Im.InterfaceC3755c;
import p225Im.InterfaceC3759g;

/* JADX INFO: renamed from: kotlin.jvm.internal.h */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16540h extends AbstractC16535c implements InterfaceC16539g, InterfaceC3759g {
    private final int arity;
    private final int flags;

    public AbstractC16540h(int i10, int i11, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.arity = i10;
        this.flags = 0;
    }

    @Override // kotlin.jvm.internal.AbstractC16535c
    public InterfaceC3755c computeReflected() {
        return AbstractC16526C.f51263a.mo5692a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16540h) {
            AbstractC16540h abstractC16540h = (AbstractC16540h) obj;
            return getName().equals(abstractC16540h.getName()) && getSignature().equals(abstractC16540h.getSignature()) && this.flags == abstractC16540h.flags && this.arity == abstractC16540h.arity && AbstractC16544l.m18089b(getBoundReceiver(), abstractC16540h.getBoundReceiver()) && AbstractC16544l.m18089b(getOwner(), abstractC16540h.getOwner());
        }
        if (obj instanceof InterfaceC3759g) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC16539g
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // p225Im.InterfaceC3759g
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // p225Im.InterfaceC3759g
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // p225Im.InterfaceC3759g
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // p225Im.InterfaceC3759g
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.AbstractC16535c, p225Im.InterfaceC3755c
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        InterfaceC3755c interfaceC3755cCompute = compute();
        if (interfaceC3755cCompute != this) {
            return interfaceC3755cCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.AbstractC16535c
    public InterfaceC3759g getReflected() {
        InterfaceC3755c interfaceC3755cCompute = compute();
        if (interfaceC3755cCompute != this) {
            return (InterfaceC3759g) interfaceC3755cCompute;
        }
        throw new C0560a();
    }
}
