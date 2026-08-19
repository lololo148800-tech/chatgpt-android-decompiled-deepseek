package com.openai.feature.conversations.impl.conversation;

import ge.C14111x0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lge/x0;", "invoke", "(Lge/x0;)Lge/x0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ConversationViewModelImpl$toggleTemporaryChat$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ boolean f37810Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationViewModelImpl$toggleTemporaryChat$1(boolean z6) {
        super(1);
        this.f37810Y = z6;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C14111x0 setState = (C14111x0) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        return C14111x0.m15491e(setState, null, null, null, null, null, null, null, null, null, null, false, false, false, null, false, false, false, null, null, null, null, false, false, null, false, null, null, this.f37810Y, null, null, null, false, false, null, null, false, -1, 8388591);
    }
}
