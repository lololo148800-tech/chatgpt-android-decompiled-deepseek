package com.openai.feature.gizmoshome.impl.details;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p706df.C13087g;
import p706df.C13104x;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Ldf/x;", "invoke", "(Ldf/x;)Ldf/x;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class SnorlaxHomeViewModelImpl$renameConversation$4$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ String f38374Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f38375Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnorlaxHomeViewModelImpl$renameConversation$4$1(String str, String str2) {
        super(1);
        this.f38374Y = str;
        this.f38375Z = str2;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C13104x setState = (C13104x) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        List<C13087g> list = setState.f41614b;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
        for (C13087g c13087g : list) {
            if (AbstractC16544l.m18089b(c13087g.f41579a, this.f38374Y)) {
                String conversationId = c13087g.f41579a;
                AbstractC16544l.m18094g(conversationId, "conversationId");
                String title = this.f38375Z;
                AbstractC16544l.m18094g(title, "title");
                c13087g = new C13087g(conversationId, title, c13087g.f41581c);
            }
            arrayList.add(c13087g);
        }
        return C13104x.m14805e(setState, null, arrayList, null, false, null, 125);
    }
}
