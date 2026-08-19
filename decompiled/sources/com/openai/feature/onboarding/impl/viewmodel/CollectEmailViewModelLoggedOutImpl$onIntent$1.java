package com.openai.feature.onboarding.impl.viewmodel;

import android.util.Patterns;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import ng.C17611b;
import ng.C17613d;
import ng.InterfaceC17612c;
import p049Bm.InterfaceC1436k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lng/d;", "invoke", "(Lng/d;)Lng/d;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class CollectEmailViewModelLoggedOutImpl$onIntent$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC17612c f39067Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectEmailViewModelLoggedOutImpl$onIntent$1(InterfaceC17612c interfaceC17612c) {
        super(1);
        this.f39067Y = interfaceC17612c;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C17613d setState = (C17613d) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        String str = ((C17611b) this.f39067Y).f56368a;
        return C17613d.m19227e(setState, str, Patterns.EMAIL_ADDRESS.matcher(str).matches(), null, 4);
    }
}
