package mk;

import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p110E4.C2307e;
import p153Fn.C2925c;

/* JADX INFO: renamed from: mk.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C17282c {

    /* JADX INFO: renamed from: a */
    public final C2307e f55095a;

    /* JADX INFO: renamed from: b */
    public final C2925c f55096b;

    /* JADX INFO: renamed from: c */
    public final C2153Q0 f55097c;

    /* JADX INFO: renamed from: d */
    public boolean f55098d;

    /* JADX INFO: renamed from: e */
    public boolean f55099e;

    /* JADX INFO: renamed from: f */
    public boolean f55100f;

    /* JADX INFO: renamed from: g */
    public boolean f55101g;

    public C17282c(C2307e externalInquiryController) {
        AbstractC16544l.m18094g(externalInquiryController, "externalInquiryController");
        this.f55095a = externalInquiryController;
        this.f55096b = AbstractC0575H.m1174c(AbstractC0593T.f1824a.plus(AbstractC0575H.m1176e()));
        this.f55097c = AbstractC2124C.m3204c(new C17280a(true, true, externalInquiryController.f7158Z, true));
        this.f55100f = true;
    }

    /* JADX INFO: renamed from: a */
    public final C17280a m18975a() {
        return (C17280a) this.f55097c.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final void m18976b() {
        C17280a c17280a = new C17280a(this.f55098d, this.f55099e, this.f55095a.f7158Z, this.f55100f && !this.f55101g);
        C2153Q0 c2153q0 = this.f55097c;
        if (AbstractC16544l.m18089b(c2153q0.getValue(), c17280a)) {
            return;
        }
        c2153q0.getClass();
        c2153q0.m3251l(null, c17280a);
        AbstractC0575H.m1156D(this.f55096b, null, null, new C17281b(this, c17280a, null), 3);
    }
}
