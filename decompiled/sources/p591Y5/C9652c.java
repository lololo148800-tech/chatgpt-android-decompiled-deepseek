package p591Y5;

import java.util.List;
import p802i6.C14935a;

/* JADX INFO: renamed from: Y5.c */
/* JADX INFO: loaded from: classes.dex */
public final class C9652c implements InterfaceC9651b {

    /* JADX INFO: renamed from: Y */
    public final List f29078Y;

    /* JADX INFO: renamed from: o0 */
    public C14935a f29080o0 = null;

    /* JADX INFO: renamed from: p0 */
    public float f29081p0 = -1.0f;

    /* JADX INFO: renamed from: Z */
    public C14935a f29079Z = m10229a(0.0f);

    public C9652c(List list) {
        this.f29078Y = list;
    }

    @Override // p591Y5.InterfaceC9651b
    /* JADX INFO: renamed from: B */
    public final float mo4174B() {
        return ((C14935a) this.f29078Y.get(0)).m16096b();
    }

    /* JADX INFO: renamed from: a */
    public final C14935a m10229a(float f10) {
        List list = this.f29078Y;
        C14935a c14935a = (C14935a) list.get(list.size() - 1);
        if (f10 >= c14935a.m16096b()) {
            return c14935a;
        }
        for (int size = list.size() - 2; size >= 1; size--) {
            C14935a c14935a2 = (C14935a) list.get(size);
            if (this.f29079Z != c14935a2 && f10 >= c14935a2.m16096b() && f10 < c14935a2.m16095a()) {
                return c14935a2;
            }
        }
        return (C14935a) list.get(0);
    }

    @Override // p591Y5.InterfaceC9651b
    /* JADX INFO: renamed from: b */
    public final boolean mo4175b(float f10) {
        C14935a c14935a = this.f29080o0;
        C14935a c14935a2 = this.f29079Z;
        if (c14935a == c14935a2 && this.f29081p0 == f10) {
            return true;
        }
        this.f29080o0 = c14935a2;
        this.f29081p0 = f10;
        return false;
    }

    @Override // p591Y5.InterfaceC9651b
    public final boolean isEmpty() {
        return false;
    }

    @Override // p591Y5.InterfaceC9651b
    /* JADX INFO: renamed from: k */
    public final C14935a mo4176k() {
        return this.f29079Z;
    }

    @Override // p591Y5.InterfaceC9651b
    /* JADX INFO: renamed from: m */
    public final boolean mo4177m(float f10) {
        C14935a c14935a = this.f29079Z;
        if (f10 >= c14935a.m16096b() && f10 < c14935a.m16095a()) {
            return !this.f29079Z.m16097c();
        }
        this.f29079Z = m10229a(f10);
        return true;
    }

    @Override // p591Y5.InterfaceC9651b
    /* JADX INFO: renamed from: y */
    public final float mo4179y() {
        List list = this.f29078Y;
        return ((C14935a) list.get(list.size() - 1)).m16095a();
    }
}
