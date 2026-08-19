package com.openai.feature.settings.impl.language;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p383Pg.C6404a;
import p383Pg.C6405b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LPg/b;", "invoke", "(LPg/b;)LPg/b;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class AppLocaleViewModelImpl$onIntent$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ AppLocaleViewModelImpl f39615Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C6404a f39616Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLocaleViewModelImpl$onIntent$1(AppLocaleViewModelImpl appLocaleViewModelImpl, C6404a c6404a) {
        super(1);
        this.f39615Y = appLocaleViewModelImpl;
        this.f39616Z = c6404a;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C6405b setState = (C6405b) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        return AppLocaleViewModelKt.m14358a(this.f39615Y.f39613i, this.f39616Z.f20836a);
    }
}
