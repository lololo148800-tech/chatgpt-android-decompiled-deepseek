package com.openai.feature.conversationdetails.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p963qd.C18676e;
import p963qd.C18686o;
import p963qd.InterfaceC18677f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lqd/o;", "invoke", "(Lqd/o;)Lqd/o;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ConversationDetailsViewModelImpl$onIntent$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC18677f f37315Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationDetailsViewModelImpl$onIntent$1(InterfaceC18677f interfaceC18677f) {
        super(1);
        this.f37315Y = interfaceC18677f;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C18686o setState = (C18686o) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        return C18686o.m20040e(setState, null, null, null, null, null, ((C18676e) this.f37315Y).f59456a, null, false, 479);
    }
}
