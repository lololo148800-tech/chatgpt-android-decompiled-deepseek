package com.openai.feature.gizmoshome.impl.edit;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p751ff.C13634e;
import p751ff.C13641l;
import p751ff.InterfaceC13636g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lff/l;", "invoke", "(Lff/l;)Lff/l;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class SnorlaxEditViewModelImpl$onIntent$3 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC13636g f38397Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnorlaxEditViewModelImpl$onIntent$3(InterfaceC13636g interfaceC13636g) {
        super(1);
        this.f38397Y = interfaceC13636g;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C13641l setState = (C13641l) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        return C13641l.m15153e(setState, null, null, ((C13634e) this.f38397Y).f43078a, false, 23);
    }
}
