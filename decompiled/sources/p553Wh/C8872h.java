package p553Wh;

import p229J0.EnumC3898D3;
import p229J0.InterfaceC4006X3;
import p537W0.C8410b;

/* JADX INFO: renamed from: Wh.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C8872h implements InterfaceC4006X3 {

    /* JADX INFO: renamed from: a */
    public final EnumC3898D3 f27155a;

    /* JADX INFO: renamed from: b */
    public final C8410b f27156b;

    public C8872h(EnumC3898D3 enumC3898D3, C8410b c8410b) {
        this.f27155a = enumC3898D3;
        this.f27156b = c8410b;
    }

    @Override // p229J0.InterfaceC4006X3
    /* JADX INFO: renamed from: a */
    public final String mo4639a() {
        return "";
    }

    @Override // p229J0.InterfaceC4006X3
    /* JADX INFO: renamed from: b */
    public final String mo4640b() {
        return null;
    }

    @Override // p229J0.InterfaceC4006X3
    /* JADX INFO: renamed from: c */
    public final EnumC3898D3 mo4641c() {
        return this.f27155a;
    }

    @Override // p229J0.InterfaceC4006X3
    /* JADX INFO: renamed from: d */
    public final boolean mo4642d() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8872h)) {
            return false;
        }
        C8872h c8872h = (C8872h) obj;
        return this.f27155a == c8872h.f27155a && this.f27156b.equals(c8872h.f27156b);
    }

    public final int hashCode() {
        return this.f27156b.hashCode() + (this.f27155a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
