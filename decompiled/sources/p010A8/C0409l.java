package p010A8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;

/* JADX INFO: renamed from: A8.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0409l {

    /* JADX INFO: renamed from: a */
    public final String f1355a;

    /* JADX INFO: renamed from: b */
    public final String f1356b;

    /* JADX INFO: renamed from: c */
    public final String f1357c;

    /* JADX INFO: renamed from: d */
    public final String f1358d;

    /* JADX INFO: renamed from: e */
    public final String f1359e;

    /* JADX INFO: renamed from: f */
    public final String f1360f;

    /* JADX INFO: renamed from: g */
    public final long f1361g;

    /* JADX INFO: renamed from: h */
    public final long f1362h;

    /* JADX INFO: renamed from: i */
    public final long f1363i;

    /* JADX INFO: renamed from: j */
    public final C0402e f1364j;

    /* JADX INFO: renamed from: k */
    public final C0401d f1365k;

    public C0409l(String traceId, String str, String str2, String str3, String name, String service, long j10, long j11, long j12, C0402e c0402e, C0401d c0401d) {
        AbstractC16544l.m18094g(traceId, "traceId");
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(service, "service");
        this.f1355a = traceId;
        this.f1356b = str;
        this.f1357c = str2;
        this.f1358d = str3;
        this.f1359e = name;
        this.f1360f = service;
        this.f1361g = j10;
        this.f1362h = j11;
        this.f1363i = j12;
        this.f1364j = c0402e;
        this.f1365k = c0401d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0409l)) {
            return false;
        }
        C0409l c0409l = (C0409l) obj;
        return AbstractC16544l.m18089b(this.f1355a, c0409l.f1355a) && AbstractC16544l.m18089b(this.f1356b, c0409l.f1356b) && AbstractC16544l.m18089b(this.f1357c, c0409l.f1357c) && AbstractC16544l.m18089b(this.f1358d, c0409l.f1358d) && AbstractC16544l.m18089b(this.f1359e, c0409l.f1359e) && AbstractC16544l.m18089b(this.f1360f, c0409l.f1360f) && this.f1361g == c0409l.f1361g && this.f1362h == c0409l.f1362h && this.f1363i == c0409l.f1363i && AbstractC16544l.m18089b(this.f1364j, c0409l.f1364j) && AbstractC16544l.m18089b(this.f1365k, c0409l.f1365k);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(this.f1355a.hashCode() * 31, 31, this.f1356b), 31, this.f1357c), 31, this.f1358d), 31, this.f1359e), 31, this.f1360f);
        long j10 = this.f1361g;
        int i10 = (iM527p + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f1362h;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f1363i;
        return this.f1365k.hashCode() + ((this.f1364j.hashCode() + ((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SpanEvent(traceId=" + this.f1355a + ", spanId=" + this.f1356b + ", parentId=" + this.f1357c + ", resource=" + this.f1358d + ", name=" + this.f1359e + ", service=" + this.f1360f + ", duration=" + this.f1361g + ", start=" + this.f1362h + ", error=" + this.f1363i + ", metrics=" + this.f1364j + ", meta=" + this.f1365k + Separators.RPAREN;
    }
}
