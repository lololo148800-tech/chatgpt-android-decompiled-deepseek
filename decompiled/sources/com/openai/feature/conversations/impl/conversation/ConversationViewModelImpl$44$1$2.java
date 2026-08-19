package com.openai.feature.conversations.impl.conversation;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p1025te.C19863N;
import p1155zi.C21999e0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lte/N;", "invoke", "(Lte/N;)Lte/N;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ConversationViewModelImpl$44$1$2 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C21999e0 f37692Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationViewModelImpl$44$1$2(C21999e0 c21999e0) {
        super(1);
        this.f37692Y = c21999e0;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C19863N update = (C19863N) obj;
        AbstractC16544l.m18094g(update, "$this$update");
        return C19863N.m20780a(update, null, false, null, null, false, null, null, this.f37692Y, 127);
    }
}
