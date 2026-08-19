package p001A;

import android.hardware.camera2.TotalCaptureResult;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.sidesheet.SideSheetBehavior;
import io.sentry.instrumentation.file.C15379d;
import io.sentry.instrumentation.file.InterfaceC15376a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p030B2.AbstractC0738T;
import p056C2.InterfaceC1522p;
import p057C3.C1547Z;
import p1016t3.AbstractC19764N;
import p1016t3.C19797x;
import p1016t3.InterfaceC19759I;
import p1073w3.InterfaceC20806h;
import p301M.InterfaceC5219a;
import p571X9.AbstractC9306j0;
import p747fb.InterfaceFutureC13608b;

/* JADX INFO: renamed from: A.V */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0041V implements InterfaceC5219a, InterfaceC20806h, InterfaceC1522p, InterfaceC15376a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f201Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f202Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f203o0;

    public /* synthetic */ C0041V(Object obj, int i10, int i11) {
        this.f201Y = i11;
        this.f203o0 = obj;
        this.f202Z = i10;
    }

    @Override // p301M.InterfaceC5219a
    public InterfaceFutureC13608b apply(Object obj) {
        TotalCaptureResult totalCaptureResult = (TotalCaptureResult) obj;
        C0047Y c0047y = (C0047Y) this.f203o0;
        c0047y.getClass();
        if (C0063g0.m240g(this.f202Z, totalCaptureResult)) {
            c0047y.f227g = C0047Y.f220k;
        }
        return c0047y.f229i.mo170a(totalCaptureResult);
    }

    @Override // io.sentry.instrumentation.file.InterfaceC15376a
    public Object call() throws IOException {
        ((C15379d) this.f203o0).f47963Y.write(this.f202Z);
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    @Override // p056C2.InterfaceC1522p
    /* JADX INFO: renamed from: h */
    public boolean mo205h(View view) {
        SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f203o0;
        sideSheetBehavior.getClass();
        int i10 = this.f202Z;
        if (i10 == 1 || i10 == 2) {
            throw new IllegalArgumentException(AbstractC9306j0.m9891j(i10 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally.", new StringBuilder("STATE_")));
        }
        WeakReference weakReference = sideSheetBehavior.f36691o;
        if (weakReference == null || weakReference.get() == null) {
            sideSheetBehavior.m13648r(i10);
        } else {
            View view2 = (View) sideSheetBehavior.f36691o.get();
            RunnableC0080p runnableC0080p = new RunnableC0080p(sideSheetBehavior, i10, 3);
            ViewParent parent = view2.getParent();
            if (parent == null || !parent.isLayoutRequested()) {
                runnableC0080p.run();
            } else {
                WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                if (view2.isAttachedToWindow()) {
                    view2.post(runnableC0080p);
                } else {
                    runnableC0080p.run();
                }
            }
        }
        return true;
    }

    @Override // p1073w3.InterfaceC20806h
    public void invoke(Object obj) {
        InterfaceC19759I interfaceC19759I = (InterfaceC19759I) obj;
        switch (this.f201Y) {
            case 1:
                AbstractC19764N abstractC19764N = ((C1547Z) this.f203o0).f4250a;
                interfaceC19759I.mo2767o(this.f202Z);
                break;
            default:
                interfaceC19759I.mo2774v((C19797x) this.f203o0, this.f202Z);
                break;
        }
    }
}
