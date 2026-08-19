package p722e8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p523V9.AbstractC8119j5;
import p677c8.C11691c;

/* JADX INFO: renamed from: e8.x */
/* JADX INFO: loaded from: classes.dex */
public final class C13340x extends AbstractC8119j5 {

    /* JADX INFO: renamed from: b */
    public final String f42315b;

    /* JADX INFO: renamed from: c */
    public final String f42316c;

    /* JADX INFO: renamed from: d */
    public final C11691c f42317d;

    public C13340x(String str, String str2) {
        C11691c c11691c = new C11691c();
        this.f42315b = str;
        this.f42316c = str2;
        this.f42317d = c11691c;
    }

    @Override // p523V9.AbstractC8119j5
    /* JADX INFO: renamed from: a */
    public final C11691c mo8622a() {
        return this.f42317d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13340x)) {
            return false;
        }
        C13340x c13340x = (C13340x) obj;
        return AbstractC16544l.m18089b(this.f42315b, c13340x.f42315b) && AbstractC16544l.m18089b(this.f42316c, c13340x.f42316c) && AbstractC16544l.m18089b(this.f42317d, c13340x.f42317d);
    }

    public final int hashCode() {
        return this.f42317d.hashCode() + AbstractC0168G.m527p(this.f42315b.hashCode() * 31, 31, this.f42316c);
    }

    public final String toString() {
        return "SetSyntheticsTestAttribute(testId=" + this.f42315b + ", resultId=" + this.f42316c + ", eventTime=" + this.f42317d + Separators.RPAREN;
    }
}
