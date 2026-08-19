package p374P5;

import kotlin.jvm.internal.AbstractC16544l;
import p033B5.InterfaceC0829m;
import p111E5.EnumC2324h;
import p228J.AbstractC3794B0;
import p259K5.C4539a;

/* JADX INFO: renamed from: P5.p */
/* JADX INFO: loaded from: classes.dex */
public final class C6363p implements InterfaceC6357j {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0829m f20707a;

    /* JADX INFO: renamed from: b */
    public final C6354g f20708b;

    /* JADX INFO: renamed from: c */
    public final EnumC2324h f20709c;

    /* JADX INFO: renamed from: d */
    public final C4539a f20710d;

    /* JADX INFO: renamed from: e */
    public final String f20711e;

    /* JADX INFO: renamed from: f */
    public final boolean f20712f;

    /* JADX INFO: renamed from: g */
    public final boolean f20713g;

    public C6363p(InterfaceC0829m interfaceC0829m, C6354g c6354g, EnumC2324h enumC2324h, C4539a c4539a, String str, boolean z6, boolean z10) {
        this.f20707a = interfaceC0829m;
        this.f20708b = c6354g;
        this.f20709c = enumC2324h;
        this.f20710d = c4539a;
        this.f20711e = str;
        this.f20712f = z6;
        this.f20713g = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6363p)) {
            return false;
        }
        C6363p c6363p = (C6363p) obj;
        return AbstractC16544l.m18089b(this.f20707a, c6363p.f20707a) && AbstractC16544l.m18089b(this.f20708b, c6363p.f20708b) && this.f20709c == c6363p.f20709c && AbstractC16544l.m18089b(this.f20710d, c6363p.f20710d) && AbstractC16544l.m18089b(this.f20711e, c6363p.f20711e) && this.f20712f == c6363p.f20712f && this.f20713g == c6363p.f20713g;
    }

    @Override // p374P5.InterfaceC6357j
    public final C6354g getRequest() {
        return this.f20708b;
    }

    public final int hashCode() {
        int iHashCode = (this.f20709c.hashCode() + ((this.f20708b.hashCode() + (this.f20707a.hashCode() * 31)) * 31)) * 31;
        C4539a c4539a = this.f20710d;
        int iHashCode2 = (iHashCode + (c4539a == null ? 0 : c4539a.hashCode())) * 31;
        String str = this.f20711e;
        return ((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + (this.f20712f ? 1231 : 1237)) * 31) + (this.f20713g ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SuccessResult(image=");
        sb2.append(this.f20707a);
        sb2.append(", request=");
        sb2.append(this.f20708b);
        sb2.append(", dataSource=");
        sb2.append(this.f20709c);
        sb2.append(", memoryCacheKey=");
        sb2.append(this.f20710d);
        sb2.append(", diskCacheKey=");
        sb2.append(this.f20711e);
        sb2.append(", isSampled=");
        sb2.append(this.f20712f);
        sb2.append(", isPlaceholderCached=");
        return AbstractC3794B0.m4499x(sb2, this.f20713g, ')');
    }
}
