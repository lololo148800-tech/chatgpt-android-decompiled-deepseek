package p053C;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p001A.C0069j0;
import p277L.ExecutorC4836i;
import p817j$.util.DesugarCollections;
import p817j$.util.Objects;

/* JADX INFO: renamed from: C.t */
/* JADX INFO: loaded from: classes.dex */
public final class C1485t implements InterfaceC1486u {

    /* JADX INFO: renamed from: a */
    public final List f3903a;

    /* JADX INFO: renamed from: b */
    public final C0069j0 f3904b;

    /* JADX INFO: renamed from: c */
    public final ExecutorC4836i f3905c;

    /* JADX INFO: renamed from: d */
    public C1473h f3906d = null;

    public C1485t(ArrayList arrayList, ExecutorC4836i executorC4836i, C0069j0 c0069j0) {
        this.f3903a = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        this.f3904b = c0069j0;
        this.f3905c = executorC4836i;
    }

    @Override // p053C.InterfaceC1486u
    /* JADX INFO: renamed from: a */
    public final Object mo2123a() {
        return null;
    }

    @Override // p053C.InterfaceC1486u
    /* JADX INFO: renamed from: b */
    public final void mo2124b(C1473h c1473h) {
        this.f3906d = c1473h;
    }

    @Override // p053C.InterfaceC1486u
    /* JADX INFO: renamed from: c */
    public final C1473h mo2125c() {
        return this.f3906d;
    }

    @Override // p053C.InterfaceC1486u
    /* JADX INFO: renamed from: d */
    public final Executor mo2126d() {
        return this.f3905c;
    }

    @Override // p053C.InterfaceC1486u
    /* JADX INFO: renamed from: e */
    public final int mo2127e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1485t) {
            C1485t c1485t = (C1485t) obj;
            if (Objects.equals(this.f3906d, c1485t.f3906d)) {
                List list = this.f3903a;
                int size = list.size();
                List list2 = c1485t.f3903a;
                if (size == list2.size()) {
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!((C1474i) list.get(i10)).equals(list2.get(i10))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p053C.InterfaceC1486u
    /* JADX INFO: renamed from: f */
    public final CameraCaptureSession.StateCallback mo2128f() {
        return this.f3904b;
    }

    @Override // p053C.InterfaceC1486u
    /* JADX INFO: renamed from: g */
    public final List mo2129g() {
        return this.f3903a;
    }

    public final int hashCode() {
        int iHashCode = this.f3903a.hashCode() ^ 31;
        int i10 = (iHashCode << 5) - iHashCode;
        C1473h c1473h = this.f3906d;
        int iHashCode2 = (c1473h == null ? 0 : c1473h.f3882a.f3881a.hashCode()) ^ i10;
        return (iHashCode2 << 5) - iHashCode2;
    }

    @Override // p053C.InterfaceC1486u
    /* JADX INFO: renamed from: h */
    public final void mo2130h(CaptureRequest captureRequest) {
    }
}
