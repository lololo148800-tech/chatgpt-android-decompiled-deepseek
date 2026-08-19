package p544W9;

import android.view.View;
import io.sentry.AbstractC15152P0;
import io.sentry.InterfaceC15154Q;
import io.sentry.instrumentation.file.C15379d;
import io.sentry.util.AbstractC15500e;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import p658b5.C11238i;

/* JADX INFO: renamed from: W9.z3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8752z3 {
    /* JADX INFO: renamed from: c */
    public static C15379d m9508c(File file, FileOutputStream fileOutputStream, boolean z6) {
        return new C15379d(C15379d.m16632a(file, fileOutputStream, z6));
    }

    /* JADX INFO: renamed from: d */
    public static C15379d m9509d(FileOutputStream fileOutputStream, File file) {
        return new C15379d(C15379d.m16632a(file, fileOutputStream, false));
    }

    /* JADX INFO: renamed from: e */
    public static C15379d m9510e(FileOutputStream fileOutputStream, FileDescriptor fileDescriptor) {
        InterfaceC15154Q interfaceC15154QMo16256y = AbstractC15500e.f48420a ? AbstractC15152P0.m16331e().mo16256y() : AbstractC15152P0.m16331e().mo16243e();
        return new C15379d(new C11238i(null, interfaceC15154QMo16256y != null ? interfaceC15154QMo16256y.mo16285p("file.write") : null, fileOutputStream, AbstractC15152P0.m16331e().mo16246j()), fileDescriptor);
    }

    /* JADX INFO: renamed from: f */
    public static C15379d m9511f(FileOutputStream fileOutputStream, String str) {
        return new C15379d(C15379d.m16632a(str != null ? new File(str) : null, fileOutputStream, false));
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo3891a(View view, int i10);

    /* JADX INFO: renamed from: b */
    public abstract int mo3892b(View view, int i10);

    /* JADX INFO: renamed from: g */
    public int mo3893g(View view) {
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public int mo3894h() {
        return 0;
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo3895j(int i10);

    /* JADX INFO: renamed from: k */
    public abstract void mo3896k(View view, int i10, int i11);

    /* JADX INFO: renamed from: l */
    public abstract void mo3897l(View view, float f10, float f11);

    /* JADX INFO: renamed from: m */
    public abstract boolean mo3898m(View view, int i10);

    /* JADX INFO: renamed from: i */
    public void mo9512i(View view, int i10) {
    }
}
