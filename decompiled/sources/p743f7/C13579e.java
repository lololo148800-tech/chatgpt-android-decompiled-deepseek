package p743f7;

import android.gov.nist.core.Separators;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;

/* JADX INFO: renamed from: f7.e */
/* JADX INFO: loaded from: classes.dex */
public final class C13579e {

    /* JADX INFO: renamed from: c */
    public static final byte[] f42928c = new byte[0];

    /* JADX INFO: renamed from: a */
    public final byte[] f42929a;

    /* JADX INFO: renamed from: b */
    public final byte[] f42930b;

    public C13579e(byte[] data, byte[] metadata) {
        AbstractC16544l.m18094g(data, "data");
        AbstractC16544l.m18094g(metadata, "metadata");
        this.f42929a = data;
        this.f42930b = metadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C13579e.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type com.datadog.android.api.storage.RawBatchEvent");
        C13579e c13579e = (C13579e) obj;
        return Arrays.equals(this.f42929a, c13579e.f42929a) && Arrays.equals(this.f42930b, c13579e.f42930b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f42930b) + (Arrays.hashCode(this.f42929a) * 31);
    }

    public final String toString() {
        return AbstractC0010F.m20d("RawBatchEvent(data=", Arrays.toString(this.f42929a), ", metadata=", Arrays.toString(this.f42930b), Separators.RPAREN);
    }
}
