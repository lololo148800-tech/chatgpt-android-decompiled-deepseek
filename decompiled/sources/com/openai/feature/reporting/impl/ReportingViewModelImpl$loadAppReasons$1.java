package com.openai.feature.reporting.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import sg.C19540D;
import sg.C19581w;
import sg.EnumC19541E;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lsg/D;", "invoke", "(Lsg/D;)Lsg/D;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ReportingViewModelImpl$loadAppReasons$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C19581w f39374Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportingViewModelImpl$loadAppReasons$1(C19581w c19581w) {
        super(1);
        this.f39374Y = c19581w;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C19540D setState = (C19540D) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        return C19540D.m20625e(setState, EnumC19541E.f62080p0, this.f39374Y, null, false, null, 28);
    }
}
