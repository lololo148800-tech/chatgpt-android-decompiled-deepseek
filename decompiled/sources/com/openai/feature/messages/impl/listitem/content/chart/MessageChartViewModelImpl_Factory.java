package com.openai.feature.messages.impl.listitem.content.chart;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1081wc.InterfaceC20904w;
import p248Jk.InterfaceC4473d;
import p876lm.InterfaceC17068a;
import tf.C19909N;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/messages/impl/listitem/content/chart/MessageChartViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/messages/impl/listitem/content/chart/MessageChartViewModelImpl;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class MessageChartViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: c */
    public static final Companion f38827c = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final InterfaceC17068a f38828a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f38829b;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/messages/impl/listitem/content/chart/MessageChartViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public MessageChartViewModelImpl_Factory(InterfaceC17068a analytics, InterfaceC17068a imageSelectionObserver) {
        AbstractC16544l.m18094g(analytics, "analytics");
        AbstractC16544l.m18094g(imageSelectionObserver, "imageSelectionObserver");
        this.f38828a = analytics;
        this.f38829b = imageSelectionObserver;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f38828a.get();
        AbstractC16544l.m18093f(obj, "get(...)");
        Object obj2 = this.f38829b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        f38827c.getClass();
        return new MessageChartViewModelImpl((InterfaceC20904w) obj, (C19909N) obj2);
    }
}
