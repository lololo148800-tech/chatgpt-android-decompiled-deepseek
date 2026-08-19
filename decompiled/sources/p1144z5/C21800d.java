package p1144z5;

import p025An.C0644w;
import p1075w5.AbstractC20832j;
import p1075w5.C20827e;
import p1075w5.C20838p;

/* JADX INFO: renamed from: z5.d */
/* JADX INFO: loaded from: classes.dex */
public final class C21800d implements InterfaceC21802f {

    /* JADX INFO: renamed from: a */
    public final InterfaceC21803g f69161a;

    /* JADX INFO: renamed from: b */
    public final AbstractC20832j f69162b;

    public C21800d(InterfaceC21803g interfaceC21803g, AbstractC20832j abstractC20832j) {
        this.f69161a = interfaceC21803g;
        this.f69162b = abstractC20832j;
    }

    @Override // p1144z5.InterfaceC21802f
    /* JADX INFO: renamed from: a */
    public final void mo22288a() {
        AbstractC20832j abstractC20832j = this.f69162b;
        boolean z6 = abstractC20832j instanceof C20838p;
        InterfaceC21803g interfaceC21803g = this.f69161a;
        if (z6) {
            interfaceC21803g.mo10667k(((C20838p) abstractC20832j).f66255a);
        } else {
            if (!(abstractC20832j instanceof C20827e)) {
                throw new C0644w();
            }
            interfaceC21803g.mo10668l(((C20827e) abstractC20832j).f66180a);
        }
    }
}
