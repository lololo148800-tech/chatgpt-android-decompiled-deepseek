package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Landroidx/lifecycle/ViewModelStore;", "", "<init>", "()V", "lifecycle-viewmodel_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public class ViewModelStore {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f33445a = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final void m12146a() {
        LinkedHashMap linkedHashMap = this.f33445a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((ViewModel) it.next()).m12141c();
        }
        linkedHashMap.clear();
    }
}
