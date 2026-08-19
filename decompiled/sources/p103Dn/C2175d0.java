package p103Dn;

import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p129En.AbstractC2592c;
import p129En.C2590a;
import p972qm.InterfaceC18770c;

/* JADX INFO: renamed from: Dn.d0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2175d0 implements InterfaceC2186j {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f6661Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16525B f6662Z;

    public /* synthetic */ C2175d0(C16525B c16525b, int i10) {
        this.f6661Y = i10;
        this.f6662Z = c16525b;
    }

    @Override // p103Dn.InterfaceC2186j
    /* JADX INFO: renamed from: a */
    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
        switch (this.f6661Y) {
            case 0:
                this.f6662Z.f51262Y = obj;
                throw new C2590a(this);
            case 1:
                this.f6662Z.f51262Y = obj;
                throw new C2590a(this);
            default:
                C16525B c16525b = this.f6662Z;
                if (c16525b.f51262Y != AbstractC2592c.f8037b) {
                    throw new IllegalArgumentException("Flow has more than one element");
                }
                c16525b.f51262Y = obj;
                return C17296C.f55119a;
        }
    }
}
