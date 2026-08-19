package p248Jk;

import p544W9.AbstractC8452B2;

/* JADX INFO: renamed from: Jk.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C4480k implements InterfaceC4478i {

    /* JADX INFO: renamed from: c */
    public static final Object f14622c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile InterfaceC4478i f14623a;

    /* JADX INFO: renamed from: b */
    public volatile Object f14624b;

    /* JADX INFO: renamed from: a */
    public static InterfaceC4478i m5208a(InterfaceC4473d interfaceC4473d) {
        InterfaceC4478i interfaceC4478iM9063b = AbstractC8452B2.m9063b(interfaceC4473d);
        if ((interfaceC4478iM9063b instanceof C4480k) || (interfaceC4478iM9063b instanceof C4472c)) {
            return interfaceC4478iM9063b;
        }
        C4480k c4480k = new C4480k();
        c4480k.f14624b = f14622c;
        c4480k.f14623a = interfaceC4478iM9063b;
        return c4480k;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f14624b;
        if (obj != f14622c) {
            return obj;
        }
        InterfaceC4478i interfaceC4478i = this.f14623a;
        if (interfaceC4478i == null) {
            return this.f14624b;
        }
        Object obj2 = interfaceC4478i.get();
        this.f14624b = obj2;
        this.f14623a = null;
        return obj2;
    }
}
