package p514V;

import java.util.UUID;
import p228J.AbstractC3813O;
import p228J.InterfaceC3866v;
import p253K.AbstractC4503n;

/* JADX INFO: renamed from: V.h */
/* JADX INFO: loaded from: classes.dex */
public final class C7734h extends AbstractC3813O {

    /* JADX INFO: renamed from: b */
    public final String f24399b;

    /* JADX INFO: renamed from: c */
    public int f24400c;

    public C7734h(InterfaceC3866v interfaceC3866v) {
        super(interfaceC3866v);
        this.f24399b = "virtual-" + interfaceC3866v.mo137b() + "-" + UUID.randomUUID().toString();
    }

    @Override // p228J.AbstractC3813O, p228J.InterfaceC3866v
    /* JADX INFO: renamed from: a */
    public final int mo136a() {
        return mo143h(0);
    }

    @Override // p228J.AbstractC3813O, p228J.InterfaceC3866v
    /* JADX INFO: renamed from: b */
    public final String mo137b() {
        return this.f24399b;
    }

    @Override // p228J.AbstractC3813O, p228J.InterfaceC3866v
    /* JADX INFO: renamed from: h */
    public final int mo143h(int i10) {
        return AbstractC4503n.m5251g(this.f11540a.mo143h(i10) - this.f24400c);
    }
}
