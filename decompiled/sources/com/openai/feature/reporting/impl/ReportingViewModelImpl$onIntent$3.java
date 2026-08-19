package com.openai.feature.reporting.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17309l;
import p049Bm.InterfaceC1436k;
import p909nm.AbstractC17659D;
import sg.C19540D;
import sg.C19557V;
import sg.InterfaceC19558W;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lsg/D;", "invoke", "(Lsg/D;)Lsg/D;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ReportingViewModelImpl$onIntent$3 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC19558W f39386Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportingViewModelImpl$onIntent$3(InterfaceC19558W interfaceC19558W) {
        super(1);
        this.f39386Y = interfaceC19558W;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C19540D setState = (C19540D) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        C19557V c19557v = (C19557V) this.f39386Y;
        return C19540D.m20625e(setState, null, null, null, false, AbstractC17659D.m19249k(setState.f62074e, new C17309l(c19557v.f62113a, c19557v.f62114b)), 15);
    }
}
