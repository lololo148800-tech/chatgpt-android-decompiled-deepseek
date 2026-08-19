package p615Z6;

/* JADX INFO: renamed from: Z6.l0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10224l0 extends AbstractC10196V {
    @Override // p615Z6.AbstractC10196V, p615Z6.InterfaceC10197W
    /* JADX INFO: renamed from: j */
    public final void mo10773j(AbstractC10202a0 abstractC10202a0) throws C10168A0 {
        if (abstractC10202a0 instanceof InterfaceC10222k0) {
            this.f30299i.add(abstractC10202a0);
            return;
        }
        throw new C10168A0("Text content elements cannot contain " + abstractC10202a0 + " elements.");
    }
}
