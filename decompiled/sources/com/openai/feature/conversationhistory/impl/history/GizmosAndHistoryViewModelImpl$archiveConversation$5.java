package com.openai.feature.conversationhistory.impl.history;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p1062vd.C20549b0;
import p1155zi.C22011h0;
import p403Qd.C6636i;
import p909nm.AbstractC17665J;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lvd/b0;", "invoke", "(Lvd/b0;)Lvd/b0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class GizmosAndHistoryViewModelImpl$archiveConversation$5 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C6636i f37397Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GizmosAndHistoryViewModelImpl$archiveConversation$5(C6636i c6636i) {
        super(1);
        this.f37397Y = c6636i;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C20549b0 setState = (C20549b0) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        return C20549b0.m21187e(setState, false, false, false, null, null, null, null, false, null, null, false, null, null, null, null, AbstractC17665J.m19263c(setState.f65226r, new C22011h0(this.f37397Y.f21379a)), null, false, 1966079);
    }
}
