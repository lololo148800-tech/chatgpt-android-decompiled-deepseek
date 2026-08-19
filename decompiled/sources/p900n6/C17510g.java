package p900n6;

import kotlin.jvm.internal.AbstractC16544l;
import p008A6.C0384d;
import p025An.AbstractC0563B;
import p153Fn.C2925c;
import p911o0.AbstractC17792x;
import p917o6.InterfaceC17833A;
import p917o6.InterfaceC17834B;
import p917o6.InterfaceC17835C;

/* JADX INFO: renamed from: n6.g */
/* JADX INFO: loaded from: classes.dex */
public final class C17510g implements InterfaceC17833A {

    /* JADX INFO: renamed from: c */
    public static final C17508e f56005c = new C17508e();

    /* JADX INFO: renamed from: a */
    public final AbstractC0563B f56006a;

    /* JADX INFO: renamed from: b */
    public final C2925c f56007b;

    public C17510g(AbstractC0563B dispatcher, C2925c c2925c) {
        AbstractC16544l.m18094g(dispatcher, "dispatcher");
        this.f56006a = dispatcher;
        this.f56007b = c2925c;
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
        return f56005c;
    }
}
