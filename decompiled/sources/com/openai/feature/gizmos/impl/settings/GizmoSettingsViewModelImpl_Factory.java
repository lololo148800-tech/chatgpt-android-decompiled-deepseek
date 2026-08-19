package com.openai.feature.gizmos.impl.settings;

import androidx.lifecycle.C11082S;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p576Xe.C9473F;
import p599Yf.C10058c;
import p876lm.InterfaceC17068a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/gizmos/impl/settings/GizmoSettingsViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/gizmos/impl/settings/GizmoSettingsViewModelImpl;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class GizmoSettingsViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: d */
    public static final Companion f38181d = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final C4474e f38182a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f38183b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f38184c;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/gizmos/impl/settings/GizmoSettingsViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public GizmoSettingsViewModelImpl_Factory(C4474e c4474e, InterfaceC17068a gizmosRepository, InterfaceC17068a oauthApi) {
        AbstractC16544l.m18094g(gizmosRepository, "gizmosRepository");
        AbstractC16544l.m18094g(oauthApi, "oauthApi");
        this.f38182a = c4474e;
        this.f38183b = gizmosRepository;
        this.f38184c = oauthApi;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f38182a.f14617a;
        AbstractC16544l.m18093f(obj, "get(...)");
        Object obj2 = this.f38183b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        Object obj3 = this.f38184c.get();
        AbstractC16544l.m18093f(obj3, "get(...)");
        f38181d.getClass();
        return new GizmoSettingsViewModelImpl((C11082S) obj, (C9473F) obj2, (C10058c) obj3);
    }
}
