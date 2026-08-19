package p972qm;

import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1439n;
import p334Na.AbstractC5695b;

/* JADX INFO: renamed from: qm.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC18768a implements InterfaceC18774g {
    private final InterfaceC18775h key;

    public AbstractC18768a(InterfaceC18775h key) {
        AbstractC16544l.m18094g(key, "key");
        this.key = key;
    }

    @Override // p972qm.InterfaceC18776i
    public <R> R fold(R r6, InterfaceC1439n operation) {
        AbstractC16544l.m18094g(operation, "operation");
        return (R) operation.invoke(r6, this);
    }

    @Override // p972qm.InterfaceC18776i
    public <E extends InterfaceC18774g> E get(InterfaceC18775h interfaceC18775h) {
        return (E) AbstractC5695b.m6136c(this, interfaceC18775h);
    }

    @Override // p972qm.InterfaceC18774g
    public InterfaceC18775h getKey() {
        return this.key;
    }

    @Override // p972qm.InterfaceC18776i
    public InterfaceC18776i minusKey(InterfaceC18775h interfaceC18775h) {
        return AbstractC5695b.m6137d(this, interfaceC18775h);
    }

    @Override // p972qm.InterfaceC18776i
    public InterfaceC18776i plus(InterfaceC18776i interfaceC18776i) {
        return AbstractC5695b.m6138e(this, interfaceC18776i);
    }
}
