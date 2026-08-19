package com.openai.feature.settings.impl.instructions;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p350O1.C6045C;
import p363Og.C6213q;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LOg/q;", "invoke", "(LOg/q;)LOg/q;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class CustomInstructionsEditViewModelImpl$update$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C6045C f39578Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f39579Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomInstructionsEditViewModelImpl$update$1(C6045C c6045c, String str) {
        super(1);
        this.f39578Y = c6045c;
        this.f39579Z = str;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C6213q setState = (C6213q) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        return C6213q.m6731e(setState, null, C6045C.m6613b(this.f39578Y, this.f39579Z, 0L, 6), false, false, 27);
    }
}
