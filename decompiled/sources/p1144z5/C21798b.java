package p1144z5;

import android.graphics.drawable.Drawable;
import p025An.C0644w;
import p1075w5.AbstractC20832j;
import p1075w5.C20827e;
import p1075w5.C20838p;
import p941p5.C18296a;

/* JADX INFO: renamed from: z5.b */
/* JADX INFO: loaded from: classes.dex */
public final class C21798b implements InterfaceC21802f {

    /* JADX INFO: renamed from: a */
    public final InterfaceC21803g f69157a;

    /* JADX INFO: renamed from: b */
    public final AbstractC20832j f69158b;

    /* JADX INFO: renamed from: c */
    public final int f69159c;

    /* JADX INFO: renamed from: d */
    public final boolean f69160d;

    public C21798b(InterfaceC21803g interfaceC21803g, AbstractC20832j abstractC20832j, int i10, boolean z6) {
        this.f69157a = interfaceC21803g;
        this.f69158b = abstractC20832j;
        this.f69159c = i10;
        this.f69160d = z6;
        if (i10 <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    @Override // p1144z5.InterfaceC21802f
    /* JADX INFO: renamed from: a */
    public final void mo22288a() {
        InterfaceC21803g interfaceC21803g = this.f69157a;
        Drawable drawableMo18920q = interfaceC21803g.mo18920q();
        AbstractC20832j abstractC20832j = this.f69158b;
        boolean z6 = abstractC20832j instanceof C20838p;
        C18296a c18296a = new C18296a(drawableMo18920q, abstractC20832j.mo21433a(), abstractC20832j.mo21434b().f66234y, this.f69159c, (z6 && ((C20838p) abstractC20832j).f66261g) ? false : true, this.f69160d);
        if (z6) {
            interfaceC21803g.mo10667k(c18296a);
        } else {
            if (!(abstractC20832j instanceof C20827e)) {
                throw new C0644w();
            }
            interfaceC21803g.mo10668l(c18296a);
        }
    }
}
