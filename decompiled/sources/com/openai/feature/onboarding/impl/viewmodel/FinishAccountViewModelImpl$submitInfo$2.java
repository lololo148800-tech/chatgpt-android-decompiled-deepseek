package com.openai.feature.onboarding.impl.viewmodel;

import com.openai.chatgpt.R;
import kg.C16404j;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lkg/j;", "invoke", "(Lkg/j;)Lkg/j;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class FinishAccountViewModelImpl$submitInfo$2 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ FinishAccountViewModelImpl f39146Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinishAccountViewModelImpl$submitInfo$2(FinishAccountViewModelImpl finishAccountViewModelImpl) {
        super(1);
        this.f39146Y = finishAccountViewModelImpl;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C16404j setState = (C16404j) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        return C16404j.m18004e(setState, null, null, null, null, this.f39146Y.f39111k.m3160b(R.string.onboarding_invalid_date), null, null, false, false, false, false, false, 4079);
    }
}
