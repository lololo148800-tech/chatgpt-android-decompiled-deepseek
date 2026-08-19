package p443S3;

import bb.AbstractC11278C;
import bb.C11276A;
import bb.C11294T;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import p1073w3.C20811m;
import p372P3.C6312D;
import p372P3.C6330l;
import p372P3.C6337s;
import p372P3.InterfaceC6333o;
import p372P3.InterfaceC6334p;
import p372P3.InterfaceC6335q;

/* JADX INFO: renamed from: S3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6992a implements InterfaceC6333o {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f22373a;

    /* JADX INFO: renamed from: b */
    public final C20811m f22374b;

    /* JADX INFO: renamed from: c */
    public final C6312D f22375c;

    public C6992a(int i10) {
        this.f22373a = i10;
        switch (i10) {
            case 1:
                this.f22374b = new C20811m(4);
                this.f22375c = new C6312D(-1, -1, "image/heif");
                break;
            case 2:
                this.f22374b = new C20811m(4);
                this.f22375c = new C6312D(-1, -1, "image/webp");
                break;
            default:
                this.f22374b = new C20811m(4);
                this.f22375c = new C6312D(-1, -1, "image/avif");
                break;
        }
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: a */
    public final InterfaceC6333o mo6855a() {
        int i10 = this.f22373a;
        return this;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: c */
    public final boolean mo6856c(InterfaceC6334p interfaceC6334p) throws EOFException, InterruptedIOException {
        switch (this.f22373a) {
            case 0:
                C6330l c6330l = (C6330l) interfaceC6334p;
                c6330l.m6941g(4, false);
                C20811m c20811m = this.f22374b;
                c20811m.m21341C(4);
                c6330l.mo3047d(c20811m.f66092a, 0, 4, false);
                if (c20811m.m21367v() != 1718909296) {
                    return false;
                }
                c20811m.m21341C(4);
                c6330l.mo3047d(c20811m.f66092a, 0, 4, false);
                return c20811m.m21367v() == ((long) 1635150182);
            case 1:
                C6330l c6330l2 = (C6330l) interfaceC6334p;
                c6330l2.m6941g(4, false);
                C20811m c20811m2 = this.f22374b;
                c20811m2.m21341C(4);
                c6330l2.mo3047d(c20811m2.f66092a, 0, 4, false);
                if (c20811m2.m21367v() != 1718909296) {
                    return false;
                }
                c20811m2.m21341C(4);
                c6330l2.mo3047d(c20811m2.f66092a, 0, 4, false);
                return c20811m2.m21367v() == ((long) 1751476579);
            default:
                C20811m c20811m3 = this.f22374b;
                c20811m3.m21341C(4);
                C6330l c6330l3 = (C6330l) interfaceC6334p;
                c6330l3.mo3047d(c20811m3.f66092a, 0, 4, false);
                if (c20811m3.m21367v() != 1380533830) {
                    return false;
                }
                c6330l3.m6941g(4, false);
                c20811m3.m21341C(4);
                c6330l3.mo3047d(c20811m3.f66092a, 0, 4, false);
                return c20811m3.m21367v() == 1464156752;
        }
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: f */
    public final void mo6857f(long j10, long j11) {
        switch (this.f22373a) {
            case 0:
                this.f22375c.mo6857f(j10, j11);
                break;
            case 1:
                this.f22375c.mo6857f(j10, j11);
                break;
            default:
                this.f22375c.mo6857f(j10, j11);
                break;
        }
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: g */
    public final List mo6858g() {
        switch (this.f22373a) {
            case 0:
                C11276A c11276a = AbstractC11278C.f34162Z;
                break;
            case 1:
                C11276A c11276a2 = AbstractC11278C.f34162Z;
                break;
            default:
                C11276A c11276a3 = AbstractC11278C.f34162Z;
                break;
        }
        return C11294T.f34185q0;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: h */
    public final int mo6859h(InterfaceC6334p interfaceC6334p, C6337s c6337s) {
        switch (this.f22373a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f22375c.mo6859h(interfaceC6334p, c6337s);
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: i */
    public final void mo6860i(InterfaceC6335q interfaceC6335q) {
        switch (this.f22373a) {
            case 0:
                this.f22375c.mo6860i(interfaceC6335q);
                break;
            case 1:
                this.f22375c.mo6860i(interfaceC6335q);
                break;
            default:
                this.f22375c.mo6860i(interfaceC6335q);
                break;
        }
    }

    @Override // p372P3.InterfaceC6333o
    public final void release() {
        int i10 = this.f22373a;
    }

    /* JADX INFO: renamed from: b */
    private final void m7392b() {
    }

    /* JADX INFO: renamed from: d */
    private final void m7393d() {
    }

    /* JADX INFO: renamed from: e */
    private final void m7394e() {
    }
}
