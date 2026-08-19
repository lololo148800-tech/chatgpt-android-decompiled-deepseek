package ml;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import java.util.List;
import mm.EnumC17307j;
import p049Bm.InterfaceC1426a;
import p544W9.AbstractC8621d4;
import p544W9.AbstractC8645h4;
import p571X9.AbstractC9227W;
import p857kl.AbstractC16435B;
import p857kl.C16456d;
import p857kl.C16460h;
import p857kl.C16472t;
import p857kl.C16478z;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: ml.j */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17292j {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1426a f55111a;

    /* JADX INFO: renamed from: b */
    public final C16478z f55112b;

    public AbstractC17292j(InterfaceC1426a interfaceC1426a, C16478z c16478z) {
        this.f55111a = interfaceC1426a;
        this.f55112b = c16478z;
        EnumC17307j enumC17307j = EnumC17307j.f55134Z;
        final int i10 = 0;
        AbstractC9227W.m9799b(enumC17307j, new InterfaceC1426a(this) { // from class: ml.g

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ AbstractC17292j f55108Z;

            {
                this.f55108Z = this;
            }

            @Override // p049Bm.InterfaceC1426a
            public final Object invoke() {
                AbstractC17292j abstractC17292j = this.f55108Z;
                switch (i10) {
                    case 0:
                        C16478z c16478z2 = abstractC17292j.f55112b;
                        List list = AbstractC16435B.f50983a;
                        String strMo7982g = c16478z2.mo7982g(SIPHeaderNames.CONTENT_DISPOSITION);
                        if (strMo7982g == null) {
                            return null;
                        }
                        int i11 = C16456d.f51059d;
                        C16472t c16472t = (C16472t) AbstractC17680n.m19351a0(AbstractC8645h4.m9313b(strMo7982g));
                        return new C16456d(c16472t.f51109a, c16472t.f51110b);
                    default:
                        C16478z c16478z3 = abstractC17292j.f55112b;
                        List list2 = AbstractC16435B.f50983a;
                        String strMo7982g2 = c16478z3.mo7982g(SIPHeaderNames.CONTENT_TYPE);
                        if (strMo7982g2 == null) {
                            return null;
                        }
                        C16460h c16460h = C16460h.f51065f;
                        return AbstractC8621d4.m9270a(strMo7982g2);
                }
            }
        });
        final int i11 = 1;
        AbstractC9227W.m9799b(enumC17307j, new InterfaceC1426a(this) { // from class: ml.g

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ AbstractC17292j f55108Z;

            {
                this.f55108Z = this;
            }

            @Override // p049Bm.InterfaceC1426a
            public final Object invoke() {
                AbstractC17292j abstractC17292j = this.f55108Z;
                switch (i11) {
                    case 0:
                        C16478z c16478z2 = abstractC17292j.f55112b;
                        List list = AbstractC16435B.f50983a;
                        String strMo7982g = c16478z2.mo7982g(SIPHeaderNames.CONTENT_DISPOSITION);
                        if (strMo7982g == null) {
                            return null;
                        }
                        int i12 = C16456d.f51059d;
                        C16472t c16472t = (C16472t) AbstractC17680n.m19351a0(AbstractC8645h4.m9313b(strMo7982g));
                        return new C16456d(c16472t.f51109a, c16472t.f51110b);
                    default:
                        C16478z c16478z3 = abstractC17292j.f55112b;
                        List list2 = AbstractC16435B.f50983a;
                        String strMo7982g2 = c16478z3.mo7982g(SIPHeaderNames.CONTENT_TYPE);
                        if (strMo7982g2 == null) {
                            return null;
                        }
                        C16460h c16460h = C16460h.f51065f;
                        return AbstractC8621d4.m9270a(strMo7982g2);
                }
            }
        });
    }
}
