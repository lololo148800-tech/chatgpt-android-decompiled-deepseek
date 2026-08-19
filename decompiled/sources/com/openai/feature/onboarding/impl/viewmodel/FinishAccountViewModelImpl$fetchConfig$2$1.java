package com.openai.feature.onboarding.impl.viewmodel;

import java.util.Iterator;
import java.util.List;
import kg.C16404j;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p623Zf.C10327w;
import p872lg.C16946f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lkg/j;", "invoke", "(Lkg/j;)Lkg/j;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class FinishAccountViewModelImpl$fetchConfig$2$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C10327w f39127Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinishAccountViewModelImpl$fetchConfig$2$1(C10327w c10327w) {
        super(1);
        this.f39127Y = c10327w;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        String str;
        Object next;
        C16404j setState = (C16404j) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        C10327w c10327w = this.f39127Y;
        List list = c10327w.f30653i;
        Iterator it = list.iterator();
        do {
            boolean zHasNext = it.hasNext();
            str = c10327w.f30651g;
            if (!zHasNext) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC16544l.m18089b(((C16946f) next).f54394a, str));
        return C16404j.m18004e(setState, null, null, null, null, null, (C16946f) next, list, false, false, false, AbstractC16544l.m18089b(str, "KR"), c10327w.f30650f, 927);
    }
}
