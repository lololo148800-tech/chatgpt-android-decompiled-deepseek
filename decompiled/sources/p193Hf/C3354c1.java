package p193Hf;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8072d6;
import p591Y5.InterfaceC9651b;
import p759g1.AbstractC13799a;
import p759g1.C13801c;
import p759g1.C13802d;
import p774h1.AbstractC14332J;
import p774h1.C14331I;
import p774h1.InterfaceC14339Q;
import p802i6.C14935a;

/* JADX INFO: renamed from: Hf.c1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3354c1 implements InterfaceC14339Q, InterfaceC9651b {

    /* JADX INFO: renamed from: Y */
    public float f10246Y;

    /* JADX INFO: renamed from: Z */
    public final Object f10247Z;

    public C3354c1(C13801c c13801c, float f10) {
        this.f10247Z = c13801c;
        this.f10246Y = f10;
    }

    @Override // p591Y5.InterfaceC9651b
    /* JADX INFO: renamed from: B */
    public float mo4174B() {
        return ((C14935a) this.f10247Z).m16096b();
    }

    @Override // p591Y5.InterfaceC9651b
    /* JADX INFO: renamed from: b */
    public boolean mo4175b(float f10) {
        if (this.f10246Y == f10) {
            return true;
        }
        this.f10246Y = f10;
        return false;
    }

    @Override // p591Y5.InterfaceC9651b
    public boolean isEmpty() {
        return false;
    }

    @Override // p591Y5.InterfaceC9651b
    /* JADX INFO: renamed from: k */
    public C14935a mo4176k() {
        return (C14935a) this.f10247Z;
    }

    @Override // p591Y5.InterfaceC9651b
    /* JADX INFO: renamed from: m */
    public boolean mo4177m(float f10) {
        return !((C14935a) this.f10247Z).m16097c();
    }

    @Override // p774h1.InterfaceC14339Q
    /* JADX INFO: renamed from: o */
    public AbstractC14332J mo4178o(long j10, EnumC7546k layoutDirection, InterfaceC7537b density) {
        AbstractC16544l.m18094g(layoutDirection, "layoutDirection");
        AbstractC16544l.m18094g(density, "density");
        float f10 = this.f10246Y;
        long jM8484a = AbstractC8072d6.m8484a(f10, f10);
        float fM15297b = AbstractC13799a.m15297b(jM8484a);
        float fM15298c = AbstractC13799a.m15298c(jM8484a);
        C13801c c13801c = (C13801c) this.f10247Z;
        long jM8484a2 = AbstractC8072d6.m8484a(fM15297b, fM15298c);
        return new C14331I(new C13802d(c13801c.f43586a, c13801c.f43587b, c13801c.f43588c, c13801c.f43589d, jM8484a2, jM8484a2, jM8484a2, jM8484a2));
    }

    @Override // p591Y5.InterfaceC9651b
    /* JADX INFO: renamed from: y */
    public float mo4179y() {
        return ((C14935a) this.f10247Z).m16095a();
    }

    public C3354c1(List list) {
        this.f10246Y = -1.0f;
        this.f10247Z = (C14935a) list.get(0);
    }
}
