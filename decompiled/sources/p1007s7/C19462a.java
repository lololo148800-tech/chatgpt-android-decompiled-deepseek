package p1007s7;

import android.gov.nist.core.Separators;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: s7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C19462a {

    /* JADX INFO: renamed from: a */
    public final C19463b f61762a;

    /* JADX INFO: renamed from: b */
    public final List f61763b;

    /* JADX INFO: renamed from: c */
    public final byte[] f61764c;

    public C19462a(C19463b c19463b, List data, byte[] bArr) {
        AbstractC16544l.m18094g(data, "data");
        this.f61762a = c19463b;
        this.f61763b = data;
        this.f61764c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C19462a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type com.datadog.android.core.internal.persistence.BatchData");
        C19462a c19462a = (C19462a) obj;
        if (!AbstractC16544l.m18089b(this.f61762a, c19462a.f61762a) || !AbstractC16544l.m18089b(this.f61763b, c19462a.f61763b)) {
            return false;
        }
        byte[] bArr = c19462a.f61764c;
        byte[] bArr2 = this.f61764c;
        if (bArr2 != null) {
            if (bArr == null || !Arrays.equals(bArr2, bArr)) {
                return false;
            }
        } else if (bArr != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iM15858x = AbstractC14376f.m15858x(this.f61763b, this.f61762a.f61765a.hashCode() * 31, 31);
        byte[] bArr = this.f61764c;
        return iM15858x + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    public final String toString() {
        return "BatchData(id=" + this.f61762a + ", data=" + this.f61763b + ", metadata=" + Arrays.toString(this.f61764c) + Separators.RPAREN;
    }
}
