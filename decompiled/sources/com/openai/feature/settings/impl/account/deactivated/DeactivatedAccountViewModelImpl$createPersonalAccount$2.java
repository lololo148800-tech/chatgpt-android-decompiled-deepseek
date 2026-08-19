package com.openai.feature.settings.impl.account.deactivated;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p020Ai.C0515d;
import p049Bm.InterfaceC1436k;
import p219Ig.C3715d;
import p219Ig.InterfaceC3718g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LIg/g;", "invoke", "(LIg/g;)LIg/g;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class DeactivatedAccountViewModelImpl$createPersonalAccount$2 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C0515d f39482Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeactivatedAccountViewModelImpl$createPersonalAccount$2(C0515d c0515d) {
        super(1);
        this.f39482Y = c0515d;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        InterfaceC3718g setState = (InterfaceC3718g) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        return new C3715d(this.f39482Y);
    }
}
