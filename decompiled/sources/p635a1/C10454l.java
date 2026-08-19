package p635a1;

import kotlin.jvm.internal.AbstractC16546n;
import p003A1.AbstractC0237c1;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: a1.l */
/* JADX INFO: loaded from: classes.dex */
public final class C10454l extends AbstractC0237c1 implements InterfaceC10457o {

    /* JADX INFO: renamed from: Z */
    public final AbstractC16546n f30957Z;

    /* JADX WARN: Multi-variable type inference failed */
    public C10454l(InterfaceC1436k interfaceC1436k, InterfaceC1440o interfaceC1440o) {
        super(interfaceC1436k);
        this.f30957Z = (AbstractC16546n) interfaceC1440o;
    }

    @Override // p635a1.InterfaceC10459q
    /* JADX INFO: renamed from: G */
    public final boolean mo426G(InterfaceC1436k interfaceC1436k) {
        return ((Boolean) interfaceC1436k.invoke(this)).booleanValue();
    }

    @Override // p635a1.InterfaceC10459q
    /* JADX INFO: renamed from: M */
    public final /* synthetic */ InterfaceC10459q mo428M(InterfaceC10459q interfaceC10459q) {
        return AbstractC9306j0.m9882a(this, interfaceC10459q);
    }

    @Override // p635a1.InterfaceC10459q
    /* JADX INFO: renamed from: j */
    public final Object mo431j(Object obj, InterfaceC1439n interfaceC1439n) {
        return interfaceC1439n.invoke(obj, this);
    }
}
