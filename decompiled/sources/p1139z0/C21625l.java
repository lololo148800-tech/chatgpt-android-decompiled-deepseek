package p1139z0;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import mm.C17296C;
import p003A1.C0275o0;
import p003A1.InterfaceC0161D1;
import p003A1.InterfaceC0255h1;
import p025An.AbstractC0575H;
import p025An.EnumC0573G;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2211v0;
import p1068vo.C20659i;
import p1071w0.AbstractC20734X;
import p350O1.C6065n;
import p571X9.AbstractC9233X;
import p820j0.C16031b;
import p870le.C16863U;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import p999s.C19341c1;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: z0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C21625l extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f68502Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f68503Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC2211v0 f68504o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C21582E0 f68505p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C21574A0 f68506q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C20659i f68507r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C0275o0 f68508s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C6065n f68509t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ C16031b f68510u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ C16863U f68511v0;

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ InterfaceC0161D1 f68512w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21625l(InterfaceC2211v0 interfaceC2211v0, C21582E0 c21582e0, C21574A0 c21574a0, C20659i c20659i, C0275o0 c0275o0, C6065n c6065n, C16031b c16031b, C16863U c16863u, InterfaceC0161D1 interfaceC0161D1, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f68504o0 = interfaceC2211v0;
        this.f68505p0 = c21582e0;
        this.f68506q0 = c21574a0;
        this.f68507r0 = c20659i;
        this.f68508s0 = c0275o0;
        this.f68509t0 = c6065n;
        this.f68510u0 = c16031b;
        this.f68511v0 = c16863u;
        this.f68512w0 = interfaceC0161D1;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C21625l c21625l = new C21625l(this.f68504o0, this.f68505p0, this.f68506q0, this.f68507r0, this.f68508s0, this.f68509t0, this.f68510u0, this.f68511v0, this.f68512w0, interfaceC18770c);
        c21625l.f68503Z = obj;
        return c21625l;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((C21625l) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        return EnumC19250a.f61036Y;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f68502Y;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw AbstractC20734X.m21252w(obj);
        }
        AbstractC9233X.m9807c(obj);
        InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f68503Z;
        EnumC0573G enumC0573G = EnumC0573G.f1793p0;
        C21582E0 c21582e0 = this.f68505p0;
        C20659i c20659i = this.f68507r0;
        AbstractC0575H.m1156D(interfaceC0571F, null, enumC0573G, new C21621j(c21582e0, c20659i, null), 1);
        InterfaceC2211v0 interfaceC2211v0 = this.f68504o0;
        if (interfaceC2211v0 != null) {
            AbstractC0575H.m1156D(interfaceC0571F, null, null, new C21623k(interfaceC2211v0, c20659i, null), 3);
        }
        final C21651y c21651y = new C21651y(c21582e0, this.f68506q0, c20659i, interfaceC0571F);
        final C21574A0 c21574a0 = this.f68506q0;
        final InterfaceC0161D1 interfaceC0161D1 = this.f68512w0;
        final C21582E0 c21582e1 = this.f68505p0;
        final C6065n c6065n = this.f68509t0;
        final C16031b c16031b = this.f68510u0;
        final C20659i c20659i2 = this.f68507r0;
        final C16863U c16863u = this.f68511v0;
        InterfaceC0255h1 interfaceC0255h1 = new InterfaceC0255h1() { // from class: z0.h
            @Override // p003A1.InterfaceC0255h1
            /* JADX INFO: renamed from: a */
            public final InputConnection mo824a(EditorInfo editorInfo) {
                C21651y c21651y2 = c21651y;
                C21574A0 c21574a1 = c21574a0;
                InterfaceC0161D1 interfaceC0161D2 = interfaceC0161D1;
                C21582E0 c21582e2 = c21582e1;
                C20659i c20659i3 = c20659i2;
                C16863U c16863u2 = c16863u;
                C16031b c16031b2 = c16031b;
                C19341c1 c19341c1 = new C19341c1();
                c19341c1.f61254Y = c21582e2;
                c19341c1.f61255Z = c20659i3;
                c19341c1.f61256o0 = c16863u2;
                c19341c1.f61257p0 = c16031b2;
                c19341c1.f61258q0 = c21651y2;
                c19341c1.f61259r0 = c21574a1;
                c19341c1.f61260s0 = interfaceC0161D2;
                AbstractC21627m.m21977y(editorInfo, c21582e2.m21881c(), c21582e2.m21881c().f67818Z, c6065n, c16031b2 != null ? AbstractC21627m.f68518a : null);
                return new InputConnectionC21601Y(c19341c1, editorInfo);
            }
        };
        this.f68502Y = 1;
        this.f68508s0.m860a(interfaceC0255h1, this);
        return enumC19250a;
    }
}
