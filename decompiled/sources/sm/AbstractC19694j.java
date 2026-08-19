package sm;

import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.InterfaceC16539g;
import p972qm.InterfaceC18770c;

/* JADX INFO: renamed from: sm.j */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC19694j extends AbstractC19687c implements InterfaceC16539g, InterfaceC19693i {
    private final int arity;

    public AbstractC19694j(int i10, InterfaceC18770c interfaceC18770c) {
        super(interfaceC18770c);
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.InterfaceC16539g
    public int getArity() {
        return this.arity;
    }

    @Override // sm.AbstractC19685a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strMo5701j = AbstractC16526C.f51263a.mo5701j(this);
        AbstractC16544l.m18093f(strMo5701j, "renderLambdaToString(...)");
        return strMo5701j;
    }
}
