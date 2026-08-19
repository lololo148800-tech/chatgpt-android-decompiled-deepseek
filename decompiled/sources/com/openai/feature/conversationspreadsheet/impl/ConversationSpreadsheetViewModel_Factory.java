package com.openai.feature.conversationspreadsheet.impl;

import androidx.lifecycle.C11082S;
import com.openai.feature.rootviewmodel.RootViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p404Qe.C6675k;
import p876lm.InterfaceC17068a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/conversationspreadsheet/impl/ConversationSpreadsheetViewModel_Factory;", "LJk/d;", "Lcom/openai/feature/conversationspreadsheet/impl/ConversationSpreadsheetViewModel;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ConversationSpreadsheetViewModel_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: d */
    public static final Companion f38113d = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final C4474e f38114a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f38115b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f38116c;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/conversationspreadsheet/impl/ConversationSpreadsheetViewModel_Factory$Companion;", "", "<init>", "()V", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public ConversationSpreadsheetViewModel_Factory(C4474e c4474e, InterfaceC17068a rootEffectEmitter, InterfaceC17068a conversationSpreadsheetRepository) {
        AbstractC16544l.m18094g(rootEffectEmitter, "rootEffectEmitter");
        AbstractC16544l.m18094g(conversationSpreadsheetRepository, "conversationSpreadsheetRepository");
        this.f38114a = c4474e;
        this.f38115b = rootEffectEmitter;
        this.f38116c = conversationSpreadsheetRepository;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f38114a.f14617a;
        AbstractC16544l.m18093f(obj, "get(...)");
        Object obj2 = this.f38115b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        Object obj3 = this.f38116c.get();
        AbstractC16544l.m18093f(obj3, "get(...)");
        f38113d.getClass();
        return new ConversationSpreadsheetViewModel((C11082S) obj, (RootViewModel) obj2, (C6675k) obj3);
    }
}
