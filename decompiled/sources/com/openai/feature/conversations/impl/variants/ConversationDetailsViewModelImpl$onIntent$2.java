package com.openai.feature.conversations.impl.variants;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p964qe.C18691d;
import p964qe.C18698k;
import p964qe.InterfaceC18692e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lqe/k;", "invoke", "(Lqe/k;)Lqe/k;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ConversationDetailsViewModelImpl$onIntent$2 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC18692e f38023Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationDetailsViewModelImpl$onIntent$2(InterfaceC18692e interfaceC18692e) {
        super(1);
        this.f38023Y = interfaceC18692e;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C18698k setState = (C18698k) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        List list = setState.f59523d;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
        int i10 = 0;
        for (Object obj2 : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC17681o.m19388q();
                throw null;
            }
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            if (i10 == ((C18691d) this.f38023Y).f59507a) {
                zBooleanValue = true;
            }
            arrayList.add(Boolean.valueOf(zBooleanValue));
            i10 = i11;
        }
        return C18698k.m20041e(setState, false, false, null, arrayList, 7);
    }
}
