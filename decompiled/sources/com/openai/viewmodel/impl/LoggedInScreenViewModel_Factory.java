package com.openai.viewmodel.impl;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p248Jk.C4477h;
import p248Jk.InterfaceC4473d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/viewmodel/impl/LoggedInScreenViewModel_Factory;", "LJk/d;", "Lcom/openai/viewmodel/impl/LoggedInScreenViewModel;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class LoggedInScreenViewModel_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: b */
    public static final Companion f40368b = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final C4477h f40369a;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/viewmodel/impl/LoggedInScreenViewModel_Factory$Companion;", "", "<init>", "()V", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public LoggedInScreenViewModel_Factory(C4477h c4477h) {
        this.f40369a = c4477h;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Map map = this.f40369a.f14612a;
        AbstractC16544l.m18093f(map, "get(...)");
        f40368b.getClass();
        return new LoggedInScreenViewModel(map);
    }
}
