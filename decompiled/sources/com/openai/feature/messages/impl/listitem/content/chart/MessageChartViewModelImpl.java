package com.openai.feature.messages.impl.listitem.content.chart;

import androidx.lifecycle.ViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17309l;
import p098Di.C2058g;
import p098Di.InterfaceC2053b;
import p1081wc.C20886e;
import p1081wc.InterfaceC20904w;
import p1152zf.C21882d;
import p1152zf.C21883e;
import p318Mh.C5381U;
import p479Td.C7352g;
import p571X9.AbstractC9315k3;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p926of.C18173j;
import tf.C19909N;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9315k3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/messages/impl/listitem/content/chart/MessageChartViewModelImpl;", "Lcom/openai/feature/messages/impl/listitem/content/chart/MessageChartViewModel;", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class MessageChartViewModelImpl extends MessageChartViewModel {

    /* JADX INFO: renamed from: i */
    public final InterfaceC20904w f38825i;

    /* JADX INFO: renamed from: j */
    public final C19909N f38826j;

    public MessageChartViewModelImpl(InterfaceC20904w interfaceC20904w, C19909N c19909n) {
        super(new C21883e());
        this.f38825i = interfaceC20904w;
        this.f38826j = c19909n;
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        String str;
        C21882d intent = (C21882d) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent instanceof C21882d) {
            C20886e c20886e = C20886e.f66516d;
            List list = intent.f69383c;
            int i10 = intent.f69384d;
            C7352g c7352g = (C7352g) AbstractC17680n.m19344T(i10, list);
            if (c7352g == null || (str = c7352g.f23312a) == null) {
                str = "unknown";
            }
            this.f38825i.mo21447a(c20886e, AbstractC17659D.m19244f(new C17309l("type", str), new C17309l("index", String.valueOf(i10))));
            List list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new C18173j(((C7352g) it.next()).f23314c, intent.f69382b));
            }
            C19909N.m20798a(this.f38826j, arrayList, intent.f69384d, false, false, false, 20);
            m14393h(new C2058g(C5381U.f17633g.m5899d(intent.f69381a), true));
        }
    }
}
