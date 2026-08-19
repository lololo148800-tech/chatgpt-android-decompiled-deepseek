package androidx.lifecycle.viewmodel.internal;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p867l8.C16831c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Landroidx/lifecycle/viewmodel/internal/ViewModelImpl;", "", "<init>", "()V", "lifecycle-viewmodel_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ViewModelImpl {

    /* JADX INFO: renamed from: a */
    public final C16831c f33496a = new C16831c();

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f33497b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet f33498c = new LinkedHashSet();

    /* JADX INFO: renamed from: d */
    public volatile boolean f33499d;

    /* JADX INFO: renamed from: a */
    public static void m12167a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }
}
