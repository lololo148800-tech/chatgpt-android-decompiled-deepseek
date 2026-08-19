package p827j7;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: j7.c */
/* JADX INFO: loaded from: classes.dex */
public final class C16175c {

    /* JADX INFO: renamed from: a */
    public final String f50212a;

    /* JADX INFO: renamed from: b */
    public final String f50213b;

    /* JADX INFO: renamed from: c */
    public final String f50214c;

    /* JADX INFO: renamed from: d */
    public final boolean f50215d;

    public C16175c(String str, String str2, boolean z6, String stack) {
        AbstractC16544l.m18094g(stack, "stack");
        this.f50212a = str;
        this.f50213b = str2;
        this.f50214c = stack;
        this.f50215d = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16175c)) {
            return false;
        }
        C16175c c16175c = (C16175c) obj;
        return AbstractC16544l.m18089b(this.f50212a, c16175c.f50212a) && AbstractC16544l.m18089b(this.f50213b, c16175c.f50213b) && AbstractC16544l.m18089b(this.f50214c, c16175c.f50214c) && this.f50215d == c16175c.f50215d;
    }

    public final int hashCode() {
        return AbstractC0168G.m527p(AbstractC0168G.m527p(this.f50212a.hashCode() * 31, 31, this.f50213b), 31, this.f50214c) + (this.f50215d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ThreadDump(name=");
        sb2.append(this.f50212a);
        sb2.append(", state=");
        sb2.append(this.f50213b);
        sb2.append(", stack=");
        sb2.append(this.f50214c);
        sb2.append(", crashed=");
        return AbstractC14376f.m15823B(sb2, this.f50215d, Separators.RPAREN);
    }
}
