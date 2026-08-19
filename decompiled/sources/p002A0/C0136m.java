package p002A0;

import p1095x1.InterfaceC21059M;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p911o0.AbstractC17770m;
import p911o0.InterfaceC17762i;

/* JADX INFO: renamed from: A0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0136m implements InterfaceC17762i {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f569a;

    /* JADX INFO: renamed from: b */
    public float f570b;

    public C0136m(float f10) {
        this.f569a = 1;
        this.f570b = f10;
    }

    @Override // p911o0.InterfaceC17760h, p911o0.InterfaceC17766k
    /* JADX INFO: renamed from: a */
    public float mo455a() {
        switch (this.f569a) {
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return this.f570b;
    }

    @Override // p911o0.InterfaceC17766k
    /* JADX INFO: renamed from: b */
    public void mo456b(int i10, InterfaceC21059M interfaceC21059M, int[] iArr, int[] iArr2) {
        switch (this.f569a) {
            case 2:
                AbstractC17770m.m19494a(i10, iArr, iArr2, false);
                break;
            case 3:
                AbstractC17770m.m19497d(i10, iArr, iArr2, false);
                break;
            case 4:
                AbstractC17770m.m19498e(i10, iArr, iArr2, false);
                break;
            default:
                AbstractC17770m.m19499f(i10, iArr, iArr2, false);
                break;
        }
    }

    @Override // p911o0.InterfaceC17760h
    /* JADX INFO: renamed from: c */
    public void mo457c(InterfaceC7537b interfaceC7537b, int i10, int[] iArr, EnumC7546k enumC7546k, int[] iArr2) {
        switch (this.f569a) {
            case 2:
                if (enumC7546k != EnumC7546k.f23904Y) {
                    AbstractC17770m.m19494a(i10, iArr, iArr2, true);
                } else {
                    AbstractC17770m.m19494a(i10, iArr, iArr2, false);
                }
                break;
            case 3:
                if (enumC7546k != EnumC7546k.f23904Y) {
                    AbstractC17770m.m19497d(i10, iArr, iArr2, true);
                } else {
                    AbstractC17770m.m19497d(i10, iArr, iArr2, false);
                }
                break;
            case 4:
                if (enumC7546k != EnumC7546k.f23904Y) {
                    AbstractC17770m.m19498e(i10, iArr, iArr2, true);
                } else {
                    AbstractC17770m.m19498e(i10, iArr, iArr2, false);
                }
                break;
            default:
                if (enumC7546k != EnumC7546k.f23904Y) {
                    AbstractC17770m.m19499f(i10, iArr, iArr2, true);
                } else {
                    AbstractC17770m.m19499f(i10, iArr, iArr2, false);
                }
                break;
        }
    }

    public String toString() {
        switch (this.f569a) {
            case 2:
                return "Arrangement#Center";
            case 3:
                return "Arrangement#SpaceAround";
            case 4:
                return "Arrangement#SpaceBetween";
            case 5:
                return "Arrangement#SpaceEvenly";
            default:
                return super.toString();
        }
    }

    public C0136m(int i10) {
        this.f569a = i10;
        switch (i10) {
            case 2:
                this.f570b = 0;
                break;
            case 3:
                this.f570b = 0;
                break;
            case 4:
                this.f570b = 0;
                break;
            case 5:
                this.f570b = 0;
                break;
        }
    }
}
