package p899n5;

import p1075w5.C20835m;
import p275Kn.AbstractC4823j;
import p275Kn.C4822i;
import p864l5.C16826m;
import p958q5.C18638m;

/* JADX INFO: renamed from: n5.b */
/* JADX INFO: loaded from: classes.dex */
public final class C17485b implements InterfaceC17490g {

    /* JADX INFO: renamed from: a */
    public final EnumC17493j f55940a;

    /* JADX INFO: renamed from: b */
    public final C4822i f55941b;

    public C17485b(int i10, EnumC17493j enumC17493j) {
        this.f55940a = enumC17493j;
        int i11 = AbstractC4823j.f15708a;
        this.f55941b = new C4822i(i10, 0);
    }

    @Override // p899n5.InterfaceC17490g
    /* JADX INFO: renamed from: a */
    public final InterfaceC17491h mo19195a(C18638m c18638m, C20835m c20835m, C16826m c16826m) {
        return new C17487d(c18638m.f59376a, c20835m, this.f55941b, this.f55940a);
    }

    public final boolean equals(Object obj) {
        return obj instanceof C17485b;
    }

    public final int hashCode() {
        return C17485b.class.hashCode();
    }
}
