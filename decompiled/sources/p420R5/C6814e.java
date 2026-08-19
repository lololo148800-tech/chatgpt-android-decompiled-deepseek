package p420R5;

import android.graphics.Canvas;
import fo.C13711h;
import p033B5.InterfaceC0829m;
import p1139z0.C21585H;

/* JADX INFO: renamed from: R5.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6814e implements InterfaceC0829m {

    /* JADX INFO: renamed from: a */
    public final C13711h f21862a;

    /* JADX INFO: renamed from: b */
    public final C21585H f21863b;

    /* JADX INFO: renamed from: c */
    public final int f21864c;

    /* JADX INFO: renamed from: d */
    public final int f21865d;

    public C6814e(C13711h c13711h, C21585H c21585h, int i10, int i11) {
        this.f21862a = c13711h;
        this.f21863b = c21585h;
        this.f21864c = i10;
        this.f21865d = i11;
    }

    @Override // p033B5.InterfaceC0829m
    /* JADX INFO: renamed from: b */
    public final long mo1876b() {
        return 2048L;
    }

    @Override // p033B5.InterfaceC0829m
    /* JADX INFO: renamed from: c */
    public final boolean mo1877c() {
        return true;
    }

    @Override // p033B5.InterfaceC0829m
    /* JADX INFO: renamed from: d */
    public final void mo1878d(Canvas canvas) {
        this.f21862a.m15181B(canvas, this.f21863b);
    }

    @Override // p033B5.InterfaceC0829m
    public final int getHeight() {
        return this.f21865d;
    }

    @Override // p033B5.InterfaceC0829m
    public final int getWidth() {
        return this.f21864c;
    }
}
