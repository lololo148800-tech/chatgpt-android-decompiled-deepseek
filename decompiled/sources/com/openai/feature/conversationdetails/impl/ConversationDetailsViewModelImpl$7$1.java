package com.openai.feature.conversationdetails.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1439n;
import p403Qd.C6636i;
import p963qd.C18686o;
import p963qd.C18687p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lqd/o;", "LQd/i;", "conversation", "invoke", "(Lqd/o;LQd/i;)Lqd/o;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ConversationDetailsViewModelImpl$7$1 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ String f37314Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationDetailsViewModelImpl$7$1(String str) {
        super(2);
        this.f37314Y = str;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C18686o setOnEach = (C18686o) obj;
        C6636i c6636i = (C6636i) obj2;
        AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
        return C18686o.m20040e(setOnEach, c6636i != null ? c6636i.f21379a : setOnEach.f59487a, null, null, null, null, false, new C18687p(c6636i != null ? c6636i.f21381c : null, setOnEach.f59493g, this.f37314Y), false, 382);
    }
}
