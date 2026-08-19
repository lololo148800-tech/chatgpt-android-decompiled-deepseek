package com.openai.feature.reporting.impl;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17686t;
import sg.C19540D;
import sg.C19578t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lsg/D;", "invoke", "(Lsg/D;)Lsg/D;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ReportingViewModelImpl$goBack$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public static final ReportingViewModelImpl$goBack$1 f39373Y = new ReportingViewModelImpl$goBack$1();

    public ReportingViewModelImpl$goBack$1() {
        super(1);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C19540D setState = (C19540D) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        List list = setState.f62072c;
        C19578t c19578t = (C19578t) AbstractC17680n.m19351a0(list);
        List listM19337M = AbstractC17680n.m19337M(1, list);
        Set setM19328G0 = AbstractC17680n.m19328G0(c19578t.f62176j);
        Map map = setState.f62074e;
        AbstractC16544l.m18094g(map, "<this>");
        LinkedHashMap linkedHashMapM19256r = AbstractC17659D.m19256r(map);
        AbstractC17686t.m19402z(setM19328G0, linkedHashMapM19256r.keySet());
        return C19540D.m20625e(setState, null, null, listM19337M, false, AbstractC17659D.m19247i(linkedHashMapM19256r), 11);
    }
}
