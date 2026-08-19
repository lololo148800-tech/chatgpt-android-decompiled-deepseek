package com.openai.feature.sharing.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p1113xn.AbstractC21322p;
import p552Wg.C8852n;
import p552Wg.C8856r;
import p552Wg.InterfaceC8855q;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LWg/r;", "invoke", "(LWg/r;)LWg/r;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ShareConversationViewModelImpl$onIntent$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC8855q f39797Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareConversationViewModelImpl$onIntent$1(InterfaceC8855q interfaceC8855q) {
        super(1);
        this.f39797Y = interfaceC8855q;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C8856r setState = (C8856r) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        return C8856r.m9546e(setState, null, AbstractC21322p.m21709q0(128, ((C8852n) this.f39797Y).f27107a), false, null, null, null, null, false, null, false, 1021);
    }
}
