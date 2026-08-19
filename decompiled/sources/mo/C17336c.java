package mo;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: mo.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C17336c {

    /* JADX INFO: renamed from: n */
    public static final C17336c f55214n = new C17336c(true, false, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* JADX INFO: renamed from: o */
    public static final C17336c f55215o;

    /* JADX INFO: renamed from: a */
    public final boolean f55216a;

    /* JADX INFO: renamed from: b */
    public final boolean f55217b;

    /* JADX INFO: renamed from: c */
    public final int f55218c;

    /* JADX INFO: renamed from: d */
    public final int f55219d;

    /* JADX INFO: renamed from: e */
    public final boolean f55220e;

    /* JADX INFO: renamed from: f */
    public final boolean f55221f;

    /* JADX INFO: renamed from: g */
    public final boolean f55222g;

    /* JADX INFO: renamed from: h */
    public final int f55223h;

    /* JADX INFO: renamed from: i */
    public final int f55224i;

    /* JADX INFO: renamed from: j */
    public final boolean f55225j;

    /* JADX INFO: renamed from: k */
    public final boolean f55226k;

    /* JADX INFO: renamed from: l */
    public final boolean f55227l;

    /* JADX INFO: renamed from: m */
    public String f55228m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        AbstractC16544l.m18094g(timeUnit, "timeUnit");
        long seconds = timeUnit.toSeconds(Integer.MAX_VALUE);
        f55215o = new C17336c(false, false, -1, -1, false, false, false, seconds <= 2147483647L ? (int) seconds : Integer.MAX_VALUE, -1, true, false, false, null);
    }

    public C17336c(boolean z6, boolean z10, int i10, int i11, boolean z11, boolean z12, boolean z13, int i12, int i13, boolean z14, boolean z15, boolean z16, String str) {
        this.f55216a = z6;
        this.f55217b = z10;
        this.f55218c = i10;
        this.f55219d = i11;
        this.f55220e = z11;
        this.f55221f = z12;
        this.f55222g = z13;
        this.f55223h = i12;
        this.f55224i = i13;
        this.f55225j = z14;
        this.f55226k = z15;
        this.f55227l = z16;
        this.f55228m = str;
    }

    public final String toString() {
        String str = this.f55228m;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f55216a) {
            sb2.append("no-cache, ");
        }
        if (this.f55217b) {
            sb2.append("no-store, ");
        }
        int i10 = this.f55218c;
        if (i10 != -1) {
            sb2.append("max-age=");
            sb2.append(i10);
            sb2.append(", ");
        }
        int i11 = this.f55219d;
        if (i11 != -1) {
            sb2.append("s-maxage=");
            sb2.append(i11);
            sb2.append(", ");
        }
        if (this.f55220e) {
            sb2.append("private, ");
        }
        if (this.f55221f) {
            sb2.append("public, ");
        }
        if (this.f55222g) {
            sb2.append("must-revalidate, ");
        }
        int i12 = this.f55223h;
        if (i12 != -1) {
            sb2.append("max-stale=");
            sb2.append(i12);
            sb2.append(", ");
        }
        int i13 = this.f55224i;
        if (i13 != -1) {
            sb2.append("min-fresh=");
            sb2.append(i13);
            sb2.append(", ");
        }
        if (this.f55225j) {
            sb2.append("only-if-cached, ");
        }
        if (this.f55226k) {
            sb2.append("no-transform, ");
        }
        if (this.f55227l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "StringBuilder().apply(builderAction).toString()");
        this.f55228m = string;
        return string;
    }
}
