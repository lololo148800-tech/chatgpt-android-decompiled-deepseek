package p646aj;

import android.content.SharedPreferences;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p031B3.C0805i;
import p049Bm.InterfaceC1426a;
import p1112xm.AbstractC21304h;
import p1113xn.C21307a;
import p167Gb.C3032c;
import p275Kn.AbstractC4823j;
import p275Kn.C4822i;
import p544W9.AbstractC8752z3;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9306j0;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: aj.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C10627g {
    public static final C10625e Companion = new C10625e();

    /* JADX INFO: renamed from: a */
    public final File f31532a;

    /* JADX INFO: renamed from: b */
    public final String f31533b;

    /* JADX INFO: renamed from: c */
    public final C3032c f31534c;

    /* JADX INFO: renamed from: d */
    public final String f31535d;

    /* JADX INFO: renamed from: e */
    public FileOutputStream f31536e;

    /* JADX INFO: renamed from: f */
    public File f31537f;

    /* JADX INFO: renamed from: g */
    public final C4822i f31538g;

    public C10627g(File file, String writeKey, C3032c c3032c, String str) throws IOException {
        String strConcat;
        AbstractC16544l.m18094g(writeKey, "writeKey");
        this.f31532a = file;
        this.f31533b = writeKey;
        this.f31534c = c3032c;
        if (!file.exists() && !file.mkdirs() && !file.isDirectory()) {
            throw new IOException("Could not create directory at " + file);
        }
        Runtime.getRuntime().addShutdownHook(new C0805i(this, 4));
        if (str == null) {
            strConcat = "segment.events.file.index.".concat(writeKey);
        } else {
            strConcat = "segment.events.file.index." + writeKey + '.' + str;
        }
        this.f31535d = strConcat;
        int i10 = AbstractC4823j.f15708a;
        this.f31538g = new C4822i(1, 0);
    }

    /* JADX INFO: renamed from: a */
    public static final void m10995a(C10627g c10627g) {
        File fileM10996b = c10627g.m10996b();
        if (fileM10996b.exists()) {
            StringBuilder sb2 = new StringBuilder("],\"sentAt\":\"");
            AbstractC10630j.Companion.getClass();
            sb2.append(C10629i.m11003a());
            sb2.append("\",\"writeKey\":\"");
            byte[] bytes = AbstractC9306j0.m9891j(c10627g.f31533b, "\"}", sb2).getBytes(C21307a.f67720a);
            AbstractC16544l.m18093f(bytes, "this as java.lang.String).getBytes(charset)");
            c10627g.m10998d(bytes, fileM10996b);
            fileM10996b.renameTo(new File(c10627g.f31532a, AbstractC21304h.m21643f(fileM10996b)));
            FileOutputStream fileOutputStream = c10627g.f31536e;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            C3032c c3032c = c10627g.f31534c;
            String key = c10627g.f31535d;
            int iM3919i = c3032c.m3919i(key) + 1;
            c3032c.getClass();
            AbstractC16544l.m18094g(key, "key");
            ((SharedPreferences) c3032c.f9127Z).edit().putInt(key, iM3919i).commit();
            c10627g.f31536e = null;
            c10627g.f31537f = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final File m10996b() {
        File file = this.f31537f;
        if (file == null) {
            file = new File(this.f31532a, this.f31533b + '-' + this.f31534c.m3919i(this.f31535d) + ".tmp");
        }
        this.f31537f = file;
        return file;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m10997c(InterfaceC1426a interfaceC1426a, AbstractC19687c abstractC19687c) {
        C10626f c10626f;
        C10627g c10627g;
        if (abstractC19687c instanceof C10626f) {
            c10626f = (C10626f) abstractC19687c;
            int i10 = c10626f.f31531q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c10626f.f31531q0 = i10 - Integer.MIN_VALUE;
            } else {
                c10626f = new C10626f(this, abstractC19687c);
            }
        } else {
            c10626f = new C10626f(this, abstractC19687c);
        }
        Object obj = c10626f.f31529o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c10626f.f31531q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            c10626f.f31527Y = this;
            c10626f.f31528Z = interfaceC1426a;
            c10626f.f31531q0 = 1;
            if (this.f31538g.m5452a(c10626f) == enumC19250a) {
                return enumC19250a;
            }
            c10627g = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC1426a = c10626f.f31528Z;
            c10627g = c10626f.f31527Y;
            AbstractC9233X.m9807c(obj);
        }
        interfaceC1426a.invoke();
        c10627g.f31538g.m5454c();
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: d */
    public final void m10998d(byte[] bArr, File file) throws IOException {
        FileOutputStream fileOutputStreamM9508c = this.f31536e;
        if (fileOutputStreamM9508c == null) {
            fileOutputStreamM9508c = AbstractC8752z3.m9508c(file, new FileOutputStream(file, true), true);
        }
        this.f31536e = fileOutputStreamM9508c;
        fileOutputStreamM9508c.write(bArr);
        fileOutputStreamM9508c.flush();
    }
}
