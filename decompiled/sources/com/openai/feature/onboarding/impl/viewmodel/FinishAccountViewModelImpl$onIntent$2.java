package com.openai.feature.onboarding.impl.viewmodel;

import android.gov.nist.core.LexerCore;
import kg.C16401g;
import kg.C16404j;
import kg.InterfaceC16403i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p1113xn.AbstractC21322p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lkg/j;", "invoke", "(Lkg/j;)Lkg/j;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class FinishAccountViewModelImpl$onIntent$2 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC16403i f39132Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinishAccountViewModelImpl$onIntent$2(InterfaceC16403i interfaceC16403i) {
        super(1);
        this.f39132Y = interfaceC16403i;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C16404j setState = (C16404j) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        return C16404j.m18004e(setState, null, AbstractC21322p.m21709q0(96, ((C16401g) this.f39132Y).f50914a), null, null, null, null, null, false, false, false, false, false, LexerCore.ID_NO_WHITESPACE);
    }
}
