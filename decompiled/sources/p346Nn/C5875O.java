package p346Nn;

import kotlin.jvm.internal.AbstractC16544l;
import p324Mn.C5521B;
import p389Pn.C6520e;
import p437Rn.InterfaceC6945c;
import p817j$.time.LocalDateTime;

/* JADX INFO: renamed from: Nn.O */
/* JADX INFO: loaded from: classes2.dex */
public final class C5875O extends AbstractC5886a {

    /* JADX INFO: renamed from: a */
    public final C6520e f19203a;

    public C5875O(C6520e c6520e) {
        this.f19203a = c6520e;
    }

    @Override // p346Nn.AbstractC5886a
    /* JADX INFO: renamed from: a */
    public final C6520e mo6300a() {
        return this.f19203a;
    }

    @Override // p346Nn.AbstractC5886a
    /* JADX INFO: renamed from: b */
    public final InterfaceC6945c mo6301b() {
        return AbstractC5876P.f19205b;
    }

    @Override // p346Nn.AbstractC5886a
    /* JADX INFO: renamed from: d */
    public final Object mo6302d(InterfaceC6945c interfaceC6945c) {
        C5867G intermediate = (C5867G) interfaceC6945c;
        AbstractC16544l.m18094g(intermediate, "intermediate");
        LocalDateTime localDateTimeM16830of = LocalDateTime.m16830of(intermediate.f19177a.m6259c().f18006Y, intermediate.f19178b.m6281e().f17976Y);
        AbstractC16544l.m18093f(localDateTimeM16830of, "of(...)");
        return new C5521B(localDateTimeM16830of);
    }
}
