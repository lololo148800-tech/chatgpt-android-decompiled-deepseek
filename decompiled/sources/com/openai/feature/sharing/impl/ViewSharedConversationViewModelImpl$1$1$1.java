package com.openai.feature.sharing.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p015Ad.C0431f;
import p049Bm.InterfaceC1436k;
import p216Id.AbstractC3693a;
import p403Qd.C6604J;
import p403Qd.C6636i;
import p523V9.AbstractC8042a0;
import p552Wg.C8838B;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LWg/B;", "invoke", "(LWg/B;)LWg/B;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ViewSharedConversationViewModelImpl$1$1$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C6604J f39832Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0431f f39833Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ ViewSharedConversationViewModelImpl f39834o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewSharedConversationViewModelImpl$1$1$1(C6604J c6604j, C0431f c0431f, ViewSharedConversationViewModelImpl viewSharedConversationViewModelImpl) {
        super(1);
        this.f39832Y = c6604j;
        this.f39833Z = c0431f;
        this.f39834o0 = viewSharedConversationViewModelImpl;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C8838B setState = (C8838B) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        C6604J c6604j = this.f39832Y;
        C6636i c6636i = c6604j.f21323a;
        C0431f c0431f = this.f39833Z;
        String str = AbstractC3693a.f11214a;
        return C8838B.m9545e(setState, c6604j, null, AbstractC3693a.m4403c(AbstractC3693a.m4407g(c0431f.m1088b(AbstractC8042a0.m8420h(c6636i)), c6604j.f21323a)), null, this.f39834o0.f39824m, false, 427);
    }
}
