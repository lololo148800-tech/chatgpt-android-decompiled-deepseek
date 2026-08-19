package com.openai.chatgpt.app.p681di;

import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import com.openai.viewmodel.ViewModelFactory;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/chatgpt/app/di/MultibindingViewModelFactory;", "Lcom/openai/viewmodel/ViewModelFactory;", "app_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public abstract class MultibindingViewModelFactory implements ViewModelFactory {

    /* JADX INFO: renamed from: a */
    public final AbstractSavedStateViewModelFactory f37239a;

    public MultibindingViewModelFactory(AbstractSavedStateViewModelFactory abstractSavedStateViewModelFactory) {
        this.f37239a = abstractSavedStateViewModelFactory;
    }
}
