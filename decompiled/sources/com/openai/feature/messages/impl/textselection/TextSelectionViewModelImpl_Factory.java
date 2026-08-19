package com.openai.feature.messages.impl.textselection;

import androidx.lifecycle.C11082S;
import com.openai.feature.messages.impl.textselection.TextSelectionViewModelImpl.C124441;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1081wc.C20897p;
import p1081wc.InterfaceC20904w;
import p1155zi.C21984a1;
import p243Jf.C4336f;
import p248Jk.C4471b;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p318Mh.C5432w0;
import p787he.C14459O;
import p876lm.InterfaceC17068a;
import p909nm.C17690x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/messages/impl/textselection/TextSelectionViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/messages/impl/textselection/TextSelectionViewModelImpl;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class TextSelectionViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: d */
    public static final Companion f38987d = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final C4471b f38988a;

    /* JADX INFO: renamed from: b */
    public final C4474e f38989b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f38990c;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/messages/impl/textselection/TextSelectionViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public TextSelectionViewModelImpl_Factory(C4471b conversationCoordinator, InterfaceC17068a analyticsService, C4474e c4474e) {
        AbstractC16544l.m18094g(conversationCoordinator, "conversationCoordinator");
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        this.f38988a = conversationCoordinator;
        this.f38989b = c4474e;
        this.f38990c = analyticsService;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f38988a.get();
        AbstractC16544l.m18093f(obj, "get(...)");
        Object obj2 = this.f38989b.f14617a;
        AbstractC16544l.m18093f(obj2, "get(...)");
        Object obj3 = this.f38990c.get();
        AbstractC16544l.m18093f(obj3, "get(...)");
        f38987d.getClass();
        C5432w0.f17762g.getClass();
        TextSelectionViewModelImpl textSelectionViewModelImpl = new TextSelectionViewModelImpl(new C4336f(null, ((C21984a1) C5432w0.f17764i.m5892c((C11082S) obj2)).f69607Y));
        ((InterfaceC20904w) obj3).mo21447a(C20897p.f66608h, C17690x.f56481Y);
        textSelectionViewModelImpl.m14396l(textSelectionViewModelImpl.new C124441(), ((C14459O) obj).f45521t);
        return textSelectionViewModelImpl;
    }
}
