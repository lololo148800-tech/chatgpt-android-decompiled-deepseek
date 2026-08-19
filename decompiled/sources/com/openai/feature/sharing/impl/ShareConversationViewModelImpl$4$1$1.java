package com.openai.feature.sharing.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p403Qd.C6636i;
import p552Wg.C8856r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LWg/r;", "invoke", "(LWg/r;)LWg/r;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ShareConversationViewModelImpl$4$1$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C6636i f39787Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareConversationViewModelImpl$4$1$1(C6636i c6636i) {
        super(1);
        this.f39787Y = c6636i;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C8856r setState = (C8856r) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        return C8856r.m9546e(setState, null, null, false, null, null, this.f39787Y.f21381c, null, false, null, false, 991);
    }
}
