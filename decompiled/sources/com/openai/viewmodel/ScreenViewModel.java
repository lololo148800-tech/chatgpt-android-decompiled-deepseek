package com.openai.viewmodel;

import androidx.lifecycle.ViewModel;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/viewmodel/ScreenViewModel;", "Landroidx/lifecycle/ViewModel;", "viewmodel_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public abstract class ScreenViewModel extends ViewModel {

    /* JADX INFO: renamed from: b */
    public final Map f40366b;

    public ScreenViewModel(Map map) {
        this.f40366b = map;
    }
}
