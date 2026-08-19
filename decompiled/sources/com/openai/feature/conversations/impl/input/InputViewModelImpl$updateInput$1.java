package com.openai.feature.conversations.impl.input;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p1025te.C19863N;
import p350O1.C6045C;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lte/N;", "invoke", "(Lte/N;)Lte/N;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class InputViewModelImpl$updateInput$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C6045C f37985Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputViewModelImpl$updateInput$1(C6045C c6045c) {
        super(1);
        this.f37985Y = c6045c;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C19863N update = (C19863N) obj;
        AbstractC16544l.m18094g(update, "$this$update");
        return C19863N.m20780a(update, this.f37985Y, false, null, null, false, null, null, null, 254);
    }
}
