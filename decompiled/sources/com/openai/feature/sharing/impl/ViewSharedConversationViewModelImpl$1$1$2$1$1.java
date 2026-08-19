package com.openai.feature.sharing.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p1042uh.C20263a0;
import p552Wg.C8838B;
import p621Zd.C10282c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LWg/B;", "invoke", "(LWg/B;)LWg/B;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ViewSharedConversationViewModelImpl$1$1$2$1$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C10282c f39839Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C20263a0 f39840Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewSharedConversationViewModelImpl$1$1$2$1$1(C10282c c10282c, C20263a0 c20263a0) {
        super(1);
        this.f39839Y = c10282c;
        this.f39840Z = c20263a0;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C8838B setState = (C8838B) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        return C8838B.m9545e(setState, null, this.f39839Y, null, this.f39840Z, null, false, 471);
    }
}
