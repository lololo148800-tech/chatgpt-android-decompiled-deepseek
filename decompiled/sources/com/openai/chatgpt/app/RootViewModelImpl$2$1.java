package com.openai.chatgpt.app;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p1155zi.AbstractC21933K1;
import ug.AbstractC20236s;
import ug.C20231n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lug/s;", "invoke", "(Lug/s;)Lug/s;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class RootViewModelImpl$2$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ AbstractC21933K1 f37190Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RootViewModelImpl$2$1(AbstractC21933K1 abstractC21933K1) {
        super(1);
        this.f37190Y = abstractC21933K1;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        AbstractC20236s setState = (AbstractC20236s) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        return new C20231n(new Object(), this.f37190Y);
    }
}
