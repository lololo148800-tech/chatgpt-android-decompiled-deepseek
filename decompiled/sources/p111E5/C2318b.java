package p111E5;

import java.io.IOException;
import p026Ao.AbstractC0685s;
import p026Ao.C0675i;
import p026Ao.InterfaceC0663L;
import p026Ao.InterfaceC0677k;
import p1027tp.C20075s;

/* JADX INFO: renamed from: E5.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2318b extends AbstractC0685s {

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f7209Z;

    /* JADX INFO: renamed from: o0 */
    public Object f7210o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2318b(InterfaceC0663L interfaceC0663L, int i10) {
        super(interfaceC0663L);
        this.f7209Z = i10;
    }

    @Override // p026Ao.AbstractC0685s, p026Ao.InterfaceC0663L
    /* JADX INFO: renamed from: H */
    public final long mo1325H(C0675i c0675i, long j10) throws Exception {
        switch (this.f7209Z) {
            case 0:
                try {
                    return super.mo1325H(c0675i, j10);
                } catch (Exception e10) {
                    this.f7210o0 = e10;
                    throw e10;
                }
            case 1:
                try {
                    return super.mo1325H(c0675i, j10);
                } catch (Exception e11) {
                    this.f7210o0 = e11;
                    throw e11;
                }
            default:
                try {
                    return super.mo1325H(c0675i, j10);
                } catch (IOException e12) {
                    ((C20075s) this.f7210o0).f63576o0 = e12;
                    throw e12;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2318b(C20075s c20075s, InterfaceC0677k interfaceC0677k) {
        super(interfaceC0677k);
        this.f7209Z = 2;
        this.f7210o0 = c20075s;
    }
}
