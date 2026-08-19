package com.openai.feature.gizmoshome.impl.details;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p1155zi.C22011h0;
import p706df.C13104x;
import p909nm.AbstractC17665J;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Ldf/x;", "invoke", "(Ldf/x;)Ldf/x;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class SnorlaxHomeViewModelImpl$renameConversation$5 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ String f38376Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnorlaxHomeViewModelImpl$renameConversation$5(String str) {
        super(1);
        this.f38376Y = str;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C13104x setState = (C13104x) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        return C13104x.m14805e(setState, null, null, null, false, AbstractC17665J.m19263c(setState.f41618f, new C22011h0(this.f38376Y)), 95);
    }
}
