package p839jk;

import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p110E4.C2307e;
import p153Fn.C2925c;
import p222Ij.C3736a;
import p544W9.AbstractC8548R3;

/* JADX INFO: renamed from: jk.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C16251h {

    /* JADX INFO: renamed from: a */
    public final C2307e f50376a;

    /* JADX INFO: renamed from: b */
    public final C2925c f50377b;

    /* JADX INFO: renamed from: c */
    public AbstractC8548R3 f50378c;

    public C16251h(C2307e externalInquiryController) {
        AbstractC16544l.m18094g(externalInquiryController, "externalInquiryController");
        this.f50376a = externalInquiryController;
        this.f50377b = AbstractC0575H.m1174c(AbstractC0593T.f1824a.plus(AbstractC0575H.m1176e()));
    }

    /* JADX INFO: renamed from: a */
    public final void m17811a(AbstractC8548R3 abstractC8548R3) {
        if (AbstractC16544l.m18089b(this.f50378c, abstractC8548R3)) {
            return;
        }
        this.f50378c = abstractC8548R3;
        AbstractC0575H.m1156D(this.f50377b, null, null, new C16250g(this, new C3736a(abstractC8548R3.mo9209b(), abstractC8548R3.toString()), null), 3);
    }
}
