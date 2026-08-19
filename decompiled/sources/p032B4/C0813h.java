package p032B4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import p544W9.AbstractC8746y3;
import p544W9.AbstractC8752z3;
import p817j$.util.Objects;

/* JADX INFO: renamed from: B4.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0813h {

    /* JADX INFO: renamed from: a */
    public final int f2266a;

    /* JADX INFO: renamed from: b */
    public final int f2267b;

    /* JADX INFO: renamed from: c */
    public final long f2268c;

    /* JADX INFO: renamed from: d */
    public final long f2269d;

    public C0813h(int i10, int i11, long j10, long j11) {
        this.f2266a = i10;
        this.f2267b = i11;
        this.f2268c = j10;
        this.f2269d = j11;
    }

    /* JADX INFO: renamed from: a */
    public static C0813h m1871a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(AbstractC8746y3.m9492c(file, new FileInputStream(file)));
        try {
            C0813h c0813h = new C0813h(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c0813h;
        } catch (Throwable th2) {
            try {
                dataInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1872b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(AbstractC8752z3.m9509d(new FileOutputStream(file), file));
        try {
            dataOutputStream.writeInt(this.f2266a);
            dataOutputStream.writeInt(this.f2267b);
            dataOutputStream.writeLong(this.f2268c);
            dataOutputStream.writeLong(this.f2269d);
            dataOutputStream.close();
        } catch (Throwable th2) {
            try {
                dataOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0813h)) {
            return false;
        }
        C0813h c0813h = (C0813h) obj;
        return this.f2267b == c0813h.f2267b && this.f2268c == c0813h.f2268c && this.f2266a == c0813h.f2266a && this.f2269d == c0813h.f2269d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f2267b), Long.valueOf(this.f2268c), Integer.valueOf(this.f2266a), Long.valueOf(this.f2269d));
    }
}
