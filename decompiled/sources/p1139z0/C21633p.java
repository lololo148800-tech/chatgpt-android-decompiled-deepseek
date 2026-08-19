package p1139z0;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import p003A1.InterfaceC0161D1;
import p049Bm.InterfaceC1436k;
import p080D0.C1837w0;
import p1071w0.C20750g0;

/* JADX INFO: renamed from: z0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C21633p {

    /* JADX INFO: renamed from: a */
    public static final C21633p f68533a = new C21633p();

    /* JADX INFO: renamed from: a */
    public final void m21980a(C20750g0 c20750g0, C1837w0 c1837w0, HandwritingGesture handwritingGesture, InterfaceC0161D1 interfaceC0161D1, Executor executor, IntConsumer intConsumer, InterfaceC1436k interfaceC1436k) {
        int iM21918j = c20750g0 != null ? C21583F.f68341a.m21918j(c20750g0, handwritingGesture, c1837w0, interfaceC0161D1, interfaceC1436k) : 3;
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new RunnableC21631o(intConsumer, iM21918j, 0));
        } else {
            intConsumer.accept(iM21918j);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m21981b(C20750g0 c20750g0, C1837w0 c1837w0, PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (c20750g0 != null) {
            return C21583F.f68341a.m21916B(c20750g0, previewableHandwritingGesture, c1837w0, cancellationSignal);
        }
        return false;
    }
}
