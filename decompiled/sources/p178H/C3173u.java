package p178H;

import java.util.ArrayList;
import java.util.List;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: H.u */
/* JADX INFO: loaded from: classes.dex */
public final class C3173u {

    /* JADX INFO: renamed from: a */
    public final List f9559a;

    public C3173u(List list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
        }
        this.f9559a = DesugarCollections.unmodifiableList(new ArrayList(list));
    }
}
