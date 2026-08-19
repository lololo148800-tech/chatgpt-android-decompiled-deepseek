package p005A3;

import io.sentry.instrumentation.file.C15379d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import p1073w3.AbstractC20817s;
import p1142z3.C21743k;
import p544W9.AbstractC8752z3;

/* JADX INFO: renamed from: A3.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0317d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0315b f1087a;

    /* JADX INFO: renamed from: b */
    public final long f1088b;

    /* JADX INFO: renamed from: c */
    public final int f1089c;

    /* JADX INFO: renamed from: d */
    public C21743k f1090d;

    /* JADX INFO: renamed from: e */
    public long f1091e;

    /* JADX INFO: renamed from: f */
    public File f1092f;

    /* JADX INFO: renamed from: g */
    public OutputStream f1093g;

    /* JADX INFO: renamed from: h */
    public long f1094h;

    /* JADX INFO: renamed from: i */
    public long f1095i;

    /* JADX INFO: renamed from: j */
    public C0332s f1096j;

    public C0317d(InterfaceC0315b interfaceC0315b) {
        interfaceC0315b.getClass();
        this.f1087a = interfaceC0315b;
        this.f1088b = 5242880L;
        this.f1089c = 20480;
    }

    /* JADX INFO: renamed from: a */
    public final void m924a() {
        OutputStream outputStream = this.f1093g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            AbstractC20817s.m21406g(this.f1093g);
            this.f1093g = null;
            File file = this.f1092f;
            this.f1092f = null;
            this.f1087a.mo921g(file, this.f1094h);
        } catch (Throwable th2) {
            AbstractC20817s.m21406g(this.f1093g);
            this.f1093g = null;
            File file2 = this.f1092f;
            this.f1092f = null;
            file2.delete();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m925b(C21743k c21743k) {
        long j10 = c21743k.f68980g;
        long jMin = j10 != -1 ? Math.min(j10 - this.f1095i, this.f1091e) : -1L;
        int i10 = AbstractC20817s.f66106a;
        this.f1092f = this.f1087a.mo920f(c21743k.f68979f + this.f1095i, jMin, c21743k.f68981h);
        File file = this.f1092f;
        C15379d c15379dM9509d = AbstractC8752z3.m9509d(new FileOutputStream(file), file);
        int i11 = this.f1089c;
        if (i11 > 0) {
            C0332s c0332s = this.f1096j;
            if (c0332s == null) {
                this.f1096j = new C0332s(c15379dM9509d, i11);
            } else {
                c0332s.m969a(c15379dM9509d);
            }
            this.f1093g = this.f1096j;
        } else {
            this.f1093g = c15379dM9509d;
        }
        this.f1094h = 0L;
    }
}
