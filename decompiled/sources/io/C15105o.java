package io;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p349O0.C5944C;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p492U1.C7545j;
import p571X9.AbstractC9233X;
import p773h0.EnumC14284g0;
import p860l0.AbstractC16786v0;
import p860l0.C16678H;
import p860l0.C16783u0;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: io.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C15105o {

    /* JADX INFO: renamed from: a */
    public final float f46986a;

    /* JADX INFO: renamed from: b */
    public final boolean f46987b;

    /* JADX INFO: renamed from: c */
    public final C6002f0 f46988c;

    /* JADX INFO: renamed from: d */
    public final C6002f0 f46989d;

    /* JADX INFO: renamed from: e */
    public final C5944C f46990e;

    /* JADX INFO: renamed from: f */
    public final C5944C f46991f;

    /* JADX INFO: renamed from: g */
    public final C6002f0 f46992g;

    /* JADX INFO: renamed from: h */
    public final C6002f0 f46993h;

    /* JADX INFO: renamed from: i */
    public final C16678H f46994i;

    public C15105o(float f10, boolean z6) {
        this.f46986a = f10;
        this.f46987b = z6;
        Float fValueOf = Float.valueOf(0.0f);
        C5975S c5975s = C5975S.f19448r0;
        this.f46988c = C5997d.m6430Q(fValueOf, c5975s);
        this.f46989d = C5997d.m6430Q(C15052h.f46779a, c5975s);
        this.f46990e = C5997d.m6421H(new C15104n(this, 1));
        this.f46991f = C5997d.m6421H(new C15104n(this, 0));
        this.f46992g = C5997d.m6430Q(new C7545j(0L), c5975s);
        this.f46993h = C5997d.m6430Q(Boolean.FALSE, c5975s);
        C15045a c15045a = new C15045a(this, 4);
        C16783u0 c16783u0 = AbstractC16786v0.f53881a;
        this.f46994i = new C16678H(c15045a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m16228a(AbstractC19687c abstractC19687c) throws Throwable {
        C15101l c15101l;
        C15105o c15105o;
        if (abstractC19687c instanceof C15101l) {
            c15101l = (C15101l) abstractC19687c;
            int i10 = c15101l.f46929p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c15101l.f46929p0 = i10 - Integer.MIN_VALUE;
            } else {
                c15101l = new C15101l(this, abstractC19687c);
            }
        } else {
            c15101l = new C15101l(this, abstractC19687c);
        }
        Object obj = c15101l.f46927Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c15101l.f46929p0;
        C15052h c15052h = C15052h.f46779a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c15105o = c15101l.f46926Y;
            try {
                AbstractC9233X.m9807c(obj);
                c15105o.m16231d(c15052h);
                return C17296C.f55119a;
            } catch (Throwable th2) {
                th = th2;
                c15105o.m16231d(c15052h);
                throw th;
            }
        }
        AbstractC9233X.m9807c(obj);
        try {
            m16231d(C15053i.f46780a);
            C16678H c16678h = this.f46994i;
            C15103m c15103m = new C15103m(this, null);
            c15101l.f46926Y = this;
            c15101l.f46929p0 = 1;
            if (c16678h.mo5517a(EnumC14284g0.f44821Y, c15103m, c15101l) == enumC19250a) {
                return enumC19250a;
            }
            c15105o = this;
            c15105o.m16231d(c15052h);
            return C17296C.f55119a;
        } catch (Throwable th3) {
            th = th3;
            c15105o = this;
            c15105o.m16231d(c15052h);
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC15054j m16229b() {
        return (InterfaceC15054j) this.f46989d.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final float m16230c() {
        return ((Number) this.f46988c.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: d */
    public final void m16231d(InterfaceC15054j interfaceC15054j) {
        AbstractC16544l.m18094g(interfaceC15054j, "<set-?>");
        this.f46989d.setValue(interfaceC15054j);
    }
}
