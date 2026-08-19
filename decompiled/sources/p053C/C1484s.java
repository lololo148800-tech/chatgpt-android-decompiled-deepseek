package p053C;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p001A.C0069j0;
import p277L.ExecutorC4836i;
import p817j$.util.DesugarCollections;
import p817j$.util.Objects;

/* JADX INFO: renamed from: C.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1484s implements InterfaceC1486u {

    /* JADX INFO: renamed from: a */
    public final SessionConfiguration f3901a;

    /* JADX INFO: renamed from: b */
    public final List f3902b;

    public C1484s(ArrayList arrayList, ExecutorC4836i executorC4836i, C0069j0 c0069j0) {
        SessionConfiguration sessionConfiguration = new SessionConfiguration(0, C1487v.m2131a(arrayList), executorC4836i, c0069j0);
        this.f3901a = sessionConfiguration;
        List<OutputConfiguration> outputConfigurations = sessionConfiguration.getOutputConfigurations();
        ArrayList arrayList2 = new ArrayList(outputConfigurations.size());
        for (OutputConfiguration outputConfiguration : outputConfigurations) {
            C1474i c1474i = null;
            if (outputConfiguration != null) {
                int i10 = Build.VERSION.SDK_INT;
                C1476k c1481p = i10 >= 33 ? new C1481p(outputConfiguration) : i10 >= 28 ? new C1480o(new C1479n(outputConfiguration)) : i10 >= 26 ? new C1478m(new C1477l(outputConfiguration)) : i10 >= 24 ? new C1476k(new C1475j(outputConfiguration)) : null;
                if (c1481p != null) {
                    c1474i = new C1474i(c1481p);
                }
            }
            arrayList2.add(c1474i);
        }
        this.f3902b = DesugarCollections.unmodifiableList(arrayList2);
    }

    @Override // p053C.InterfaceC1486u
    /* JADX INFO: renamed from: a */
    public final Object mo2123a() {
        return this.f3901a;
    }

    @Override // p053C.InterfaceC1486u
    /* JADX INFO: renamed from: b */
    public final void mo2124b(C1473h c1473h) {
        this.f3901a.setInputConfiguration(c1473h.f3882a.f3881a);
    }

    @Override // p053C.InterfaceC1486u
    /* JADX INFO: renamed from: c */
    public final C1473h mo2125c() {
        return C1473h.m2112a(this.f3901a.getInputConfiguration());
    }

    @Override // p053C.InterfaceC1486u
    /* JADX INFO: renamed from: d */
    public final Executor mo2126d() {
        return this.f3901a.getExecutor();
    }

    @Override // p053C.InterfaceC1486u
    /* JADX INFO: renamed from: e */
    public final int mo2127e() {
        return this.f3901a.getSessionType();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1484s) {
            return Objects.equals(this.f3901a, ((C1484s) obj).f3901a);
        }
        return false;
    }

    @Override // p053C.InterfaceC1486u
    /* JADX INFO: renamed from: f */
    public final CameraCaptureSession.StateCallback mo2128f() {
        return this.f3901a.getStateCallback();
    }

    @Override // p053C.InterfaceC1486u
    /* JADX INFO: renamed from: g */
    public final List mo2129g() {
        return this.f3902b;
    }

    @Override // p053C.InterfaceC1486u
    /* JADX INFO: renamed from: h */
    public final void mo2130h(CaptureRequest captureRequest) {
        this.f3901a.setSessionParameters(captureRequest);
    }

    public final int hashCode() {
        return this.f3901a.hashCode();
    }
}
