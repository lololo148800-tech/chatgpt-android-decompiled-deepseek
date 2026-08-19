package com.openai.feature.onboarding.impl.viewmodel;

import androidx.lifecycle.C11082S;
import androidx.lifecycle.ViewModel;
import bg.C11399A;
import com.openai.feature.onboarding.viewmodel.VerifyEmailCodeViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import ng.C17614e;
import ng.C17615f;
import ng.C17616g;
import ng.C17618i;
import ng.InterfaceC17617h;
import p049Bm.InterfaceC1436k;
import p092Dc.C1991h;
import p098Di.C2059h;
import p098Di.InterfaceC2053b;
import p1081wc.InterfaceC20904w;
import p1149zc.AbstractC21864z;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p1155zi.EnumC21895B;
import p195Hh.C3430e;
import p318Mh.C5398f0;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p544W9.AbstractC8458C2;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9327m3;
import p708dh.C13145X;
import p905nd.C17589q;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9327m3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/onboarding/impl/viewmodel/VerifyEmailCodeViewModelLoggedInImpl;", "Lcom/openai/feature/onboarding/viewmodel/VerifyEmailCodeViewModel;", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class VerifyEmailCodeViewModelLoggedInImpl extends VerifyEmailCodeViewModel {

    /* JADX INFO: renamed from: i */
    public final C11399A f39214i;

    /* JADX INFO: renamed from: j */
    public final AbstractC21864z f39215j;

    /* JADX INFO: renamed from: k */
    public final C13145X f39216k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC20904w f39217l;

    /* JADX INFO: renamed from: m */
    public final C1991h f39218m;

    /* JADX INFO: renamed from: n */
    public final EnumC21895B f39219n;

    /* JADX INFO: renamed from: o */
    public final C3430e f39220o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyEmailCodeViewModelLoggedInImpl(C11399A c11399a, AbstractC21864z abstractC21864z, C13145X c13145x, InterfaceC20904w interfaceC20904w, C1991h c1991h, EnumC21895B enumC21895B, C11082S c11082s) {
        super(new C17618i((String) C5398f0.f17662i.m5892c(c11082s), 30));
        C5398f0.f17661h.getClass();
        this.f39214i = c11399a;
        this.f39215j = abstractC21864z;
        this.f39216k = c13145x;
        this.f39217l = interfaceC20904w;
        this.f39218m = c1991h;
        this.f39219n = enumC21895B;
        this.f39220o = AbstractC8168p6.m8749b("VerifyEmailCodeViewModel", null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: n */
    public static final Object m14332n(VerifyEmailCodeViewModelLoggedInImpl verifyEmailCodeViewModelLoggedInImpl, AbstractC19687c abstractC19687c) {
        VerifyEmailCodeViewModelLoggedInImpl$handleEmailRefresh$1 verifyEmailCodeViewModelLoggedInImpl$handleEmailRefresh$1;
        VerifyEmailCodeViewModelLoggedInImpl verifyEmailCodeViewModelLoggedInImpl2;
        verifyEmailCodeViewModelLoggedInImpl.getClass();
        if (abstractC19687c instanceof VerifyEmailCodeViewModelLoggedInImpl$handleEmailRefresh$1) {
            verifyEmailCodeViewModelLoggedInImpl$handleEmailRefresh$1 = (VerifyEmailCodeViewModelLoggedInImpl$handleEmailRefresh$1) abstractC19687c;
            int i10 = verifyEmailCodeViewModelLoggedInImpl$handleEmailRefresh$1.f39225q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                verifyEmailCodeViewModelLoggedInImpl$handleEmailRefresh$1.f39225q0 = i10 - Integer.MIN_VALUE;
            } else {
                verifyEmailCodeViewModelLoggedInImpl$handleEmailRefresh$1 = new VerifyEmailCodeViewModelLoggedInImpl$handleEmailRefresh$1(verifyEmailCodeViewModelLoggedInImpl, abstractC19687c);
            }
        } else {
            verifyEmailCodeViewModelLoggedInImpl$handleEmailRefresh$1 = new VerifyEmailCodeViewModelLoggedInImpl$handleEmailRefresh$1(verifyEmailCodeViewModelLoggedInImpl, abstractC19687c);
        }
        Object objM19221g = verifyEmailCodeViewModelLoggedInImpl$handleEmailRefresh$1.f39223o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = verifyEmailCodeViewModelLoggedInImpl$handleEmailRefresh$1.f39225q0;
        if (i11 != 0) {
            if (i11 == 1) {
                verifyEmailCodeViewModelLoggedInImpl = verifyEmailCodeViewModelLoggedInImpl$handleEmailRefresh$1.f39222Z;
                verifyEmailCodeViewModelLoggedInImpl2 = verifyEmailCodeViewModelLoggedInImpl$handleEmailRefresh$1.f39221Y;
                AbstractC9233X.m9807c(objM19221g);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM19221g);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(objM19221g);
        verifyEmailCodeViewModelLoggedInImpl$handleEmailRefresh$1.f39221Y = verifyEmailCodeViewModelLoggedInImpl;
        verifyEmailCodeViewModelLoggedInImpl$handleEmailRefresh$1.f39222Z = verifyEmailCodeViewModelLoggedInImpl;
        verifyEmailCodeViewModelLoggedInImpl$handleEmailRefresh$1.f39225q0 = 1;
        objM19221g = ((C17589q) verifyEmailCodeViewModelLoggedInImpl.f39215j).m19221g(verifyEmailCodeViewModelLoggedInImpl$handleEmailRefresh$1);
        if (objM19221g == enumC19250a) {
            return enumC19250a;
        }
        verifyEmailCodeViewModelLoggedInImpl2 = verifyEmailCodeViewModelLoggedInImpl;
        VerifyEmailCodeViewModelLoggedInImpl$handleEmailRefresh$2 verifyEmailCodeViewModelLoggedInImpl$handleEmailRefresh$2 = new VerifyEmailCodeViewModelLoggedInImpl$handleEmailRefresh$2(verifyEmailCodeViewModelLoggedInImpl2, null);
        verifyEmailCodeViewModelLoggedInImpl$handleEmailRefresh$1.f39221Y = null;
        verifyEmailCodeViewModelLoggedInImpl$handleEmailRefresh$1.f39222Z = null;
        verifyEmailCodeViewModelLoggedInImpl$handleEmailRefresh$1.f39225q0 = 2;
        if (verifyEmailCodeViewModelLoggedInImpl.m14333o((AbstractC21955Q1) objM19221g, verifyEmailCodeViewModelLoggedInImpl$handleEmailRefresh$2, verifyEmailCodeViewModelLoggedInImpl$handleEmailRefresh$1) == enumC19250a) {
            return enumC19250a;
        }
        return C17296C.f55119a;
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        InterfaceC17617h intent = (InterfaceC17617h) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent.equals(C17614e.f56372a)) {
            m14394i(new VerifyEmailCodeViewModelLoggedInImpl$onIntent$1(this, null));
        } else if (intent.equals(C17615f.f56373a)) {
            m14394i(new VerifyEmailCodeViewModelLoggedInImpl$onIntent$2(this, null));
        } else if (intent instanceof C17616g) {
            m14397m(new VerifyEmailCodeViewModelLoggedInImpl$onIntent$3(intent));
        }
    }

    /* JADX INFO: renamed from: o */
    public final Object m14333o(AbstractC21955Q1 abstractC21955Q1, InterfaceC1436k interfaceC1436k, AbstractC19687c abstractC19687c) {
        boolean z6 = abstractC21955Q1 instanceof C21952P1;
        C17296C c17296c = C17296C.f55119a;
        if (z6) {
            Object objInvoke = interfaceC1436k.invoke(abstractC19687c);
            return objInvoke == EnumC19250a.f61036Y ? objInvoke : c17296c;
        }
        if (abstractC21955Q1 instanceof AbstractC21933K1) {
            AbstractC21933K1 abstractC21933K1 = (AbstractC21933K1) abstractC21955Q1;
            AbstractC8160o6.m8727b(this.f39220o, "Failed to refresh credentials", abstractC21933K1.f69485a, 4);
            m14397m(new VerifyEmailCodeViewModelLoggedInImpl$submitResultFold$2(abstractC21955Q1));
            m14393h(new C2059h(AbstractC8458C2.m9074b(abstractC21933K1, this.f39218m, this.f39219n, null)));
        } else if (abstractC21955Q1 instanceof C21929J1) {
            m14397m(VerifyEmailCodeViewModelLoggedInImpl$submitResultFold$3.f39245Y);
        }
        return c17296c;
    }
}
