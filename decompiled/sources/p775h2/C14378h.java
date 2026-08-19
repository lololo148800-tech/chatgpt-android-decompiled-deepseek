package p775h2;

/* JADX INFO: renamed from: h2.h */
/* JADX INFO: loaded from: classes.dex */
public class C14378h extends C14377g {

    /* JADX INFO: renamed from: m */
    public int f45091m;

    public C14378h(AbstractC14386p abstractC14386p) {
        super(abstractC14386p);
        if (abstractC14386p instanceof C14382l) {
            this.f45083e = 2;
        } else {
            this.f45083e = 3;
        }
    }

    @Override // p775h2.C14377g
    /* JADX INFO: renamed from: d */
    public final void mo15863d(int i10) {
        if (this.f45088j) {
            return;
        }
        this.f45088j = true;
        this.f45085g = i10;
        for (InterfaceC14375e interfaceC14375e : this.f45089k) {
            interfaceC14375e.mo15814a(interfaceC14375e);
        }
    }
}
