package p229J0;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: J0.K3 */
/* JADX INFO: loaded from: classes.dex */
public final class C3940K3 implements InterfaceC4006X3 {

    /* JADX INFO: renamed from: a */
    public final String f12142a;

    /* JADX INFO: renamed from: b */
    public final String f12143b;

    /* JADX INFO: renamed from: c */
    public final EnumC3898D3 f12144c;

    public C3940K3(String str, String str2, EnumC3898D3 enumC3898D3) {
        this.f12142a = str;
        this.f12143b = str2;
        this.f12144c = enumC3898D3;
    }

    @Override // p229J0.InterfaceC4006X3
    /* JADX INFO: renamed from: a */
    public final String mo4639a() {
        return this.f12142a;
    }

    @Override // p229J0.InterfaceC4006X3
    /* JADX INFO: renamed from: b */
    public final String mo4640b() {
        return this.f12143b;
    }

    @Override // p229J0.InterfaceC4006X3
    /* JADX INFO: renamed from: c */
    public final EnumC3898D3 mo4641c() {
        return this.f12144c;
    }

    @Override // p229J0.InterfaceC4006X3
    /* JADX INFO: renamed from: d */
    public final boolean mo4642d() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3940K3.class != obj.getClass()) {
            return false;
        }
        C3940K3 c3940k3 = (C3940K3) obj;
        return AbstractC16544l.m18089b(this.f12142a, c3940k3.f12142a) && AbstractC16544l.m18089b(this.f12143b, c3940k3.f12143b) && this.f12144c == c3940k3.f12144c;
    }

    public final int hashCode() {
        int iHashCode = this.f12142a.hashCode() * 31;
        String str = this.f12143b;
        return this.f12144c.hashCode() + ((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + 1231) * 31);
    }
}
