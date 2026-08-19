package com.openai.feature.onboarding.impl.viewmodel;

import kg.C16410p;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p014Ac.C0425b;
import p049Bm.InterfaceC1436k;
import p1155zi.C21921H1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lkg/p;", "invoke", "(Lkg/p;)Lkg/p;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class VerifyEmailLinkViewModel$checkVerification$3$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C0425b f39299Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyEmailLinkViewModel$checkVerification$3$1(C0425b c0425b) {
        super(1);
        this.f39299Y = c0425b;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C16410p setState = (C16410p) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        C17296C c17296c = C17296C.f55119a;
        String str = this.f39299Y.f1399b;
        if (str == null) {
            str = setState.f50934a;
        }
        return C16410p.m18006e(setState, str, null, new C21921H1(c17296c), 6);
    }
}
