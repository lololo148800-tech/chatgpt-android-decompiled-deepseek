package p1034u6;

import p008A6.C0384d;
import p086D6.InterfaceC1957a;
import p911o0.AbstractC17792x;
import p917o6.InterfaceC17833A;
import p917o6.InterfaceC17834B;
import p917o6.InterfaceC17835C;

/* JADX INFO: renamed from: u6.g */
/* JADX INFO: loaded from: classes.dex */
public final class C20129g implements InterfaceC17833A {

    /* JADX INFO: renamed from: b */
    public static final C20124b f63761b = new C20124b();

    /* JADX INFO: renamed from: a */
    public final InterfaceC1957a f63762a;

    public C20129g(InterfaceC1957a interfaceC1957a) {
        this.f63762a = interfaceC1957a;
    }

    @Override // p917o6.InterfaceC17835C
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC17835C mo4138a(InterfaceC17834B interfaceC17834B) {
        return AbstractC17792x.m19519b(this, interfaceC17834B);
    }

    @Override // p917o6.InterfaceC17835C
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC17835C mo4139b(InterfaceC17835C interfaceC17835C) {
        return AbstractC17792x.m19520c(this, interfaceC17835C);
    }

    @Override // p917o6.InterfaceC17835C
    /* JADX INFO: renamed from: c */
    public final Object mo4140c(InterfaceC17835C interfaceC17835C, C0384d c0384d) {
        return c0384d.invoke(interfaceC17835C, this);
    }

    @Override // p917o6.InterfaceC17835C
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC17833A mo4141d(InterfaceC17834B interfaceC17834B) {
        return AbstractC17792x.m19518a(this, interfaceC17834B);
    }

    @Override // p917o6.InterfaceC17833A
    public final InterfaceC17834B getKey() {
        return f63761b;
    }
}
