package com.openai.feature.conversationspreadsheet.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p404Qe.C6682r;
import p968qi.C18739v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LQe/r;", "invoke", "(LQe/r;)LQe/r;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ConversationSpreadsheetViewModel$updateSelectionState$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C18739v f38112Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationSpreadsheetViewModel$updateSelectionState$1(C18739v c18739v) {
        super(1);
        this.f38112Y = c18739v;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C6682r setState = (C6682r) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        return C6682r.m7181e(setState, null, null, null, 0, this.f38112Y, 31);
    }
}
