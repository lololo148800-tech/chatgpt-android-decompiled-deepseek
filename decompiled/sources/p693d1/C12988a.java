package p693d1;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import p049Bm.InterfaceC1436k;
import p228J.AbstractC3794B0;
import p492U1.C7538c;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p759g1.C13803e;
import p774h1.AbstractC14348d;
import p774h1.C14347c;
import p774h1.InterfaceC14362r;
import p821j1.C16036a;
import p821j1.C16037b;

/* JADX INFO: renamed from: d1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C12988a extends View.DragShadowBuilder {

    /* JADX INFO: renamed from: a */
    public final C7538c f41238a;

    /* JADX INFO: renamed from: b */
    public final long f41239b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1436k f41240c;

    public C12988a(C7538c c7538c, long j10, InterfaceC1436k interfaceC1436k) {
        this.f41238a = c7538c;
        this.f41239b = j10;
        this.f41240c = interfaceC1436k;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        C16037b c16037b = new C16037b();
        EnumC7546k enumC7546k = EnumC7546k.f23904Y;
        Canvas canvas2 = AbstractC14348d.f45031a;
        C14347c c14347c = new C14347c();
        c14347c.f45028a = canvas;
        C16036a c16036a = c16037b.f49478Y;
        InterfaceC7537b interfaceC7537b = c16036a.f49474a;
        EnumC7546k enumC7546k2 = c16036a.f49475b;
        InterfaceC14362r interfaceC14362r = c16036a.f49476c;
        long j10 = c16036a.f49477d;
        c16036a.f49474a = this.f41238a;
        c16036a.f49475b = enumC7546k;
        c16036a.f49476c = c14347c;
        c16036a.f49477d = this.f41239b;
        c14347c.mo15706e();
        this.f41240c.invoke(c16037b);
        c14347c.mo15719r();
        c16036a.f49474a = interfaceC7537b;
        c16036a.f49475b = enumC7546k2;
        c16036a.f49476c = interfaceC14362r;
        c16036a.f49477d = j10;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j10 = this.f41239b;
        float fM15333e = C13803e.m15333e(j10);
        C7538c c7538c = this.f41238a;
        point.set(AbstractC3794B0.m4485j(c7538c, fM15333e / c7538c.getDensity()), AbstractC3794B0.m4485j(c7538c, C13803e.m15331c(j10) / c7538c.getDensity()));
        point2.set(point.x / 2, point.y / 2);
    }
}
