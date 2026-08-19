package p1139z0;

import android.os.Build;
import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import p003A1.InterfaceC0161D1;
import p999s.C19341c1;

/* JADX INFO: renamed from: z0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C21635q {

    /* JADX INFO: renamed from: a */
    public static final C21635q f68538a = new C21635q();

    /* JADX INFO: renamed from: a */
    public final void m21982a(InterfaceC21654z0 interfaceC21654z0, HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        int iM21919k;
        C19341c1 c19341c1 = (C19341c1) interfaceC21654z0;
        if (Build.VERSION.SDK_INT >= 34) {
            iM21919k = C21583F.f68341a.m21919k((C21582E0) c19341c1.f61254Y, handwritingGesture, (C21574A0) c19341c1.f61259r0, (InterfaceC0161D1) c19341c1.f61260s0);
        } else {
            c19341c1.getClass();
            iM21919k = 2;
        }
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new RunnableC21631o(intConsumer, iM21919k, 1));
        } else {
            intConsumer.accept(iM21919k);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m21983b(InterfaceC21654z0 interfaceC21654z0, PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        C19341c1 c19341c1 = (C19341c1) interfaceC21654z0;
        if (Build.VERSION.SDK_INT >= 34) {
            return C21583F.f68341a.m21917C((C21582E0) c19341c1.f61254Y, previewableHandwritingGesture, (C21574A0) c19341c1.f61259r0, cancellationSignal);
        }
        c19341c1.getClass();
        return false;
    }
}
