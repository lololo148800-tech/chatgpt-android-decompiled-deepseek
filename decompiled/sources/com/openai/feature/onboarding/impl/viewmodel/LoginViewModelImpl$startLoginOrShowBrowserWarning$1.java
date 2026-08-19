package com.openai.feature.onboarding.impl.viewmodel;

import ec.AbstractC13361c;
import ga.C13834b;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p623Zf.C10310f;
import p623Zf.C10324t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LZf/t;", "invoke", "(LZf/t;)LZf/t;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class LoginViewModelImpl$startLoginOrShowBrowserWarning$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ AbstractC13361c f39197Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13834b f39198Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginViewModelImpl$startLoginOrShowBrowserWarning$1(AbstractC13361c abstractC13361c, C13834b c13834b) {
        super(1);
        this.f39197Y = abstractC13361c;
        this.f39198Z = c13834b;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C10324t setState = (C10324t) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        return C10324t.m10881e(setState, false, false, new C10310f(this.f39197Y, this.f39198Z), 19);
    }
}
