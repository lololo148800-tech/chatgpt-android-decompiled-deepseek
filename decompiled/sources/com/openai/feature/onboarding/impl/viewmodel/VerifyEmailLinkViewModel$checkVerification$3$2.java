package com.openai.feature.onboarding.impl.viewmodel;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p014Ac.C0425b;
import p049Bm.InterfaceC1436k;
import p623Zf.C10327w;
import p623Zf.C10330z;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LZf/z;", "state", "invoke", "(LZf/z;)LZf/z;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class VerifyEmailLinkViewModel$checkVerification$3$2 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C0425b f39300Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyEmailLinkViewModel$checkVerification$3$2(C0425b c0425b) {
        super(1);
        this.f39300Y = c0425b;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C10330z state = (C10330z) obj;
        AbstractC16544l.m18094g(state, "state");
        String str = this.f39300Y.f1399b;
        C10327w c10327w = state.f30661e;
        return C10330z.m10884a(state, str, null, null, null, c10327w != null ? C10327w.m10883a(c10327w, true, null, null, 2031) : null, 14);
    }
}
