package p565X3;

import p084D4.C1918i;
import p372P3.AbstractC6340v;
import p372P3.C6309A;
import p372P3.C6311C;
import p372P3.InterfaceC6310B;

/* JADX INFO: renamed from: X3.c */
/* JADX INFO: loaded from: classes.dex */
public final class C9041c extends AbstractC6340v {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC6310B f27610b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1918i f27611c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9041c(C1918i c1918i, InterfaceC6310B interfaceC6310B, InterfaceC6310B interfaceC6310B2) {
        super(interfaceC6310B);
        this.f27611c = c1918i;
        this.f27610b = interfaceC6310B2;
    }

    @Override // p372P3.AbstractC6340v, p372P3.InterfaceC6310B
    /* JADX INFO: renamed from: j */
    public final C6309A mo6854j(long j10) {
        C6309A c6309aMo6854j = this.f27610b.mo6854j(j10);
        C6311C c6311c = c6309aMo6854j.f20441a;
        long j11 = c6311c.f20444a;
        long j12 = this.f27611c.f5612Z;
        C6311C c6311c2 = new C6311C(j11, c6311c.f20445b + j12);
        C6311C c6311c3 = c6309aMo6854j.f20442b;
        return new C6309A(c6311c2, new C6311C(c6311c3.f20444a, c6311c3.f20445b + j12));
    }
}
