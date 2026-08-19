package com.openai.feature.messages.impl.listitem.content.reference.map;

import androidx.lifecycle.C11082S;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p042Bf.C1284z;
import p1155zi.C21984a1;
import p248Jk.C4471b;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p318Mh.C5411m;
import p787he.C14459O;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/messages/impl/listitem/content/reference/map/BusinessesMapViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/messages/impl/listitem/content/reference/map/BusinessesMapViewModelImpl;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class BusinessesMapViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: c */
    public static final Companion f38832c = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final C4474e f38833a;

    /* JADX INFO: renamed from: b */
    public final C4471b f38834b;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/messages/impl/listitem/content/reference/map/BusinessesMapViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public BusinessesMapViewModelImpl_Factory(C4474e c4474e, C4471b conversationCoordinator) {
        AbstractC16544l.m18094g(conversationCoordinator, "conversationCoordinator");
        this.f38833a = c4474e;
        this.f38834b = conversationCoordinator;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f38833a.f14617a;
        AbstractC16544l.m18093f(obj, "get(...)");
        Object obj2 = this.f38834b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        f38832c.getClass();
        BusinessesMapViewModelImpl businessesMapViewModelImpl = new BusinessesMapViewModelImpl(new C1284z(null));
        C5411m.f17686g.getClass();
        businessesMapViewModelImpl.m14396l(new BusinessesMapViewModelImpl.C124231(((C21984a1) C5411m.f17688i.m5892c((C11082S) obj)).f69607Y), ((C14459O) obj2).f45521t);
        return businessesMapViewModelImpl;
    }
}
