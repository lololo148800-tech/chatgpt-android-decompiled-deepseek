package ao;

import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p003A1.C0295v;

/* JADX INFO: renamed from: ao.w */
/* JADX INFO: loaded from: classes2.dex */
public final class C11196w {

    /* JADX INFO: renamed from: e */
    public static final long[] f33853e = new long[0];

    /* JADX INFO: renamed from: a */
    public final SerialDescriptor f33854a;

    /* JADX INFO: renamed from: b */
    public final C0295v f33855b;

    /* JADX INFO: renamed from: c */
    public long f33856c;

    /* JADX INFO: renamed from: d */
    public final long[] f33857d;

    public C11196w(SerialDescriptor descriptor, C0295v c0295v) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        this.f33854a = descriptor;
        this.f33855b = c0295v;
        int iMo10682e = descriptor.mo10682e();
        if (iMo10682e <= 64) {
            this.f33856c = iMo10682e != 64 ? (-1) << iMo10682e : 0L;
            this.f33857d = f33853e;
            return;
        }
        this.f33856c = 0L;
        int i10 = (iMo10682e - 1) >>> 6;
        long[] jArr = new long[i10];
        if ((iMo10682e & 63) != 0) {
            jArr[i10 - 1] = (-1) << iMo10682e;
        }
        this.f33857d = jArr;
    }
}
