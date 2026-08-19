package p030B2;

import android.view.View;
import com.google.protobuf.AbstractC12107L1;
import p084D4.AbstractC1933p0;
import p1071w0.AbstractC20740b0;
import p350O1.InterfaceC6073v;

/* JADX INFO: renamed from: B2.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0781s implements InterfaceC6073v {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2191a;

    /* JADX INFO: renamed from: b */
    public int f2192b;

    /* JADX INFO: renamed from: c */
    public int f2193c;

    public /* synthetic */ C0781s(int i10) {
        this.f2191a = i10;
    }

    @Override // p350O1.InterfaceC6073v
    /* JADX INFO: renamed from: a */
    public int mo1765a(int i10) {
        if (i10 >= 0 && i10 <= this.f2193c) {
            AbstractC20740b0.m21259B(i10, this.f2192b, i10);
        }
        return i10;
    }

    @Override // p350O1.InterfaceC6073v
    /* JADX INFO: renamed from: b */
    public int mo1766b(int i10) {
        if (i10 >= 0 && i10 <= this.f2192b) {
            AbstractC20740b0.m21258A(i10, this.f2193c, i10);
        }
        return i10;
    }

    /* JADX INFO: renamed from: c */
    public void m1767c(AbstractC1933p0 abstractC1933p0) {
        View view = abstractC1933p0.f5680a;
        this.f2192b = view.getLeft();
        this.f2193c = view.getTop();
        view.getRight();
        view.getBottom();
    }

    public String toString() {
        switch (this.f2191a) {
            case 7:
                StringBuilder sb2 = new StringBuilder("Location(line = ");
                sb2.append(this.f2192b);
                sb2.append(", column = ");
                return AbstractC12107L1.m13826q(sb2, this.f2193c, ')');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C0781s(int i10, int i11, int i12) {
        this.f2191a = i12;
        this.f2192b = i10;
        this.f2193c = i11;
    }
}
