package com.openai.feature.conversations.impl.variants;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p403Qd.C6657s0;
import p909nm.AbstractC17682p;
import p964qe.C18698k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lqe/k;", "invoke", "(Lqe/k;)Lqe/k;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ConversationDetailsViewModelImpl$handleConversationUpdate$2 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C6657s0 f38018Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ ArrayList f38019Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationDetailsViewModelImpl$handleConversationUpdate$2(C6657s0 c6657s0, ArrayList arrayList) {
        super(1);
        this.f38018Y = c6657s0;
        this.f38019Z = arrayList;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C18698k setState = (C18698k) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        boolean z6 = this.f38018Y.f21425d;
        ArrayList<List> arrayList = this.f38019Z;
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
        for (List list : arrayList) {
            arrayList2.add(Boolean.FALSE);
        }
        return C18698k.m20041e(setState, false, z6, arrayList, arrayList2, 1);
    }
}
