package sm;

import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.InterfaceC16539g;
import p972qm.InterfaceC18770c;

/* JADX INFO: renamed from: sm.h */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC19692h extends AbstractC19691g implements InterfaceC16539g, InterfaceC19693i {

    /* JADX INFO: renamed from: Y */
    public final int f62380Y;

    public AbstractC19692h(int i10, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.f62380Y = i10;
    }

    @Override // kotlin.jvm.internal.InterfaceC16539g
    public final int getArity() {
        return this.f62380Y;
    }

    @Override // sm.AbstractC19685a
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strMo5701j = AbstractC16526C.f51263a.mo5701j(this);
        AbstractC16544l.m18093f(strMo5701j, "renderLambdaToString(...)");
        return strMo5701j;
    }
}
