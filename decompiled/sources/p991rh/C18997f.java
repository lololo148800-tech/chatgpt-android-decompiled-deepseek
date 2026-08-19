package p991rh;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: rh.f */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C18997f {
    public static final C18996e Companion = new C18996e();

    /* JADX INFO: renamed from: a */
    public final String f60576a;

    /* JADX INFO: renamed from: b */
    public final String f60577b;

    public /* synthetic */ C18997f(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C18995d.f60575a.getDescriptor());
            throw null;
        }
        this.f60576a = str;
        this.f60577b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18997f)) {
            return false;
        }
        C18997f c18997f = (C18997f) obj;
        return AbstractC16544l.m18089b(this.f60576a, c18997f.f60576a) && AbstractC16544l.m18089b(this.f60577b, c18997f.f60577b);
    }

    public final int hashCode() {
        return this.f60577b.hashCode() + (this.f60576a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }

    public C18997f(String uploadUrl, String fileId) {
        AbstractC16544l.m18094g(uploadUrl, "uploadUrl");
        AbstractC16544l.m18094g(fileId, "fileId");
        this.f60576a = uploadUrl;
        this.f60577b = fileId;
    }
}
