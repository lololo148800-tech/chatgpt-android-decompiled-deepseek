package com.openai.feature.messages.impl.messagefeedback;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p1150zd.EnumC21867c;
import p316Mf.AbstractC5349p;
import p316Mf.C5347n;
import p479Td.C7351f0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LMf/p;", "invoke", "(LMf/p;)LMf/p;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class MessageFeedbackViewModelImpl$thumbsUpOrDown$1$1$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C7351f0 f38979Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageFeedbackViewModelImpl$thumbsUpOrDown$1$1$1(C7351f0 c7351f0) {
        super(1);
        this.f38979Y = c7351f0;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        AbstractC5349p setState = (AbstractC5349p) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        return new C5347n(this.f38979Y, EnumC21867c.f69341o0, false);
    }
}
