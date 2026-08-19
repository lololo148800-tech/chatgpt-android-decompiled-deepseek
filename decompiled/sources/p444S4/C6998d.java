package p444S4;

import android.os.Build;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p228J.AbstractC3794B0;
import p775h2.AbstractC14376f;
import p909nm.C17691y;

/* JADX INFO: renamed from: S4.d */
/* JADX INFO: loaded from: classes.dex */
public final class C6998d {

    /* JADX INFO: renamed from: i */
    public static final C6998d f22391i = new C6998d(1, false, false, false, false, -1, -1, C17691y.f56482Y);

    /* JADX INFO: renamed from: a */
    public final int f22392a;

    /* JADX INFO: renamed from: b */
    public final boolean f22393b;

    /* JADX INFO: renamed from: c */
    public final boolean f22394c;

    /* JADX INFO: renamed from: d */
    public final boolean f22395d;

    /* JADX INFO: renamed from: e */
    public final boolean f22396e;

    /* JADX INFO: renamed from: f */
    public final long f22397f;

    /* JADX INFO: renamed from: g */
    public final long f22398g;

    /* JADX INFO: renamed from: h */
    public final Set f22399h;

    public C6998d(int i10, boolean z6, boolean z10, boolean z11, boolean z12, long j10, long j11, Set contentUriTriggers) {
        AbstractC14376f.m15825D(i10, "requiredNetworkType");
        AbstractC16544l.m18094g(contentUriTriggers, "contentUriTriggers");
        this.f22392a = i10;
        this.f22393b = z6;
        this.f22394c = z10;
        this.f22395d = z11;
        this.f22396e = z12;
        this.f22397f = j10;
        this.f22398g = j11;
        this.f22399h = contentUriTriggers;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m7400a() {
        return Build.VERSION.SDK_INT < 24 || !this.f22399h.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C6998d.class.equals(obj.getClass())) {
            return false;
        }
        C6998d c6998d = (C6998d) obj;
        if (this.f22393b == c6998d.f22393b && this.f22394c == c6998d.f22394c && this.f22395d == c6998d.f22395d && this.f22396e == c6998d.f22396e && this.f22397f == c6998d.f22397f && this.f22398g == c6998d.f22398g && this.f22392a == c6998d.f22392a) {
            return AbstractC16544l.m18089b(this.f22399h, c6998d.f22399h);
        }
        return false;
    }

    public final int hashCode() {
        int iM24h = ((((((((AbstractC0010F.m24h(this.f22392a) * 31) + (this.f22393b ? 1 : 0)) * 31) + (this.f22394c ? 1 : 0)) * 31) + (this.f22395d ? 1 : 0)) * 31) + (this.f22396e ? 1 : 0)) * 31;
        long j10 = this.f22397f;
        int i10 = (iM24h + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f22398g;
        return this.f22399h.hashCode() + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + AbstractC3794B0.m4475J(this.f22392a) + ", requiresCharging=" + this.f22393b + ", requiresDeviceIdle=" + this.f22394c + ", requiresBatteryNotLow=" + this.f22395d + ", requiresStorageNotLow=" + this.f22396e + ", contentTriggerUpdateDelayMillis=" + this.f22397f + ", contentTriggerMaxDelayMillis=" + this.f22398g + ", contentUriTriggers=" + this.f22399h + ", }";
    }

    public C6998d(C6998d other) {
        AbstractC16544l.m18094g(other, "other");
        this.f22393b = other.f22393b;
        this.f22394c = other.f22394c;
        this.f22392a = other.f22392a;
        this.f22395d = other.f22395d;
        this.f22396e = other.f22396e;
        this.f22399h = other.f22399h;
        this.f22397f = other.f22397f;
        this.f22398g = other.f22398g;
    }
}
