package com.openai.feature.messages.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p926of.C18160X;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lof/X;", "invoke", "(Lof/X;)Lof/X;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class MessagesViewModelImpl$showCode$2 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ String f38637Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesViewModelImpl$showCode$2(String str) {
        super(1);
        this.f38637Y = str;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C18160X setState = (C18160X) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        return C18160X.m19717e(setState, false, this.f38637Y, null, false, null, null, null, null, 2039);
    }
}
