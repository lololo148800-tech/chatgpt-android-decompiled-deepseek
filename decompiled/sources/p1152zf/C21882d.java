package p1152zf;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p098Di.InterfaceC2053b;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: zf.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C21882d implements InterfaceC2053b {

    /* JADX INFO: renamed from: a */
    public final String f69381a;

    /* JADX INFO: renamed from: b */
    public final String f69382b;

    /* JADX INFO: renamed from: c */
    public final List f69383c;

    /* JADX INFO: renamed from: d */
    public final int f69384d;

    public C21882d(int i10, String conversationId, String messageId, List charts) {
        AbstractC16544l.m18094g(conversationId, "conversationId");
        AbstractC16544l.m18094g(messageId, "messageId");
        AbstractC16544l.m18094g(charts, "charts");
        this.f69381a = conversationId;
        this.f69382b = messageId;
        this.f69383c = charts;
        this.f69384d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21882d)) {
            return false;
        }
        C21882d c21882d = (C21882d) obj;
        return AbstractC16544l.m18089b(this.f69381a, c21882d.f69381a) && AbstractC16544l.m18089b(this.f69382b, c21882d.f69382b) && AbstractC16544l.m18089b(this.f69383c, c21882d.f69383c) && this.f69384d == c21882d.f69384d;
    }

    public final int hashCode() {
        return AbstractC14376f.m15858x(this.f69383c, AbstractC0168G.m527p(this.f69381a.hashCode() * 31, 31, this.f69382b), 31) + this.f69384d;
    }

    public final String toString() {
        return "█";
    }
}
