package com.openai.feature.onboarding.impl.viewmodel;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import ng.C17618i;
import p049Bm.InterfaceC1436k;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21913F1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lng/i;", "invoke", "(Lng/i;)Lng/i;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class VerifyEmailCodeViewModelLoggedInImpl$submitResultFold$2 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ AbstractC21955Q1 f39244Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyEmailCodeViewModelLoggedInImpl$submitResultFold$2(AbstractC21955Q1 abstractC21955Q1) {
        super(1);
        this.f39244Y = abstractC21955Q1;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C17618i setState = (C17618i) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        AbstractC21933K1 error = (AbstractC21933K1) this.f39244Y;
        AbstractC16544l.m18094g(error, "error");
        return C17618i.m19228e(setState, null, null, false, new C21913F1(error), null, 23);
    }
}
