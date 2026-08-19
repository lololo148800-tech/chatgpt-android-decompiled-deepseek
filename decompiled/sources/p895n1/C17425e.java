package p895n1;

import com.google.protobuf.AbstractC12107L1;
import kotlin.jvm.internal.AbstractC16544l;
import p492U1.C7540e;
import p774h1.AbstractC14334L;
import p774h1.C14365u;
import p775h2.AbstractC14376f;
import p885m4.C17155e;

/* JADX INFO: renamed from: n1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C17425e {

    /* JADX INFO: renamed from: k */
    public static final C17155e f55692k = new C17155e();

    /* JADX INFO: renamed from: l */
    public static int f55693l;

    /* JADX INFO: renamed from: a */
    public final String f55694a;

    /* JADX INFO: renamed from: b */
    public final float f55695b;

    /* JADX INFO: renamed from: c */
    public final float f55696c;

    /* JADX INFO: renamed from: d */
    public final float f55697d;

    /* JADX INFO: renamed from: e */
    public final float f55698e;

    /* JADX INFO: renamed from: f */
    public final C17417E f55699f;

    /* JADX INFO: renamed from: g */
    public final long f55700g;

    /* JADX INFO: renamed from: h */
    public final int f55701h;

    /* JADX INFO: renamed from: i */
    public final boolean f55702i;

    /* JADX INFO: renamed from: j */
    public final int f55703j;

    public C17425e(String str, float f10, float f11, float f12, float f13, C17417E c17417e, long j10, int i10, boolean z6) {
        int i11;
        synchronized (f55692k) {
            i11 = f55693l;
            f55693l = i11 + 1;
        }
        this.f55694a = str;
        this.f55695b = f10;
        this.f55696c = f11;
        this.f55697d = f12;
        this.f55698e = f13;
        this.f55699f = c17417e;
        this.f55700g = j10;
        this.f55701h = i10;
        this.f55702i = z6;
        this.f55703j = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17425e)) {
            return false;
        }
        C17425e c17425e = (C17425e) obj;
        return AbstractC16544l.m18089b(this.f55694a, c17425e.f55694a) && C7540e.m7873a(this.f55695b, c17425e.f55695b) && C7540e.m7873a(this.f55696c, c17425e.f55696c) && this.f55697d == c17425e.f55697d && this.f55698e == c17425e.f55698e && this.f55699f.equals(c17425e.f55699f) && C14365u.m15775c(this.f55700g, c17425e.f55700g) && AbstractC14334L.m15639q(this.f55701h, c17425e.f55701h) && this.f55702i == c17425e.f55702i;
    }

    public final int hashCode() {
        int iHashCode = (this.f55699f.hashCode() + AbstractC12107L1.m13819j(this.f55698e, AbstractC12107L1.m13819j(this.f55697d, AbstractC12107L1.m13819j(this.f55696c, AbstractC12107L1.m13819j(this.f55695b, this.f55694a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i10 = C14365u.f45061k;
        return ((AbstractC14376f.m15857w(this.f55700g, iHashCode, 31) + this.f55701h) * 31) + (this.f55702i ? 1231 : 1237);
    }
}
