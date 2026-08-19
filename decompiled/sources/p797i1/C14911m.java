package p797i1;

import p530Vi.AbstractC8301I;

/* JADX INFO: renamed from: i1.m */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C14911m implements InterfaceC14907i {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f46444Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C14915q f46445Z;

    public /* synthetic */ C14911m(C14915q c14915q, int i10) {
        this.f46444Y = i10;
        this.f46445Z = c14915q;
    }

    @Override // p797i1.InterfaceC14907i
    /* JADX INFO: renamed from: b */
    public final double mo9580b(double d10) {
        switch (this.f46444Y) {
            case 0:
                C14915q c14915q = this.f46445Z;
                return AbstractC8301I.m8919j(c14915q.f46460k.mo9580b(d10), c14915q.f46454e, c14915q.f46455f);
            default:
                C14915q c14915q2 = this.f46445Z;
                return c14915q2.f46463n.mo9580b(AbstractC8301I.m8919j(d10, c14915q2.f46454e, c14915q2.f46455f));
        }
    }
}
