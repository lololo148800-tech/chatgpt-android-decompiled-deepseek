package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: renamed from: kotlin.jvm.internal.n */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16546n implements InterfaceC16539g, Serializable {
    private final int arity;

    public AbstractC16546n(int i10) {
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.InterfaceC16539g
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String strMo5702k = AbstractC16526C.f51263a.mo5702k(this);
        AbstractC16544l.m18093f(strMo5702k, "renderLambdaToString(...)");
        return strMo5702k;
    }
}
