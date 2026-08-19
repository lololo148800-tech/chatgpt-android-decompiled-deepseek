package com.openai.feature.subscriptions.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p624Zg.C10337G;
import p624Zg.C10378l;
import p624Zg.C10390v;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LZg/l;", "invoke", "(LZg/l;)LZg/l;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ChoosePlanViewModelImpl$setPurchasing$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ String f39887Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f39888Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChoosePlanViewModelImpl$setPurchasing$1(String str, boolean z6) {
        super(1);
        this.f39887Y = str;
        this.f39888Z = z6;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C10378l setState = (C10378l) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        List<C10390v> list = setState.f30750a;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
        for (C10390v c10390v : list) {
            if (c10390v.f30791a.f30669a.equals(this.f39887Y)) {
                C10337G c10337g = c10390v.f30791a;
                String title = c10390v.f30794d;
                AbstractC16544l.m18094g(title, "title");
                String subtitle = c10390v.f30795e;
                AbstractC16544l.m18094g(subtitle, "subtitle");
                String purchaseCtaText = c10390v.f30796f;
                AbstractC16544l.m18094g(purchaseCtaText, "purchaseCtaText");
                c10390v = new C10390v(c10337g, c10390v.f30792b, this.f39888Z, title, subtitle, purchaseCtaText, c10390v.f30797g, c10390v.f30798h);
            }
            arrayList.add(c10390v);
        }
        return C10378l.m10892e(setState, arrayList, null, 2);
    }
}
