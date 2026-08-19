package p917o6;

import kotlin.jvm.internal.AbstractC16544l;
import p008A6.C0384d;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: o6.j */
/* JADX INFO: loaded from: classes.dex */
public final class C17857j implements InterfaceC17835C {

    /* JADX INFO: renamed from: a */
    public final InterfaceC17835C f56943a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17833A f56944b;

    public C17857j(InterfaceC17835C left, InterfaceC17833A element) {
        AbstractC16544l.m18094g(left, "left");
        AbstractC16544l.m18094g(element, "element");
        this.f56943a = left;
        this.f56944b = element;
    }

    @Override // p917o6.InterfaceC17835C
    /* JADX INFO: renamed from: a */
    public final InterfaceC17835C mo4138a(InterfaceC17834B key) {
        AbstractC16544l.m18094g(key, "key");
        InterfaceC17833A interfaceC17833A = this.f56944b;
        InterfaceC17833A interfaceC17833AMo4141d = interfaceC17833A.mo4141d(key);
        InterfaceC17835C interfaceC17835C = this.f56943a;
        if (interfaceC17833AMo4141d != null) {
            return interfaceC17835C;
        }
        InterfaceC17835C interfaceC17835CMo4138a = interfaceC17835C.mo4138a(key);
        if (interfaceC17835CMo4138a == interfaceC17835C) {
            return this;
        }
        return interfaceC17835CMo4138a == C17870w.f56967a ? interfaceC17833A : new C17857j(interfaceC17835CMo4138a, interfaceC17833A);
    }

    @Override // p917o6.InterfaceC17835C
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC17835C mo4139b(InterfaceC17835C interfaceC17835C) {
        return AbstractC17792x.m19520c(this, interfaceC17835C);
    }

    @Override // p917o6.InterfaceC17835C
    /* JADX INFO: renamed from: c */
    public final Object mo4140c(InterfaceC17835C interfaceC17835C, C0384d c0384d) {
        return c0384d.invoke(this.f56943a.mo4140c(interfaceC17835C, c0384d), this.f56944b);
    }

    @Override // p917o6.InterfaceC17835C
    /* JADX INFO: renamed from: d */
    public final InterfaceC17833A mo4141d(InterfaceC17834B key) {
        AbstractC16544l.m18094g(key, "key");
        C17857j c17857j = this;
        while (true) {
            InterfaceC17833A interfaceC17833AMo4141d = c17857j.f56944b.mo4141d(key);
            if (interfaceC17833AMo4141d != null) {
                return interfaceC17833AMo4141d;
            }
            InterfaceC17835C interfaceC17835C = c17857j.f56943a;
            if (!(interfaceC17835C instanceof C17857j)) {
                return interfaceC17835C.mo4141d(key);
            }
            c17857j = (C17857j) interfaceC17835C;
        }
    }
}
