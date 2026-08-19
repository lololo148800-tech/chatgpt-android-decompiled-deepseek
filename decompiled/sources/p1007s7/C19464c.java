package p1007s7;

import android.gov.nist.core.Separators;
import java.io.File;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: s7.c */
/* JADX INFO: loaded from: classes.dex */
public final class C19464c {

    /* JADX INFO: renamed from: a */
    public final File f61766a;

    /* JADX INFO: renamed from: b */
    public final File f61767b;

    public C19464c(File file, File file2) {
        this.f61766a = file;
        this.f61767b = file2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19464c)) {
            return false;
        }
        C19464c c19464c = (C19464c) obj;
        return AbstractC16544l.m18089b(this.f61766a, c19464c.f61766a) && AbstractC16544l.m18089b(this.f61767b, c19464c.f61767b);
    }

    public final int hashCode() {
        int iHashCode = this.f61766a.hashCode() * 31;
        File file = this.f61767b;
        return iHashCode + (file == null ? 0 : file.hashCode());
    }

    public final String toString() {
        return "Batch(file=" + this.f61766a + ", metaFile=" + this.f61767b + Separators.RPAREN;
    }
}
