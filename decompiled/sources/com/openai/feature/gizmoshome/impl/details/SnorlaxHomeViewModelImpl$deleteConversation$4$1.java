package com.openai.feature.gizmoshome.impl.details;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p706df.C13087g;
import p706df.C13104x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Ldf/x;", "invoke", "(Ldf/x;)Ldf/x;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class SnorlaxHomeViewModelImpl$deleteConversation$4$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ String f38334Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnorlaxHomeViewModelImpl$deleteConversation$4$1(String str) {
        super(1);
        this.f38334Y = str;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C13104x setState = (C13104x) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        List list = setState.f41614b;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!AbstractC16544l.m18089b(((C13087g) obj2).f41579a, this.f38334Y)) {
                arrayList.add(obj2);
            }
        }
        return C13104x.m14805e(setState, null, arrayList, null, false, null, 125);
    }
}
