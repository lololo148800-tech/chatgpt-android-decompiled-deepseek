package com.openai.feature.conversationhistory.impl.history;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p1062vd.C20549b0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lvd/b0;", "invoke", "(Lvd/b0;)Lvd/b0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class GizmosAndHistoryViewModelImpl$fetchMore$5$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ boolean f37413Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GizmosAndHistoryViewModelImpl$fetchMore$5$1(boolean z6) {
        super(1);
        this.f37413Y = z6;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C20549b0 setState = (C20549b0) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        return C20549b0.m21187e(setState, false, false, false, null, null, null, null, this.f37413Y, null, null, false, null, null, null, null, null, null, false, 2096895);
    }
}
